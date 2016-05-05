package net.hedtech.banner.arsys.Tsasbrl.model;

import java.util.Hashtable;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;


import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;

import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;












public class TsasbrlModel extends FormModel {
	
	
	public TsasbrlModel(ITask task, Hashtable parameters){
		super(task, parameters);
    }
    
		

	public GSdkey getGSdkey() 
	{
		return (GSdkey) getBusinessObject("G$_SDKEY");
	}

	public IDBBusinessObject getGSdisp() 
	{
		return (IDBBusinessObject) getBusinessObject("G$_SDISP");
	}

	public GVpdiBlock getGVpdiBlock() 
	{
		return (GVpdiBlock) getBusinessObject("G$_VPDI_BLOCK");
	}

	public GNavBlock getGNavBlock() 
	{
		return (GNavBlock) getBusinessObject("G$_NAV_BLOCK");
	}

	public FormHeader getFormHeader() 
	{
		return (FormHeader) getBusinessObject("FORM_HEADER");
	}

	public KeyBlock getKeyBlock() 
	{
		return (KeyBlock) getBusinessObject("KEY_BLOCK");
	}

	public IDBBusinessObject getTbbsbrl() 
	{
		return (IDBBusinessObject) getBusinessObject("TBBSBRL");
	}

	public IDBBusinessObject getTbrsbrl() 
	{
		return (IDBBusinessObject) getBusinessObject("TBRSBRL");
	}

	public IDBBusinessObject getTbrsbep() 
	{
		return (IDBBusinessObject) getBusinessObject("TBRSBEP");
	}

	public IDBBusinessObject getTbrsbms() 
	{
		return (IDBBusinessObject) getBusinessObject("TBRSBMS");
	}

	public ButtonControlBlock getButtonControlBlock() 
	{
		return (ButtonControlBlock) getBusinessObject("BUTTON_CONTROL_BLOCK");
	}


}

		

