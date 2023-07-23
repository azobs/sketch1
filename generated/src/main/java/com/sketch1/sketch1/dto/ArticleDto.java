package com.sketch1.sketch1.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ArticleDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-07-23T14:10:18.052568617-04:00[America/Toronto]")
public class ArticleDto   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("artCode")
  private String artCode;

  @JsonProperty("artName")
  private String artName;

  @JsonProperty("artPrice")
  private Double artPrice;

  public ArticleDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ArticleDto artCode(String artCode) {
    this.artCode = artCode;
    return this;
  }

  /**
   * Get artCode
   * @return artCode
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getArtCode() {
    return artCode;
  }

  public void setArtCode(String artCode) {
    this.artCode = artCode;
  }

  public ArticleDto artName(String artName) {
    this.artName = artName;
    return this;
  }

  /**
   * Get artName
   * @return artName
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getArtName() {
    return artName;
  }

  public void setArtName(String artName) {
    this.artName = artName;
  }

  public ArticleDto artPrice(Double artPrice) {
    this.artPrice = artPrice;
    return this;
  }

  /**
   * Get artPrice
   * @return artPrice
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Double getArtPrice() {
    return artPrice;
  }

  public void setArtPrice(Double artPrice) {
    this.artPrice = artPrice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArticleDto articleDto = (ArticleDto) o;
    return Objects.equals(this.id, articleDto.id) &&
        Objects.equals(this.artCode, articleDto.artCode) &&
        Objects.equals(this.artName, articleDto.artName) &&
        Objects.equals(this.artPrice, articleDto.artPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, artCode, artName, artPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArticleDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    artCode: ").append(toIndentedString(artCode)).append("\n");
    sb.append("    artName: ").append(toIndentedString(artName)).append("\n");
    sb.append("    artPrice: ").append(toIndentedString(artPrice)).append("\n");
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

