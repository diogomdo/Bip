package com.codeography.copyValues;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;


@XmlRootElement(name="manager")
//@XmlType(propOrder = { "managerId","managerName","itemsList"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Manager {
	

	private String managerId;
	private String managerName;
	@XmlElementWrapper(name="items")
	@XmlElement(name="item")
	private List<Item> itemsList;

	public Manager(){
	}
	
	public Manager(Item itemA){
		itemsList = new ArrayList<Item>();
		this.itemsList.add(itemA);
		this.itemsList.add(new Item());
	}
	
	public Manager(String managerId, String managerName){
		super();
		this.managerId = managerId;
		this.managerName = managerName;
	}	
	
	@XmlAttribute(name="id")
	public String getId() {
		return managerId;
	}

	public void setId(String managerId) {
		this.managerId = managerId;
	}
	@XmlAttribute(name="name")
	public String getName() {
		return managerName;
	}

	public void setName(String managerName) {
		this.managerName = managerName;
	}
	

	public List<Item> getitems() {
		return itemsList;
	}

	public void setItemsList(List<Item> items) {
		this.itemsList = items;
	}
}





