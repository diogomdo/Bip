package com.codeography.copyValues.mappingObj;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;


@XmlRootElement(name="manager")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace="")
public class Manager {
	
	@XmlAttribute(name="id")
	private String managerId;
	
	@XmlAttribute(name="name")
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
//		super();
		this.managerId = managerId;
		this.managerName = managerName;
	}	
	
	public String getId() {
		return managerId;
	}

	public void setId(String managerId) {
		this.managerId = managerId;
	}
	
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





