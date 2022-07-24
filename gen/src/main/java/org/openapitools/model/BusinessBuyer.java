package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BusinessAddress;
import org.openapitools.model.BusinessBuyerEInvoicing;
import org.openapitools.model.BusinessPerson;
import org.openapitools.model.BusinessProfessionnalParty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes buyer organisation &amp; contact
 */
@ApiModel(description = "Describes buyer organisation & contact")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-24T16:21:13.194359300+02:00[Europe/Paris]")
public class BusinessBuyer   {
  @JsonProperty("buyerRef")
  private String buyerRef;

  /**
   * Gets or Sets buyerType
   */
  public enum BuyerTypeEnum {
    PARTICULAR("PARTICULAR"),
    
    PROFESSIONNAL("PROFESSIONNAL");

    private String value;

    BuyerTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BuyerTypeEnum fromValue(String value) {
      for (BuyerTypeEnum b : BuyerTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("buyerType")
  private BuyerTypeEnum buyerType;

  @JsonProperty("party")
  private BusinessProfessionnalParty party;

  @JsonProperty("eInvoicing")
  private BusinessBuyerEInvoicing eInvoicing;

  @JsonProperty("contactPerson")
  private BusinessPerson contactPerson;

  @JsonProperty("contactAddress")
  private BusinessAddress contactAddress;

  @JsonProperty("billingAddress")
  private BusinessAddress billingAddress;

  public BusinessBuyer buyerRef(String buyerRef) {
    this.buyerRef = buyerRef;
    return this;
  }

  /**
   * External reference of buyer (By example: social reason of the company)
   * @return buyerRef
  */
  @ApiModelProperty(example = "Ma Petite Entreprise", value = "External reference of buyer (By example: social reason of the company)")


  public String getBuyerRef() {
    return buyerRef;
  }

  public void setBuyerRef(String buyerRef) {
    this.buyerRef = buyerRef;
  }

  public BusinessBuyer buyerType(BuyerTypeEnum buyerType) {
    this.buyerType = buyerType;
    return this;
  }

  /**
   * Get buyerType
   * @return buyerType
  */
  @ApiModelProperty(example = "PROFESSIONNAL", required = true, value = "")
  @NotNull


  public BuyerTypeEnum getBuyerType() {
    return buyerType;
  }

  public void setBuyerType(BuyerTypeEnum buyerType) {
    this.buyerType = buyerType;
  }

  public BusinessBuyer party(BusinessProfessionnalParty party) {
    this.party = party;
    return this;
  }

  /**
   * Get party
   * @return party
  */
  @ApiModelProperty(value = "")

  @Valid

  public BusinessProfessionnalParty getParty() {
    return party;
  }

  public void setParty(BusinessProfessionnalParty party) {
    this.party = party;
  }

  public BusinessBuyer eInvoicing(BusinessBuyerEInvoicing eInvoicing) {
    this.eInvoicing = eInvoicing;
    return this;
  }

  /**
   * Get eInvoicing
   * @return eInvoicing
  */
  @ApiModelProperty(value = "")

  @Valid

  public BusinessBuyerEInvoicing geteInvoicing() {
    return eInvoicing;
  }

  public void seteInvoicing(BusinessBuyerEInvoicing eInvoicing) {
    this.eInvoicing = eInvoicing;
  }

  public BusinessBuyer contactPerson(BusinessPerson contactPerson) {
    this.contactPerson = contactPerson;
    return this;
  }

  /**
   * Get contactPerson
   * @return contactPerson
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BusinessPerson getContactPerson() {
    return contactPerson;
  }

  public void setContactPerson(BusinessPerson contactPerson) {
    this.contactPerson = contactPerson;
  }

  public BusinessBuyer contactAddress(BusinessAddress contactAddress) {
    this.contactAddress = contactAddress;
    return this;
  }

  /**
   * Get contactAddress
   * @return contactAddress
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BusinessAddress getContactAddress() {
    return contactAddress;
  }

  public void setContactAddress(BusinessAddress contactAddress) {
    this.contactAddress = contactAddress;
  }

  public BusinessBuyer billingAddress(BusinessAddress billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

  /**
   * Get billingAddress
   * @return billingAddress
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BusinessAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(BusinessAddress billingAddress) {
    this.billingAddress = billingAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessBuyer businessBuyer = (BusinessBuyer) o;
    return Objects.equals(this.buyerRef, businessBuyer.buyerRef) &&
        Objects.equals(this.buyerType, businessBuyer.buyerType) &&
        Objects.equals(this.party, businessBuyer.party) &&
        Objects.equals(this.eInvoicing, businessBuyer.eInvoicing) &&
        Objects.equals(this.contactPerson, businessBuyer.contactPerson) &&
        Objects.equals(this.contactAddress, businessBuyer.contactAddress) &&
        Objects.equals(this.billingAddress, businessBuyer.billingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyerRef, buyerType, party, eInvoicing, contactPerson, contactAddress, billingAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessBuyer {\n");
    
    sb.append("    buyerRef: ").append(toIndentedString(buyerRef)).append("\n");
    sb.append("    buyerType: ").append(toIndentedString(buyerType)).append("\n");
    sb.append("    party: ").append(toIndentedString(party)).append("\n");
    sb.append("    eInvoicing: ").append(toIndentedString(eInvoicing)).append("\n");
    sb.append("    contactPerson: ").append(toIndentedString(contactPerson)).append("\n");
    sb.append("    contactAddress: ").append(toIndentedString(contactAddress)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
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

