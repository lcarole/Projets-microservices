package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BusinessAddress;
import org.openapitools.model.BusinessPerson;
import org.openapitools.model.BusinessSellerEFacturation;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes seller organisation &amp; contact
 */
@ApiModel(description = "Describes seller organisation & contact")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-24T16:21:13.194359300+02:00[Europe/Paris]")
public class BusinessSeller   {
  @JsonProperty("sellerRef")
  private String sellerRef;

  @JsonProperty("eFacturation")
  private BusinessSellerEFacturation eFacturation;

  @JsonProperty("contactPerson")
  private BusinessPerson contactPerson;

  @JsonProperty("contactAddress")
  private BusinessAddress contactAddress;

  public BusinessSeller sellerRef(String sellerRef) {
    this.sellerRef = sellerRef;
    return this;
  }

  /**
   * External reference of seller
   * @return sellerRef
  */
  @ApiModelProperty(example = "esgi SA", value = "External reference of seller")


  public String getSellerRef() {
    return sellerRef;
  }

  public void setSellerRef(String sellerRef) {
    this.sellerRef = sellerRef;
  }

  public BusinessSeller eFacturation(BusinessSellerEFacturation eFacturation) {
    this.eFacturation = eFacturation;
    return this;
  }

  /**
   * Get eFacturation
   * @return eFacturation
  */
  @ApiModelProperty(value = "")

  @Valid

  public BusinessSellerEFacturation geteFacturation() {
    return eFacturation;
  }

  public void seteFacturation(BusinessSellerEFacturation eFacturation) {
    this.eFacturation = eFacturation;
  }

  public BusinessSeller contactPerson(BusinessPerson contactPerson) {
    this.contactPerson = contactPerson;
    return this;
  }

  /**
   * Get contactPerson
   * @return contactPerson
  */
  @ApiModelProperty(value = "")

  @Valid

  public BusinessPerson getContactPerson() {
    return contactPerson;
  }

  public void setContactPerson(BusinessPerson contactPerson) {
    this.contactPerson = contactPerson;
  }

  public BusinessSeller contactAddress(BusinessAddress contactAddress) {
    this.contactAddress = contactAddress;
    return this;
  }

  /**
   * Get contactAddress
   * @return contactAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public BusinessAddress getContactAddress() {
    return contactAddress;
  }

  public void setContactAddress(BusinessAddress contactAddress) {
    this.contactAddress = contactAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessSeller businessSeller = (BusinessSeller) o;
    return Objects.equals(this.sellerRef, businessSeller.sellerRef) &&
        Objects.equals(this.eFacturation, businessSeller.eFacturation) &&
        Objects.equals(this.contactPerson, businessSeller.contactPerson) &&
        Objects.equals(this.contactAddress, businessSeller.contactAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerRef, eFacturation, contactPerson, contactAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessSeller {\n");
    
    sb.append("    sellerRef: ").append(toIndentedString(sellerRef)).append("\n");
    sb.append("    eFacturation: ").append(toIndentedString(eFacturation)).append("\n");
    sb.append("    contactPerson: ").append(toIndentedString(contactPerson)).append("\n");
    sb.append("    contactAddress: ").append(toIndentedString(contactAddress)).append("\n");
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

