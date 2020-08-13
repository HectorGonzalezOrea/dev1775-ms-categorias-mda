package mx.com.nmp.gestionescenarios.oag.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "fechaInicioPeticion", "peticionEscenario" })
public class CalendarizarEscenarioRequestVO {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("fechaInicioPeticion")
	private String fechaInicioPeticion;
	@JsonProperty("peticionEscenario")
	private PeticionEscenarioVO peticionEscenario;

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	@JsonProperty("fechaInicioPeticion")
	public String getFechaInicioPeticion() {
		return fechaInicioPeticion;
	}

	@JsonProperty("fechaInicioPeticion")
	public void setFechaInicioPeticion(String fechaInicioPeticion) {
		this.fechaInicioPeticion = fechaInicioPeticion;
	}

	@JsonProperty("peticionEscenario")
	public PeticionEscenarioVO getPeticionEscenario() {
		return peticionEscenario;
	}

	@JsonProperty("peticionEscenario")
	public void setPeticionEscenario(PeticionEscenarioVO peticionEscenario) {
		this.peticionEscenario = peticionEscenario;
	}
	
	@Override
	public String toString() {
		 StringBuilder sb = new StringBuilder();
		 sb.append("CalendarizarEscenarioRequestVO {\n");
		 sb.append("id: ").append(toIndentedString(id)).append("\n");
		 sb.append("fechaInicioPeticion: ").append(toIndentedString(fechaInicioPeticion)).append("\n");
		 sb.append("peticionEscenario: ").append(toIndentedString(peticionEscenario)).append("\n");
		 sb.append("}");
		return sb.toString();
	}
	
	 private String toIndentedString(java.lang.Object o) {
		    if (o == null) {
		      return "null";
	   }
	   return o.toString().replace("\n", "\n    ");
	 }


}
