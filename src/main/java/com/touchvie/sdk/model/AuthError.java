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
 * AuthError
 */

public class AuthError implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("error")
  private String error = null;

  @SerializedName("error_description")
  private String errorDescription = null;

  public AuthError error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Short error identifier
   * @return error
  **/
  @ApiModelProperty(value = "Short error identifier")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public AuthError errorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

   /**
   * Extended error description
   * @return errorDescription
  **/
  @ApiModelProperty(value = "Extended error description")
  public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthError authError = (AuthError) o;
    return Objects.equals(this.error, authError.error) &&
        Objects.equals(this.errorDescription, authError.errorDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, errorDescription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthError {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
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

