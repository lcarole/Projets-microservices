package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EligibilityResponseBillingInProgress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-24T16:21:13.194359300+02:00[Europe/Paris]")
public class EligibilityResponseBillingInProgress   {
  @JsonProperty("amountWithoutTax")
  private BigDecimal amountWithoutTax;

  @JsonProperty("amountTax")
  private BigDecimal amountTax;

  @JsonProperty("amountWithTax")
  private BigDecimal amountWithTax;

  @JsonProperty("amountEcoParticipation")
  private BigDecimal amountEcoParticipation;

  public EligibilityResponseBillingInProgress amountWithoutTax(BigDecimal amountWithoutTax) {
    this.amountWithoutTax = amountWithoutTax;
    return this;
  }

  /**
   * Get amountWithoutTax
   * @return amountWithoutTax
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getAmountWithoutTax() {
    return amountWithoutTax;
  }

  public void setAmountWithoutTax(BigDecimal amountWithoutTax) {
    this.amountWithoutTax = amountWithoutTax;
  }

  public EligibilityResponseBillingInProgress amountTax(BigDecimal amountTax) {
    this.amountTax = amountTax;
    return this;
  }

  /**
   * Get amountTax
   * @return amountTax
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getAmountTax() {
    return amountTax;
  }

  public void setAmountTax(BigDecimal amountTax) {
    this.amountTax = amountTax;
  }

  public EligibilityResponseBillingInProgress amountWithTax(BigDecimal amountWithTax) {
    this.amountWithTax = amountWithTax;
    return this;
  }

  /**
   * Get amountWithTax
   * @return amountWithTax
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getAmountWithTax() {
    return amountWithTax;
  }

  public void setAmountWithTax(BigDecimal amountWithTax) {
    this.amountWithTax = amountWithTax;
  }

  public EligibilityResponseBillingInProgress amountEcoParticipation(BigDecimal amountEcoParticipation) {
    this.amountEcoParticipation = amountEcoParticipation;
    return this;
  }

  /**
   * Get amountEcoParticipation
   * @return amountEcoParticipation
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getAmountEcoParticipation() {
    return amountEcoParticipation;
  }

  public void setAmountEcoParticipation(BigDecimal amountEcoParticipation) {
    this.amountEcoParticipation = amountEcoParticipation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EligibilityResponseBillingInProgress eligibilityResponseBillingInProgress = (EligibilityResponseBillingInProgress) o;
    return Objects.equals(this.amountWithoutTax, eligibilityResponseBillingInProgress.amountWithoutTax) &&
        Objects.equals(this.amountTax, eligibilityResponseBillingInProgress.amountTax) &&
        Objects.equals(this.amountWithTax, eligibilityResponseBillingInProgress.amountWithTax) &&
        Objects.equals(this.amountEcoParticipation, eligibilityResponseBillingInProgress.amountEcoParticipation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountWithoutTax, amountTax, amountWithTax, amountEcoParticipation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EligibilityResponseBillingInProgress {\n");
    
    sb.append("    amountWithoutTax: ").append(toIndentedString(amountWithoutTax)).append("\n");
    sb.append("    amountTax: ").append(toIndentedString(amountTax)).append("\n");
    sb.append("    amountWithTax: ").append(toIndentedString(amountWithTax)).append("\n");
    sb.append("    amountEcoParticipation: ").append(toIndentedString(amountEcoParticipation)).append("\n");
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

