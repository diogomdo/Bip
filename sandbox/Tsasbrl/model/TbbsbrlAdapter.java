package  net.hedtech.banner.arsys.Tsasbrl.model;

import java.util.Date;
import java.math.BigDecimal;
import org.jdesktop.databuffer.DataRow;
import morphis.foundations.flavors.forms.appdatalayer.data.BaseRowAdapter;
import morphis.foundations.core.appdatalayer.data.DAO;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appdatalayer.data.configuration.*;



public class TbbsbrlAdapter extends BaseRowAdapter{
	

	public TbbsbrlAdapter(DataRow row, IDBBusinessObject businessObject) {
		super(row, businessObject);
	}

	
	//Data Columns
		     
	
	public void setTbbsbrlUseRulesInd(NString value){
		this.setValue("TBBSBRL_USE_RULES_IND", value.getValue());
	}


	public NString getTbbsbrlUseRulesInd(){
		NString v = new NString((String)this.getValue("TBBSBRL_USE_RULES_IND"));
		return v;
	}


	
	
	public void setRulesDesc(NString value){
		this.setValue("RULES_DESC", value.getValue());
	}


	public NString getRulesDesc(){
		NString v = new NString((String)this.getValue("RULES_DESC"));
		return v;
	}


	
	
	public void setTbbsbrlExclRegInd(NString value){
		this.setValue("TBBSBRL_EXCL_REG_IND", value.getValue());
	}


	public NString getTbbsbrlExclRegInd(){
		NString v = new NString((String)this.getValue("TBBSBRL_EXCL_REG_IND"));
		return v;
	}


	
	
	public void setTbbsbrlPrintFinMemoInd(NString value){
		this.setValue("TBBSBRL_PRINT_FIN_MEMO_IND", value.getValue());
	}


	public NString getTbbsbrlPrintFinMemoInd(){
		NString v = new NString((String)this.getValue("TBBSBRL_PRINT_FIN_MEMO_IND"));
		return v;
	}


	
	
	public void setTbbsbrlPrintOthrMemosInd(NString value){
		this.setValue("TBBSBRL_PRINT_OTHR_MEMOS_IND", value.getValue());
	}


	public NString getTbbsbrlPrintOthrMemosInd(){
		NString v = new NString((String)this.getValue("TBBSBRL_PRINT_OTHR_MEMOS_IND"));
		return v;
	}


	
	
	public void setTbbsbrlCdeInd(NString value){
		this.setValue("TBBSBRL_CDE_IND", value.getValue());
	}


	public NString getTbbsbrlCdeInd(){
		NString v = new NString((String)this.getValue("TBBSBRL_CDE_IND"));
		return v;
	}


	
	
	public void setTbbsbrlPrintDepInd(NString value){
		this.setValue("TBBSBRL_PRINT_DEP_IND", value.getValue());
	}


	public NString getTbbsbrlPrintDepInd(){
		NString v = new NString((String)this.getValue("TBBSBRL_PRINT_DEP_IND"));
		return v;
	}


	
	
	public void setTbbsbrlPrintEpNoteInd(NString value){
		this.setValue("TBBSBRL_PRINT_EP_NOTE_IND", value.getValue());
	}


	public NString getTbbsbrlPrintEpNoteInd(){
		NString v = new NString((String)this.getValue("TBBSBRL_PRINT_EP_NOTE_IND"));
		return v;
	}


	
	
	public void setTbbsbrlSumFinaidMemoInd(NString value){
		this.setValue("TBBSBRL_SUM_FINAID_MEMO_IND", value.getValue());
	}


	public NString getTbbsbrlSumFinaidMemoInd(){
		NString v = new NString((String)this.getValue("TBBSBRL_SUM_FINAID_MEMO_IND"));
		return v;
	}


	
	
	public void setTbbsbrlFinaidMemoAffectDue(NString value){
		this.setValue("TBBSBRL_FINAID_MEMO_AFFECT_DUE", value.getValue());
	}


