package com.codeography.copyValues;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="item")
@XmlAccessorType(XmlAccessType.FIELD)
public class Item {

    public String itemName;

    public String itemValue;
    
    public Item(){};
    public Item(String name, String value) {
		this.itemName = name;
		this.itemValue = value;
	}
    
	@XmlAttribute(name="name")
	public String getName() {
		return itemName;
	}
	public void setName(String name) {
		this.itemName = name;
	}
    @XmlAttribute(name="value")
	public String getValue() {
		return itemValue;
	}
	public void setValue(String value) {
		this.itemValue = value;
	}
}