package com.masterdoc.pojo;

import java.util.Map;

import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * User: pleresteux
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Entity extends AbstractEntity {
  private Map<String, AbstractEntity> fields;

  public Entity() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Map<String, AbstractEntity> getFields() {
    return fields;
  }

  public void setFields(Map<String, AbstractEntity> fields) {
    this.fields = fields;
  }

}
