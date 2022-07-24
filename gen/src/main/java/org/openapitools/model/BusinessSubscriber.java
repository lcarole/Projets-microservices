package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BusinessAddress;
import org.openapitools.model.BusinessPerson;
import org.openapitools.model.BusinessProfessionnalParty;
import org.openapitools.model.BusinessSubscriberEInvoicing;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes subscriber organisation &amp; contact
 */
@ApiModel(description = "Describes subscriber organisation & contact")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-24T16:40:58.350645200+02:00[Europe/Paris]")
public class BusinessSubscriber   {
  @JsonProperty("subscriberRef")
  private String subscriberRef;

  /**
   * Gets or Sets subscriberType
   */
  public enum SubscriberTypeEnum {
    PARTICULAR("PARTICULAR"),
    
    PROFESSIONNAL("PROFESSIONNAL");

    private String value;

    SubscriberTypeEnum(String value) {
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
    public static SubscriberTypeEnum fromValue(String value) {
      for (SubscriberTypeEnum b : SubscriberTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("subscriberType")
  private SubscriberTypeEnum subscriberType;

  @JsonProperty("party")
  private BusinessProfessionnalParty party;

  @JsonProperty("eInvoicing")
  private BusinessSubscriberEInvoicing eInvoicing;

  @JsonProperty("contactPerson")
  private BusinessPerson contactPerson;

  @JsonProperty("contactAddress")
  private BusinessAddress contactAddress;

  @JsonProperty("billingAddress")
  private BusinessAddress billingAddress;

  public BusinessSubscriber subscriberRef(String subscriberRef) {
    this.subscriberRef = subscriberRef;
    return this;
  }

  /**
   * External reference of subscriber (By example: social reason of the company)
   * @return subscriberRef
  */
  @ApiModelProperty(example = "Ma Petite Entreprise", value = "External reference of subscriber (By example: social reason of the company)")


  public String getSubscriberRef() {
    return subscriberRef;
  }

  public void setSubscriberRef(String subscriberRef) {
    this.subscriberRef = subscriberRef;
  }

  public BusinessSubscriber subscriberType(SubscriberTypeEnum subscriberType) {
    this.subscriberType = subscriberType;
    return this;
  }

  /**
   * Get subscriberType
   * @return subscriberType
  */
  @ApiModelProperty(example = "PROFESSIONNAL", required = true, value = "")
  @NotNull


  public SubscriberTypeEnum getSubscriberType() {
    return subscriberType;
  }

  public void setSubscriberType(SubscriberTypeEnum subscriberType) {
    this.subscriberType = subscriberType;
  }

  public BusinessSubscriber party(BusinessProfessionnalParty party) {
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

  public BusinessSubscriber eInvoicing(BusinessSubscriberEInvoicing eInvoicing) {
    this.eInvoicing = eInvoicing;
    return this;
  }

  /**
   * Get eInvoicing
   * @return eInvoicing
  */
  @ApiModelProperty(value = "")

  @Valid

  public BusinessSubscriberEInvoicing geteInvoicing() {
    return eInvoicing;
  }

  public void seteInvoicing(BusinessSubscriberEInvoicing eInvoicing) {
    this.eInvoicing = eInvoicing;
  }

  public BusinessSubscriber contactPerson(BusinessPerson contactPerson) {
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

  public BusinessSubscriber contactAddress(BusinessAddress contactAddress) {
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

  public BusinessSubscriber billingAddress(BusinessAddress billingAddress) {
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
    BusinessSubscriber businessSubscriber = (BusinessSubscriber) o;
    return Objects.equals(this.subscriberRef, businessSubscriber.subscriberRef) &&
        Objects.equals(this.subscriberType, businessSubscriber.subscriberType) &&
        Objects.equals(this.party, businessSubscriber.party) &&
        Objects.equals(this.eInvoicing, businessSubscriber.eInvoicing) &&
        Objects.equals(this.contactPerson, businessSubscriber.contactPerson) &&
        Objects.equals(this.contactAddress, businessSubscriber.contactAddress) &&
        Objects.equals(this.billingAddress, businessSubscriber.billingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriberRef, subscriberType, party, eInvoicing, contactPerson, contactAddress, billingAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessSubscriber {\n");
    
    sb.append("    subscriberRef: ").append(toIndentedString(subscriberRef)).append("\n");
    sb.append("    subscriberType: ").append(toIndentedString(subscriberType)).append("\n");
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

