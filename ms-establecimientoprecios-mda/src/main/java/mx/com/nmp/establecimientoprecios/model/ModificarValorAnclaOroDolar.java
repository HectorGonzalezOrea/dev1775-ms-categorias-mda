package mx.com.nmp.establecimientoprecios.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;
import org.threeten.bp.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Información correspondiente a la modificación del valor ancla de Oro y Dolar
 */
@ApiModel(description = "Información correspondiente a la modificación del valor ancla de Oro y Dolar")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-03T00:30:35.505Z")

public class ModificarValorAnclaOroDolar extends ValorAnclaOroDolar  {
  @JsonProperty("fechaAplicacion")
  private LocalDate fechaAplicacion = null;

  @JsonProperty("idBolsa")
  private Integer idBolsa = null;

  @JsonProperty("sucursales")
  @Valid
  private List<String> sucursales = null;

  public ModificarValorAnclaOroDolar fechaAplicacion(LocalDate fechaAplicacion) {
    this.fechaAplicacion = fechaAplicacion;
    return this;
  }

  /**
   * Fecha en la que se tiene que aplicar el ajuste del valor ancla
   * @return fechaAplicacion
  **/
  @ApiModelProperty(example = "03/12/2019", value = "Fecha en la que se tiene que aplicar el ajuste del valor ancla")

  @Valid

  public LocalDate getFechaAplicacion() {
    return fechaAplicacion;
  }

  public void setFechaAplicacion(LocalDate fechaAplicacion) {
    this.fechaAplicacion = fechaAplicacion;
  }

  public ModificarValorAnclaOroDolar idBolsa(Integer idBolsa) {
    this.idBolsa = idBolsa;
    return this;
  }

  /**
   * Identificador de la bolsa a la que se aplicará el cambio de valor ancla
   * @return idBolsa
  **/
  @ApiModelProperty(example = "7", value = "Identificador de la bolsa a la que se aplicará el cambio de valor ancla")


  public Integer getIdBolsa() {
    return idBolsa;
  }

  public void setIdBolsa(Integer idBolsa) {
    this.idBolsa = idBolsa;
  }

  public ModificarValorAnclaOroDolar sucursales(List<String> sucursales) {
    this.sucursales = sucursales;
    return this;
  }

  public ModificarValorAnclaOroDolar addSucursalesItem(String sucursalesItem) {
    if (this.sucursales == null) {
      this.sucursales = new ArrayList<String>();
    }
    this.sucursales.add(sucursalesItem);
    return this;
  }

  /**
   * Ids de sucursales a las que se aplicará el cambio de valor ancla
   * @return sucursales
  **/
  @ApiModelProperty(value = "Ids de sucursales a las que se aplicará el cambio de valor ancla")


  public List<String> getSucursales() {
    return sucursales;
  }

  public void setSucursales(List<String> sucursales) {
    this.sucursales = sucursales;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModificarValorAnclaOroDolar modificarValorAnclaOroDolar = (ModificarValorAnclaOroDolar) o;
    return Objects.equals(this.fechaAplicacion, modificarValorAnclaOroDolar.fechaAplicacion) &&
        Objects.equals(this.idBolsa, modificarValorAnclaOroDolar.idBolsa) &&
        Objects.equals(this.sucursales, modificarValorAnclaOroDolar.sucursales) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fechaAplicacion, idBolsa, sucursales, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModificarValorAnclaOroDolar {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    fechaAplicacion: ").append(toIndentedString(fechaAplicacion)).append("\n");
    sb.append("    idBolsa: ").append(toIndentedString(idBolsa)).append("\n");
    sb.append("    sucursales: ").append(toIndentedString(sucursales)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

