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
 * SubscriptionResponseAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-24T16:21:13.194359300+02:00[Europe/Paris]")
public class SubscriptionResponseAllOf   {
  @JsonProperty("subscriptionId")
  private Integer subscriptionId;

  @JsonProperty("subscriptionRef")
  private String subscriptionRef;

  public SubscriptionResponseAllOf subscriptionId(Integer subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  /**
   * Internal identifier of the subscription
   * @return subscriptionId
  */
  @ApiModelProperty(example = "58761542", value = "Internal identifier of the subscription")


  public Integer getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(Integer subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public SubscriptionResponseAllOf subscriptionRef(String subscriptionRef) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionResponseAllOf subscriptionResponseAllOf = (SubscriptionResponseAllOf) o;
    return Objects.equals(this.subscriptionId, subscriptionResponseAllOf.subscriptionId) &&
        Objects.equals(this.subscriptionRef, subscriptionResponseAllOf.subscriptionRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, subscriptionRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionResponseAllOf {\n");
    
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    subscriptionRef: ").append(toIndentedString(subscriptionRef)).append("\n");
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

