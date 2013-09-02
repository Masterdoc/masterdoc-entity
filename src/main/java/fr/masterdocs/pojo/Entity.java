package fr.masterdocs.pojo;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;
import java.util.Map;

/**
 * User: pleresteux
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Entity extends AbstractEntity {
	private Serializable superClass;
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

	public Serializable getSuperClass() {
		return superClass;
	}

	public void setSuperClass(Serializable superClass) {
		this.superClass = superClass;
	}
}
