package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OperationRequestOrderOrderItems;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes Purchase or Refund Operation
 */
@ApiModel(description = "Describes Purchase or Refund Operation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-24T16:21:13.194359300+02:00[Europe/Paris]")
public class OperationRequestOrder   {
  @JsonProperty("orderRef")
  private String orderRef;

  @JsonProperty("currencyCode")
  private String currencyCode;

  /**
   * Necessary for e-Invoicing :  LB = Livraison de Biens, PS = Prestation de Service LBPS = Double 
   */
  public enum OrderTypeEnum {
    LB("LB"),
    
    PS("PS"),
    
    LBPS("LBPS");

    private String value;

    OrderTypeEnum(String value) {
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
    public static OrderTypeEnum fromValue(String value) {
      for (OrderTypeEnum b : OrderTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("orderType")
  private OrderTypeEnum orderType;

  @JsonProperty("orderItems")
  @Valid
  private List<OperationRequestOrderOrderItems> orderItems = null;

  @JsonProperty("totalWithoutTax")
  private BigDecimal totalWithoutTax;

  @JsonProperty("totalTax")
  private BigDecimal totalTax;

  @JsonProperty("totalWithTax")
  private BigDecimal totalWithTax;

  @JsonProperty("amountEcoParticipation")
  private BigDecimal amountEcoParticipation;

  public OperationRequestOrder orderRef(String orderRef) {
    this.orderRef = orderRef;
    return this;
  }

  /**
   * External Order reference
   * @return orderRef
  */
  @ApiModelProperty(example = "789e4567-e89b-12d3-a456-556642440000", value = "External Order reference")


  public String getOrderRef() {
    return orderRef;
  }

  public void setOrderRef(String orderRef) {
    this.orderRef = orderRef;
  }

  public OperationRequestOrder currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Billing currency code as defined in ISO 4217 ([more information about the standard](https://www.iso.org/fr/iso-4217-currency-codes.html))
   * @return currencyCode
  */
  @ApiModelProperty(example = "EUR", value = "Billing currency code as defined in ISO 4217 ([more information about the standard](https://www.iso.org/fr/iso-4217-currency-codes.html))")


  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public OperationRequestOrder orderType(OrderTypeEnum orderType) {
    this.orderType = orderType;
    return this;
  }

  /**
   * Necessary for e-Invoicing :  LB = Livraison de Biens, PS = Prestation de Service LBPS = Double 
   * @return orderType
  */
  @ApiModelProperty(example = "LB", value = "Necessary for e-Invoicing :  LB = Livraison de Biens, PS = Prestation de Service LBPS = Double ")


  public OrderTypeEnum getOrderType() {
    return orderType;
  }

  public void setOrderType(OrderTypeEnum orderType) {
    this.orderType = orderType;
  }

  public OperationRequestOrder orderItems(List<OperationRequestOrderOrderItems> orderItems) {
    this.orderItems = orderItems;
    return this;
  }

  public OperationRequestOrder addOrderItemsItem(OperationRequestOrderOrderItems orderItemsItem) {
    if (this.orderItems == null) {
      this.orderItems = new ArrayList<>();
    }
    this.orderItems.add(orderItemsItem);
    return this;
  }

  /**
   * Get orderItems
   * @return orderItems
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OperationRequestOrderOrderItems> getOrderItems() {
    return orderItems;
  }

  public void setOrderItems(List<OperationRequestOrderOrderItems> orderItems) {
    this.orderItems = orderItems;
  }

  public OperationRequestOrder totalWithoutTax(BigDecimal totalWithoutTax) {
    this.totalWithoutTax = totalWithoutTax;
    return this;
  }

  /**
   * Get totalWithoutTax
   * @return totalWithoutTax
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getTotalWithoutTax() {
    return totalWithoutTax;
  }

  public void setTotalWithoutTax(BigDecimal totalWithoutTax) {
    this.totalWithoutTax = totalWithoutTax;
  }

  public OperationRequestOrder totalTax(BigDecimal totalTax) {
    this.totalTax = totalTax;
    return this;
  }

  /**
   * Get totalTax
   * @return totalTax
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(BigDecimal totalTax) {
    this.totalTax = totalTax;
  }

  public OperationRequestOrder totalWithTax(BigDecimal totalWithTax) {
    this.totalWithTax = totalWithTax;
    return this;
  }

  /**
   * Get totalWithTax
   * @return totalWithTax
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getTotalWithTax() {
    return totalWithTax;
  }

  public void setTotalWithTax(BigDecimal totalWithTax) {
    this.totalWithTax = totalWithTax;
  }

  public OperationRequestOrder amountEcoParticipation(BigDecimal amountEcoParticipation) {
    this.amountEcoParticipation = amountEcoParticipation;
    return this;
  }

  /**
   * Necessary for e-Invoicing
   * @return amountEcoParticipation
  */
  @ApiModelProperty(value = "Necessary for e-Invoicing")

  @Valid

  public BigDecimal getAmountEcoParticipation() {
    return amountEcoParticipation;
  }

  public void setAmountEcoParticipation(BigDecimal amountEcoParticipation) {
    this.amountEcoParticipation = amountEcoParticipation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationRequestOrder operationRequestOrder = (OperationRequestOrder) o;
    return Objects.equals(this.orderRef, operationRequestOrder.orderRef) &&
        Objects.equals(this.currencyCode, operationRequestOrder.currencyCode) &&
        Objects.equals(this.orderType, operationRequestOrder.orderType) &&
        Objects.equals(this.orderItems, operationRequestOrder.orderItems) &&
        Objects.equals(this.totalWithoutTax, operationRequestOrder.totalWithoutTax) &&
        Objects.equals(this.totalTax, operationRequestOrder.totalTax) &&
        Objects.equals(this.totalWithTax, operationRequestOrder.totalWithTax) &&
        Objects.equals(this.amountEcoParticipation, operationRequestOrder.amountEcoParticipation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderRef, currencyCode, orderType, orderItems, totalWithoutTax, totalTax, totalWithTax, amountEcoParticipation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationRequestOrder {\n");
    
    sb.append("    orderRef: ").append(toIndentedString(orderRef)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    orderItems: ").append(toIndentedString(orderItems)).append("\n");
    sb.append("    totalWithoutTax: ").append(toIndentedString(totalWithoutTax)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    totalWithTax: ").append(toIndentedString(totalWithTax)).append("\n");
    sb.append("    amountEcoParticipation: ").append(toIndentedString(amountEcoParticipation)).append("\n");
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

