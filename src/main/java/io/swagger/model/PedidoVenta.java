package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PedidoVenta
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-10-12T13:40:53.224Z[GMT]")


public class PedidoVenta   {
  @JsonProperty("servicio")
  private String servicio = null;

  @JsonProperty("tipoServicio")
  private String tipoServicio = null;

  @JsonProperty("cantidad")
  private Float cantidad = null;

  public PedidoVenta servicio(String servicio) {
    this.servicio = servicio;
    return this;
  }

  /**
   * Get servicio
   * @return servicio
   **/
  @Schema(example = "Lavanderia", required = true, description = "")
      @NotNull

    public String getServicio() {
    return servicio;
  }

  public void setServicio(String servicio) {
    this.servicio = servicio;
  }

  public PedidoVenta tipoServicio(String tipoServicio) {
    this.tipoServicio = tipoServicio;
    return this;
  }

  /**
   * Get tipoServicio
   * @return tipoServicio
   **/
  @Schema(example = "Normal", required = true, description = "")
      @NotNull

    public String getTipoServicio() {
    return tipoServicio;
  }

  public void setTipoServicio(String tipoServicio) {
    this.tipoServicio = tipoServicio;
  }

  public PedidoVenta cantidad(Float cantidad) {
    this.cantidad = cantidad;
    return this;
  }

  /**
   * Get cantidad
   * @return cantidad
   **/
  @Schema(example = "5", required = true, description = "")
      @NotNull

    public Float getCantidad() {
    return cantidad;
  }

  public void setCantidad(Float cantidad) {
    this.cantidad = cantidad;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PedidoVenta pedidoVenta = (PedidoVenta) o;
    return Objects.equals(this.servicio, pedidoVenta.servicio) &&
        Objects.equals(this.tipoServicio, pedidoVenta.tipoServicio) &&
        Objects.equals(this.cantidad, pedidoVenta.cantidad);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servicio, tipoServicio, cantidad);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PedidoVenta {\n");
    
    sb.append("    servicio: ").append(toIndentedString(servicio)).append("\n");
    sb.append("    tipoServicio: ").append(toIndentedString(tipoServicio)).append("\n");
    sb.append("    cantidad: ").append(toIndentedString(cantidad)).append("\n");
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
