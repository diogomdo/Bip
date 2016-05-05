package  net.hedtech.banner.arsys.Tsasbrl.model;

import java.util.Date;
import java.math.BigDecimal;
import org.jdesktop.databuffer.DataRow;
import morphis.foundations.flavors.forms.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class TbrsbrlAdapter extends BaseRowAdapter{
	

	public TbrsbrlAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setTbrsbrlValue(NString value){
		this.setValue("TBRSBRL_VALUE", value.getValue());
	}


	public NString getTbrsbrlValue(){
		NString v = new NString((String)this.getValue("TBRSBRL_VALUE"));
		return v;
	}


	
	// F2J_TODO : Item TBRSBRL_SBRC_CODE has the "Copy Value from Item" property defined, with value: KEY_BLOCK.KEYBLOC_SBRC_CODE                  
	
	public void setTbrsbrlSbrcCode(NString value){
		this.setValue("TBRSBRL_SBRC_CODE", value.getValue());
	}


	public NString getTbrsbrlSbrcCode(){
		NString v = new NString((String)this.getValue("TBRSBRL_SBRC_CODE"));
		return v;
	}


	
	// F2J_TODO : Item TBRSBRL_TYPE_IND has the "Copy Value from Item" property defined, with value: tbbsbrl_sel_term_charges                  
	
	public void setTbrsbrlTypeInd(NString value){
		this.setValue("TBRSBRL_TYPE_IND", value.getValue());
	}


	public NString getTbrsbrlTypeInd(){
		NString v = new NString((String)this.getValue("TBRSBRL_TYPE_IND"));
		return v;
	}


	
	
	public void setTbrsbrlActivityDate(NDate value){
		this.setValue("TBRSBRL_ACTIVITY_DATE", value.getValue());
	}


	public NDate getTbrsbrlActivityDate(){
		NDate v = new NDate((Date)this.getValue("TBRSBRL_ACTIVITY_DATE"));
		return v;
	}


	

	
}
