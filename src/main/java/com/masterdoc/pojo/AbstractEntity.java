package com.masterdoc.pojo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.*;
import org.codehaus.jackson.annotate.JsonSubTypes.Type;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "enumeration")
@JsonSubTypes({
    @Type(value = Entity.class, name = "false"),
    @Type(value = Enumeration.class, name = "true") })
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public abstract class AbstractEntity implements Serializable {
  protected String  name;

  @JsonIgnore
  protected boolean enumeration;

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "AbstractEntity [name=" + name + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    AbstractEntity other = (AbstractEntity) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    return true;
  }
}
