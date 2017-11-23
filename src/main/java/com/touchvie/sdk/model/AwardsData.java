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
import com.touchvie.sdk.model.AwardData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AwardsData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-23T13:15:20.476+01:00")
public class AwardsData {
  @SerializedName("title")
  private String title = null;

  @SerializedName("nominee")
  private List<AwardData> nominee = null;

  @SerializedName("winner")
  private List<AwardData> winner = null;

  public AwardsData title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Award name
   * @return title
  **/
  @ApiModelProperty(required = true, value = "Award name")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AwardsData nominee(List<AwardData> nominee) {
    this.nominee = nominee;
    return this;
  }

  public AwardsData addNomineeItem(AwardData nomineeItem) {
    if (this.nominee == null) {
      this.nominee = new ArrayList<AwardData>();
    }
    this.nominee.add(nomineeItem);
    return this;
  }

   /**
   * Get nominee
   * @return nominee
  **/
  @ApiModelProperty(value = "")
  public List<AwardData> getNominee() {
    return nominee;
  }

  public void setNominee(List<AwardData> nominee) {
    this.nominee = nominee;
  }

  public AwardsData winner(List<AwardData> winner) {
    this.winner = winner;
    return this;
  }

  public AwardsData addWinnerItem(AwardData winnerItem) {
    if (this.winner == null) {
      this.winner = new ArrayList<AwardData>();
    }
    this.winner.add(winnerItem);
    return this;
  }

   /**
   * Get winner
   * @return winner
  **/
  @ApiModelProperty(value = "")
  public List<AwardData> getWinner() {
    return winner;
  }

  public void setWinner(List<AwardData> winner) {
    this.winner = winner;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwardsData awardsData = (AwardsData) o;
    return Objects.equals(this.title, awardsData.title) &&
        Objects.equals(this.nominee, awardsData.nominee) &&
        Objects.equals(this.winner, awardsData.winner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, nominee, winner);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwardsData {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    nominee: ").append(toIndentedString(nominee)).append("\n");
    sb.append("    winner: ").append(toIndentedString(winner)).append("\n");
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

