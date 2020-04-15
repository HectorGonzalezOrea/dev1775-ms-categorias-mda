package mx.com.nmp.usuarios.utils;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import mx.com.nmp.usuarios.mongodb.vo.DepatamentoAreaVO;
import mx.com.nmp.usuarios.mongodb.vo.DireccionVO;
import mx.com.nmp.usuarios.mongodb.vo.GerenciaVO;
import mx.com.nmp.usuarios.mongodb.vo.PuestoVO;
import mx.com.nmp.usuarios.mongodb.vo.SubdireccionVO;
import mx.com.nmp.usuarios.oag.vo.GetTokenResponseVO;
import mx.com.nmp.usuarios.oag.vo.IdentidadUsuarioResponseVO;
import mx.com.nmp.usuarios.oag.vo.ProfileVO;
import mx.com.nmp.usuarios.oag.vo.TokenProviderErrorVO;

public class ConverterUtil {

	private static final Logger log = LoggerFactory.getLogger(ConverterUtil.class);
	
	public static String messageToJson(Object ohj) {
		Gson gson = new Gson();
		return gson.toJson(ohj);
	}
	
	public static GetTokenResponseVO stringJsonToObjectGetTokenResponseVO(String json) {
		ObjectMapper mapper = new ObjectMapper();
		GetTokenResponseVO obj = null;
		try {
			obj = mapper.readValue(json, GetTokenResponseVO.class);

		} catch (IOException e) {
			log.error("IOException: {}" , e);
		}
		return obj;
	}
	
	public static IdentidadUsuarioResponseVO stringJsonToObjectIdentidadUsuarioResponseVO(String json) {
		ObjectMapper mapper = new ObjectMapper();
		IdentidadUsuarioResponseVO obj = null;
		try {
			obj = mapper.readValue(json, IdentidadUsuarioResponseVO.class);

		} catch (IOException e) {
			log.error("IOException: {}" , e);
		}
		return obj;
	}
	
	public static ProfileVO stringJsonToObjectProfileVO(String json) {
		ObjectMapper mapper = new ObjectMapper();
		ProfileVO obj = null;
		try {
			obj = mapper.readValue(json, ProfileVO.class);

		} catch (IOException e) {
			log.error("IOException: {}" , e);
		}
		return obj;
	}
	
	public static TokenProviderErrorVO stringJsonToObjectTokenProviderErrorVO(String json) {
		ObjectMapper mapper = new ObjectMapper();
		TokenProviderErrorVO obj = null;
		try {
			obj = mapper.readValue(json, TokenProviderErrorVO.class);

		} catch (IOException e) {
			log.error("IOException: {}" , e);
		}
		return obj;
	}
	
	public static DepatamentoAreaVO stringJsonToObjectDepatamentoAreaVO(String json) {
		ObjectMapper mapper = new ObjectMapper();
		DepatamentoAreaVO obj = null;
		try {
			obj = mapper.readValue(json, DepatamentoAreaVO.class);

		} catch (IOException e) {
			log.error("IOException: {}" , e);
		}
		return obj;
	}
	
	public static DireccionVO stringJsonToObjectDireccionVO(String json) {
		ObjectMapper mapper = new ObjectMapper();
		DireccionVO obj = null;
		try {
			obj = mapper.readValue(json, DireccionVO.class);

		} catch (IOException e) {
			log.error("IOException: {}" , e);
		}
		return obj;
	}
	
	public static GerenciaVO stringJsonToObjectGerenciaVO(String json) {
		ObjectMapper mapper = new ObjectMapper();
		GerenciaVO obj = null;
		try {
			obj = mapper.readValue(json, GerenciaVO.class);

		} catch (IOException e) {
			log.error("IOException: {}" , e);
		}
		return obj;
	}
	
	public static PuestoVO stringJsonToObjectPuestoVO(String json) {
		ObjectMapper mapper = new ObjectMapper();
		PuestoVO obj = null;
		try {
			obj = mapper.readValue(json, PuestoVO.class);

		} catch (IOException e) {
			log.error("IOException: {}" , e);
		}
		return obj;
	}
	
	public static SubdireccionVO stringJsonToObjectSubdireccionVO(String json) {
		ObjectMapper mapper = new ObjectMapper();
		SubdireccionVO obj = null;
		try {
			obj = mapper.readValue(json, SubdireccionVO.class);

		} catch (IOException e) {
			log.error("IOException: {}" , e);
		}
		return obj;
	}
}
