package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.model.BusinessDistributor;
import org.openapitools.model.BusinessSubscriber;
import org.openapitools.model.ContractRequest;
import org.openapitools.model.ContractResponseAllOf;
import org.openapitools.model.DeferredBilling;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContractResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-24T16:40:58.350645200+02:00[Europe/Paris]")
public class ContractResponse   {
  @JsonProperty("contractId")
  private Integer contractId;

  @JsonProperty("contractRef")
  private String contractRef;

  /**
   * External reference of the product
   */
  public enum ProductRefEnum {
    DEFERRED_BILLING("DEFERRED_BILLING");

    private String value;

    ProductRefEnum(String value) {
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
    public static ProductRefEnum fromValue(String value) {
      for (ProductRefEnum b : ProductRefEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("productRef")
  private ProductRefEnum productRef;

  /**
   * Type of contract
   */
  public enum ContractTypeEnum {
    DEFERRED_BILLING("DEFERRED_BILLING");

    private String value;

    ContractTypeEnum(String value) {
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
    public static ContractTypeEnum fromValue(String value) {
      for (ContractTypeEnum b : ContractTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("contractType")
  private ContractTypeEnum contractType;

  @JsonProperty("createdAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate createdAt;

  @JsonProperty("signedAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate signedAt;

  @JsonProperty("activatedAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate activatedAt;

  @JsonProperty("expireAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate expireAt;

  /**
   * Status of contact
   */
  public enum StatusEnum {
    CREATED("CREATED"),
    
    ACTIVE("ACTIVE"),
    
    SUSPENDED("SUSPENDED"),
    
    EXPIRED("EXPIRED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  @JsonProperty("distributor")
  private BusinessDistributor distributor;

  @JsonProperty("subscriber")
  private BusinessSubscriber subscriber;

  @JsonProperty("custom")
  private DeferredBilling custom;

  public ContractResponse contractId(Integer contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * Internal identifier of the contract
   * @return contractId
  */
  @ApiModelProperty(example = "58761542", required = true, value = "Internal identifier of the contract")
  @NotNull


  public Integer getContractId() {
    return contractId;
  }

  public void setContractId(Integer contractId) {
    this.contractId = contractId;
  }

  public ContractResponse contractRef(String contractRef) {
    this.contractRef = contractRef;
    return this;
  }

  /**
   * External identifier of the contract
   * @return contractRef
  */
  @ApiModelProperty(example = "SUB-YTYE65687", required = true, value = "External identifier of the contract")
  @NotNull


  public String getContractRef() {
    return contractRef;
  }

  public void setContractRef(String contractRef) {
    this.contractRef = contractRef;
  }

  public ContractResponse productRef(ProductRefEnum productRef) {
    this.productRef = productRef;
    return this;
  }

  /**
   * External reference of the product
   * @return productRef
  */
  @ApiModelProperty(example = "DEFERRED_BILLING", value = "External reference of the product")


  public ProductRefEnum getProductRef() {
    return productRef;
  }

  public void setProductRef(ProductRefEnum productRef) {
    this.productRef = productRef;
  }

  public ContractResponse contractType(ContractTypeEnum contractType) {
    this.contractType = contractType;
    return this;
  }

  /**
   * Type of contract
   * @return contractType
  */
  @ApiModelProperty(example = "DEFERRED_BILLING", required = true, value = "Type of contract")
  @NotNull


  public ContractTypeEnum getContractType() {
    return contractType;
  }

  public void setContractType(ContractTypeEnum contractType) {
    this.contractType = contractType;
  }

  public ContractResponse createdAt(LocalDate createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Creation date of contract (use ISO 8601 format YYYY-MM-DD)
   * @return createdAt
  */
  @ApiModelProperty(example = "Fri Apr 22 02:00:00 CEST 2022", required = true, value = "Creation date of contract (use ISO 8601 format YYYY-MM-DD)")
  @NotNull

  @Valid

  public LocalDate getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDate createdAt) {
    this.createdAt = createdAt;
  }

  public ContractResponse signedAt(LocalDate signedAt) {
    this.signedAt = signedAt;
    return this;
  }

  /**
   * Signed date of contract (use ISO 8601 format YYYY-MM-DD)
   * @return signedAt
  */
  @ApiModelProperty(example = "Fri Apr 22 02:00:00 CEST 2022", value = "Signed date of contract (use ISO 8601 format YYYY-MM-DD)")

  @Valid

  public LocalDate getSignedAt() {
    return signedAt;
  }

  public void setSignedAt(LocalDate signedAt) {
    this.signedAt = signedAt;
  }

  public ContractResponse activatedAt(LocalDate activatedAt) {
    this.activatedAt = activatedAt;
    return this;
  }

  /**
   * Activation date of contract (use ISO 8601 format YYYY-MM-DD)
   * @return activatedAt
  */
  @ApiModelProperty(example = "Sun Apr 24 02:00:00 CEST 2022", required = true, value = "Activation date of contract (use ISO 8601 format YYYY-MM-DD)")
  @NotNull

  @Valid

  public LocalDate getActivatedAt() {
    return activatedAt;
  }

  public void setActivatedAt(LocalDate activatedAt) {
    this.activatedAt = activatedAt;
  }

  public ContractResponse expireAt(LocalDate expireAt) {
    this.expireAt = expireAt;
    return this;
  }

  /**
   * Expiration date of contract (use ISO 8601 format YYYY-MM-DD)
   * @return expireAt
  */
  @ApiModelProperty(example = "Sat Apr 01 02:00:00 CEST 2023", required = true, value = "Expiration date of contract (use ISO 8601 format YYYY-MM-DD)")
  @NotNull

  @Valid

  public LocalDate getExpireAt() {
    return expireAt;
  }

  public void setExpireAt(LocalDate expireAt) {
    this.expireAt = expireAt;
  }

  public ContractResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of contact
   * @return status
  */
  @ApiModelProperty(example = "ACTIVE", required = true, value = "Status of contact")
  @NotNull


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ContractResponse distributor(BusinessDistributor distributor) {
    this.distributor = distributor;
    return this;
  }

  /**
   * Get distributor
   * @return distributor
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BusinessDistributor getDistributor() {
    return distributor;
  }

  public void setDistributor(BusinessDistributor distributor) {
    this.distributor = distributor;
  }

  public ContractResponse subscriber(BusinessSubscriber subscriber) {
    this.subscriber = subscriber;
    return this;
  }

  /**
   * Get subscriber
   * @return subscriber
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BusinessSubscriber getSubscriber() {
    return subscriber;
  }

  public void setSubscriber(BusinessSubscriber subscriber) {
    this.subscriber = subscriber;
  }

  public ContractResponse custom(DeferredBilling custom) {
    this.custom = custom;
    return this;
  }

  /**
   * Get custom
   * @return custom
  */
  @ApiModelProperty(value = "")

  @Valid

  public DeferredBilling getCustom() {
    return custom;
  }

  public void setCustom(DeferredBilling custom) {
    this.custom = custom;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractResponse contractResponse = (ContractResponse) o;
    return Objects.equals(this.contractId, contractResponse.contractId) &&
        Objects.equals(this.contractRef, contractResponse.contractRef) &&
        Objects.equals(this.productRef, contractResponse.productRef) &&
        Objects.equals(this.contractType, contractResponse.contractType) &&
        Objects.equals(this.createdAt, contractResponse.createdAt) &&
        Objects.equals(this.signedAt, contractResponse.signedAt) &&
        Objects.equals(this.activatedAt, contractResponse.activatedAt) &&
        Objects.equals(this.expireAt, contractResponse.expireAt) &&
        Objects.equals(this.status, contractResponse.status) &&
        Objects.equals(this.distributor, contractResponse.distributor) &&
        Objects.equals(this.subscriber, contractResponse.subscriber) &&
        Objects.equals(this.custom, contractResponse.custom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractId, contractRef, productRef, contractType, createdAt, signedAt, activatedAt, expireAt, status, distributor, subscriber, custom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractResponse {\n");
    
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    contractRef: ").append(toIndentedString(contractRef)).append("\n");
    sb.append("    productRef: ").append(toIndentedString(productRef)).append("\n");
    sb.append("    contractType: ").append(toIndentedString(contractType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    signedAt: ").append(toIndentedString(signedAt)).append("\n");
    sb.append("    activatedAt: ").append(toIndentedString(activatedAt)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    distributor: ").append(toIndentedString(distributor)).append("\n");
    sb.append("    subscriber: ").append(toIndentedString(subscriber)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
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

