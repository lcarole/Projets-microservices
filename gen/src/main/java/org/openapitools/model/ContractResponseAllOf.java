package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContractResponseAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-24T16:40:58.350645200+02:00[Europe/Paris]")
public class ContractResponseAllOf   {
  @JsonProperty("contractId")
  private Integer contractId;

  @JsonProperty("contractRef")
  private String contractRef;

  public ContractResponseAllOf contractId(Integer contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * Internal identifier of the contract
   * @return contractId
  */
  @ApiModelProperty(example = "58761542", value = "Internal identifier of the contract")


  public Integer getContractId() {
    return contractId;
  }

  public void setContractId(Integer contractId) {
    this.contractId = contractId;
  }

  public ContractResponseAllOf contractRef(String contractRef) {
    this.contractRef = contractRef;
    return this;
  }

  /**
   * External identifier of the contract
   * @return contractRef
  */
  @ApiModelProperty(example = "SUB-YTYE65687", value = "External identifier of the contract")


  public String getContractRef() {
    return contractRef;
  }

  public void setContractRef(String contractRef) {
    this.contractRef = contractRef;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractResponseAllOf contractResponseAllOf = (ContractResponseAllOf) o;
    return Objects.equals(this.contractId, contractResponseAllOf.contractId) &&
        Objects.equals(this.contractRef, contractResponseAllOf.contractRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractId, contractRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractResponseAllOf {\n");
    
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    contractRef: ").append(toIndentedString(contractRef)).append("\n");
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

