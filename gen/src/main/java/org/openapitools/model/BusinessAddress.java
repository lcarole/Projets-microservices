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
 * A postal address splitted in 6 lines ordered as defined in RNVP and french standard AFNOR NF Z 10-011 ([more information about the standards](http://www.rnvp-internationale.com/norme-postale/NF-Z-10-011.php)). All the lines are mandatory. Lines that are optional may be empty. 
 */
@ApiModel(description = "A postal address splitted in 6 lines ordered as defined in RNVP and french standard AFNOR NF Z 10-011 ([more information about the standards](http://www.rnvp-internationale.com/norme-postale/NF-Z-10-011.php)). All the lines are mandatory. Lines that are optional may be empty. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-24T16:40:58.350645200+02:00[Europe/Paris]")
public class BusinessAddress   {
  @JsonProperty("line1")
  private String line1;

  @JsonProperty("line2")
  private String line2;

  @JsonProperty("line3")
  private String line3;

  @JsonProperty("line4")
  private String line4;

  @JsonProperty("line5")
  private String line5;

  @JsonProperty("locality")
  private String locality;

  @JsonProperty("countryCode")
  private String countryCode;

  @JsonProperty("countryName")
  private String countryName;

  public BusinessAddress line1(String line1) {
    this.line1 = line1;
    return this;
  }

  /**
   * Particular: CIVILITÉ - TITRE ou QUALITÉ - PRÉNOM - NOM Progessionnal: RAISON SOCIALE ou DÉNOMINATION 
   * @return line1
  */
  @ApiModelProperty(example = "ESGI SA", value = "Particular: CIVILITÉ - TITRE ou QUALITÉ - PRÉNOM - NOM Progessionnal: RAISON SOCIALE ou DÉNOMINATION ")


  public String getLine1() {
    return line1;
  }

  public void setLine1(String line1) {
    this.line1 = line1;
  }

  public BusinessAddress line2(String line2) {
    this.line2 = line2;
    return this;
  }

  /**
   * Particular: N°APP ou BAL - ÉTAGE - COULOIR - ESC Professionnal: IDENTITÉ DU DESTINATAIRE et ou SERVICE 
   * @return line2
  */
  @ApiModelProperty(example = "Service comptabilité", value = "Particular: N°APP ou BAL - ÉTAGE - COULOIR - ESC Professionnal: IDENTITÉ DU DESTINATAIRE et ou SERVICE ")


  public String getLine2() {
    return line2;
  }

  public void setLine2(String line2) {
    this.line2 = line2;
  }

  public BusinessAddress line3(String line3) {
    this.line3 = line3;
    return this;
  }

  /**
   * ENTRÉE - BÂTIMENT - IMMEUBLE - RÉS - ZI
   * @return line3
  */
  @ApiModelProperty(value = "ENTRÉE - BÂTIMENT - IMMEUBLE - RÉS - ZI")


  public String getLine3() {
    return line3;
  }

  public void setLine3(String line3) {
    this.line3 = line3;
  }

  public BusinessAddress line4(String line4) {
    this.line4 = line4;
    return this;
  }

  /**
   * NUMÉRO - LIBELLÉ DE LA VOIE
   * @return line4
  */
  @ApiModelProperty(value = "NUMÉRO - LIBELLÉ DE LA VOIE")


  public String getLine4() {
    return line4;
  }

  public void setLine4(String line4) {
    this.line4 = line4;
  }

  public BusinessAddress line5(String line5) {
    this.line5 = line5;
    return this;
  }

  /**
   * LIEU DIT ou SERVICE PARTICULIER DE DISTRIBUTION
   * @return line5
  */
  @ApiModelProperty(value = "LIEU DIT ou SERVICE PARTICULIER DE DISTRIBUTION")


  public String getLine5() {
    return line5;
  }

  public void setLine5(String line5) {
    this.line5 = line5;
  }

  public BusinessAddress locality(String locality) {
    this.locality = locality;
    return this;
  }

  /**
   * Name of the locality of the address
   * @return locality
  */
  @ApiModelProperty(value = "Name of the locality of the address")


  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public BusinessAddress countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Country code as defined in standard ISO 3166 ([more information about the standard](https://www.iso.org/fr/iso-3166-country-codes.html))
   * @return countryCode
  */
  @ApiModelProperty(value = "Country code as defined in standard ISO 3166 ([more information about the standard](https://www.iso.org/fr/iso-3166-country-codes.html))")


  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public BusinessAddress countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }

  /**
   * Country name as defined in standard ISO 3166 ([more information about the standard](https://www.iso.org/fr/iso-3166-country-codes.html))
   * @return countryName
  */
  @ApiModelProperty(value = "Country name as defined in standard ISO 3166 ([more information about the standard](https://www.iso.org/fr/iso-3166-country-codes.html))")


  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessAddress businessAddress = (BusinessAddress) o;
    return Objects.equals(this.line1, businessAddress.line1) &&
        Objects.equals(this.line2, businessAddress.line2) &&
        Objects.equals(this.line3, businessAddress.line3) &&
        Objects.equals(this.line4, businessAddress.line4) &&
        Objects.equals(this.line5, businessAddress.line5) &&
        Objects.equals(this.locality, businessAddress.locality) &&
        Objects.equals(this.countryCode, businessAddress.countryCode) &&
        Objects.equals(this.countryName, businessAddress.countryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(line1, line2, line3, line4, line5, locality, countryCode, countryName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessAddress {\n");
    
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    line3: ").append(toIndentedString(line3)).append("\n");
    sb.append("    line4: ").append(toIndentedString(line4)).append("\n");
    sb.append("    line5: ").append(toIndentedString(line5)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
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

