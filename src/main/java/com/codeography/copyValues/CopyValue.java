package com.codeography.copyValues;

public class CopyValue {

	String block;
	String item;
	String itemToCopy;
	String blockToCopy;
	
	public CopyValue(){};
	
	public CopyValue(String block, String item, String itemToCopy, String blockToCopy) {
		this.block = block;
		this.item = item;
		this.itemToCopy = itemToCopy;
		this.blockToCopy = blockToCopy;
	}
	
	public static CopyValue create() {
		return new CopyValue();
	}

}
