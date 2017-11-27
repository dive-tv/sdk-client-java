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
 * AccessToken
 */

public class AccessToken implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("access_token")
  private String accessToken = null;

  /**
   * Token type
   */
  @JsonAdapter(TokenTypeEnum.Adapter.class)
  public enum TokenTypeEnum {
    BEARER("bearer");

    private String value;

    TokenTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TokenTypeEnum fromValue(String text) {
      for (TokenTypeEnum b : TokenTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TokenTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TokenTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TokenTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TokenTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("token_type")
  private TokenTypeEnum tokenType = null;

  @SerializedName("refresh_token")
  private String refreshToken = null;

  @SerializedName("expires_in")
  private Integer expiresIn = null;

  /**
   * Granted auth scope
   */
  @JsonAdapter(ScopeEnum.Adapter.class)
  public enum ScopeEnum {
    DEVICE("device");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScopeEnum fromValue(String text) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScopeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScopeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ScopeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("scope")
  private ScopeEnum scope = null;

  public AccessToken accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Auth token, must be included on every API request
   * @return accessToken
  **/
  @ApiModelProperty(value = "Auth token, must be included on every API request")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public AccessToken tokenType(TokenTypeEnum tokenType) {
    this.tokenType = tokenType;
    return this;
  }

   /**
   * Token type
   * @return tokenType
  **/
  @ApiModelProperty(value = "Token type")
  public TokenTypeEnum getTokenType() {
    return tokenType;
  }

  public void setTokenType(TokenTypeEnum tokenType) {
    this.tokenType = tokenType;
  }

  public AccessToken refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * Allows to issue new access tokens without resending client credentials
   * @return refreshToken
  **/
  @ApiModelProperty(value = "Allows to issue new access tokens without resending client credentials")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public AccessToken expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * Expiration time (in seconds).
   * @return expiresIn
  **/
  @ApiModelProperty(value = "Expiration time (in seconds).")
  public Integer getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  public AccessToken scope(ScopeEnum scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Granted auth scope
   * @return scope
  **/
  @ApiModelProperty(value = "Granted auth scope")
  public ScopeEnum getScope() {
    return scope;
  }

  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessToken accessToken = (AccessToken) o;
    return Objects.equals(this.accessToken, accessToken.accessToken) &&
        Objects.equals(this.tokenType, accessToken.tokenType) &&
        Objects.equals(this.refreshToken, accessToken.refreshToken) &&
        Objects.equals(this.expiresIn, accessToken.expiresIn) &&
        Objects.equals(this.scope, accessToken.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, tokenType, refreshToken, expiresIn, scope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessToken {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

