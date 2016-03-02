package net.hedtech.las.studemre.banner.student.Svacimp.model;

import morphis.foundations.flavors.forms.appsupportlib.model.SimpleBusinessObject;
import morphis.foundations.core.appsupportlib.model.configuration.SimpleBusinessObjectConfiguration;
import morphis.foundations.core.types.*;
import static morphis.foundations.core.types.Types.*;


public class KeyBlock extends SimpleBusinessObject
{
	public KeyBlock() {
		super();
	}

	public KeyBlock(SimpleBusinessObjectConfiguration configuration, String name) {
		super(configuration, name);
	}
	

	



	public NString getProcessCode() {
		return toStr(super.getValue("PROCESS_CODE"));
	}
	
	public void setProcessCode(NString value) {
		super.setValue("PROCESS_CODE", value);
	}
	


	public NString getProcessDesc() {
		return toStr(super.getValue("PROCESS_DESC"));
	}
	
	public void setProcessDesc(NString value) {
		super.setValue("PROCESS_DESC", value);
	}
	



}




