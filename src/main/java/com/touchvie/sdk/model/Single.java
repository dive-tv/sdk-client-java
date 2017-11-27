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
import com.touchvie.sdk.model.Card;
import com.touchvie.sdk.model.RelationModule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * List of related single cards. The relation type is defined by the module content type
 */
@ApiModel(description = "List of related single cards. The relation type is defined by the module content type")

public class Single extends RelationModule implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Single module content type, defines what kind of relations are contained in the module
   */
  @JsonAdapter(ContentTypeEnum.Adapter.class)
  public enum ContentTypeEnum {
    MOVIE_VEHICLES("movie_vehicles"),
    
    MOVIE_SONGS("movie_songs"),
    
    MISCELLANEOUS("miscellaneous"),
    
    HIGHLIGHTED("highlighted"),
    
    RECOMMENDED("recommended"),
    
    TRIVIAS("trivias"),
    
    APPEARS_IN("appears_in"),
    
    TRACKLIST("tracklist"),
    
    SOUNDS_IN("sounds_in"),
    
    FULL_LOOKS("full_looks"),
    
    LOOK_FASHION("look_fashion"),
    
    FASHION_SET("fashion_set"),
    
    OTHER_LOOKS("other_looks"),
    
    WEARS("wears"),
    
    HOME_DECO("home_deco"),
    
    FULL_HOME("full_home"),
    
    IS_PART_OF("is_part_of"),
    
    DIRECTORS("directors"),
    
    IS_CHAPTER_OF("is_chapter_of");

    private String value;

    ContentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ContentTypeEnum fromValue(String text) {
      for (ContentTypeEnum b : ContentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ContentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ContentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ContentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ContentTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("content_type")
  private ContentTypeEnum contentType = null;

  @SerializedName("data")
  private List<Card> data = new ArrayList<Card>();

  public Single contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Single module content type, defines what kind of relations are contained in the module
   * @return contentType
  **/
  @ApiModelProperty(required = true, value = "Single module content type, defines what kind of relations are contained in the module")
  public ContentTypeEnum getContentType() {
    return contentType;
  }

  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }

  public Single data(List<Card> data) {
    this.data = data;
    return this;
  }

  public Single addDataItem(Card dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Card> getData() {
    return data;
  }

  public void setData(List<Card> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Single single = (Single) o;
    return Objects.equals(this.contentType, single.contentType) &&
        Objects.equals(this.data, single.data) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, data, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Single {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

