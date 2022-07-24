package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.WireTransfertResourceBankCoordinates;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SEPA Informations
 */
@ApiModel(description = "SEPA Informations")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-24T16:21:13.194359300+02:00[Europe/Paris]")
public class WireTransfertResource   {
  @JsonProperty("rum")
  private String rum;

  @JsonProperty("bankCoordinates")
  private WireTransfertResourceBankCoordinates bankCoordinates;

  public WireTransfertResource rum(String rum) {
    this.rum = rum;
    return this;
  }

  /**
   * Référence Unique de Mandat
   * @return rum
  */
  @ApiModelProperty(example = "RUM08918098739762ABCGDF65524255658", value = "Référence Unique de Mandat")


  public String getRum() {
    return rum;
  }

  public void setRum(String rum) {
    this.rum = rum;
  }

  public WireTransfertResource bankCoordinates(WireTransfertResourceBankCoordinates bankCoordinates) {
    this.bankCoordinates = bankCoordinates;
    return this;
  }

  /**
   * Get bankCoordinates
   * @return bankCoordinates
  */
  @ApiModelProperty(value = "")

  @Valid

  public WireTransfertResourceBankCoordinates getBankCoordinates() {
    return bankCoordinates;
  }

  public void setBankCoordinates(WireTransfertResourceBankCoordinates bankCoordinates) {
    this.bankCoordinates = bankCoordinates;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WireTransfertResource wireTransfertResource = (WireTransfertResource) o;
    return Objects.equals(this.rum, wireTransfertResource.rum) &&
        Objects.equals(this.bankCoordinates, wireTransfertResource.bankCoordinates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rum, bankCoordinates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WireTransfertResource {\n");
    
    sb.append("    rum: ").append(toIndentedString(rum)).append("\n");
    sb.append("    bankCoordinates: ").append(toIndentedString(bankCoordinates)).append("\n");
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

