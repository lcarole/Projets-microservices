package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.model.OperationRequest;
import org.openapitools.model.OperationRequestOrder;
import org.openapitools.model.OperationResponseAllOf;
import org.openapitools.model.OperationResponseAllOfBilling;
import org.openapitools.model.OperationResponseAllOfInvoice;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-24T16:21:13.194359300+02:00[Europe/Paris]")
public class OperationResponse   {
  @JsonProperty("operationId")
  private Integer operationId;

  @JsonProperty("operationRef")
  private String operationRef;

  @JsonProperty("billing")
  private OperationResponseAllOfBilling billing;

  @JsonProperty("invoice")
  private OperationResponseAllOfInvoice invoice;

  @JsonProperty("customerRef")
  private String customerRef;

  @JsonProperty("operationAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate operationAt;

  @JsonProperty("order")
  private OperationRequestOrder order;

  public OperationResponse operationId(Integer operationId) {
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

  public OperationResponse operationRef(String operationRef) {
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

  public OperationResponse billing(OperationResponseAllOfBilling billing) {
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

  public OperationResponse invoice(OperationResponseAllOfInvoice invoice) {
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

  public OperationResponse customerRef(String customerRef) {
    this.customerRef = customerRef;
    return this;
  }

  /**
   * External identifier of the Customer
   * @return customerRef
  */
  @ApiModelProperty(example = "HA-8768376537", value = "External identifier of the Customer")


  public String getCustomerRef() {
    return customerRef;
  }

  public void setCustomerRef(String customerRef) {
    this.customerRef = customerRef;
  }

  public OperationResponse operationAt(LocalDate operationAt) {
    this.operationAt = operationAt;
    return this;
  }

  /**
   * Transaction date in the sales system as defined in ISO 8601 ([more information about the standar](https://www.iso.org/fr/iso-8601-date-and-time-format.html)).  Used format : YYYY-MM-DD 
   * @return operationAt
  */
  @ApiModelProperty(example = "Wed Apr 27 02:00:00 CEST 2022", value = "Transaction date in the sales system as defined in ISO 8601 ([more information about the standar](https://www.iso.org/fr/iso-8601-date-and-time-format.html)).  Used format : YYYY-MM-DD ")

  @Valid

  public LocalDate getOperationAt() {
    return operationAt;
  }

  public void setOperationAt(LocalDate operationAt) {
    this.operationAt = operationAt;
  }

  public OperationResponse order(OperationRequestOrder order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * @return order
  */
  @ApiModelProperty(value = "")

  @Valid

  public OperationRequestOrder getOrder() {
    return order;
  }

  public void setOrder(OperationRequestOrder order) {
    this.order = order;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationResponse operationResponse = (OperationResponse) o;
    return Objects.equals(this.operationId, operationResponse.operationId) &&
        Objects.equals(this.operationRef, operationResponse.operationRef) &&
        Objects.equals(this.billing, operationResponse.billing) &&
        Objects.equals(this.invoice, operationResponse.invoice) &&
        Objects.equals(this.customerRef, operationResponse.customerRef) &&
        Objects.equals(this.operationAt, operationResponse.operationAt) &&
        Objects.equals(this.order, operationResponse.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationId, operationRef, billing, invoice, customerRef, operationAt, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationResponse {\n");
    
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    operationRef: ").append(toIndentedString(operationRef)).append("\n");
    sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    customerRef: ").append(toIndentedString(customerRef)).append("\n");
    sb.append("    operationAt: ").append(toIndentedString(operationAt)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

