package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PedidoVenta;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VentasRegistro
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-10-12T13:40:53.224Z[GMT]")


public class VentasRegistro   {
  @JsonProperty("fecha")
  private OffsetDateTime fecha = null;

  @JsonProperty("nombreCliente")
  private String nombreCliente = null;

  @JsonProperty("direccionCliente")
  private String direccionCliente = null;

  @JsonProperty("telefonoCliente")
  private String telefonoCliente = null;

  @JsonProperty("pedidos")
  @Valid
  private List<PedidoVenta> pedidos = new ArrayList<>();

  public VentasRegistro fecha(OffsetDateTime fecha) {
    this.fecha = fecha;
    return this;
  }

  /**
   * Get fecha
   * @return fecha
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public OffsetDateTime getFecha() {
    return fecha;
  }

  public void setFecha(OffsetDateTime fecha) {
    this.fecha = fecha;
  }

  public VentasRegistro nombreCliente(String nombreCliente) {
    this.nombreCliente = nombreCliente;
    return this;
  }

  /**
   * Get nombreCliente
   * @return nombreCliente
   **/
  @Schema(example = "Alfonso Jari Maya Hernandez", required = true, description = "")
      @NotNull

  @Size(min=1,max=50)   public String getNombreCliente() {
    return nombreCliente;
  }

  public void setNombreCliente(String nombreCliente) {
    this.nombreCliente = nombreCliente;
  }

  public VentasRegistro direccionCliente(String direccionCliente) {
    this.direccionCliente = direccionCliente;
    return this;
  }

  /**
   * Get direccionCliente
   * @return direccionCliente
   **/
  @Schema(example = "5 de Mayo 14A", required = true, description = "")
      @NotNull

  @Size(min=1,max=50)   public String getDireccionCliente() {
    return direccionCliente;
  }

  public void setDireccionCliente(String direccionCliente) {
    this.direccionCliente = direccionCliente;
  }

  public VentasRegistro telefonoCliente(String telefonoCliente) {
    this.telefonoCliente = telefonoCliente;
    return this;
  }

  /**
   * Get telefonoCliente
   * @return telefonoCliente
   **/
  @Schema(example = "2721613244", required = true, description = "")
      @NotNull

  @Size(min=1,max=10)   public String getTelefonoCliente() {
    return telefonoCliente;
  }

  public void setTelefonoCliente(String telefonoCliente) {
    this.telefonoCliente = telefonoCliente;
  }

  public VentasRegistro pedidos(List<PedidoVenta> pedidos) {
    this.pedidos = pedidos;
    return this;
  }

  public VentasRegistro addPedidosItem(PedidoVenta pedidosItem) {
    this.pedidos.add(pedidosItem);
    return this;
  }

  /**
   * Get pedidos
   * @return pedidos
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<PedidoVenta> getPedidos() {
    return pedidos;
  }

  public void setPedidos(List<PedidoVenta> pedidos) {
    this.pedidos = pedidos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VentasRegistro ventasRegistro = (VentasRegistro) o;
    return Objects.equals(this.fecha, ventasRegistro.fecha) &&
        Objects.equals(this.nombreCliente, ventasRegistro.nombreCliente) &&
        Objects.equals(this.direccionCliente, ventasRegistro.direccionCliente) &&
        Objects.equals(this.telefonoCliente, ventasRegistro.telefonoCliente) &&
        Objects.equals(this.pedidos, ventasRegistro.pedidos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fecha, nombreCliente, direccionCliente, telefonoCliente, pedidos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VentasRegistro {\n");
    
    sb.append("    fecha: ").append(toIndentedString(fecha)).append("\n");
    sb.append("    nombreCliente: ").append(toIndentedString(nombreCliente)).append("\n");
    sb.append("    direccionCliente: ").append(toIndentedString(direccionCliente)).append("\n");
    sb.append("    telefonoCliente: ").append(toIndentedString(telefonoCliente)).append("\n");
    sb.append("    pedidos: ").append(toIndentedString(pedidos)).append("\n");
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
