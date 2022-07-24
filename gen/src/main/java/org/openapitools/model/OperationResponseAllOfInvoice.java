package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationResponseAllOfInvoice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-24T16:21:13.194359300+02:00[Europe/Paris]")
public class OperationResponseAllOfInvoice   {
  @JsonProperty("invoiceRef")
  private String invoiceRef;

  @JsonProperty("createdAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate createdAt;

  public OperationResponseAllOfInvoice invoiceRef(String invoiceRef) {
    this.invoiceRef = invoiceRef;
    return this;
  }

  /**
   * Get invoiceRef
   * @return invoiceRef
  */
  @ApiModelProperty(value = "")


  public String getInvoiceRef() {
    return invoiceRef;
  }

  public void setInvoiceRef(String invoiceRef) {
    this.invoiceRef = invoiceRef;
  }

  public OperationResponseAllOfInvoice createdAt(LocalDate createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDate createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationResponseAllOfInvoice operationResponseAllOfInvoice = (OperationResponseAllOfInvoice) o;
    return Objects.equals(this.invoiceRef, operationResponseAllOfInvoice.invoiceRef) &&
        Objects.equals(this.createdAt, operationResponseAllOfInvoice.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceRef, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationResponseAllOfInvoice {\n");
    
    sb.append("    invoiceRef: ").append(toIndentedString(invoiceRef)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

