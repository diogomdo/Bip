package net.hedtech.banner.arsys.Tsasbrl.model;

import morphis.foundations.flavors.forms.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class GNavBlock extends SimpleBusinessObject
{
	public GNavBlock() {
		super();
	}

	public GNavBlock(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getGoItem() {
		return toStr(super.getValue("GO_ITEM"));
	}
	
	public void setGoItem(NString value) {
		super.setValue("GO_ITEM", value);
	}
	


	public NString getHoldCursorLocation() {
		return toStr(super.getValue("HOLD_CURSOR_LOCATION"));
	}
	
	public void setHoldCursorLocation(NString value) {
		super.setValue("HOLD_CURSOR_LOCATION", value);
	}
	


	public NString getCallFld() {
		return toStr(super.getValue("CALL_FLD"));
	}
	
	public void setCallFld(NString value) {
		super.setValue("CALL_FLD", value);
	}
	


	public NString getFormLeadingEdge() {
		return toStr(super.getValue("FORM_LEADING_EDGE"));
	}
	
	public void setFormLeadingEdge(NString value) {
		super.setValue("FORM_LEADING_EDGE", value);
	}
	


	public NString getFormTypeInd() {
		return toStr(super.getValue("FORM_TYPE_IND"));
	}
	
	public void setFormTypeInd(NString value) {
		super.setValue("FORM_TYPE_IND", value);
	}
	


	public NString getLeavingBlkInd() {
		return toStr(super.getValue("LEAVING_BLK_IND"));
	}
	
	public void setLeavingBlkInd(NString value) {
		super.setValue("LEAVING_BLK_IND", value);
	}
	


	public NString getFormInitInd() {
		return toStr(super.getValue("FORM_INIT_IND"));
	}
	
	public void setFormInitInd(NString value) {
		super.setValue("FORM_INIT_IND", value);
	}
	


	public NInteger getLastMenuItem() {
		return toInt(super.getValue("LAST_MENU_ITEM"));
	}
	
	public void setLastMenuItem(NInteger value) {
		super.setValue("LAST_MENU_ITEM", value);
	}
	


	public NString getDisplayItem242() {
		return toStr(super.getValue("DISPLAY_ITEM242"));
	}
	
	public void setDisplayItem242(NString value) {
		super.setValue("DISPLAY_ITEM242", value);
	}
	



}




