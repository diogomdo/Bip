package com.codeography.copyValues.mappingObj;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="item")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace="")
public class CopyValueItem {
	
	@XmlElement(name="name")
	String name;
	
	
	public CopyValueItem(){
	}
	
	public CopyValueItem(String name) {
		this.name = name;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
