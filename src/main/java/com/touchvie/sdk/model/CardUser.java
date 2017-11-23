/*
 * Dive EA REST API
 * Dive Experience Amplifier REST API provides a set of services which leverage obtaining catalog and TV grid info, contextual items (cards) information and saving and a static (scene by scene) version of the card carousel for linear TV and video on demand
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.touchvie.sdk.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Contains user interaction attributes relative to this card
 */
@ApiModel(description = "Contains user interaction attributes relative to this card")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-23T13:15:20.476+01:00")
public class CardUser {
  @SerializedName("is_liked")
  private Boolean isLiked = null;

  public CardUser isLiked(Boolean isLiked) {
    this.isLiked = isLiked;
    return this;
  }

   /**
   * Indicates if user has liked the card or not
   * @return isLiked
  **/
  @ApiModelProperty(required = true, value = "Indicates if user has liked the card or not")
  public Boolean getIsLiked() {
    return isLiked;
  }

  public void setIsLiked(Boolean isLiked) {
    this.isLiked = isLiked;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardUser cardUser = (CardUser) o;
    return Objects.equals(this.isLiked, cardUser.isLiked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isLiked);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardUser {\n");
    
    sb.append("    isLiked: ").append(toIndentedString(isLiked)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