	public NString getTbbsbrlFinaidMemoAffectDue(){
		NString v = new NString((String)this.getValue("TBBSBRL_FINAID_MEMO_AFFECT_DUE"));
		return v;
	}


	
	
	public void setTbbsbrlPreauthCredAffDue(NString value){
		this.setValue("TBBSBRL_PREAUTH_CRED_AFF_DUE", value.getValue());
	}


	public NString getTbbsbrlPreauthCredAffDue(){
		NString v = new NString((String)this.getValue("TBBSBRL_PREAUTH_CRED_AFF_DUE"));
		return v;
	}


	
	
	public void setTbbsbrlOtherMemoAffectDue(NString value){
		this.setValue("TBBSBRL_OTHER_MEMO_AFFECT_DUE", value.getValue());
	}


	public NString getTbbsbrlOtherMemoAffectDue(){
		NString v = new NString((String)this.getValue("TBBSBRL_OTHER_MEMO_AFFECT_DUE"));
		return v;
	}


	
	
	public void setTbbsbrlPrevBalOffInd(NString value){
		this.setValue("TBBSBRL_PREV_BAL_OFF_IND", value.getValue());
	}


	public NString getTbbsbrlPrevBalOffInd(){
		NString v = new NString((String)this.getValue("TBBSBRL_PREV_BAL_OFF_IND"));
		return v;
	}


	
	
	public void setTbbsbrlCurrCredPrevDbtInd(NString value){
		this.setValue("TBBSBRL_CURR_CRED_PREV_DBT_IND", value.getValue());
	}


	public NString getTbbsbrlCurrCredPrevDbtInd(){
		NString v = new NString((String)this.getValue("TBBSBRL_CURR_CRED_PREV_DBT_IND"));
		return v;
	}


	
	
	public void setTbbsbrlInclEnrollInd(NString value){
		this.setValue("TBBSBRL_INCL_ENROLL_IND", value.getValue());
	}


	public NString getTbbsbrlInclEnrollInd(){
		NString v = new NString((String)this.getValue("TBBSBRL_INCL_ENROLL_IND"));
		return v;
	}


	
	
	public void setTbbsbrlCrseRequiredInd(NString value){
		this.setValue("TBBSBRL_CRSE_REQUIRED_IND", value.getValue());
	}


	public NString getTbbsbrlCrseRequiredInd(){
		NString v = new NString((String)this.getValue("TBBSBRL_CRSE_REQUIRED_IND"));
		return v;
	}


	
	
	public void setTbbsbrlAcctBillableInd(NString value){
		this.setValue("TBBSBRL_ACCT_BILLABLE_IND", value.getValue());
	}


	public NString getTbbsbrlAcctBillableInd(){
		NString v = new NString((String)this.getValue("TBBSBRL_ACCT_BILLABLE_IND"));
		return v;
	}


	
	
	public void setTbbsbrlPrintOrder(NString value){
		this.setValue("TBBSBRL_PRINT_ORDER", value.getValue());
	}


	public NString getTbbsbrlPrintOrder(){
		NString v = new NString((String)this.getValue("TBBSBRL_PRINT_ORDER"));
		return v;
	}


	
	
	public void setTbbsbrlFormType(NString value){
		this.setValue("TBBSBRL_FORM_TYPE", value.getValue());
	}


	public NString getTbbsbrlFormType(){
		NString v = new NString((String)this.getValue("TBBSBRL_FORM_TYPE"));
		return v;
	}


	
	
	public void setTbbsbrlPrintHeadingsInd(NString value){
		this.setValue("TBBSBRL_PRINT_HEADINGS_IND", value.getValue());
	}


	public NString getTbbsbrlPrintHeadingsInd(){
		NString v = new NString((String)this.getValue("TBBSBRL_PRINT_HEADINGS_IND"));
		return v;
	}


	
	
	public void setTbbsbrlPrintScheduleInd(NString value){
		this.setValue("TBBSBRL_PRINT_SCHEDULE_IND", value.getValue());
	}


