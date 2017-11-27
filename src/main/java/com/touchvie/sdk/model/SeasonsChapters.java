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
import java.io.Serializable;

/**
 * SeasonsChapters
 */

public class SeasonsChapters implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("chapter_index")
  private Integer chapterIndex = null;

  @SerializedName("card_id")
  private String cardId = null;

  public SeasonsChapters chapterIndex(Integer chapterIndex) {
    this.chapterIndex = chapterIndex;
    return this;
  }

   /**
   * Index of the chapter inside this season
   * @return chapterIndex
  **/
  @ApiModelProperty(required = true, value = "Index of the chapter inside this season")
  public Integer getChapterIndex() {
    return chapterIndex;
  }

  public void setChapterIndex(Integer chapterIndex) {
    this.chapterIndex = chapterIndex;
  }

  public SeasonsChapters cardId(String cardId) {
    this.cardId = cardId;
    return this;
  }

   /**
   * ID of the chapter card
   * @return cardId
  **/
  @ApiModelProperty(required = true, value = "ID of the chapter card")
  public String getCardId() {
    return cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeasonsChapters seasonsChapters = (SeasonsChapters) o;
    return Objects.equals(this.chapterIndex, seasonsChapters.chapterIndex) &&
        Objects.equals(this.cardId, seasonsChapters.cardId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chapterIndex, cardId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeasonsChapters {\n");
    
    sb.append("    chapterIndex: ").append(toIndentedString(chapterIndex)).append("\n");
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
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

