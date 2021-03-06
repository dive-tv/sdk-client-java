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
import com.touchvie.sdk.model.CardContainer;
import com.touchvie.sdk.model.CardUser;
import com.touchvie.sdk.model.ImageData;
import com.touchvie.sdk.model.Product;
import com.touchvie.sdk.model.RelationModule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Basic Dive data unit, represents an item of a given category
 */
@ApiModel(description = "Basic Dive data unit, represents an item of a given category")

public class Card implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("card_id")
  private String cardId = null;

  @SerializedName("version")
  private String version = null;

  /**
   * Card type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    MOVIE("movie"),
    
    SERIE("serie"),
    
    PERSON("person"),
    
    CHARACTER("character"),
    
    VEHICLE("vehicle"),
    
    FASHION("fashion"),
    
    LOCATION("location"),
    
    HISTORIC("historic"),
    
    TRIVIA("trivia"),
    
    QUOTE("quote"),
    
    OST("ost"),
    
    HOME("home"),
    
    TECHNOLOGY("technology"),
    
    ART("art"),
    
    SONG("song"),
    
    LOOK("look"),
    
    WEAPON("weapon"),
    
    LEISURE_SPORT("leisure_sport"),
    
    HEALTH_BEAUTY("health_beauty"),
    
    FOOD_DRINK("food_drink"),
    
    FAUNA_FLORA("fauna_flora"),
    
    BUSINESS("business"),
    
    REFERENCE("reference"),
    
    CHAPTER("chapter");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("subtitle")
  private String subtitle = null;

  @SerializedName("image")
  private ImageData image = null;

  @SerializedName("has_content")
  private Boolean hasContent = null;

  @SerializedName("info")
  private List<CardContainer> info = null;

  @SerializedName("products")
  private List<Product> products = null;

  @SerializedName("relations")
  private List<RelationModule> relations = null;

  @SerializedName("user")
  private CardUser user = null;

  public Card cardId(String cardId) {
    this.cardId = cardId;
    return this;
  }

   /**
   * Card unique identifier
   * @return cardId
  **/
  @ApiModelProperty(required = true, value = "Card unique identifier")
  public String getCardId() {
    return cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
  }

  public Card version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Card version for a given movie and scene
   * @return version
  **/
  @ApiModelProperty(value = "Card version for a given movie and scene")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Card type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Card type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Card type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Card locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Card content locale
   * @return locale
  **/
  @ApiModelProperty(required = true, value = "Card content locale")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public Card title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Card title
   * @return title
  **/
  @ApiModelProperty(required = true, value = "Card title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Card subtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }

   /**
   * Card subtitle (might be empty)
   * @return subtitle
  **/
  @ApiModelProperty(value = "Card subtitle (might be empty)")
  public String getSubtitle() {
    return subtitle;
  }

  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }

  public Card image(ImageData image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(value = "")
  public ImageData getImage() {
    return image;
  }

  public void setImage(ImageData image) {
    this.image = image;
  }

  public Card hasContent(Boolean hasContent) {
    this.hasContent = hasContent;
    return this;
  }

   /**
   * Indicates if the card has additional browsable content
   * @return hasContent
  **/
  @ApiModelProperty(value = "Indicates if the card has additional browsable content")
  public Boolean getHasContent() {
    return hasContent;
  }

  public void setHasContent(Boolean hasContent) {
    this.hasContent = hasContent;
  }

  public Card info(List<CardContainer> info) {
    this.info = info;
    return this;
  }

  public Card addInfoItem(CardContainer infoItem) {
    if (this.info == null) {
      this.info = new ArrayList<CardContainer>();
    }
    this.info.add(infoItem);
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  @ApiModelProperty(value = "")
  public List<CardContainer> getInfo() {
    return info;
  }

  public void setInfo(List<CardContainer> info) {
    this.info = info;
  }

  public Card products(List<Product> products) {
    this.products = products;
    return this;
  }

  public Card addProductsItem(Product productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<Product>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * Commercial products associated to the card
   * @return products
  **/
  @ApiModelProperty(value = "Commercial products associated to the card")
  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }

  public Card relations(List<RelationModule> relations) {
    this.relations = relations;
    return this;
  }

  public Card addRelationsItem(RelationModule relationsItem) {
    if (this.relations == null) {
      this.relations = new ArrayList<RelationModule>();
    }
    this.relations.add(relationsItem);
    return this;
  }

   /**
   * Get relations
   * @return relations
  **/
  @ApiModelProperty(value = "")
  public List<RelationModule> getRelations() {
    return relations;
  }

  public void setRelations(List<RelationModule> relations) {
    this.relations = relations;
  }

  public Card user(CardUser user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")
  public CardUser getUser() {
    return user;
  }

  public void setUser(CardUser user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Card card = (Card) o;
    return Objects.equals(this.cardId, card.cardId) &&
        Objects.equals(this.version, card.version) &&
        Objects.equals(this.type, card.type) &&
        Objects.equals(this.locale, card.locale) &&
        Objects.equals(this.title, card.title) &&
        Objects.equals(this.subtitle, card.subtitle) &&
        Objects.equals(this.image, card.image) &&
        Objects.equals(this.hasContent, card.hasContent) &&
        Objects.equals(this.info, card.info) &&
        Objects.equals(this.products, card.products) &&
        Objects.equals(this.relations, card.relations) &&
        Objects.equals(this.user, card.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardId, version, type, locale, title, subtitle, image, hasContent, info, products, relations, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Card {\n");
    
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    hasContent: ").append(toIndentedString(hasContent)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    relations: ").append(toIndentedString(relations)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

