package com.codeography.copyValues;

import com.github.javaparser.ast.comments.Comment;

public class CopyValueStatement {

	String block;
	String item;
	String itemToCopy;
	String blockToCopy;
	
	public CopyValueStatement(){};
	
	public CopyValueStatement(String block, String item, String itemToCopy, String blockToCopy) {
		this.block = block;
		this.item = item;
		this.itemToCopy = itemToCopy;
		this.blockToCopy = blockToCopy;
	}
	
	public static CopyValueStatement create(Comment comment) {
		return new CopyValueStatement();
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String comment) {
		this.block = comment;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String comment) {
		this.item = item;
	}

	public String getItemToCopy() {
		return itemToCopy;
	}

	public void setItemToCopy(String comment) {
		this.itemToCopy = itemToCopy;
	}

	public String getBlockToCopy() {
		return blockToCopy;
	}

	public void setBlockToCopy(String comment) {
		this.blockToCopy = blockToCopy;
	}

}
