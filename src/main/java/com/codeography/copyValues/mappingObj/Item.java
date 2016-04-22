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
public class Item {
	
	@XmlAttribute(name="name")
    public String itemName;
	@XmlAttribute(name="logicalName")
    public String itemValue;
	@XmlElement(name="value")
	public CopyValueItem itemCopyValue;
	@XmlElement(name="businessObject")
	public String businessObject;
	
 
    public Item(){};
    
    public Item(String name, String value) {
		this.itemName = name;
		this.itemValue = value;
	}
    
	public String getName() {
		return itemName;
	}
	public void setName(String name) {
		this.itemName = name;
	}
   
	public String getValue() {
		return itemValue;
	}
	public void setValue(String value) {
		this.itemValue = value;
	}

	public CopyValueItem getItemCopyValue() {
		return itemCopyValue;
	}
	public void setItemCopyValue(CopyValueItem itemCopyValue) {
		this.itemCopyValue = itemCopyValue;
	}

	public String getBusinessObject() {
		return businessObject;
	}

	public void setBusinessObject(String businessObject) {
		this.businessObject = businessObject;
	}
}