package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BusinessBuyer;
import org.openapitools.model.BusinessContract;
import org.openapitools.model.BusinessPayment;
import org.openapitools.model.BusinessSeller;
import org.openapitools.model.SubscriptionRequest;
import org.openapitools.model.SubscriptionResponseAllOf;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SubscriptionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-24T16:21:13.194359300+02:00[Europe/Paris]")
public class SubscriptionResponse   {
  @JsonProperty("subscriptionId")
  private Integer subscriptionId;

  @JsonProperty("subscriptionRef")
  private String subscriptionRef;

  /**
   * Type of subscription
   */
  public enum SubscriptionTypeEnum {
    DEFERRED_BILLING("DEFERRED_BILLING");

    private String value;

    SubscriptionTypeEnum(String value) {
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
    public static SubscriptionTypeEnum fromValue(String value) {
      for (SubscriptionTypeEnum b : SubscriptionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("subscriptionType")
  private SubscriptionTypeEnum subscriptionType;

  @JsonProperty("contract")
  private BusinessContract contract;

  @JsonProperty("seller")
  private BusinessSeller seller;

  @JsonProperty("buyer")
  private BusinessBuyer buyer;

  @JsonProperty("payment")
  private BusinessPayment payment;

  public SubscriptionResponse subscriptionId(Integer subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  /**
   * Internal identifier of the subscription
   * @return subscriptionId
  */
  @ApiModelProperty(example = "58761542", required = true, value = "Internal identifier of the subscription")
  @NotNull


  public Integer getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(Integer subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public SubscriptionResponse subscriptionRef(String subscriptionRef) {
    this.subscriptionRef = subscriptionRef;
    return this;
  }

  /**
   * External identifier of the subscription
   * @return subscriptionRef
  */
  @ApiModelProperty(example = "SUB-YTYE65687", value = "External identifier of the subscription")


  public String getSubscriptionRef() {
    return subscriptionRef;
  }

  public void setSubscriptionRef(String subscriptionRef) {
    this.subscriptionRef = subscriptionRef;
  }

  public SubscriptionResponse subscriptionType(SubscriptionTypeEnum subscriptionType) {
    this.subscriptionType = subscriptionType;
    return this;
  }

  /**
   * Type of subscription
   * @return subscriptionType
  */
  @ApiModelProperty(example = "DEFERRED_BILLING", required = true, value = "Type of subscription")
  @NotNull


  public SubscriptionTypeEnum getSubscriptionType() {
    return subscriptionType;
  }

  public void setSubscriptionType(SubscriptionTypeEnum subscriptionType) {
    this.subscriptionType = subscriptionType;
  }

  public SubscriptionResponse contract(BusinessContract contract) {
    this.contract = contract;
    return this;
  }

  /**
   * Get contract
   * @return contract
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BusinessContract getContract() {
    return contract;
  }

  public void setContract(BusinessContract contract) {
    this.contract = contract;
  }

  public SubscriptionResponse seller(BusinessSeller seller) {
    this.seller = seller;
    return this;
  }

  /**
   * Get seller
   * @return seller
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BusinessSeller getSeller() {
    return seller;
  }

  public void setSeller(BusinessSeller seller) {
    this.seller = seller;
  }

  public SubscriptionResponse buyer(BusinessBuyer buyer) {
    this.buyer = buyer;
    return this;
  }

  /**
   * Get buyer
   * @return buyer
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BusinessBuyer getBuyer() {
    return buyer;
  }

  public void setBuyer(BusinessBuyer buyer) {
    this.buyer = buyer;
  }

  public SubscriptionResponse payment(BusinessPayment payment) {
    this.payment = payment;
    return this;
  }

  /**
   * Get payment
   * @return payment
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BusinessPayment getPayment() {
    return payment;
  }

  public void setPayment(BusinessPayment payment) {
    this.payment = payment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionResponse subscriptionResponse = (SubscriptionResponse) o;
    return Objects.equals(this.subscriptionId, subscriptionResponse.subscriptionId) &&
        Objects.equals(this.subscriptionRef, subscriptionResponse.subscriptionRef) &&
        Objects.equals(this.subscriptionType, subscriptionResponse.subscriptionType) &&
        Objects.equals(this.contract, subscriptionResponse.contract) &&
        Objects.equals(this.seller, subscriptionResponse.seller) &&
        Objects.equals(this.buyer, subscriptionResponse.buyer) &&
        Objects.equals(this.payment, subscriptionResponse.payment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, subscriptionRef, subscriptionType, contract, seller, buyer, payment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionResponse {\n");
    
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    subscriptionRef: ").append(toIndentedString(subscriptionRef)).append("\n");
    sb.append("    subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
    sb.append("    buyer: ").append(toIndentedString(buyer)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
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

