package com.codeography.copyValues.mappingObj;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="beans")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace="")
public class Beans {
	
	@XmlElement(name="manager")
	private Manager manager;
	
	public Beans(){}
	
	
	public Manager getBeans() {
		return manager;
	}

	public void setBeans(Manager manager) {
		this.manager = manager;
	}

}
