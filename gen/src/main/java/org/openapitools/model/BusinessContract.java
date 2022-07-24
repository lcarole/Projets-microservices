package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describe business contract
 */
@ApiModel(description = "Describe business contract")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-24T16:21:13.194359300+02:00[Europe/Paris]")
public class BusinessContract   {
  @JsonProperty("contractId")
  private Integer contractId;

  @JsonProperty("contractRef")
  private String contractRef;

  @JsonProperty("createdAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate createdAt;

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
    
    ACTIVATED("ACTIVATED"),
    
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

  public BusinessContract contractId(Integer contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * Internal identifier of the subscription
   * @return contractId
  */
  @ApiModelProperty(example = "786876725453", value = "Internal identifier of the subscription")


  public Integer getContractId() {
    return contractId;
  }

  public void setContractId(Integer contractId) {
    this.contractId = contractId;
  }

  public BusinessContract contractRef(String contractRef) {
    this.contractRef = contractRef;
    return this;
  }

  /**
   * External contract reference
   * @return contractRef
  */
  @ApiModelProperty(example = "CTR-JHKJQGFSHFHGS", value = "External contract reference")


  public String getContractRef() {
    return contractRef;
  }

  public void setContractRef(String contractRef) {
    this.contractRef = contractRef;
  }

  public BusinessContract createdAt(LocalDate createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Creation date of contract (use ISO 8601 format YYYY-MM-DD)
   * @return createdAt
  */
  @ApiModelProperty(example = "Fri Apr 22 02:00:00 CEST 2022", value = "Creation date of contract (use ISO 8601 format YYYY-MM-DD)")

  @Valid

  public LocalDate getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDate createdAt) {
    this.createdAt = createdAt;
  }

  public BusinessContract activatedAt(LocalDate activatedAt) {
    this.activatedAt = activatedAt;
    return this;
  }

  /**
   * Activation date of contract (use ISO 8601 format YYYY-MM-DD)
   * @return activatedAt
  */
  @ApiModelProperty(example = "Sun Apr 24 02:00:00 CEST 2022", value = "Activation date of contract (use ISO 8601 format YYYY-MM-DD)")

  @Valid

  public LocalDate getActivatedAt() {
    return activatedAt;
  }

  public void setActivatedAt(LocalDate activatedAt) {
    this.activatedAt = activatedAt;
  }

  public BusinessContract expireAt(LocalDate expireAt) {
    this.expireAt = expireAt;
    return this;
  }

  /**
   * Expiration date of contract (use ISO 8601 format YYYY-MM-DD)
   * @return expireAt
  */
  @ApiModelProperty(example = "Sat Apr 01 02:00:00 CEST 2023", value = "Expiration date of contract (use ISO 8601 format YYYY-MM-DD)")

  @Valid

  public LocalDate getExpireAt() {
    return expireAt;
  }

  public void setExpireAt(LocalDate expireAt) {
    this.expireAt = expireAt;
  }

  public BusinessContract status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of contact
   * @return status
  */
  @ApiModelProperty(example = "ACTIVE", value = "Status of contact")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessContract businessContract = (BusinessContract) o;
    return Objects.equals(this.contractId, businessContract.contractId) &&
        Objects.equals(this.contractRef, businessContract.contractRef) &&
        Objects.equals(this.createdAt, businessContract.createdAt) &&
        Objects.equals(this.activatedAt, businessContract.activatedAt) &&
        Objects.equals(this.expireAt, businessContract.expireAt) &&
        Objects.equals(this.status, businessContract.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractId, contractRef, createdAt, activatedAt, expireAt, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessContract {\n");
    
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    contractRef: ").append(toIndentedString(contractRef)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    activatedAt: ").append(toIndentedString(activatedAt)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