	public NString getTbbsbrlPrintScheduleInd(){
		NString v = new NString((String)this.getValue("TBBSBRL_PRINT_SCHEDULE_IND"));
		return v;
	}


	
	
	public void setTbbsbrlCurrentDueDate(NDate value){
		this.setValue("TBBSBRL_CURRENT_DUE_DATE", value.getValue());
	}


	public NDate getTbbsbrlCurrentDueDate(){
		NDate v = new NDate((Date)this.getValue("TBBSBRL_CURRENT_DUE_DATE"));
		return v;
	}


	
	
	public void setTbbsbrlSelTermCharges(NString value){
		this.setValue("TBBSBRL_SEL_TERM_CHARGES", value.getValue());
	}


	public NString getTbbsbrlSelTermCharges(){
		NString v = new NString((String)this.getValue("TBBSBRL_SEL_TERM_CHARGES"));
		return v;
	}


	
	
	public void setTbbsbrlSumTermCharges(NString value){
		this.setValue("TBBSBRL_SUM_TERM_CHARGES", value.getValue());
	}


	public NString getTbbsbrlSumTermCharges(){
		NString v = new NString((String)this.getValue("TBBSBRL_SUM_TERM_CHARGES"));
		return v;
	}


	
	
	public void setTbbsbrlSumPayments(NString value){
		this.setValue("TBBSBRL_SUM_PAYMENTS", value.getValue());
	}


	public NString getTbbsbrlSumPayments(){
		NString v = new NString((String)this.getValue("TBBSBRL_SUM_PAYMENTS"));
		return v;
	}


	
	
	public void setTbbsbrlCurrCode(NString value){
		this.setValue("TBBSBRL_CURR_CODE", value.getValue());
	}


	public NString getTbbsbrlCurrCode(){
		NString v = new NString((String)this.getValue("TBBSBRL_CURR_CODE"));
		return v;
	}


	
	
	public void setCurrTitle(NString value){
		this.setValue("CURR_TITLE", value.getValue());
	}


	public NString getCurrTitle(){
		NString v = new NString((String)this.getValue("CURR_TITLE"));
		return v;
	}


	
	// F2J_TODO : Item TBBSBRL_SBRC_CODE has the "Copy Value from Item" property defined, with value: KEY_BLOCK.KEYBLOC_SBRC_CODE                  
	
	public void setTbbsbrlSbrcCode(NString value){
		this.setValue("TBBSBRL_SBRC_CODE", value.getValue());
	}


	public NString getTbbsbrlSbrcCode(){
		NString v = new NString((String)this.getValue("TBBSBRL_SBRC_CODE"));
		return v;
	}


	
	
	public void setTbbsbrlActivityDate(NDate value){
		this.setValue("TBBSBRL_ACTIVITY_DATE", value.getValue());
	}


	public NDate getTbbsbrlActivityDate(){
		NDate v = new NDate((Date)this.getValue("TBBSBRL_ACTIVITY_DATE"));
		return v;
	}


	
	
	public void setCrnLnth(NNumber value){
		this.setValue("CRN_LNTH", value.getValue());
	}


	public NNumber getCrnLnth(){
		NNumber v = new NNumber((BigDecimal)this.getValue("CRN_LNTH"));
		return v;
	}


	
	
	public void setSubjLnth(NNumber value){
		this.setValue("SUBJ_LNTH", value.getValue());
	}


	public NNumber getSubjLnth(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SUBJ_LNTH"));
		return v;
	}


	
	
	public void setTbbsbrlProcFinaidInd(NString value){
		this.setValue("TBBSBRL_PROC_FINAID_IND", value.getValue());
	}


	public NString getTbbsbrlProcFinaidInd(){
		NString v = new NString((String)this.getValue("TBBSBRL_PROC_FINAID_IND"));
		return v;
	}


	
	
	public void setCrseLnth(NNumber value){
		this.setValue("CRSE_LNTH", value.getValue());
	}


