package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BusinessProfessionnalPartyProfessionnal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes professionnal organisation
 */
@ApiModel(description = "Describes professionnal organisation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-24T16:21:13.194359300+02:00[Europe/Paris]")
public class BusinessProfessionnalParty   {
  @JsonProperty("professionnal")
  private BusinessProfessionnalPartyProfessionnal professionnal;

  public BusinessProfessionnalParty professionnal(BusinessProfessionnalPartyProfessionnal professionnal) {
    this.professionnal = professionnal;
    return this;
  }

  /**
   * Get professionnal
   * @return professionnal
  */
  @ApiModelProperty(value = "")

  @Valid

  public BusinessProfessionnalPartyProfessionnal getProfessionnal() {
    return professionnal;
  }

  public void setProfessionnal(BusinessProfessionnalPartyProfessionnal professionnal) {
    this.professionnal = professionnal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessProfessionnalParty businessProfessionnalParty = (BusinessProfessionnalParty) o;
    return Objects.equals(this.professionnal, businessProfessionnalParty.professionnal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(professionnal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessProfessionnalParty {\n");
    
    sb.append("    professionnal: ").append(toIndentedString(professionnal)).append("\n");
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

