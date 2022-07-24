package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BusinessParticularPartyParticular
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-24T16:40:58.350645200+02:00[Europe/Paris]")
public class BusinessParticularPartyParticular   {
  @JsonProperty("customerId")
  private String customerId;

  @JsonProperty("customerRef")
  private String customerRef;

  public BusinessParticularPartyParticular customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Internal Identifier of person
   * @return customerId
  */
  @ApiModelProperty(example = "PRO-8996786873", value = "Internal Identifier of person")


  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public BusinessParticularPartyParticular customerRef(String customerRef) {
    this.customerRef = customerRef;
    return this;
  }

  /**
   * External identifier of organisation (i.e. firstName + lastName)
   * @return customerRef
  */
  @ApiModelProperty(example = "John DOE", value = "External identifier of organisation (i.e. firstName + lastName)")


  public String getCustomerRef() {
    return customerRef;
  }

  public void setCustomerRef(String customerRef) {
    this.customerRef = customerRef;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessParticularPartyParticular businessParticularPartyParticular = (BusinessParticularPartyParticular) o;
    return Objects.equals(this.customerId, businessParticularPartyParticular.customerId) &&
        Objects.equals(this.customerRef, businessParticularPartyParticular.customerRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, customerRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessParticularPartyParticular {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerRef: ").append(toIndentedString(customerRef)).append("\n");
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

