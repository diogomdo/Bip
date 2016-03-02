package  net.hedtech.las.studemre.banner.student.Svacimp.model;

import java.util.Date;
import java.math.BigDecimal;
import org.jdesktop.databuffer.DataRow;
import morphis.foundations.flavors.forms.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class SvbcimpAdapter extends BaseRowAdapter{
	

	public SvbcimpAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	// F2J_TODO : Item SVBCIMP_SQPR_CODE has the "Copy Value from Item" property defined, with value: PROCESS_CODE                  
	
	public void setSvbcimpSqprCode(NString value){
		this.setValue("SVBCIMP_SQPR_CODE", value.getValue());
	}


	public NString getSvbcimpSqprCode(){
		NString v = new NString((String)this.getValue("SVBCIMP_SQPR_CODE"));
		return v;
	}


	
	
	public void setSvbcimpSystemReqInd(NString value){
		this.setValue("SVBCIMP_SYSTEM_REQ_IND", value.getValue());
	}


	public NString getSvbcimpSystemReqInd(){
		NString v = new NString((String)this.getValue("SVBCIMP_SYSTEM_REQ_IND"));
		return v;
	}


	
	
	public void setSvbcimpExternalTablename(NString value){
		this.setValue("SVBCIMP_EXTERNAL_TABLENAME", value.getValue());
	}


	public NString getSvbcimpExternalTablename(){
		NString v = new NString((String)this.getValue("SVBCIMP_EXTERNAL_TABLENAME"));
		return v;
	}


	
	
	public void setRegisterfileDrop(NString value){
		this.setValue("REGISTERFILE_DROP", value.getValue());
	}


	public NString getRegisterfileDrop(){
		NString v = new NString((String)this.getValue("REGISTERFILE_DROP"));
		return v;
	}


	
	
	public void setSvbcimpInclFileNameInd(NString value){
		this.setValue("SVBCIMP_INCL_FILE_NAME_IND", value.getValue());
	}


	public NString getSvbcimpInclFileNameInd(){
		NString v = new NString((String)this.getValue("SVBCIMP_INCL_FILE_NAME_IND"));
		return v;
	}


	
	
	public void setSvbcimpDirectory(NString value){
		this.setValue("SVBCIMP_DIRECTORY", value.getValue());
	}


	public NString getSvbcimpDirectory(){
		NString v = new NString((String)this.getValue("SVBCIMP_DIRECTORY"));
		return v;
	}


	
	
	public void setRegisterfilePath(NString value){
		this.setValue("REGISTERFILE_PATH", value.getValue());
	}


	public NString getRegisterfilePath(){
		NString v = new NString((String)this.getValue("REGISTERFILE_PATH"));
		return v;
	}


	
	
	public void setSvbcimpFilename(NString value){
		this.setValue("SVBCIMP_FILENAME", value.getValue());
	}


	public NString getSvbcimpFilename(){
		NString v = new NString((String)this.getValue("SVBCIMP_FILENAME"));
		return v;
	}


	
	
	public void setSvbcimpDefinitionYear(NString value){
		this.setValue("SVBCIMP_DEFINITION_YEAR", value.getValue());
	}


	public NString getSvbcimpDefinitionYear(){
		NString v = new NString((String)this.getValue("SVBCIMP_DEFINITION_YEAR"));
		return v;
	}


	
	
	public void setSvbcimpFileLength(NNumber value){
		this.setValue("SVBCIMP_FILE_LENGTH", value.getValue());
	}


	public NNumber getSvbcimpFileLength(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SVBCIMP_FILE_LENGTH"));
		return v;
	}


	
	
	public void setSvbcimpRecordDelimiter(NString value){
		this.setValue("SVBCIMP_RECORD_DELIMITER", value.getValue());
	}


	public NString getSvbcimpRecordDelimiter(){
		NString v = new NString((String)this.getValue("SVBCIMP_RECORD_DELIMITER"));
		return v;
	}


	
	
	public void setSvbcimpFields(NString value){
		this.setValue("SVBCIMP_FIELDS", value.getValue());
	}


	public NString getSvbcimpFields(){
		NString v = new NString((String)this.getValue("SVBCIMP_FIELDS"));
		return v;
	}


	
	
	public void setSvbcimpLoadWhen(NString value){
		this.setValue("SVBCIMP_LOAD_WHEN", value.getValue());
	}


	public NString getSvbcimpLoadWhen(){
		NString v = new NString((String)this.getValue("SVBCIMP_LOAD_WHEN"));
		return v;
	}


	
	
	public void setSvbcimpFieldDelimiter(NString value){
		this.setValue("SVBCIMP_FIELD_DELIMITER", value.getValue());
	}


	public NString getSvbcimpFieldDelimiter(){
		NString v = new NString((String)this.getValue("SVBCIMP_FIELD_DELIMITER"));
		return v;
	}


	
	
	public void setSvbcimpLastLoadedFile(NString value){
		this.setValue("SVBCIMP_LAST_LOADED_FILE", value.getValue());
	}


	public NString getSvbcimpLastLoadedFile(){
		NString v = new NString((String)this.getValue("SVBCIMP_LAST_LOADED_FILE"));
		return v;
	}


	
	
	public void setSvbcimpLoadedFileDate(NDate value){
		this.setValue("SVBCIMP_LOADED_FILE_DATE", value.getValue());
	}


	public NDate getSvbcimpLoadedFileDate(){
		NDate v = new NDate((Date)this.getValue("SVBCIMP_LOADED_FILE_DATE"));
		return v;
	}


	
	
	public void setRegisterfileMessageout(NString value){
		this.setValue("REGISTERFILE_MESSAGEOUT", value.getValue());
	}


	public NString getRegisterfileMessageout(){
		NString v = new NString((String)this.getValue("REGISTERFILE_MESSAGEOUT"));
		return v;
	}


	
	
	public void setSvbcimpUserId(NString value){
		this.setValue("SVBCIMP_USER_ID", value.getValue());
	}


	public NString getSvbcimpUserId(){
		NString v = new NString((String)this.getValue("SVBCIMP_USER_ID"));
		return v;
	}


	
	
	public void setSvbcimpActivityDate(NDate value){
		this.setValue("SVBCIMP_ACTIVITY_DATE", value.getValue());
	}


	public NDate getSvbcimpActivityDate(){
		NDate v = new NDate((Date)this.getValue("SVBCIMP_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setReimportFile(NString value){
		this.setValue("REIMPORT_FILE", value.getValue());
	}


	public NString getReimportFile(){
		NString v = new NString((String)this.getValue("REIMPORT_FILE"));
		return v;
	}


	

	
}
