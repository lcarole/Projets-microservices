package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.WireTransfertResource;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes the payment method used
 */
@ApiModel(description = "Describes the payment method used")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-24T16:21:13.194359300+02:00[Europe/Paris]")
public class BusinessPayment   {
  /**
   * Payment method type (Only WIRETRANSFER for differed billing phase 1)
   */
  public enum PaymentMethodTypeEnum {
    WIRETRANSFER("WIRETRANSFER");

    private String value;

    PaymentMethodTypeEnum(String value) {
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
    public static PaymentMethodTypeEnum fromValue(String value) {
      for (PaymentMethodTypeEnum b : PaymentMethodTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("paymentMethodType")
  private PaymentMethodTypeEnum paymentMethodType;

  @JsonProperty("wireTansfert")
  private WireTransfertResource wireTansfert;

  public BusinessPayment paymentMethodType(PaymentMethodTypeEnum paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
    return this;
  }

  /**
   * Payment method type (Only WIRETRANSFER for differed billing phase 1)
   * @return paymentMethodType
  */
  @ApiModelProperty(example = "WIRETRANSFER", required = true, value = "Payment method type (Only WIRETRANSFER for differed billing phase 1)")
  @NotNull


  public PaymentMethodTypeEnum getPaymentMethodType() {
    return paymentMethodType;
  }

  public void setPaymentMethodType(PaymentMethodTypeEnum paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
  }

  public BusinessPayment wireTansfert(WireTransfertResource wireTansfert) {
    this.wireTansfert = wireTansfert;
    return this;
  }

  /**
   * Get wireTansfert
   * @return wireTansfert
  */
  @ApiModelProperty(value = "")

  @Valid

  public WireTransfertResource getWireTansfert() {
    return wireTansfert;
  }

  public void setWireTansfert(WireTransfertResource wireTansfert) {
    this.wireTansfert = wireTansfert;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessPayment businessPayment = (BusinessPayment) o;
    return Objects.equals(this.paymentMethodType, businessPayment.paymentMethodType) &&
        Objects.equals(this.wireTansfert, businessPayment.wireTansfert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethodType, wireTansfert);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessPayment {\n");
    
    sb.append("    paymentMethodType: ").append(toIndentedString(paymentMethodType)).append("\n");
    sb.append("    wireTansfert: ").append(toIndentedString(wireTansfert)).append("\n");
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

