package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.QueryMetadataResponse;
import org.openapitools.model.SubscriptionResponse;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * List of subscriptions that meet the search criteria
 */
@ApiModel(description = "List of subscriptions that meet the search criteria")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-24T16:21:13.194359300+02:00[Europe/Paris]")
public class SubscriptionsResponse   {
  @JsonProperty("subscriptions")
  @Valid
  private List<SubscriptionResponse> subscriptions = null;

  @JsonProperty("metadata")
  private QueryMetadataResponse metadata;

  public SubscriptionsResponse subscriptions(List<SubscriptionResponse> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public SubscriptionsResponse addSubscriptionsItem(SubscriptionResponse subscriptionsItem) {
    if (this.subscriptions == null) {
      this.subscriptions = new ArrayList<>();
    }
    this.subscriptions.add(subscriptionsItem);
    return this;
  }

  /**
   * Get subscriptions
   * @return subscriptions
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<SubscriptionResponse> getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(List<SubscriptionResponse> subscriptions) {
    this.subscriptions = subscriptions;
  }

  public SubscriptionsResponse metadata(QueryMetadataResponse metadata) {
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
    SubscriptionsResponse subscriptionsResponse = (SubscriptionsResponse) o;
    return Objects.equals(this.subscriptions, subscriptionsResponse.subscriptions) &&
        Objects.equals(this.metadata, subscriptionsResponse.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptions, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionsResponse {\n");
    
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
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

