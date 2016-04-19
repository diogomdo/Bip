package com.codeography.copyValues;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;


@XmlRootElement(name="manager")
//@XmlType(propOrder = { "managerId","managerName","managerItems"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Manager {
	

	private String managerId;
	private String managerName;
	
	@XmlElement(name = "items", type = Item.class)
	public List<Item> itemsList = new ArrayList<Item>();

	public Manager(){
	}
	
	public Manager(Item itemA){
		this.itemsList.add(itemA);
	}
	
	public Manager(String id, String name){
		super();
		this.managerId = id;
		this.managerName = name;
	}	
	
	@XmlAttribute(name="id")
	public String getId() {
		return managerId;
	}

	public void setId(String id) {
		this.managerId = id;
	}
	@XmlAttribute(name="name")
	public String getName() {
		return managerName;
	}

	public void setName(String name) {
		this.managerName = name;
	}
	
	@XmlElement(name="items")
	public List<Item> getitems() {
		return itemsList;
	}

	public void setItemsList(List<Item> items) {
		this.itemsList = items;
	}
}