	public NNumber getCrseLnth(){
		NNumber v = new NNumber((BigDecimal)this.getValue("CRSE_LNTH"));
		return v;
	}


	
	
	public void setSectLnth(NNumber value){
		this.setValue("SECT_LNTH", value.getValue());
	}


	public NNumber getSectLnth(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SECT_LNTH"));
		return v;
	}


	
	
	public void setCampLnth(NNumber value){
		this.setValue("CAMP_LNTH", value.getValue());
	}


	public NNumber getCampLnth(){
		NNumber v = new NNumber((BigDecimal)this.getValue("CAMP_LNTH"));
		return v;
	}


	
	
	public void setCreditHrLnth(NNumber value){
		this.setValue("CREDIT_HR_LNTH", value.getValue());
	}


	public NNumber getCreditHrLnth(){
		NNumber v = new NNumber((BigDecimal)this.getValue("CREDIT_HR_LNTH"));
		return v;
	}


	
	
	public void setLevlLnth(NNumber value){
		this.setValue("LEVL_LNTH", value.getValue());
	}


	public NNumber getLevlLnth(){
		NNumber v = new NNumber((BigDecimal)this.getValue("LEVL_LNTH"));
		return v;
	}


	
	
	public void setStatLnth(NNumber value){
		this.setValue("STAT_LNTH", value.getValue());
	}


	public NNumber getStatLnth(){
		NNumber v = new NNumber((BigDecimal)this.getValue("STAT_LNTH"));
		return v;
	}


	
	
	public void setMeetDayLnth(NNumber value){
		this.setValue("MEET_DAY_LNTH", value.getValue());
	}


	public NNumber getMeetDayLnth(){
		NNumber v = new NNumber((BigDecimal)this.getValue("MEET_DAY_LNTH"));
		return v;
	}


	
	
	public void setMeetTimeLnth(NNumber value){
		this.setValue("MEET_TIME_LNTH", value.getValue());
	}


	public NNumber getMeetTimeLnth(){
		NNumber v = new NNumber((BigDecimal)this.getValue("MEET_TIME_LNTH"));
		return v;
	}


	
	
	public void setBldgLnth(NNumber value){
		this.setValue("BLDG_LNTH", value.getValue());
	}


	public NNumber getBldgLnth(){
		NNumber v = new NNumber((BigDecimal)this.getValue("BLDG_LNTH"));
		return v;
	}


	
	
	public void setGmodLnth(NNumber value){
		this.setValue("GMOD_LNTH", value.getValue());
	}


	public NNumber getGmodLnth(){
		NNumber v = new NNumber((BigDecimal)this.getValue("GMOD_LNTH"));
		return v;
	}


	
	
	public void setPtrmLnth(NNumber value){
		this.setValue("PTRM_LNTH", value.getValue());
	}


	public NNumber getPtrmLnth(){
		NNumber v = new NNumber((BigDecimal)this.getValue("PTRM_LNTH"));
		return v;
	}


	
	
	public void setTbbsbrlPtrmCodeInd(NString value){
		this.setValue("TBBSBRL_PTRM_CODE_IND", value.getValue());
	}


	public NString getTbbsbrlPtrmCodeInd(){
		NString v = new NString((String)this.getValue("TBBSBRL_PTRM_CODE_IND"));
		return v;
	}


	
	
	public void setTbbsbrlPtrmHdng(NString value){
		this.setValue("TBBSBRL_PTRM_HDNG", value.getValue());
	}


	public NString getTbbsbrlPtrmHdng(){
		NString v = new NString((String)this.getValue("TBBSBRL_PTRM_HDNG"));
		return v;
	}


	
	
	public void setTbbsbrlCrnInd(NString value){
		this.setValue("TBBSBRL_CRN_IND", value.getValue());
	}


	public NString getTbbsbrlCrnInd(){
		NString v = new NString((String)this.getValue("TBBSBRL_CRN_IND"));
		return v;
	}


	
	
