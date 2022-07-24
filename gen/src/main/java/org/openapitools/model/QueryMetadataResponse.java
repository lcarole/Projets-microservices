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
 * Informations on current query &amp; count of items and pages
 */
@ApiModel(description = "Informations on current query & count of items and pages")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-24T16:40:58.350645200+02:00[Europe/Paris]")
public class QueryMetadataResponse   {
  @JsonProperty("query")
  private String query;

  @JsonProperty("countItems")
  private Integer countItems;

  @JsonProperty("totalItems")
  private Integer totalItems;

  @JsonProperty("totalPages")
  private Integer totalPages;

  public QueryMetadataResponse query(String query) {
    this.query = query;
    return this;
  }

  /**
   * URI of current query
   * @return query
  */
  @ApiModelProperty(value = "URI of current query")


  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public QueryMetadataResponse countItems(Integer countItems) {
    this.countItems = countItems;
    return this;
  }

  /**
   * Number of items in current response
   * @return countItems
  */
  @ApiModelProperty(value = "Number of items in current response")


  public Integer getCountItems() {
    return countItems;
  }

  public void setCountItems(Integer countItems) {
    this.countItems = countItems;
  }

  public QueryMetadataResponse totalItems(Integer totalItems) {
    this.totalItems = totalItems;
    return this;
  }

  /**
   * Total number of items for current query
   * @return totalItems
  */
  @ApiModelProperty(value = "Total number of items for current query")


  public Integer getTotalItems() {
    return totalItems;
  }

  public void setTotalItems(Integer totalItems) {
    this.totalItems = totalItems;
  }

  public QueryMetadataResponse totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Total number of pages for current query
   * @return totalPages
  */
  @ApiModelProperty(value = "Total number of pages for current query")


  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryMetadataResponse queryMetadataResponse = (QueryMetadataResponse) o;
    return Objects.equals(this.query, queryMetadataResponse.query) &&
        Objects.equals(this.countItems, queryMetadataResponse.countItems) &&
        Objects.equals(this.totalItems, queryMetadataResponse.totalItems) &&
        Objects.equals(this.totalPages, queryMetadataResponse.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, countItems, totalItems, totalPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryMetadataResponse {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    countItems: ").append(toIndentedString(countItems)).append("\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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

