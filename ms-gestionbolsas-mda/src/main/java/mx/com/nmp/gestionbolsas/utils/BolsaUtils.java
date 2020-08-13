package mx.com.nmp.gestionbolsas.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BolsaUtils {

	/**
	 * obtiene la lista de las sucursales
	 * */
	public List<String>paseraLista(List<String> sucursalesLst){
		String cadena=null;
		List<String> lstSucursales= new ArrayList<>();
		for (String text : sucursalesLst) {
			cadena=text;
		}
		Boolean delimitador=false;
		if(cadena !=null) {
			delimitador=cadena.contains("-");
		}
		if(Boolean.TRUE.equals(delimitador)){
            String[] texto = cadena.split("-");
            Integer  inicio = Integer.parseInt(texto[0]);
            Integer  fin= Integer.parseInt(texto[1]);
            lstSucursales= obtenervalores(inicio,fin);
        }else{
        	if(cadena !=null) {
	        	String[] textoComas = cadena.split(",");
	            lstSucursales=Arrays.asList(textoComas);
        	}
        }
		return lstSucursales;
	}
	
	/**
	 * Crear el consecutivo de las sucursales
	 *  y se agrega en la lista
	 * */
	 public  List<String> obtenervalores(Integer inicio, Integer fin ){
		 List<String> sucursales= new ArrayList<>();
	        for(Integer i=inicio; i<=fin;i++){
	            sucursales.add(String.valueOf(i));
	            
	        }
	        return sucursales;
	 } 
	 

}
