package com.codeography.copyValues;

import com.codeography.core.FormMigrationTasks;
import com.github.javaparser.ast.comments.Comment;

public class CopyValueStatement {

	String originalComment;
	String blockCopyFrom;
	String itemCopyFrom;
	String itemCopyTo;
	String blockCopyTo;
	
	public CopyValueStatement(){};
	
//	public CopyValueStatement(String blockCopyFrom, String itemCopyFrom, String itemCopyTo, String blockCopyTo) {
//		this.blockCopyFrom = blockCopyFrom;
//		this.itemCopyFrom = itemCopyFrom;
//		this.itemCopyTo = itemCopyTo;
//		this.blockCopyTo = blockCopyTo;
//	}
	
	public void create(String comment) {

		itemBlockToEvaluation(comment.split(" ")[15].toString());
		setOriginalComment(comment);
		setItemCopyTo(comment);
	}

	private void itemBlockToEvaluation(String str) {
		if (str.contains(".")){
			setBlockCopyFrom(str.split(".")[0]);
			setItemCopyFrom(str.split(".")[1]);
		}else{
			/*
			 * TODO
			 * A chamada a verificacao se no comentario nao estiver o
			 * bloco, ele confirmar que pertence ao keyblock ou a
			 * outro qualquer.
			 * Provisoriamente fica com a atribuicao para o keyblock
			 */
			setBlockCopyFrom("KEYBLOCK");
			setItemCopyFrom(str);
		}
	}

	public String getBlockCopyFrom() {
		return blockCopyFrom;
	}

	public void setBlockCopyFrom(String blockCopyFrom) {
		this.blockCopyFrom = blockCopyFrom;
	}

	public String getItemCopyFrom() {
		return itemCopyFrom;
	}
	
	public void setItemCopyFrom(String itemCopyFrom) {
		this.itemCopyFrom = itemCopyFrom;
	}

	public String getItemCopyTo() {
		return itemCopyTo;
	}

	public void setItemCopyTo(String itemCopyTo) {
		/*
		 * TODO
		 * pode dar raia visto que nao esta a confirmarse e um item
		 * baseia-se apenas no index
		 */
		this.itemCopyTo = itemCopyTo.split(" ")[4];
	}

	public void setBlockCopyTo(String blockCopyTo) {
		this.blockCopyTo = blockCopyTo;
	}

	public String getBlockCopyTo() {
		return blockCopyTo;
	}

	public void setOriginalComment(String originalComment) {
		this.originalComment = originalComment;
	}

	public void setTargetBlock(String targetBlock) {
		this.setBlockCopyTo(targetBlock);
		
	}
	
	public String getManagerFileName(){
		return getBlockCopyTo().concat(".Manager.Config.xml");
	}



}
