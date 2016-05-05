package net.hedtech.banner.arsys.Tsasbrl.model;

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
	

	



	public NString getKeyblocSbrcCode() {
		return toStr(super.getValue("KEYBLOC_SBRC_CODE"));
	}
	
	public void setKeyblocSbrcCode(NString value) {
		super.setValue("KEYBLOC_SBRC_CODE", value);
	}
	


	public NString getSbrcDesc() {
		return toStr(super.getValue("SBRC_DESC"));
	}
	
	public void setSbrcDesc(NString value) {
		super.setValue("SBRC_DESC", value);
	}
	



}




