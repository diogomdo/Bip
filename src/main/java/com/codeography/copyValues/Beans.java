package com.codeography.copyValues;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Beans {
	
	@XmlElement
	private Manager manager;
	
	public Beans(){}
	

	public Manager getBeans() {
		return manager;
	}

	public void setBeans(Manager manager) {
		this.manager = manager;
	}

}
