package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.OperationResponse;
import org.openapitools.model.QueryMetadataResponse;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * List of operations that meet the search criteria
 */
@ApiModel(description = "List of operations that meet the search criteria")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-24T16:21:13.194359300+02:00[Europe/Paris]")
public class OperationsResponse   {
  @JsonProperty("operations")
  @Valid
  private List<OperationResponse> operations = null;

  @JsonProperty("metadata")
  private QueryMetadataResponse metadata;

  public OperationsResponse operations(List<OperationResponse> operations) {
    this.operations = operations;
    return this;
  }

  public OperationsResponse addOperationsItem(OperationResponse operationsItem) {
    if (this.operations == null) {
      this.operations = new ArrayList<>();
    }
    this.operations.add(operationsItem);
    return this;
  }

  /**
   * Get operations
   * @return operations
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<OperationResponse> getOperations() {
    return operations;
  }

  public void setOperations(List<OperationResponse> operations) {
    this.operations = operations;
  }

  public OperationsResponse metadata(QueryMetadataResponse metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
  @ApiModelProperty(value = "")

  @Valid

  public QueryMetadataResponse getMetadata() {
    return metadata;
  }

  public void setMetadata(QueryMetadataResponse metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationsResponse operationsResponse = (OperationsResponse) o;
    return Objects.equals(this.operations, operationsResponse.operations) &&
        Objects.equals(this.metadata, operationsResponse.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operations, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationsResponse {\n");
    
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

