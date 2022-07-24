package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.model.OperationRequestOrder;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes an Operation added to deferred billing
 */
@ApiModel(description = "Describes an Operation added to deferred billing")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-24T16:21:13.194359300+02:00[Europe/Paris]")
public class OperationRequest   {
  @JsonProperty("customerRef")
  private String customerRef;

  @JsonProperty("operationAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate operationAt;

  @JsonProperty("order")
  private OperationRequestOrder order;

  public OperationRequest customerRef(String customerRef) {
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

  public OperationRequest operationAt(LocalDate operationAt) {
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

  public OperationRequest order(OperationRequestOrder order) {
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
    OperationRequest operationRequest = (OperationRequest) o;
    return Objects.equals(this.customerRef, operationRequest.customerRef) &&
        Objects.equals(this.operationAt, operationRequest.operationAt) &&
        Objects.equals(this.order, operationRequest.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerRef, operationAt, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationRequest {\n");
    
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

