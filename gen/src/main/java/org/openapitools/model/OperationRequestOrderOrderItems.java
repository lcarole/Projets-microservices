package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.BusinessAddress;
import org.openapitools.model.BusinessPerson;
import org.openapitools.model.OperationRequestOrderProductItems;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationRequestOrderOrderItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-24T16:21:13.194359300+02:00[Europe/Paris]")
public class OperationRequestOrderOrderItems   {
  @JsonProperty("shipmentAddress")
  private BusinessAddress shipmentAddress;

  @JsonProperty("shipmentContact")
  private BusinessPerson shipmentContact;

  @JsonProperty("deliveredOn")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate deliveredOn;

  @JsonProperty("productItems")
  @Valid
  private List<OperationRequestOrderProductItems> productItems = null;

  public OperationRequestOrderOrderItems shipmentAddress(BusinessAddress shipmentAddress) {
    this.shipmentAddress = shipmentAddress;
    return this;
  }

  /**
   * Get shipmentAddress
   * @return shipmentAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public BusinessAddress getShipmentAddress() {
    return shipmentAddress;
  }

  public void setShipmentAddress(BusinessAddress shipmentAddress) {
    this.shipmentAddress = shipmentAddress;
  }

  public OperationRequestOrderOrderItems shipmentContact(BusinessPerson shipmentContact) {
    this.shipmentContact = shipmentContact;
    return this;
  }

  /**
   * Get shipmentContact
   * @return shipmentContact
  */
  @ApiModelProperty(value = "")

  @Valid

  public BusinessPerson getShipmentContact() {
    return shipmentContact;
  }

  public void setShipmentContact(BusinessPerson shipmentContact) {
    this.shipmentContact = shipmentContact;
  }

  public OperationRequestOrderOrderItems deliveredOn(LocalDate deliveredOn) {
    this.deliveredOn = deliveredOn;
    return this;
  }

  /**
   * Order delivery date
   * @return deliveredOn
  */
  @ApiModelProperty(example = "Thu Apr 28 02:00:00 CEST 2022", value = "Order delivery date")

  @Valid

  public LocalDate getDeliveredOn() {
    return deliveredOn;
  }

  public void setDeliveredOn(LocalDate deliveredOn) {
    this.deliveredOn = deliveredOn;
  }

  public OperationRequestOrderOrderItems productItems(List<OperationRequestOrderProductItems> productItems) {
    this.productItems = productItems;
    return this;
  }

  public OperationRequestOrderOrderItems addProductItemsItem(OperationRequestOrderProductItems productItemsItem) {
    if (this.productItems == null) {
      this.productItems = new ArrayList<>();
    }
    this.productItems.add(productItemsItem);
    return this;
  }

  /**
   * Get productItems
   * @return productItems
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OperationRequestOrderProductItems> getProductItems() {
    return productItems;
  }

  public void setProductItems(List<OperationRequestOrderProductItems> productItems) {
    this.productItems = productItems;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationRequestOrderOrderItems operationRequestOrderOrderItems = (OperationRequestOrderOrderItems) o;
    return Objects.equals(this.shipmentAddress, operationRequestOrderOrderItems.shipmentAddress) &&
        Objects.equals(this.shipmentContact, operationRequestOrderOrderItems.shipmentContact) &&
        Objects.equals(this.deliveredOn, operationRequestOrderOrderItems.deliveredOn) &&
        Objects.equals(this.productItems, operationRequestOrderOrderItems.productItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipmentAddress, shipmentContact, deliveredOn, productItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationRequestOrderOrderItems {\n");
    
    sb.append("    shipmentAddress: ").append(toIndentedString(shipmentAddress)).append("\n");
    sb.append("    shipmentContact: ").append(toIndentedString(shipmentContact)).append("\n");
    sb.append("    deliveredOn: ").append(toIndentedString(deliveredOn)).append("\n");
    sb.append("    productItems: ").append(toIndentedString(productItems)).append("\n");
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

