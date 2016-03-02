package  net.hedtech.las.studemre.banner.student.Svacimp.model;

import java.util.Date;
import java.math.BigDecimal;
import org.jdesktop.databuffer.DataRow;
import morphis.foundations.flavors.forms.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class SvrcimhAdapter extends BaseRowAdapter{
	

	public SvrcimhAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setSvrcimhSeqNum(NNumber value){
		this.setValue("SVRCIMH_SEQ_NUM", value.getValue());
	}


	public NNumber getSvrcimhSeqNum(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SVRCIMH_SEQ_NUM"));
		return v;
	}


	
	
	public void setSvrcimhSqprCode(NString value){
		this.setValue("SVRCIMH_SQPR_CODE", value.getValue());
	}


	public NString getSvrcimhSqprCode(){
		NString v = new NString((String)this.getValue("SVRCIMH_SQPR_CODE"));
		return v;
	}


	
	
	public void setSvrcimhDefinitionYear(NString value){
		this.setValue("SVRCIMH_DEFINITION_YEAR", value.getValue());
	}


	public NString getSvrcimhDefinitionYear(){
		NString v = new NString((String)this.getValue("SVRCIMH_DEFINITION_YEAR"));
		return v;
	}


	
	
	public void setSvrcimhFilename(NString value){
		this.setValue("SVRCIMH_FILENAME", value.getValue());
	}


	public NString getSvrcimhFilename(){
		NString v = new NString((String)this.getValue("SVRCIMH_FILENAME"));
		return v;
	}


	
	
	public void setSvrcimhUserId(NString value){
		this.setValue("SVRCIMH_USER_ID", value.getValue());
	}


	public NString getSvrcimhUserId(){
		NString v = new NString((String)this.getValue("SVRCIMH_USER_ID"));
		return v;
	}


	
	
	public void setSvrcimhActivityDate(NDate value){
		this.setValue("SVRCIMH_ACTIVITY_DATE", value.getValue());
	}


	public NDate getSvrcimhActivityDate(){
		NDate v = new NDate((Date)this.getValue("SVRCIMH_ACTIVITY_DATE"));
		return v;
	}


	

	
}
