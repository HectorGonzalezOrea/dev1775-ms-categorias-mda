package mx.com.nmp.valormonte.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.nmp.valormonte.elastic.controller.ElasticController;
import mx.com.nmp.valormonte.elastic.vo.Source;
import mx.com.nmp.valormonte.model.CalculoValorMonteReq;
import mx.com.nmp.valormonte.model.CalculoValorMonteReqInner;
import mx.com.nmp.valormonte.model.CalculoValorMonteRes;
import mx.com.nmp.valormonte.model.CalculoValorMonteResInner;

@Service
public class ValorMonteService {

	@Autowired
	private ElasticController elasticController;

	private static final Logger log = LoggerFactory.getLogger(ValorMonteService.class);

	public CalculoValorMonteRes calcularValorMonte(CalculoValorMonteReq vm) {
		log.info("ValorMonteService.CalcularValorMonte");

		Float vma = null;
		CalculoValorMonteRes cvmResp = null;
		CalculoValorMonteResInner cvmRespInner = null;

		if (vm != null) {
			cvmResp = new CalculoValorMonteRes();
			for (CalculoValorMonteReqInner vmri : vm) {
				Source producto = elasticController.consultaElastic(vmri.getSKU(), vmri.getIdPartida());
				if(producto != null) {
					if (vmri.getValorAncla() != null && vmri.getDesplazamiento() != null && vmri.getGramaje() != null
							&& vmri.getIncremento() != null && vmri.getKilataje() != null
							&& vmri.getAvaluoComplementario() != null) {
						
						vma = this.valorMonteActualizado(vmri);
						cvmRespInner = new CalculoValorMonteResInner();

						cvmRespInner.setIdPartida(vmri.getIdPartida());
						cvmRespInner.setSku(vmri.getSKU());
						cvmRespInner.setValorMonteActualizado(vma);

						cvmResp.add(cvmRespInner);
					} else {
						if(producto != null) {
							cvmRespInner = new CalculoValorMonteResInner();

							cvmRespInner.setIdPartida(Integer.valueOf(producto.getPartida()));
							cvmRespInner.setSku(producto.getSku());
							
							if(producto.getValorMonteAct() != null) {
								cvmRespInner.setValorMonteActualizado(Float.valueOf(producto.getValorMonteAct()));
							}
							cvmResp.add(cvmRespInner);
						}
					}
				}
			}
		}

		return cvmResp;

	}

	private Float valorMonteActualizado(CalculoValorMonteReqInner producto) {

		float k24 = producto.getKilataje() / 24;
		float id100 = 1 + ((producto.getIncremento() + producto.getDesplazamiento()) / 100);
		float vma = (producto.getValorAncla() * producto.getGramaje() * k24 * id100)
				+ producto.getAvaluoComplementario();

		return Float.valueOf(vma);
	}

}