	public void setTbbsbrlCrnHdng(NString value){
		this.setValue("TBBSBRL_CRN_HDNG", value.getValue());
	}


	public NString getTbbsbrlCrnHdng(){
		NString v = new NString((String)this.getValue("TBBSBRL_CRN_HDNG"));
		return v;
	}


	
	
	public void setTbbsbrlSubjCodeInd(NString value){
		this.setValue("TBBSBRL_SUBJ_CODE_IND", value.getValue());
	}


	public NString getTbbsbrlSubjCodeInd(){
		NString v = new NString((String)this.getValue("TBBSBRL_SUBJ_CODE_IND"));
		return v;
	}


	
	
	public void setTbbsbrlSubjHdng(NString value){
		this.setValue("TBBSBRL_SUBJ_HDNG", value.getValue());
	}


	public NString getTbbsbrlSubjHdng(){
		NString v = new NString((String)this.getValue("TBBSBRL_SUBJ_HDNG"));
		return v;
	}


	
	
	public void setTbbsbrlCrseNumbInd(NString value){
		this.setValue("TBBSBRL_CRSE_NUMB_IND", value.getValue());
	}


	public NString getTbbsbrlCrseNumbInd(){
		NString v = new NString((String)this.getValue("TBBSBRL_CRSE_NUMB_IND"));
		return v;
	}


	
	
	public void setTbbsbrlCrseHdng(NString value){
		this.setValue("TBBSBRL_CRSE_HDNG", value.getValue());
	}


	public NString getTbbsbrlCrseHdng(){
		NString v = new NString((String)this.getValue("TBBSBRL_CRSE_HDNG"));
		return v;
	}


	
	
	public void setTbbsbrlSectInd(NString value){
		this.setValue("TBBSBRL_SECT_IND", value.getValue());
	}


	public NString getTbbsbrlSectInd(){
		NString v = new NString((String)this.getValue("TBBSBRL_SECT_IND"));
		return v;
	}


	
	
	public void setTbbsbrlSectHdng(NString value){
		this.setValue("TBBSBRL_SECT_HDNG", value.getValue());
	}


	public NString getTbbsbrlSectHdng(){
		NString v = new NString((String)this.getValue("TBBSBRL_SECT_HDNG"));
		return v;
	}


	
	
	public void setTbbsbrlCampCodeInd(NString value){
		this.setValue("TBBSBRL_CAMP_CODE_IND", value.getValue());
	}


	public NString getTbbsbrlCampCodeInd(){
		NString v = new NString((String)this.getValue("TBBSBRL_CAMP_CODE_IND"));
		return v;
	}


	
	
	public void setTbbsbrlCampHdng(NString value){
		this.setValue("TBBSBRL_CAMP_HDNG", value.getValue());
	}


	public NString getTbbsbrlCampHdng(){
		NString v = new NString((String)this.getValue("TBBSBRL_CAMP_HDNG"));
		return v;
	}


	
	
	public void setTbbsbrlCrseTitleInd(NString value){
		this.setValue("TBBSBRL_CRSE_TITLE_IND", value.getValue());
	}


	public NString getTbbsbrlCrseTitleInd(){
		NString v = new NString((String)this.getValue("TBBSBRL_CRSE_TITLE_IND"));
		return v;
	}


	
	
	public void setTbbsbrlTitleLnth(NNumber value){
		this.setValue("TBBSBRL_TITLE_LNTH", value.getValue());
	}


	public NNumber getTbbsbrlTitleLnth(){
		NNumber v = new NNumber((BigDecimal)this.getValue("TBBSBRL_TITLE_LNTH"));
		return v;
	}


	
	
	public void setTbbsbrlTitleHdng(NString value){
		this.setValue("TBBSBRL_TITLE_HDNG", value.getValue());
	}


	public NString getTbbsbrlTitleHdng(){
		NString v = new NString((String)this.getValue("TBBSBRL_TITLE_HDNG"));
		return v;
	}


	
	
