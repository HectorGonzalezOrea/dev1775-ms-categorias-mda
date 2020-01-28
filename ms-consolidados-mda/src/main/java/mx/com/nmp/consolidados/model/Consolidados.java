package mx.com.nmp.consolidados.model;

import java.io.File;
import java.time.LocalDate;
import java.util.Date;
import org.springframework.validation.annotation.Validated;
import com.fasterxml.jackson.annotation.JsonProperty;

@Validated
public class Consolidados {
	@JsonProperty("idArchivo")
	private Long idArchivo;
	@JsonProperty("adjunto")
	private File adjunto;
	@JsonProperty("vigencia")
	private LocalDate vigencia;
	@JsonProperty("nombreAjuste")
	private String nombreAjuste;
	@JsonProperty("emergente")
	private Boolean emergente;
	@JsonProperty("fechaAplicacion")
	private Date fechaAplicacion;
	
	public Long getIdArchivo() {
		return idArchivo;
	}
	public void setIdArchivo(Long idArchivo) {
		this.idArchivo = idArchivo;
	}
	public File getAdjunto() {
		return adjunto;
	}
	public void setAdjunto(File adjunto) {
		this.adjunto = adjunto;
	}
	public LocalDate getVigencia() {
		return vigencia;
	}
	public void setVigencia(LocalDate vigencia) {
		this.vigencia = vigencia;
	}
	public String getNombreAjuste() {
		return nombreAjuste;
	}
	public void setNombreAjuste(String nombreAjuste) {
		this.nombreAjuste = nombreAjuste;
	}
	public Boolean getEmergente() {
		return emergente;
	}
	public void setEmergente(Boolean emergente) {
		this.emergente = emergente;
	}
	public Date getFechaAplicacion() {
		return fechaAplicacion;
	}
	public void setFechaAplicacion(Date fechaAplicacion) {
		this.fechaAplicacion = fechaAplicacion;
	}
}