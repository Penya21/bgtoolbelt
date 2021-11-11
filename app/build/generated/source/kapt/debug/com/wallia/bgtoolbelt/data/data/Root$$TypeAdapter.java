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

public class Root$$TypeAdapter implements TypeAdapter<Root> {
  private Map<String, AttributeBinder<ValueHolder>> attributeBinders = new  HashMap<String, AttributeBinder<ValueHolder>>();

  private Map<String, ChildElementBinder<ValueHolder>> childElementBinders = new  HashMap<String, ChildElementBinder<ValueHolder>>();

  public Root$$TypeAdapter() {
    attributeBinders.put("termsofuse", new AttributeBinder<ValueHolder>() {
      @Override
      public void fromXml(XmlReader reader, TikXmlConfig config, ValueHolder value) throws
          IOException {
        value.termsofuse = reader.nextAttributeValue();
      }
    });
    childElementBinders.put("item", new ChildElementBinder<ValueHolder>() {
      @Override
      public void fromXml(XmlReader reader, TikXmlConfig config, ValueHolder value) throws
          IOException {
        if (value.item == null) {
          value.item = new ArrayList<Thing>();
        }
        value.item.add((Thing) config.getTypeAdapter(Thing.class).fromXml(reader, config) );
      }
    });
  }

  @Override
  public Root fromXml(XmlReader reader, TikXmlConfig config) throws IOException {
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
    return new Root(value.termsofuse, value.item);
  }

  @Override
  public void toXml(XmlWriter writer, TikXmlConfig config, Root value,
      String overridingXmlElementTagName) throws IOException {
    if (value != null) {
      if (overridingXmlElementTagName == null) {
        writer.beginElement("items");
      } else {
        writer.beginElement(overridingXmlElementTagName);
      }
      if (value.getTermsofuse() != null) {
        writer.attribute("termsofuse", value.getTermsofuse());
      }
      if (value.getItem() != null) {
        List<Thing> list = value.getItem();
        int listSize = list.size();
        for (int i =0; i<listSize; i++) {
          Thing item = list.get(i);
          config.getTypeAdapter(Thing.class).toXml(writer, config, item, "item");
        }
      }
      writer.endElement();
    }
  }

  static class ValueHolder {
    String termsofuse;

    List<Thing> item;
  }
}
