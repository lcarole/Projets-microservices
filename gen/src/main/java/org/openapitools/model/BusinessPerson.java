package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BusinessPerson
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-24T16:21:13.194359300+02:00[Europe/Paris]")
public class BusinessPerson   {
  /**
   * Gender of the contact
   */
  public enum GenderEnum {
    M("M"),
    
    MME("MME");

    private String value;

    GenderEnum(String value) {
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
    public static GenderEnum fromValue(String value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("gender")
  private GenderEnum gender;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("mail")
  private String mail;

  @JsonProperty("phone")
  private String phone;

  public BusinessPerson gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Gender of the contact
   * @return gender
  */
  @ApiModelProperty(example = "M", value = "Gender of the contact")


  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public BusinessPerson firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name of the contact
   * @return firstName
  */
  @ApiModelProperty(example = "John", value = "First name of the contact")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public BusinessPerson lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name of the contact
   * @return lastName
  */
  @ApiModelProperty(example = "DOE", required = true, value = "Last name of the contact")
  @NotNull


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public BusinessPerson mail(String mail) {
    this.mail = mail;
    return this;
  }

  /**
   * Mail address of the contact
   * @return mail
  */
  @ApiModelProperty(example = "john.doe@acme.com", required = true, value = "Mail address of the contact")
  @NotNull

@javax.validation.constraints.Email
  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public BusinessPerson phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Phone number of the contact
   * @return phone
  */
  @ApiModelProperty(example = "+33 (0)1 56 87 65 78", value = "Phone number of the contact")


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessPerson businessPerson = (BusinessPerson) o;
    return Objects.equals(this.gender, businessPerson.gender) &&
        Objects.equals(this.firstName, businessPerson.firstName) &&
        Objects.equals(this.lastName, businessPerson.lastName) &&
        Objects.equals(this.mail, businessPerson.mail) &&
        Objects.equals(this.phone, businessPerson.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gender, firstName, lastName, mail, phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessPerson {\n");
    
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

