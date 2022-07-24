package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OperationResponseAllOfBilling;
import org.openapitools.model.OperationResponseAllOfInvoice;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationResponseAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-24T16:21:13.194359300+02:00[Europe/Paris]")
public class OperationResponseAllOf   {
  @JsonProperty("operationId")
  private Integer operationId;

  @JsonProperty("operationRef")
  private String operationRef;

  @JsonProperty("billing")
  private OperationResponseAllOfBilling billing;

  @JsonProperty("invoice")
  private OperationResponseAllOfInvoice invoice;

  public OperationResponseAllOf operationId(Integer operationId) {
    this.operationId = operationId;
    return this;
  }

  /**
   * Internal identifier of the Operation
   * @return operationId
  */
  @ApiModelProperty(value = "Internal identifier of the Operation")


  public Integer getOperationId() {
    return operationId;
  }

  public void setOperationId(Integer operationId) {
    this.operationId = operationId;
  }

  public OperationResponseAllOf operationRef(String operationRef) {
    this.operationRef = operationRef;
    return this;
  }

  /**
   * External identifier of the Operation
   * @return operationRef
  */
  @ApiModelProperty(example = "HA-8768376537", value = "External identifier of the Operation")


  public String getOperationRef() {
    return operationRef;
  }

  public void setOperationRef(String operationRef) {
    this.operationRef = operationRef;
  }

  public OperationResponseAllOf billing(OperationResponseAllOfBilling billing) {
    this.billing = billing;
    return this;
  }

  /**
   * Get billing
   * @return billing
  */
  @ApiModelProperty(value = "")

  @Valid

  public OperationResponseAllOfBilling getBilling() {
    return billing;
  }

  public void setBilling(OperationResponseAllOfBilling billing) {
    this.billing = billing;
  }

  public OperationResponseAllOf invoice(OperationResponseAllOfInvoice invoice) {
    this.invoice = invoice;
    return this;
  }

  /**
   * Get invoice
   * @return invoice
  */
  @ApiModelProperty(value = "")

  @Valid

  public OperationResponseAllOfInvoice getInvoice() {
    return invoice;
  }

  public void setInvoice(OperationResponseAllOfInvoice invoice) {
    this.invoice = invoice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationResponseAllOf operationResponseAllOf = (OperationResponseAllOf) o;
    return Objects.equals(this.operationId, operationResponseAllOf.operationId) &&
        Objects.equals(this.operationRef, operationResponseAllOf.operationRef) &&
        Objects.equals(this.billing, operationResponseAllOf.billing) &&
        Objects.equals(this.invoice, operationResponseAllOf.invoice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationId, operationRef, billing, invoice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationResponseAllOf {\n");
    
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    operationRef: ").append(toIndentedString(operationRef)).append("\n");
    sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

