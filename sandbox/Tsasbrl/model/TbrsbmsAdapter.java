package  net.hedtech.banner.arsys.Tsasbrl.model;

import java.util.Date;
import java.math.BigDecimal;
import org.jdesktop.databuffer.DataRow;
import morphis.foundations.flavors.forms.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class TbrsbmsAdapter extends BaseRowAdapter{
	

	public TbrsbmsAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setTbrsbmsMessage(NString value){
		this.setValue("TBRSBMS_MESSAGE", value.getValue());
	}


	public NString getTbrsbmsMessage(){
		NString v = new NString((String)this.getValue("TBRSBMS_MESSAGE"));
		return v;
	}


	
	
	public void setTbrsbmsSeqNumber(NNumber value){
		this.setValue("TBRSBMS_SEQ_NUMBER", value.getValue());
	}


	public NNumber getTbrsbmsSeqNumber(){
		NNumber v = new NNumber((BigDecimal)this.getValue("TBRSBMS_SEQ_NUMBER"));
		return v;
	}


	
	
	public void setTbrsbmsActivityDate(NDate value){
		this.setValue("TBRSBMS_ACTIVITY_DATE", value.getValue());
	}


	public NDate getTbrsbmsActivityDate(){
		NDate v = new NDate((Date)this.getValue("TBRSBMS_ACTIVITY_DATE"));
		return v;
	}


	
	// F2J_TODO : Item TBRSBMS_SBRC_CODE has the "Copy Value from Item" property defined, with value: KEY_BLOCK.KEYBLOC_SBRC_CODE                  
	
	public void setTbrsbmsSbrcCode(NString value){
		this.setValue("TBRSBMS_SBRC_CODE", value.getValue());
	}


	public NString getTbrsbmsSbrcCode(){
		NString v = new NString((String)this.getValue("TBRSBMS_SBRC_CODE"));
		return v;
	}


	

	
}
