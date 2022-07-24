package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BusinessAddress;
import org.openapitools.model.BusinessDistributorEFacturation;
import org.openapitools.model.BusinessPerson;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes distributor organisation &amp; contact
 */
@ApiModel(description = "Describes distributor organisation & contact")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-24T16:40:58.350645200+02:00[Europe/Paris]")
public class BusinessDistributor   {
  @JsonProperty("disributorRef")
  private String disributorRef;

  @JsonProperty("eFacturation")
  private BusinessDistributorEFacturation eFacturation;

  @JsonProperty("contactPerson")
  private BusinessPerson contactPerson;

  @JsonProperty("contactAddress")
  private BusinessAddress contactAddress;

  public BusinessDistributor disributorRef(String disributorRef) {
    this.disributorRef = disributorRef;
    return this;
  }

  /**
   * External reference of distributor
   * @return disributorRef
  */
  @ApiModelProperty(example = "esgi SA", value = "External reference of distributor")


  public String getDisributorRef() {
    return disributorRef;
  }

  public void setDisributorRef(String disributorRef) {
    this.disributorRef = disributorRef;
  }

  public BusinessDistributor eFacturation(BusinessDistributorEFacturation eFacturation) {
    this.eFacturation = eFacturation;
    return this;
  }

  /**
   * Get eFacturation
   * @return eFacturation
  */
  @ApiModelProperty(value = "")

  @Valid

  public BusinessDistributorEFacturation geteFacturation() {
    return eFacturation;
  }

  public void seteFacturation(BusinessDistributorEFacturation eFacturation) {
    this.eFacturation = eFacturation;
  }

  public BusinessDistributor contactPerson(BusinessPerson contactPerson) {
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

  public BusinessDistributor contactAddress(BusinessAddress contactAddress) {
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
    BusinessDistributor businessDistributor = (BusinessDistributor) o;
    return Objects.equals(this.disributorRef, businessDistributor.disributorRef) &&
        Objects.equals(this.eFacturation, businessDistributor.eFacturation) &&
        Objects.equals(this.contactPerson, businessDistributor.contactPerson) &&
        Objects.equals(this.contactAddress, businessDistributor.contactAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disributorRef, eFacturation, contactPerson, contactAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessDistributor {\n");
    
    sb.append("    disributorRef: ").append(toIndentedString(disributorRef)).append("\n");
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