	public void setTbbsbrlCreditHrInd(NString value){
		this.setValue("TBBSBRL_CREDIT_HR_IND", value.getValue());
	}


	public NString getTbbsbrlCreditHrInd(){
		NString v = new NString((String)this.getValue("TBBSBRL_CREDIT_HR_IND"));
		return v;
	}


	
	
	public void setTbbsbrlCreditHrHdng(NString value){
		this.setValue("TBBSBRL_CREDIT_HR_HDNG", value.getValue());
	}


	public NString getTbbsbrlCreditHrHdng(){
		NString v = new NString((String)this.getValue("TBBSBRL_CREDIT_HR_HDNG"));
		return v;
	}


	
	
	public void setTbbsbrlLevlCodeInd(NString value){
		this.setValue("TBBSBRL_LEVL_CODE_IND", value.getValue());
	}


	public NString getTbbsbrlLevlCodeInd(){
		NString v = new NString((String)this.getValue("TBBSBRL_LEVL_CODE_IND"));
		return v;
	}


	
	
	public void setTbbsbrlLevlHdng(NString value){
		this.setValue("TBBSBRL_LEVL_HDNG", value.getValue());
	}


	public NString getTbbsbrlLevlHdng(){
		NString v = new NString((String)this.getValue("TBBSBRL_LEVL_HDNG"));
		return v;
	}


	
	
	public void setTbbsbrlRstsCodeInd(NString value){
		this.setValue("TBBSBRL_RSTS_CODE_IND", value.getValue());
	}


	public NString getTbbsbrlRstsCodeInd(){
		NString v = new NString((String)this.getValue("TBBSBRL_RSTS_CODE_IND"));
		return v;
	}


	
	
	public void setTbbsbrlStatHdng(NString value){
		this.setValue("TBBSBRL_STAT_HDNG", value.getValue());
	}


	public NString getTbbsbrlStatHdng(){
		NString v = new NString((String)this.getValue("TBBSBRL_STAT_HDNG"));
		return v;
	}


	
	
	public void setTbbsbrlMeetDayInd(NString value){
		this.setValue("TBBSBRL_MEET_DAY_IND", value.getValue());
	}


	public NString getTbbsbrlMeetDayInd(){
		NString v = new NString((String)this.getValue("TBBSBRL_MEET_DAY_IND"));
		return v;
	}


	
	
	public void setTbbsbrlMeetDayHdng(NString value){
		this.setValue("TBBSBRL_MEET_DAY_HDNG", value.getValue());
	}


	public NString getTbbsbrlMeetDayHdng(){
		NString v = new NString((String)this.getValue("TBBSBRL_MEET_DAY_HDNG"));
		return v;
	}


	
	
	public void setTbbsbrlMeetTimeInd(NString value){
		this.setValue("TBBSBRL_MEET_TIME_IND", value.getValue());
	}


	public NString getTbbsbrlMeetTimeInd(){
		NString v = new NString((String)this.getValue("TBBSBRL_MEET_TIME_IND"));
		return v;
	}


	
	
	public void setTbbsbrlMeetTimeHdng(NString value){
		this.setValue("TBBSBRL_MEET_TIME_HDNG", value.getValue());
	}


	public NString getTbbsbrlMeetTimeHdng(){
		NString v = new NString((String)this.getValue("TBBSBRL_MEET_TIME_HDNG"));
		return v;
	}


	
	
	public void setTbbsbrlBldgCodeInd(NString value){
		this.setValue("TBBSBRL_BLDG_CODE_IND", value.getValue());
	}


	public NString getTbbsbrlBldgCodeInd(){
		NString v = new NString((String)this.getValue("TBBSBRL_BLDG_CODE_IND"));
		return v;
	}


	
	
	public void setTbbsbrlBldgHdng(NString value){
		this.setValue("TBBSBRL_BLDG_HDNG", value.getValue());
	}


