package com.wallia.bgtoolbelt.data.data;

import com.tickaroo.tikxml.TikXmlConfig;
import com.tickaroo.tikxml.XmlReader;
import com.tickaroo.tikxml.XmlWriter;
import com.tickaroo.tikxml.typeadapter.AttributeBinder;
import com.tickaroo.tikxml.typeadapter.ChildElementBinder;
import com.tickaroo.tikxml.typeadapter.TypeAdapter;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Thing$$TypeAdapter implements TypeAdapter<Thing> {
  private Map<String, AttributeBinder<ValueHolder>> attributeBinders = new  HashMap<String, AttributeBinder<ValueHolder>>();

  private Map<String, ChildElementBinder<ValueHolder>> childElementBinders = new  HashMap<String, ChildElementBinder<ValueHolder>>();

  public Thing$$TypeAdapter() {
    attributeBinders.put("id", new AttributeBinder<ValueHolder>() {
      @Override
      public void fromXml(XmlReader reader, TikXmlConfig config, ValueHolder value) throws
          IOException {
        value.id = reader.nextAttributeValue();
      }
    });
    attributeBinders.put("type", new AttributeBinder<ValueHolder>() {
      @Override
      public void fromXml(XmlReader reader, TikXmlConfig config, ValueHolder value) throws
          IOException {
        value.type = reader.nextAttributeValue();
      }
    });
    childElementBinders.put("image", new ChildElementBinder<ValueHolder>() {
      @Override
      public void fromXml(XmlReader reader, TikXmlConfig config, ValueHolder value) throws
          IOException {
        while(reader.hasAttribute()) {
          String attributeName = reader.nextAttributeName();
          if (config.exceptionOnUnreadXml() && !attributeName.startsWith("xmlns")) {
            throw new IOException("Unread attribute '"+ attributeName +"' at path "+ reader.getPath());
          }
          reader.skipAttributeValue();
        }
        value.image = reader.nextTextContent();
      }
    });
    childElementBinders.put("thumbnail", new ChildElementBinder<ValueHolder>() {
      @Override
      public void fromXml(XmlReader reader, TikXmlConfig config, ValueHolder value) throws
          IOException {
        while(reader.hasAttribute()) {
          String attributeName = reader.nextAttributeName();
          if (config.exceptionOnUnreadXml() && !attributeName.startsWith("xmlns")) {
            throw new IOException("Unread attribute '"+ attributeName +"' at path "+ reader.getPath());
          }
          reader.skipAttributeValue();
        }
        value.thumbnail = reader.nextTextContent();
      }
    });
    childElementBinders.put("yearpublished", new ChildElementBinder<ValueHolder>() {
      @Override
      public void fromXml(XmlReader reader, TikXmlConfig config, ValueHolder value) throws
          IOException {
        value.year = config.getTypeAdapter(BoardGameYear.class).fromXml(reader, config);
      }
    });
    childElementBinders.put("name", new ChildElementBinder<ValueHolder>() {
      @Override
      public void fromXml(XmlReader reader, TikXmlConfig config, ValueHolder value) throws
          IOException {
        if (value.nameList == null) {
          value.nameList = new ArrayList<BoardGameName>();
        }
        value.nameList.add((BoardGameName) config.getTypeAdapter(BoardGameName.class).fromXml(reader, config) );
      }
    });
    childElementBinders.put("link", new ChildElementBinder<ValueHolder>() {
      @Override
      public void fromXml(XmlReader reader, TikXmlConfig config, ValueHolder value) throws
          IOException {
        if (value.propertyList == null) {
          value.propertyList = new ArrayList<BoardGameProperty>();
        }
        value.propertyList.add((BoardGameProperty) config.getTypeAdapter(BoardGameProperty.class).fromXml(reader, config) );
      }
    });
    childElementBinders.put("description", new ChildElementBinder<ValueHolder>() {
      @Override
      public void fromXml(XmlReader reader, TikXmlConfig config, ValueHolder value) throws
          IOException {
        while(reader.hasAttribute()) {
          String attributeName = reader.nextAttributeName();
          if (config.exceptionOnUnreadXml() && !attributeName.startsWith("xmlns")) {
            throw new IOException("Unread attribute '"+ attributeName +"' at path "+ reader.getPath());
          }
          reader.skipAttributeValue();
        }
        value.description = reader.nextTextContent();
      }
    });
  }

  @Override
  public Thing fromXml(XmlReader reader, TikXmlConfig config) throws IOException {
    ValueHolder value = new ValueHolder();
    while(reader.hasAttribute()) {
      String attributeName = reader.nextAttributeName();
      AttributeBinder<ValueHolder> attributeBinder = attributeBinders.get(attributeName);
      if (attributeBinder != null) {
        attributeBinder.fromXml(reader, config, value);
      } else {
        if (config.exceptionOnUnreadXml() && !attributeName.startsWith("xmlns")) {
          throw new IOException("Could not map the xml attribute with the name '"+attributeName+"' at path "+reader.getPath()+" to java class. Have you annotated such a field in your java class to map this xml attribute? Otherwise you can turn this error message off with TikXml.Builder().exceptionOnUnreadXml(false).build().");
        }
        reader.skipAttributeValue();
      }
    }
    while(true) {
      if (reader.hasElement()) {
        reader.beginElement();
        String elementName = reader.nextElementName();
        ChildElementBinder<ValueHolder> childElementBinder = childElementBinders.get(elementName);
        if (childElementBinder != null) {
          childElementBinder.fromXml(reader, config, value);
          reader.endElement();
        } else if (config.exceptionOnUnreadXml()) {
          throw new IOException("Could not map the xml element with the tag name <" + elementName + "> at path '" + reader.getPath()+"' to java class. Have you annotated such a field in your java class to map this xml attribute? Otherwise you can turn this error message off with TikXml.Builder().exceptionOnUnreadXml(false).build().");
        } else {
          reader.skipRemainingElement();
        }
      } else if (reader.hasTextContent()) {
        if (config.exceptionOnUnreadXml()) {
          throw new IOException("Could not map the xml element's text content at path '"+reader.getPath()+" to java class. Have you annotated such a field in your java class to map the xml element's text content? Otherwise you can turn this error message off with TikXml.Builder().exceptionOnUnreadXml(false).build().");
        }
        reader.skipTextContent();
      } else {
        break;
      }
    }
    return new Thing(value.type, value.id, value.thumbnail, value.image, value.nameList, value.year, value.description, value.propertyList);
  }

  @Override
  public void toXml(XmlWriter writer, TikXmlConfig config, Thing value,
      String overridingXmlElementTagName) throws IOException {
    if (value != null) {
      if (overridingXmlElementTagName == null) {
        writer.beginElement("thing");
      } else {
        writer.beginElement(overridingXmlElementTagName);
      }
      if (value.getId() != null) {
        writer.attribute("id", value.getId());
      }
      if (value.getType() != null) {
        writer.attribute("type", value.getType());
      }
      if (value.getImage() != null) {
        writer.beginElement("image");
        if (value.getImage() != null) {
          writer.textContent(value.getImage());
        }
        writer.endElement();
      }
      if (value.getThumbnail() != null) {
        writer.beginElement("thumbnail");
        if (value.getThumbnail() != null) {
          writer.textContent(value.getThumbnail());
        }
        writer.endElement();
      }
      if (value.getYear() != null) {
        config.getTypeAdapter(BoardGameYear.class).toXml(writer, config, value.getYear(), "yearpublished");
      }
      if (value.getNameList() != null) {
        List<BoardGameName> list = value.getNameList();
        int listSize = list.size();
        for (int i =0; i<listSize; i++) {
          BoardGameName item = list.get(i);
          config.getTypeAdapter(BoardGameName.class).toXml(writer, config, item, "name");
        }
      }
      if (value.getPropertyList() != null) {
        List<BoardGameProperty> list = value.getPropertyList();
        int listSize = list.size();
        for (int i =0; i<listSize; i++) {
          BoardGameProperty item = list.get(i);
          config.getTypeAdapter(BoardGameProperty.class).toXml(writer, config, item, "link");
        }
      }
      if (value.getDescription() != null) {
        writer.beginElement("description");
        if (value.getDescription() != null) {
          writer.textContent(value.getDescription());
        }
        writer.endElement();
      }
      writer.endElement();
    }
  }

  static class ValueHolder {
    String type;

    String id;

    String thumbnail;

    String image;

    List<BoardGameName> nameList;

    BoardGameYear year;

    String description;

    List<BoardGameProperty> propertyList;
  }
}
