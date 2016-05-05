package  net.hedtech.banner.arsys.Tsasbrl.model;

import java.util.Date;
import java.math.BigDecimal;
import org.jdesktop.databuffer.DataRow;
import morphis.foundations.flavors.forms.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class TbrsbepAdapter extends BaseRowAdapter{
	

	public TbrsbepAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	// F2J_TODO : Item TBRSBEP_SBRC_CODE has the "Copy Value from Item" property defined, with value: KEY_BLOCK.KEYBLOC_SBRC_CODE                  
	
	public void setTbrsbepSbrcCode(NString value){
		this.setValue("TBRSBEP_SBRC_CODE", value.getValue());
	}


	public NString getTbrsbepSbrcCode(){
		NString v = new NString((String)this.getValue("TBRSBEP_SBRC_CODE"));
		return v;
	}


	
	
	public void setTbrsbepTermCode(NString value){
		this.setValue("TBRSBEP_TERM_CODE", value.getValue());
	}


	public NString getTbrsbepTermCode(){
		NString v = new NString((String)this.getValue("TBRSBEP_TERM_CODE"));
		return v;
	}


	
	
	public void setTbrsbepCutoffDate(NDate value){
		this.setValue("TBRSBEP_CUTOFF_DATE", value.getValue());
	}


	public NDate getTbrsbepCutoffDate(){
		NDate v = new NDate((Date)this.getValue("TBRSBEP_CUTOFF_DATE"));
		return v;
	}


	
	
	public void setTbrsbepDueDate(NDate value){
		this.setValue("TBRSBEP_DUE_DATE", value.getValue());
	}


	public NDate getTbrsbepDueDate(){
		NDate v = new NDate((Date)this.getValue("TBRSBEP_DUE_DATE"));
		return v;
	}


	
	
	public void setTbrsbepActivityDate(NDate value){
		this.setValue("TBRSBEP_ACTIVITY_DATE", value.getValue());
	}


	public NDate getTbrsbepActivityDate(){
		NDate v = new NDate((Date)this.getValue("TBRSBEP_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setTbrsbepUserId(NString value){
		this.setValue("TBRSBEP_USER_ID", value.getValue());
	}


	public NString getTbrsbepUserId(){
		NString v = new NString((String)this.getValue("TBRSBEP_USER_ID"));
		return v;
	}


	
	
	public void setTbrsbepDataOrigin(NString value){
		this.setValue("TBRSBEP_DATA_ORIGIN", value.getValue());
	}


	public NString getTbrsbepDataOrigin(){
		NString v = new NString((String)this.getValue("TBRSBEP_DATA_ORIGIN"));
		return v;
	}


	
	
	public void setTbrsbepSurrogateId(NNumber value){
		this.setValue("TBRSBEP_SURROGATE_ID", value.getValue());
	}


	public NNumber getTbrsbepSurrogateId(){
		NNumber v = new NNumber((BigDecimal)this.getValue("TBRSBEP_SURROGATE_ID"));
		return v;
	}


	
	
	public void setTbrsbepVersion(NNumber value){
		this.setValue("TBRSBEP_VERSION", value.getValue());
	}


	public NNumber getTbrsbepVersion(){
		NNumber v = new NNumber((BigDecimal)this.getValue("TBRSBEP_VERSION"));
		return v;
	}


	
	
	public void setTbrsbepVpdiCode(NString value){
		this.setValue("TBRSBEP_VPDI_CODE", value.getValue());
	}


	public NString getTbrsbepVpdiCode(){
		NString v = new NString((String)this.getValue("TBRSBEP_VPDI_CODE"));
		return v;
	}


	

	
}
