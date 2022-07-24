package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationRequestOrderProductItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-24T16:21:13.194359300+02:00[Europe/Paris]")
public class OperationRequestOrderProductItems   {
  @JsonProperty("productRef")
  private String productRef;

  @JsonProperty("productLabel")
  private String productLabel;

  @JsonProperty("quantity")
  private Integer quantity;

  @JsonProperty("packaging")
  private String packaging;

  @JsonProperty("unitPrice")
  private BigDecimal unitPrice;

  @JsonProperty("vatRate")
  private BigDecimal vatRate;

  @JsonProperty("amountWithoutTax")
  private BigDecimal amountWithoutTax;

  @JsonProperty("amountTax")
  private BigDecimal amountTax;

  @JsonProperty("amountWithTax")
  private BigDecimal amountWithTax;

  @JsonProperty("amountEcoParticipation")
  private BigDecimal amountEcoParticipation;

  public OperationRequestOrderProductItems productRef(String productRef) {
    this.productRef = productRef;
    return this;
  }

  /**
   * Get productRef
   * @return productRef
  */
  @ApiModelProperty(value = "")


  public String getProductRef() {
    return productRef;
  }

  public void setProductRef(String productRef) {
    this.productRef = productRef;
  }

  public OperationRequestOrderProductItems productLabel(String productLabel) {
    this.productLabel = productLabel;
    return this;
  }

  /**
   * Get productLabel
   * @return productLabel
  */
  @ApiModelProperty(value = "")


  public String getProductLabel() {
    return productLabel;
  }

  public void setProductLabel(String productLabel) {
    this.productLabel = productLabel;
  }

  public OperationRequestOrderProductItems quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  */
  @ApiModelProperty(value = "")


  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public OperationRequestOrderProductItems packaging(String packaging) {
    this.packaging = packaging;
    return this;
  }

  /**
   * Get packaging
   * @return packaging
  */
  @ApiModelProperty(value = "")


  public String getPackaging() {
    return packaging;
  }

  public void setPackaging(String packaging) {
    this.packaging = packaging;
  }

  public OperationRequestOrderProductItems unitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  /**
   * Get unitPrice
   * @return unitPrice
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }

  public OperationRequestOrderProductItems vatRate(BigDecimal vatRate) {
    this.vatRate = vatRate;
    return this;
  }

  /**
   * Get vatRate
   * @return vatRate
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getVatRate() {
    return vatRate;
  }

  public void setVatRate(BigDecimal vatRate) {
    this.vatRate = vatRate;
  }

  public OperationRequestOrderProductItems amountWithoutTax(BigDecimal amountWithoutTax) {
    this.amountWithoutTax = amountWithoutTax;
    return this;
  }

  /**
   * Get amountWithoutTax
   * @return amountWithoutTax
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getAmountWithoutTax() {
    return amountWithoutTax;
  }

  public void setAmountWithoutTax(BigDecimal amountWithoutTax) {
    this.amountWithoutTax = amountWithoutTax;
  }

  public OperationRequestOrderProductItems amountTax(BigDecimal amountTax) {
    this.amountTax = amountTax;
    return this;
  }

  /**
   * Get amountTax
   * @return amountTax
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getAmountTax() {
    return amountTax;
  }

  public void setAmountTax(BigDecimal amountTax) {
    this.amountTax = amountTax;
  }

  public OperationRequestOrderProductItems amountWithTax(BigDecimal amountWithTax) {
    this.amountWithTax = amountWithTax;
    return this;
  }

  /**
   * Get amountWithTax
   * @return amountWithTax
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getAmountWithTax() {
    return amountWithTax;
  }

  public void setAmountWithTax(BigDecimal amountWithTax) {
    this.amountWithTax = amountWithTax;
  }

  public OperationRequestOrderProductItems amountEcoParticipation(BigDecimal amountEcoParticipation) {
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
    OperationRequestOrderProductItems operationRequestOrderProductItems = (OperationRequestOrderProductItems) o;
    return Objects.equals(this.productRef, operationRequestOrderProductItems.productRef) &&
        Objects.equals(this.productLabel, operationRequestOrderProductItems.productLabel) &&
        Objects.equals(this.quantity, operationRequestOrderProductItems.quantity) &&
        Objects.equals(this.packaging, operationRequestOrderProductItems.packaging) &&
        Objects.equals(this.unitPrice, operationRequestOrderProductItems.unitPrice) &&
        Objects.equals(this.vatRate, operationRequestOrderProductItems.vatRate) &&
        Objects.equals(this.amountWithoutTax, operationRequestOrderProductItems.amountWithoutTax) &&
        Objects.equals(this.amountTax, operationRequestOrderProductItems.amountTax) &&
        Objects.equals(this.amountWithTax, operationRequestOrderProductItems.amountWithTax) &&
        Objects.equals(this.amountEcoParticipation, operationRequestOrderProductItems.amountEcoParticipation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productRef, productLabel, quantity, packaging, unitPrice, vatRate, amountWithoutTax, amountTax, amountWithTax, amountEcoParticipation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationRequestOrderProductItems {\n");
    
    sb.append("    productRef: ").append(toIndentedString(productRef)).append("\n");
    sb.append("    productLabel: ").append(toIndentedString(productLabel)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    packaging: ").append(toIndentedString(packaging)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    vatRate: ").append(toIndentedString(vatRate)).append("\n");
    sb.append("    amountWithoutTax: ").append(toIndentedString(amountWithoutTax)).append("\n");
    sb.append("    amountTax: ").append(toIndentedString(amountTax)).append("\n");
    sb.append("    amountWithTax: ").append(toIndentedString(amountWithTax)).append("\n");
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