	public NString getTbbsbrlBldgHdng(){
		NString v = new NString((String)this.getValue("TBBSBRL_BLDG_HDNG"));
		return v;
	}


	
	
	public void setTbbsbrlRoomCodeInd(NString value){
		this.setValue("TBBSBRL_ROOM_CODE_IND", value.getValue());
	}


	public NString getTbbsbrlRoomCodeInd(){
		NString v = new NString((String)this.getValue("TBBSBRL_ROOM_CODE_IND"));
		return v;
	}


	
	
	public void setTbbsbrlRoomLnth(NNumber value){
		this.setValue("TBBSBRL_ROOM_LNTH", value.getValue());
	}


	public NNumber getTbbsbrlRoomLnth(){
		NNumber v = new NNumber((BigDecimal)this.getValue("TBBSBRL_ROOM_LNTH"));
		return v;
	}


	
	
	public void setTbbsbrlRoomHdng(NString value){
		this.setValue("TBBSBRL_ROOM_HDNG", value.getValue());
	}


	public NString getTbbsbrlRoomHdng(){
		NString v = new NString((String)this.getValue("TBBSBRL_ROOM_HDNG"));
		return v;
	}


	
	
	public void setTbbsbrlInstructorInd(NString value){
		this.setValue("TBBSBRL_INSTRUCTOR_IND", value.getValue());
	}


	public NString getTbbsbrlInstructorInd(){
		NString v = new NString((String)this.getValue("TBBSBRL_INSTRUCTOR_IND"));
		return v;
	}


	
	
	public void setTbbsbrlInstrLnth(NNumber value){
		this.setValue("TBBSBRL_INSTR_LNTH", value.getValue());
	}


	public NNumber getTbbsbrlInstrLnth(){
		NNumber v = new NNumber((BigDecimal)this.getValue("TBBSBRL_INSTR_LNTH"));
		return v;
	}


	
	
	public void setTbbsbrlInstrHdng(NString value){
		this.setValue("TBBSBRL_INSTR_HDNG", value.getValue());
	}


	public NString getTbbsbrlInstrHdng(){
		NString v = new NString((String)this.getValue("TBBSBRL_INSTR_HDNG"));
		return v;
	}


	
	
	public void setTbbsbrlGmodCodeInd(NString value){
		this.setValue("TBBSBRL_GMOD_CODE_IND", value.getValue());
	}


	public NString getTbbsbrlGmodCodeInd(){
		NString v = new NString((String)this.getValue("TBBSBRL_GMOD_CODE_IND"));
		return v;
	}


	
	
	public void setTbbsbrlGmodHdng(NString value){
		this.setValue("TBBSBRL_GMOD_HDNG", value.getValue());
	}


	public NString getTbbsbrlGmodHdng(){
		NString v = new NString((String)this.getValue("TBBSBRL_GMOD_HDNG"));
		return v;
	}


	
	
	public void setSelectTotal(NNumber value){
		this.setValue("SELECT_TOTAL", value.getValue());
	}


	public NNumber getSelectTotal(){
		NNumber v = new NNumber((BigDecimal)this.getValue("SELECT_TOTAL"));
		return v;
	}


	
	
	public void setEffdateEffDateTime(NString value){
		this.setValue("EFFDATE_EFF_DATE_TIME", value.getValue());
	}


	public NString getEffdateEffDateTime(){
		NString v = new NString((String)this.getValue("EFFDATE_EFF_DATE_TIME"));
		return v;
	}


	
	
	public void setHoldConvRate(NNumber value){
		this.setValue("HOLD_CONV_RATE", value.getValue());
	}


	public NNumber getHoldConvRate(){
		NNumber v = new NNumber((BigDecimal)this.getValue("HOLD_CONV_RATE"));
		return v;
	}


	
	
	public void setDelPending(NString value){
		this.setValue("DEL_PENDING", value.getValue());
	}


	public NString getDelPending(){
		NString v = new NString((String)this.getValue("DEL_PENDING"));
		return v;
	}


	

	
}
