package net.hedtech.banner.arsys.Tsasbrl.controller;
 
import java.util.*;
import org.jdesktop.databuffer.DataRow.DataRowStatus;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.events.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.control.*;
import morphis.foundations.core.appsupportlib.runtime.events.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;
import morphis.foundations.core.appsupportlib.runtime.action.*;
import morphis.foundations.flavors.forms.appsupportlib.runtime.action.*;
import static net.hedtech.general.common.forms.services.BaseTaskServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ViewServices.*;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ValueSetServices.*;
import static morphis.foundations.core.appsupportlib.runtime.LovServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ListServices.*;
import static morphis.foundations.core.appsupportlib.runtime.TreeServices.*;

import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;
import morphis.core.utils.behavior.annotations.*;
import morphis.foundations.flavors.forms.appsupportlib.runtime.*;

import net.hedtech.general.common.forms.controller.DefaultBlockController;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

import net.hedtech.banner.arsys.Tsasbrl.model.*;
import net.hedtech.banner.arsys.Tsasbrl.*;
import net.hedtech.banner.arsys.Tsasbrl.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	
    
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;
import net.hedtech.general.common.libraries.Goqolib.model.GSdispAdapter;
import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;
		
public class TbbsbrlController extends DefaultBlockController {

	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	

	
	public TbbsbrlController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public TsasbrlTask getTask() {
		return (TsasbrlTask)super.getTask();
	}

	public TsasbrlModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
	
		/* Original PL/SQL code code for TRIGGER TBBSBRL.WHEN_NEW_BLOCK_INSTANCE
		 IF :CHECK_KEYS = 'Y' THEN
   GO_BLOCK('KEY_BLOCK'); 
  :SYSTEM.MESSAGE_LEVEL := '5' ;
--
   G$_CHECK_VALUE ((:KEY_BLOCK.KEYBLOC_SBRC_CODE IS NULL),
      G$_NLS.Get('TSASBRL-0018', 'FORM','*ERROR* Valid key information must be entered before proceeding.') , TRUE, TRUE);
--
   NEXT_BLOCK;
  :SYSTEM.MESSAGE_LEVEL := '0' ;
   :CHECK_KEYS := 'N';
   EXECUTE_TRIGGER('DISABLE_KEYS');
   G$_CHECK_FAILURE;
   EXECUTE_QUERY ;

END IF;
--
<multilinecomment>
:SELECT_TOTAL := 1;
IF CHECKBOX_CHECKED('TBBSBRL_PTRM_CODE_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + 1;
END IF;
IF CHECKBOX_CHECKED('TBBSBRL_CRN_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + 1;
END IF;
IF CHECKBOX_CHECKED('TBBSBRL_SUBJ_CODE_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + 1;
END IF;
IF CHECKBOX_CHECKED('TBBSBRL_CRSE_NUMB_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + 1;
END IF;
IF CHECKBOX_CHECKED('TBBSBRL_SECT_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + 1;
END IF;
IF CHECKBOX_CHECKED('TBBSBRL_CAMP_CODE_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + 1;
END IF;
IF CHECKBOX_CHECKED('TBBSBRL_CRSE_TITLE_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + 1;
END IF;
IF CHECKBOX_CHECKED('TBBSBRL_CREDIT_HR_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + 1;
END IF;
IF CHECKBOX_CHECKED('TBBSBRL_LEVEL_CODE_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + 1;
END IF;
IF CHECKBOX_CHECKED('TBBSBRL_RSTS_CODE_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + 1;
END IF;
IF CHECKBOX_CHECKED('TBBSBRL_MEET_TIME_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + 1;
END IF;
IF CHECKBOX_CHECKED('TBBSBRL_BLDG_CODE_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + 1;
END IF;
IF CHECKBOX_CHECKED('TBBSBRL_ROOM_CODE_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + 1;
END IF;
IF CHECKBOX_CHECKED('TBBSBRL_INSTRUCTOR_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + 1;
END IF;
IF CHECKBOX_CHECKED('TBBSBRL_GMOD_CODE_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + 1;
END IF;   </multilinecomment>

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL.WHEN_NEW_BLOCK_INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE")
		@After
		public void tbbsbrl_WhenNewBlockInstance()
		{
			
				if ( getFormModel().getButtonControlBlock().getCheckKeys().equals("Y") )
				{
					goBlock(toStr("KEY_BLOCK"));
					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
					// 
					getTask().getGoqrpls().gCheckValue(((getFormModel().getKeyBlock().getKeyblocSbrcCode().isNull())), GNls.Fget(toStr("TSASBRL-0018"), toStr("FORM"), toStr("*ERROR* Valid key information must be entered before proceeding.")), toBool(NBool.True), toBool(NBool.True));
					// 
					nextBlock();
					// F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
					MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
					getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
					executeAction("DISABLE_KEYS");
					getTask().getGoqrpls().gCheckFailure();
					executeQuery();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL.COPY_LENGTHS
		 -- Note: These values are hard-coded here because the defaults on the item property sheets
--       get erased on a rollback.  If these are ever changed, you must also change the 
--       lengths of the heading fields (TBBSBRL_xxxx_HDNG - database & form), and also
--       the corresponding print fields in TSRCBIL.
-- As of 2.1.5, only Course Title and Instructor Name are user-defined lengths.
-- 7.1 add new tbbsbrl_room_lnth
:ptrm_lnth := 3;
:crn_lnth := 5;
:subj_lnth := 4;
:crse_lnth := 5;
:sect_lnth := 3;
:camp_lnth := 3;
:credit_hr_lnth := 5;
:levl_lnth := 2;
:stat_lnth := 2;
:meet_day_lnth := 7;
:meet_time_lnth := 11;
:bldg_lnth := 6;
--:room_lnth := 5;
:gmod_lnth := 1;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL.COPY_LENGTHS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="COPY_LENGTHS")
		public void tbbsbrl_CopyLengths()
		{
			
				//  Note: These values are hard-coded here because the defaults on the item property sheets
				//        get erased on a rollback.  If these are ever changed, you must also change the 
				//        lengths of the heading fields (TBBSBRL_xxxx_HDNG - database & form), and also
				//        the corresponding print fields in TSRCBIL.
				//  As of 2.1.5, only Course Title and Instructor Name are user-defined lengths.
				//  7.1 add new tbbsbrl_room_lnth

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				//  Note: These values are hard-coded here because the defaults on the item property sheets
				//        get erased on a rollback.  If these are ever changed, you must also change the 
				//        lengths of the heading fields (TBBSBRL_xxxx_HDNG - database & form), and also
				//        the corresponding print fields in TSRCBIL.
				//  As of 2.1.5, only Course Title and Instructor Name are user-defined lengths.
				//  7.1 add new tbbsbrl_room_lnth
				tbbsbrlElement.setPtrmLnth(toNumber(3));
				tbbsbrlElement.setCrnLnth(toNumber(5));
				tbbsbrlElement.setSubjLnth(toNumber(4));
				tbbsbrlElement.setCrseLnth(toNumber(5));
				tbbsbrlElement.setSectLnth(toNumber(3));
				tbbsbrlElement.setCampLnth(toNumber(3));
				tbbsbrlElement.setCreditHrLnth(toNumber(5));
				tbbsbrlElement.setLevlLnth(toNumber(2));
				tbbsbrlElement.setStatLnth(toNumber(2));
				tbbsbrlElement.setMeetDayLnth(toNumber(7));
				tbbsbrlElement.setMeetTimeLnth(toNumber(11));
				tbbsbrlElement.setBldgLnth(toNumber(6));
				// :room_lnth := 5;
				tbbsbrlElement.setGmodLnth(toNumber(1));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL.RECALC_COLUMNS
		 :SELECT_TOTAL := 0;
IF CHECKBOX_CHECKED('TBBSBRL_BLDG_CODE_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + :BLDG_LNTH + 1;
END IF;
IF CHECKBOX_CHECKED('TBBSBRL_CAMP_CODE_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + :CAMP_LNTH + 1;
END IF;
IF CHECKBOX_CHECKED('TBBSBRL_CREDIT_HR_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + :CREDIT_HR_LNTH + 1;
END IF;
IF CHECKBOX_CHECKED('TBBSBRL_CRN_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + :CRN_LNTH + 1;
END IF;
IF CHECKBOX_CHECKED('TBBSBRL_CRSE_NUMB_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + :CRSE_LNTH + 1;
END IF;
IF CHECKBOX_CHECKED('TBBSBRL_CRSE_TITLE_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + :TBBSBRL_TITLE_LNTH + 1;
END IF;
IF CHECKBOX_CHECKED('TBBSBRL_GMOD_CODE_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + :GMOD_LNTH + 1;
END IF;
IF CHECKBOX_CHECKED('TBBSBRL_INSTRUCTOR_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + :TBBSBRL_INSTR_LNTH + 1;
END IF;
IF CHECKBOX_CHECKED('TBBSBRL_LEVL_CODE_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + :LEVL_LNTH + 1;
END IF;
IF CHECKBOX_CHECKED('TBBSBRL_MEET_DAY_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + :MEET_DAY_LNTH + 1;
END IF;
IF CHECKBOX_CHECKED('TBBSBRL_MEET_TIME_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + :MEET_TIME_LNTH + 1;
END IF;
IF CHECKBOX_CHECKED('TBBSBRL_PTRM_CODE_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + :PTRM_LNTH + 1;
END IF;
IF CHECKBOX_CHECKED('TBBSBRL_ROOM_CODE_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + :TBBSBRL_ROOM_LNTH + 1;
END IF;
IF CHECKBOX_CHECKED('TBBSBRL_RSTS_CODE_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + :STAT_LNTH + 1;
END IF;
IF CHECKBOX_CHECKED('TBBSBRL_SECT_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + :SECT_LNTH + 1;
END IF;
IF CHECKBOX_CHECKED('TBBSBRL_SUBJ_CODE_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + :SUBJ_LNTH + 1;
END IF;
-- EXECUTE_TRIGGER('CHECK_WIDTH');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL.RECALC_COLUMNS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="RECALC_COLUMNS")
		public void tbbsbrl_RecalcColumns()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				tbbsbrlElement.setSelectTotal(toNumber(0));
				if ( SupportClasses.FORMS40.CheckboxChecked("TBBSBRL_BLDG_CODE_IND").getValue() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().add(tbbsbrlElement.getBldgLnth()).add(1));
				}
				if ( SupportClasses.FORMS40.CheckboxChecked("TBBSBRL_CAMP_CODE_IND").getValue() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().add(tbbsbrlElement.getCampLnth()).add(1));
				}
				if ( SupportClasses.FORMS40.CheckboxChecked("TBBSBRL_CREDIT_HR_IND").getValue() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().add(tbbsbrlElement.getCreditHrLnth()).add(1));
				}
				if ( SupportClasses.FORMS40.CheckboxChecked("TBBSBRL_CRN_IND").getValue() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().add(tbbsbrlElement.getCrnLnth()).add(1));
				}
				if ( SupportClasses.FORMS40.CheckboxChecked("TBBSBRL_CRSE_NUMB_IND").getValue() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().add(tbbsbrlElement.getCrseLnth()).add(1));
				}
				if ( SupportClasses.FORMS40.CheckboxChecked("TBBSBRL_CRSE_TITLE_IND").getValue() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().add(tbbsbrlElement.getTbbsbrlTitleLnth()).add(1));
				}
				if ( SupportClasses.FORMS40.CheckboxChecked("TBBSBRL_GMOD_CODE_IND").getValue() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().add(tbbsbrlElement.getGmodLnth()).add(1));
				}
				if ( SupportClasses.FORMS40.CheckboxChecked("TBBSBRL_INSTRUCTOR_IND").getValue() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().add(tbbsbrlElement.getTbbsbrlInstrLnth()).add(1));
				}
				if ( SupportClasses.FORMS40.CheckboxChecked("TBBSBRL_LEVL_CODE_IND").getValue() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().add(tbbsbrlElement.getLevlLnth()).add(1));
				}
				if ( SupportClasses.FORMS40.CheckboxChecked("TBBSBRL_MEET_DAY_IND").getValue() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().add(tbbsbrlElement.getMeetDayLnth()).add(1));
				}
				if ( SupportClasses.FORMS40.CheckboxChecked("TBBSBRL_MEET_TIME_IND").getValue() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().add(tbbsbrlElement.getMeetTimeLnth()).add(1));
				}
				if ( SupportClasses.FORMS40.CheckboxChecked("TBBSBRL_PTRM_CODE_IND").getValue() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().add(tbbsbrlElement.getPtrmLnth()).add(1));
				}
				if ( SupportClasses.FORMS40.CheckboxChecked("TBBSBRL_ROOM_CODE_IND").getValue() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().add(tbbsbrlElement.getTbbsbrlRoomLnth()).add(1));
				}
				if ( SupportClasses.FORMS40.CheckboxChecked("TBBSBRL_RSTS_CODE_IND").getValue() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().add(tbbsbrlElement.getStatLnth()).add(1));
				}
				if ( SupportClasses.FORMS40.CheckboxChecked("TBBSBRL_SECT_IND").getValue() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().add(tbbsbrlElement.getSectLnth()).add(1));
				}
				if ( SupportClasses.FORMS40.CheckboxChecked("TBBSBRL_SUBJ_CODE_IND").getValue() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().add(tbbsbrlElement.getSubjLnth()).add(1));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL.POST-QUERY
		 execute_trigger ('COPY_LENGTHS');
execute_trigger ('RECALC_COLUMNS');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void tbbsbrl_AfterQuery(RowAdapterEvent args)
		{
			
				// F2J_WARNING : Post-query code is executed once for every row retrieved. If you expect the query to return many records, this may cause a performance problem.
				executeAction("COPY_LENGTHS");
				executeAction("RECALC_COLUMNS");
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL.PRE-UPDATE
		 :TBBSBRL_ACTIVITY_DATE := SYSDATE ;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void tbbsbrl_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)args.getRow();


				tbbsbrlElement.setTbbsbrlActivityDate(DbManager.getDBDateTime());
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL.PRE-INSERT
		    :TBBSBRL_ACTIVITY_DATE := SYSDATE ;
   :TBBSBRL_PROC_FINAID_IND := 'N';--Not used anymore
   
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void tbbsbrl_BeforeRowInsert(RowAdapterEvent args)
		{
			
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)args.getRow();


				tbbsbrlElement.setTbbsbrlActivityDate(DbManager.getDBDateTime());
				tbbsbrlElement.setTbbsbrlProcFinaidInd(toStr("N"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL.KEY-NXTSET
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL.KEY-NXTSET
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTSET")
		public void tbbsbrl_KeyNxtset()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL.KEY-CQUERY
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", function=KeyFunction.COUNT_QUERY)
		public void tbbsbrl_TotalResults()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL.KEY-CLRBLK
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
		public void tbbsbrl_keyClearBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL.KEY-CLRREC
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void tbbsbrl_ClearRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL.KEY-CREREC
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void tbbsbrl_CreateRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL.KEY-DELREC
		 IF G$_NCHK(:DEL_PENDING <> 'Y') THEN
   EXECUTE_TRIGGER( 'DEL_PROMPT' ) ;
   G$_CHECK_FAILURE ;
ELSE
  EXECUTE_TRIGGER('DEL_TBRSBRL');
  G$_CHECK_FAILURE ;
	DELETE_RECORD ;
  G$_CHECK_FAILURE ;
	DECLARE 
		 CURSOR GET_TBRSBMS_REC IS
		  SELECT 'X'
		   FROM TBRSBMS
		  WHERE TBRSBMS_SBRC_CODE  = :KEYBLOC_SBRC_CODE;
		  
		 VAR_TEMP VARCHAR2(1);
	BEGIN		  
		
		OPEN GET_TBRSBMS_REC;
		FETCH GET_TBRSBMS_REC INTO VAR_TEMP;
		IF GET_TBRSBMS_REC%FOUND THEN
			 DELETE FROM TBRSBMS WHERE TBRSBMS_SBRC_CODE  = :KEYBLOC_SBRC_CODE;
		END IF;
		CLOSE GET_TBRSBMS_REC;
   COMMIT;
   G$_CHECK_FAILURE;
   :DEL_PENDING := 'N';
   EXECUTE_TRIGGER( 'CLOSE_WINDOWS' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'SAVE_KEYS' ) ;
   G$_CHECK_FAILURE ;
   CLEAR_FORM(NO_VALIDATE) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'ENABLE_KEYS' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'GLOBAL_COPY' ) ;
   G$_CHECK_FAILURE ;
   GO_BLOCK('KEY_BLOCK');

 END;
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void tbbsbrl_DeleteRecord()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				int rowCount = 0;
				if ( getTask().getGoqrpls().gNchk(tbbsbrlElement.getDelPending().notEquals("Y")).getValue() )
				{
					executeAction("DEL_PROMPT");
					getTask().getGoqrpls().gCheckFailure();
				}
				else {
					executeAction("DEL_TBRSBRL");
					getTask().getGoqrpls().gCheckFailure();
					deleteRecord();
					getTask().getGoqrpls().gCheckFailure();
					{
						String sqlgetTbrsbmsRec = "SELECT 'X' " +
	" FROM TBRSBMS " +
	" WHERE TBRSBMS_SBRC_CODE = :KEYBLOC_SBRC_CODE ";
						DataCursor getTbrsbmsRec = new DataCursor(sqlgetTbrsbmsRec);
						NString varTemp= NString.getNull();
						try {
							//Setting query parameters
							getTbrsbmsRec.addParameter("KEYBLOC_SBRC_CODE", getFormModel().getKeyBlock().getKeyblocSbrcCode());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable getTbrsbmsRec.
							getTbrsbmsRec.open();
							ResultSet getTbrsbmsRecResults = getTbrsbmsRec.fetchInto();
							if ( getTbrsbmsRecResults != null ) {
								varTemp = getTbrsbmsRecResults.getStr(0);
							}
							if ( getTbrsbmsRec.found() )
							{
								String sql1 = "DELETE FROM TBRSBMS " +
	" WHERE TBRSBMS_SBRC_CODE = :KEYBLOC_SBRC_CODE";
								DataCommand command1 = new DataCommand(sql1);
								//Setting query parameters
								command1.addParameter("KEYBLOC_SBRC_CODE", getFormModel().getKeyBlock().getKeyblocSbrcCode());
								rowCount = command1.execute();
							}
							getTbrsbmsRec.close();
							commitTask();
							getTask().getGoqrpls().gCheckFailure();
							tbbsbrlElement.setDelPending(toStr("N"));
							executeAction("CLOSE_WINDOWS");
							getTask().getGoqrpls().gCheckFailure();
							executeAction("SAVE_KEYS");
							getTask().getGoqrpls().gCheckFailure();
							clearTask(TaskServices.NO_VALIDATE);
							getTask().getGoqrpls().gCheckFailure();
							executeAction("ENABLE_KEYS");
							getTask().getGoqrpls().gCheckFailure();
							executeAction("LOAD_FORM_HEADER");
							getTask().getGoqrpls().gCheckFailure();
							executeAction("GLOBAL_COPY");
							getTask().getGoqrpls().gCheckFailure();
							goBlock(toStr("KEY_BLOCK"));
						}
						finally{
							getTbrsbmsRec.close();
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL.KEY-PRVREC
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void tbbsbrl_PreviousRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL.KEY-NXTREC
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void tbbsbrl_NextRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL.KEY-NXTBLK
		 IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) = 'HOME_CANVAS1' THEN
	 GO_ITEM('TBBSBRL_EXCL_REG_IND');
ELSIF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) = 'STU_CANVAS2' THEN
	    go_block('TBRSBEP'); <multilinecomment>shalini added these 2 lines</multilinecomment>
      execute_query;	
	    GO_ITEM('TBBSBRL_PRINT_FIN_MEMO_IND');
ELSIF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) = 'BILL_CANVAS3' THEN
	    GO_ITEM('TBBSBRL_PTRM_CODE_IND');
ELSIF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) = 'SCHEDULE_CANVAS4' THEN
	    GO_ITEM('TBRSBMS_MESSAGE');
	    EXECUTE_QUERY;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void tbbsbrl_NextBlock()
		{
			
				if ( getItemCanvas(getCursorItem()).equals("HOME_CANVAS1") )
				{
					goItem(toStr("TBBSBRL_EXCL_REG_IND"));
				}
				else if ( getItemCanvas(getCursorItem()).equals("STU_CANVAS2") ) {
					goBlock(toStr("TBRSBEP"));
					// shalini added these 2 lines
					executeQuery();
					goItem(toStr("TBBSBRL_PRINT_FIN_MEMO_IND"));
				}
				else if ( getItemCanvas(getCursorItem()).equals("BILL_CANVAS3") ) {
					goItem(toStr("TBBSBRL_PTRM_CODE_IND"));
				}
				else if ( getItemCanvas(getCursorItem()).equals("SCHEDULE_CANVAS4") ) {
					goItem(toStr("TBRSBMS_MESSAGE"));
					executeQuery();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL.KEY-PRVBLK
		 IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) = 'HOME_CANVAS1' THEN
	 GO_ITEM('TBRSBMS_MESSAGE');
	 EXECUTE_QUERY;
ELSIF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) = 'STU_CANVAS2' THEN
	    GO_ITEM('TBBSBRL_USE_RULES_IND');
ELSIF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) = 'BILL_CANVAS3' THEN
	    GO_ITEM('TBBSBRL_EXCL_REG_IND');
ELSIF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) = 'SCHEDULE_CANVAS4' THEN
		  go_block('TBRSBEP'); <multilinecomment>shalini added these 2 lines</multilinecomment>
      execute_query;	
	    GO_ITEM('TBBSBRL_PRINT_FIN_MEMO_IND');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void tbbsbrl_PreviousBlock()
		{
			
				if ( getItemCanvas(getCursorItem()).equals("HOME_CANVAS1") )
				{
					goItem(toStr("TBRSBMS_MESSAGE"));
					executeQuery();
				}
				else if ( getItemCanvas(getCursorItem()).equals("STU_CANVAS2") ) {
					goItem(toStr("TBBSBRL_USE_RULES_IND"));
				}
				else if ( getItemCanvas(getCursorItem()).equals("BILL_CANVAS3") ) {
					goItem(toStr("TBBSBRL_EXCL_REG_IND"));
				}
				else if ( getItemCanvas(getCursorItem()).equals("SCHEDULE_CANVAS4") ) {
					goBlock(toStr("TBRSBEP"));
					// shalini added these 2 lines
					executeQuery();
					goItem(toStr("TBBSBRL_PRINT_FIN_MEMO_IND"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_USE_RULES_IND.KEY-PREV-ITEM
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_USE_RULES_IND.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="TBBSBRL_USE_RULES_IND", function=KeyFunction.PREVIOUS_ITEM)
		public void tbbsbrlUseRulesInd_PreviousItem()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_USE_RULES_IND.KEY-NEXT-ITEM
		 GO_ITEM('RULES_DESC');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_USE_RULES_IND.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBBSBRL_USE_RULES_IND", function=KeyFunction.NEXT_ITEM)
		public void tbbsbrlUseRulesInd_keyNexItem()
		{
			
				goItem(toStr("RULES_DESC"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_USE_RULES_IND.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   IF :TBBSBRL_USE_RULES_IND = 'Y' THEN
      :RULES_DESC :=  G$_NLS.Get('TSASBRL-0019', 'FORM','Build Student Selection Rules')  ;
   ELSIF :TBBSBRL_USE_RULES_IND = 'N' THEN
      :RULES_DESC :=  G$_NLS.Get('TSASBRL-0020', 'FORM','Use Population Selection')  ;
   ELSE
      MESSAGE (  G$_NLS.Get('TSASBRL-0021', 'FORM','*ERROR* Values are ''Y'' (Build Student Selection Rules)or ''N'' (use population selection).')  
          ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   END IF ;
--
   :GLOBAL.QUERY_MODE := '0' ;
EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0' ;
      RAISE FORM_TRIGGER_FAILURE ;
END ;




		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_USE_RULES_IND.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@AfterValueChangedTrigger(item="TBBSBRL_USE_RULES_IND")
		public void tbbsbrlUseRulesInd_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					if ( tbbsbrlElement.getTbbsbrlUseRulesInd().equals("Y") )
					{
						tbbsbrlElement.setRulesDesc(GNls.Fget(toStr("TSASBRL-0019"), toStr("FORM"), toStr("Build Student Selection Rules")));
					}
					else if ( tbbsbrlElement.getTbbsbrlUseRulesInd().equals("N") ) {
						tbbsbrlElement.setRulesDesc(GNls.Fget(toStr("TSASBRL-0020"), toStr("FORM"), toStr("Use Population Selection")));
					}
					else {
						errorMessage(GNls.Fget(toStr("TSASBRL-0021"), toStr("FORM"), toStr("*ERROR* Values are 'Y' (Build Student Selection Rules)or 'N' (use population selection).")));
						throw new ApplicationException();
					}
					// 
					setGlobal("QUERY_MODE", toStr("0"));
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_USE_RULES_IND.WHEN-VALIDATE-ITEM
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   IF :TBBSBRL_USE_RULES_IND = 'Y' THEN
      :RULES_DESC :=  G$_NLS.Get('TSASBRL-0022', 'FORM','Build Student Selection Rules')  ;
   ELSIF :TBBSBRL_USE_RULES_IND = 'N' THEN
      :RULES_DESC :=  G$_NLS.Get('TSASBRL-0023', 'FORM','Use Population Selection')  ;
   ELSE
      MESSAGE (  G$_NLS.Get('TSASBRL-0024', 'FORM','*ERROR* Values are ''Y'' (Build Student Selection Rules)or ''N'' (use population selection).')  
          ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   END IF ;
--
   :GLOBAL.QUERY_MODE := '0' ;
EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0' ;
      RAISE FORM_TRIGGER_FAILURE ;
END ;




		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_USE_RULES_IND.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="TBBSBRL_USE_RULES_IND")
		public void tbbsbrlUseRulesInd_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					if ( tbbsbrlElement.getTbbsbrlUseRulesInd().equals("Y") )
					{
						tbbsbrlElement.setRulesDesc(GNls.Fget(toStr("TSASBRL-0022"), toStr("FORM"), toStr("Build Student Selection Rules")));
					}
					else if ( tbbsbrlElement.getTbbsbrlUseRulesInd().equals("N") ) {
						tbbsbrlElement.setRulesDesc(GNls.Fget(toStr("TSASBRL-0023"), toStr("FORM"), toStr("Use Population Selection")));
					}
					else {
						errorMessage(GNls.Fget(toStr("TSASBRL-0024"), toStr("FORM"), toStr("*ERROR* Values are 'Y' (Build Student Selection Rules)or 'N' (use population selection).")));
						throw new ApplicationException();
					}
					// 
					setGlobal("QUERY_MODE", toStr("0"));
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER RULES_DESC.KEY-PREV-ITEM
		 GO_ITEM('TBBSBRL_USE_RULES_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * RULES_DESC.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="RULES_DESC", function=KeyFunction.PREVIOUS_ITEM)
		public void rulesDesc_PreviousItem()
		{
			
				goItem(toStr("TBBSBRL_USE_RULES_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER RULES_DESC.KEY-NEXT-ITEM
		 GO_ITEM('TBBSBRL_USE_RULES_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * RULES_DESC.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="RULES_DESC", function=KeyFunction.NEXT_ITEM)
		public void rulesDesc_keyNexItem()
		{
			
				goItem(toStr("TBBSBRL_USE_RULES_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_EXCL_REG_IND.KEY-PREV-ITEM
		 GO_ITEM('TBBSBRL_PRINT_SCHEDULE_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_EXCL_REG_IND.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="TBBSBRL_EXCL_REG_IND", function=KeyFunction.PREVIOUS_ITEM)
		public void tbbsbrlExclRegInd_PreviousItem()
		{
			
				goItem(toStr("TBBSBRL_PRINT_SCHEDULE_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_EXCL_REG_IND.KEY-NEXT-ITEM
		 GO_ITEM('TBBSBRL_INCL_ENROLL_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_EXCL_REG_IND.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBBSBRL_EXCL_REG_IND", function=KeyFunction.NEXT_ITEM)
		public void tbbsbrlExclRegInd_keyNexItem()
		{
			
				goItem(toStr("TBBSBRL_INCL_ENROLL_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_PRINT_FIN_MEMO_IND.KEY-NEXT-ITEM
		 GO_ITEM('TBBSBRL_CDE_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_PRINT_FIN_MEMO_IND.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBBSBRL_PRINT_FIN_MEMO_IND", function=KeyFunction.NEXT_ITEM)
		public void tbbsbrlPrintFinMemoInd_keyNexItem()
		{
			
				goItem(toStr("TBBSBRL_CDE_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_PRINT_OTHR_MEMOS_IND.KEY-NEXT-ITEM
		 GO_ITEM('TBBSBRL_PRINT_DEP_IND');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_PRINT_OTHR_MEMOS_IND.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBBSBRL_PRINT_OTHR_MEMOS_IND", function=KeyFunction.NEXT_ITEM)
		public void tbbsbrlPrintOthrMemosInd_keyNexItem()
		{
			
				goItem(toStr("TBBSBRL_PRINT_DEP_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_PRINT_OTHR_MEMOS_IND.KEY-PREV-ITEM
		 GO_ITEM('TBBSBRL_CDE_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_PRINT_OTHR_MEMOS_IND.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="TBBSBRL_PRINT_OTHR_MEMOS_IND", function=KeyFunction.PREVIOUS_ITEM)
		public void tbbsbrlPrintOthrMemosInd_PreviousItem()
		{
			
				goItem(toStr("TBBSBRL_CDE_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_CDE_IND.KEY-NEXT-ITEM
		 GO_ITEM('TBBSBRL_PRINT_OTHR_MEMOS_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_CDE_IND.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBBSBRL_CDE_IND", function=KeyFunction.NEXT_ITEM)
		public void tbbsbrlCdeInd_keyNexItem()
		{
			
				goItem(toStr("TBBSBRL_PRINT_OTHR_MEMOS_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_CDE_IND.KEY-PREV-ITEM
		 GO_ITEM('TBBSBRL_PRINT_FIN_MEMO_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_CDE_IND.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="TBBSBRL_CDE_IND", function=KeyFunction.PREVIOUS_ITEM)
		public void tbbsbrlCdeInd_PreviousItem()
		{
			
				goItem(toStr("TBBSBRL_PRINT_FIN_MEMO_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_PRINT_DEP_IND.KEY-NEXT-ITEM
		 GO_ITEM('TBBSBRL_PRINT_EP_NOTE_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_PRINT_DEP_IND.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBBSBRL_PRINT_DEP_IND", function=KeyFunction.NEXT_ITEM)
		public void tbbsbrlPrintDepInd_keyNexItem()
		{
			
				goItem(toStr("TBBSBRL_PRINT_EP_NOTE_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_PRINT_DEP_IND.KEY-PREV-ITEM
		 GO_ITEM('TBBSBRL_PRINT_OTHR_MEMOS_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_PRINT_DEP_IND.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="TBBSBRL_PRINT_DEP_IND", function=KeyFunction.PREVIOUS_ITEM)
		public void tbbsbrlPrintDepInd_PreviousItem()
		{
			
				goItem(toStr("TBBSBRL_PRINT_OTHR_MEMOS_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_PRINT_EP_NOTE_IND.KEY-NEXT-ITEM
		 GO_ITEM('TBBSBRL_SUM_FINAID_MEMO_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_PRINT_EP_NOTE_IND.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBBSBRL_PRINT_EP_NOTE_IND", function=KeyFunction.NEXT_ITEM)
		public void tbbsbrlPrintEpNoteInd_keyNexItem()
		{
			
				goItem(toStr("TBBSBRL_SUM_FINAID_MEMO_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_PRINT_EP_NOTE_IND.KEY-PREV-ITEM
		 GO_ITEM('TBBSBRL_PRINT_DEP_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_PRINT_EP_NOTE_IND.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="TBBSBRL_PRINT_EP_NOTE_IND", function=KeyFunction.PREVIOUS_ITEM)
		public void tbbsbrlPrintEpNoteInd_PreviousItem()
		{
			
				goItem(toStr("TBBSBRL_PRINT_DEP_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_SUM_FINAID_MEMO_IND.KEY-NEXT-ITEM
		 GO_ITEM('TBBSBRL_FINAID_MEMO_AFFECT_DUE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_SUM_FINAID_MEMO_IND.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBBSBRL_SUM_FINAID_MEMO_IND", function=KeyFunction.NEXT_ITEM)
		public void tbbsbrlSumFinaidMemoInd_keyNexItem()
		{
			
				goItem(toStr("TBBSBRL_FINAID_MEMO_AFFECT_DUE"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_SUM_FINAID_MEMO_IND.KEY-PREV-ITEM
		 GO_ITEM('TBBSBRL_PRINT_EP_NOTE_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_SUM_FINAID_MEMO_IND.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="TBBSBRL_SUM_FINAID_MEMO_IND", function=KeyFunction.PREVIOUS_ITEM)
		public void tbbsbrlSumFinaidMemoInd_PreviousItem()
		{
			
				goItem(toStr("TBBSBRL_PRINT_EP_NOTE_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_FINAID_MEMO_AFFECT_DUE.KEY-NEXT-ITEM
		 GO_ITEM('TBBSBRL_PREAUTH_CRED_AFF_DUE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_FINAID_MEMO_AFFECT_DUE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBBSBRL_FINAID_MEMO_AFFECT_DUE", function=KeyFunction.NEXT_ITEM)
		public void tbbsbrlFinaidMemoAffectDue_keyNexItem()
		{
			
				goItem(toStr("TBBSBRL_PREAUTH_CRED_AFF_DUE"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_FINAID_MEMO_AFFECT_DUE.KEY-PREV-ITEM
		 GO_ITEM('TBBSBRL_SUM_FINAID_MEMO_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_FINAID_MEMO_AFFECT_DUE.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="TBBSBRL_FINAID_MEMO_AFFECT_DUE", function=KeyFunction.PREVIOUS_ITEM)
		public void tbbsbrlFinaidMemoAffectDue_PreviousItem()
		{
			
				goItem(toStr("TBBSBRL_SUM_FINAID_MEMO_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_PREAUTH_CRED_AFF_DUE.KEY-NEXT-ITEM
		 GO_ITEM('TBBSBRL_OTHER_MEMO_AFFECT_DUE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_PREAUTH_CRED_AFF_DUE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBBSBRL_PREAUTH_CRED_AFF_DUE", function=KeyFunction.NEXT_ITEM)
		public void tbbsbrlPreauthCredAffDue_keyNexItem()
		{
			
				goItem(toStr("TBBSBRL_OTHER_MEMO_AFFECT_DUE"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_PREAUTH_CRED_AFF_DUE.KEY-PREV-ITEM
		 GO_ITEM('TBBSBRL_FINAID_MEMO_AFFECT_DUE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_PREAUTH_CRED_AFF_DUE.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="TBBSBRL_PREAUTH_CRED_AFF_DUE", function=KeyFunction.PREVIOUS_ITEM)
		public void tbbsbrlPreauthCredAffDue_PreviousItem()
		{
			
				goItem(toStr("TBBSBRL_FINAID_MEMO_AFFECT_DUE"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_OTHER_MEMO_AFFECT_DUE.KEY-NEXT-ITEM
		 GO_ITEM('TBBSBRL_PREV_BAL_OFF_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_OTHER_MEMO_AFFECT_DUE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBBSBRL_OTHER_MEMO_AFFECT_DUE", function=KeyFunction.NEXT_ITEM)
		public void tbbsbrlOtherMemoAffectDue_keyNexItem()
		{
			
				goItem(toStr("TBBSBRL_PREV_BAL_OFF_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_OTHER_MEMO_AFFECT_DUE.KEY-PREV-ITEM
		 GO_ITEM('TBBSBRL_PREAUTH_CRED_AFF_DUE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_OTHER_MEMO_AFFECT_DUE.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="TBBSBRL_OTHER_MEMO_AFFECT_DUE", function=KeyFunction.PREVIOUS_ITEM)
		public void tbbsbrlOtherMemoAffectDue_PreviousItem()
		{
			
				goItem(toStr("TBBSBRL_PREAUTH_CRED_AFF_DUE"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_PREV_BAL_OFF_IND.KEY-NEXT-ITEM
		 GO_ITEM('TBBSBRL_CURR_CRED_PREV_DBT_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_PREV_BAL_OFF_IND.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBBSBRL_PREV_BAL_OFF_IND", function=KeyFunction.NEXT_ITEM)
		public void tbbsbrlPrevBalOffInd_keyNexItem()
		{
			
				goItem(toStr("TBBSBRL_CURR_CRED_PREV_DBT_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_PREV_BAL_OFF_IND.KEY-PREV-ITEM
		 GO_ITEM('TBBSBRL_OTHER_MEMO_AFFECT_DUE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_PREV_BAL_OFF_IND.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="TBBSBRL_PREV_BAL_OFF_IND", function=KeyFunction.PREVIOUS_ITEM)
		public void tbbsbrlPrevBalOffInd_PreviousItem()
		{
			
				goItem(toStr("TBBSBRL_OTHER_MEMO_AFFECT_DUE"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_CURR_CRED_PREV_DBT_IND.KEY-NEXT-ITEM
		 GO_ITEM('TBBSBRL_CURRENT_DUE_DATE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_CURR_CRED_PREV_DBT_IND.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBBSBRL_CURR_CRED_PREV_DBT_IND", function=KeyFunction.NEXT_ITEM)
		public void tbbsbrlCurrCredPrevDbtInd_keyNexItem()
		{
			
				goItem(toStr("TBBSBRL_CURRENT_DUE_DATE"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_CURR_CRED_PREV_DBT_IND.KEY-PREV-ITEM
		 GO_ITEM('TBBSBRL_PREV_BAL_OFF_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_CURR_CRED_PREV_DBT_IND.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="TBBSBRL_CURR_CRED_PREV_DBT_IND", function=KeyFunction.PREVIOUS_ITEM)
		public void tbbsbrlCurrCredPrevDbtInd_PreviousItem()
		{
			
				goItem(toStr("TBBSBRL_PREV_BAL_OFF_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_INCL_ENROLL_IND.KEY-NEXT-ITEM
		 GO_ITEM('TBBSBRL_CRSE_REQUIRED_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_INCL_ENROLL_IND.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBBSBRL_INCL_ENROLL_IND", function=KeyFunction.NEXT_ITEM)
		public void tbbsbrlInclEnrollInd_keyNexItem()
		{
			
				goItem(toStr("TBBSBRL_CRSE_REQUIRED_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_INCL_ENROLL_IND.KEY-PREV-ITEM
		 GO_ITEM('TBBSBRL_EXCL_REG_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_INCL_ENROLL_IND.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="TBBSBRL_INCL_ENROLL_IND", function=KeyFunction.PREVIOUS_ITEM)
		public void tbbsbrlInclEnrollInd_PreviousItem()
		{
			
				goItem(toStr("TBBSBRL_EXCL_REG_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_CRSE_REQUIRED_IND.KEY-NEXT-ITEM
		 GO_ITEM('TBBSBRL_ACCT_BILLABLE_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_CRSE_REQUIRED_IND.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBBSBRL_CRSE_REQUIRED_IND", function=KeyFunction.NEXT_ITEM)
		public void tbbsbrlCrseRequiredInd_keyNexItem()
		{
			
				goItem(toStr("TBBSBRL_ACCT_BILLABLE_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_CRSE_REQUIRED_IND.KEY-PREV-ITEM
		 GO_ITEM('TBBSBRL_INCL_ENROLL_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_CRSE_REQUIRED_IND.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="TBBSBRL_CRSE_REQUIRED_IND", function=KeyFunction.PREVIOUS_ITEM)
		public void tbbsbrlCrseRequiredInd_PreviousItem()
		{
			
				goItem(toStr("TBBSBRL_INCL_ENROLL_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_ACCT_BILLABLE_IND.KEY-NEXT-ITEM
		 GO_ITEM('TBBSBRL_PRINT_ORDER');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_ACCT_BILLABLE_IND.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBBSBRL_ACCT_BILLABLE_IND", function=KeyFunction.NEXT_ITEM)
		public void tbbsbrlAcctBillableInd_keyNexItem()
		{
			
				goItem(toStr("TBBSBRL_PRINT_ORDER"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_ACCT_BILLABLE_IND.KEY-PREV-ITEM
		 GO_ITEM('TBBSBRL_CRSE_REQUIRED_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_ACCT_BILLABLE_IND.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="TBBSBRL_ACCT_BILLABLE_IND", function=KeyFunction.PREVIOUS_ITEM)
		public void tbbsbrlAcctBillableInd_PreviousItem()
		{
			
				goItem(toStr("TBBSBRL_CRSE_REQUIRED_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_PRINT_ORDER.KEY-NEXT-ITEM
		 GO_ITEM('TBBSBRL_FORM_TYPE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_PRINT_ORDER.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBBSBRL_PRINT_ORDER", function=KeyFunction.NEXT_ITEM)
		public void tbbsbrlPrintOrder_keyNexItem()
		{
			
				goItem(toStr("TBBSBRL_FORM_TYPE"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_PRINT_ORDER.KEY-PREV-ITEM
		 GO_ITEM('TBBSBRL_ACCT_BILLABLE_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_PRINT_ORDER.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="TBBSBRL_PRINT_ORDER", function=KeyFunction.PREVIOUS_ITEM)
		public void tbbsbrlPrintOrder_PreviousItem()
		{
			
				goItem(toStr("TBBSBRL_ACCT_BILLABLE_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_FORM_TYPE.KEY-NEXT-ITEM
		 GO_ITEM('TBBSBRL_PRINT_HEADINGS_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_FORM_TYPE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBBSBRL_FORM_TYPE", function=KeyFunction.NEXT_ITEM)
		public void tbbsbrlFormType_keyNexItem()
		{
			
				goItem(toStr("TBBSBRL_PRINT_HEADINGS_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_FORM_TYPE.KEY-PREV-ITEM
		 GO_ITEM('TBBSBRL_PRINT_ORDER');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_FORM_TYPE.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="TBBSBRL_FORM_TYPE", function=KeyFunction.PREVIOUS_ITEM)
		public void tbbsbrlFormType_PreviousItem()
		{
			
				goItem(toStr("TBBSBRL_PRINT_ORDER"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_PRINT_HEADINGS_IND.KEY-NEXT-ITEM
		 GO_ITEM('TBBSBRL_PRINT_SCHEDULE_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_PRINT_HEADINGS_IND.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBBSBRL_PRINT_HEADINGS_IND", function=KeyFunction.NEXT_ITEM)
		public void tbbsbrlPrintHeadingsInd_keyNexItem()
		{
			
				goItem(toStr("TBBSBRL_PRINT_SCHEDULE_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_PRINT_HEADINGS_IND.KEY-PREV-ITEM
		 GO_ITEM('TBBSBRL_FORM_TYPE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_PRINT_HEADINGS_IND.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="TBBSBRL_PRINT_HEADINGS_IND", function=KeyFunction.PREVIOUS_ITEM)
		public void tbbsbrlPrintHeadingsInd_PreviousItem()
		{
			
				goItem(toStr("TBBSBRL_FORM_TYPE"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_PRINT_SCHEDULE_IND.KEY-NEXT-ITEM
		 GO_ITEM('TBBSBRL_EXCL_REG_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_PRINT_SCHEDULE_IND.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBBSBRL_PRINT_SCHEDULE_IND", function=KeyFunction.NEXT_ITEM)
		public void tbbsbrlPrintScheduleInd_keyNexItem()
		{
			
				goItem(toStr("TBBSBRL_EXCL_REG_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_PRINT_SCHEDULE_IND.KEY-PREV-ITEM
		 GO_ITEM('TBBSBRL_PRINT_HEADINGS_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_PRINT_SCHEDULE_IND.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="TBBSBRL_PRINT_SCHEDULE_IND", function=KeyFunction.PREVIOUS_ITEM)
		public void tbbsbrlPrintScheduleInd_PreviousItem()
		{
			
				goItem(toStr("TBBSBRL_PRINT_HEADINGS_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_CURRENT_DUE_DATE.WHEN-VALIDATE-ITEM
		 G$_DATE_REFORMAT('','');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_CURRENT_DUE_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="TBBSBRL_CURRENT_DUE_DATE")
		public void tbbsbrlCurrentDueDate_validate()
		{
			
				getTask().getGoqrpls().gDateReformat(toStr(""), toNumber(""));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_CURRENT_DUE_DATE.POST-TEXT-ITEM
		 G$_DATE_POST_ITEM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_CURRENT_DUE_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="TBBSBRL_CURRENT_DUE_DATE", function=KeyFunction.ITEM_OUT)
		public void tbbsbrlCurrentDueDate_itemOut()
		{
			
				getTask().getGoqrpls().gDatePostItem();
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_CURRENT_DUE_DATE.KEY-NEXT-ITEM
		 G$_DATE_REFORMAT('','');
G$_CHECK_FAILURE;
GO_ITEM('TBBSBRL_SEL_TERM_CHARGES');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_CURRENT_DUE_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBBSBRL_CURRENT_DUE_DATE", function=KeyFunction.NEXT_ITEM)
		public void tbbsbrlCurrentDueDate_keyNexItem()
		{
			
				getTask().getGoqrpls().gDateReformat(toStr(""), toNumber(""));
				getTask().getGoqrpls().gCheckFailure();
				goItem(toStr("TBBSBRL_SEL_TERM_CHARGES"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_CURRENT_DUE_DATE.WHEN-NEW-ITEM-INSTANCE
		 G$_DATE_WHEN_NEW_ITEM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_CURRENT_DUE_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="TBBSBRL_CURRENT_DUE_DATE", function=KeyFunction.ITEM_CHANGE)
		public void tbbsbrlCurrentDueDate_itemChange()
		{
			
				getTask().getGoqrpls().gDateWhenNewItem();
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_CURRENT_DUE_DATE.KEY-PREV-ITEM
		 GO_ITEM('TBBSBRL_CURR_CRED_PREV_DBT_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_CURRENT_DUE_DATE.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="TBBSBRL_CURRENT_DUE_DATE", function=KeyFunction.PREVIOUS_ITEM)
		public void tbbsbrlCurrentDueDate_PreviousItem()
		{
			
				goItem(toStr("TBBSBRL_CURR_CRED_PREV_DBT_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_SEL_TERM_CHARGES.OLD_POST_CHANGE
		 IF :TBBSBRL_SEL_TERM_CHARGES = 'C' THEN
   SET_ITEM_PROPERTY('TBRSBRL_VALUE_LBT',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('TBRSBRL_VALUE_LBT',LABEL, G$_NLS.Get('TSASBRL-0025', 'FORM','Category') );
   SET_ITEM_PROPERTY('TBRSBRL_VALUE',    ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('TBRSBRL_VALUE',    NAVIGABLE,PROPERTY_ON);
   SET_ITEM_PROPERTY('TBRSBRL_VALUE',    LOV_NAME,'TTVDCAT_LOV');
ELSIF :TBBSBRL_SEL_TERM_CHARGES = 'S' THEN
   SET_ITEM_PROPERTY('TBRSBRL_VALUE_LBT',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('TBRSBRL_VALUE_LBT',LABEL, G$_NLS.Get('TSASBRL-0026', 'FORM','Source') );
   SET_ITEM_PROPERTY('TBRSBRL_VALUE',    ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('TBRSBRL_VALUE',    NAVIGABLE,PROPERTY_ON);
   SET_ITEM_PROPERTY('TBRSBRL_VALUE',    LOV_NAME,'TTVSRCE_LOV');
ELSE 
   SET_ITEM_PROPERTY('TBRSBRL_VALUE_LBT',LABEL,' ');
   SET_ITEM_PROPERTY('TBRSBRL_VALUE_LBT',ENABLED,PROPERTY_OFF);   
   SET_ITEM_PROPERTY('TBRSBRL_VALUE',    ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('TBRSBRL_VALUE',    NAVIGABLE,PROPERTY_OFF);
-- SET_ITEM_PROPERTY('TBRSBRL_VALUE',    LOV_NAME,' ');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_SEL_TERM_CHARGES.OLD_POST_CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="OLD_POST_CHANGE", item="TBBSBRL_SEL_TERM_CHARGES")
		public void tbbsbrlSelTermCharges_OldPostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				if ( tbbsbrlElement.getTbbsbrlSelTermCharges().equals("C") )
				{
					setItemEnabled("TBRSBRL_VALUE_LBT", true);
					setItemLabel("TBRSBRL_VALUE_LBT", GNls.Fget(toStr("TSASBRL-0025"), toStr("FORM"), toStr("Category")));
					setItemEnabled("TBRSBRL_VALUE", true);
					setItemNavigable("TBRSBRL_VALUE", true);
					setItemLovName("TBRSBRL_VALUE", "TTVDCAT_LOV");
				}
				else if ( tbbsbrlElement.getTbbsbrlSelTermCharges().equals("S") ) {
					setItemEnabled("TBRSBRL_VALUE_LBT", true);
					setItemLabel("TBRSBRL_VALUE_LBT", GNls.Fget(toStr("TSASBRL-0026"), toStr("FORM"), toStr("Source")));
					setItemEnabled("TBRSBRL_VALUE", true);
					setItemNavigable("TBRSBRL_VALUE", true);
					setItemLovName("TBRSBRL_VALUE", "TTVSRCE_LOV");
				}
				else {
					setItemLabel("TBRSBRL_VALUE_LBT", " ");
					setItemEnabled("TBRSBRL_VALUE_LBT", false);
					setItemEnabled("TBRSBRL_VALUE", false);
					setItemNavigable("TBRSBRL_VALUE", false);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_SEL_TERM_CHARGES.KEY-NEXT-ITEM
		 IF :TBBSBRL_SEL_TERM_CHARGES = 'A' THEN
   GO_ITEM('TBBSBRL_SUM_TERM_CHARGES');
ELSE
   GO_BLOCK('TBRSBRL');
   EXECUTE_QUERY;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_SEL_TERM_CHARGES.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBBSBRL_SEL_TERM_CHARGES", function=KeyFunction.NEXT_ITEM)
		public void tbbsbrlSelTermCharges_keyNexItem()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				if ( tbbsbrlElement.getTbbsbrlSelTermCharges().equals("A") )
				{
					goItem(toStr("TBBSBRL_SUM_TERM_CHARGES"));
				}
				else {
					goBlock(toStr("TBRSBRL"));
					executeQuery();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_SEL_TERM_CHARGES.WHEN-LIST-CHANGED
		 EXECUTE_TRIGGER('SETUP_TBRSBRL_BLOCK_CHANGE');
GO_ITEM('TBBSBRL_SEL_TERM_CHARGES');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_SEL_TERM_CHARGES.WHEN-LIST-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-LIST-CHANGED", item="TBBSBRL_SEL_TERM_CHARGES")
		public void tbbsbrlSelTermCharges_listChange()
		{
			
				executeAction("SETUP_TBRSBRL_BLOCK_CHANGE");
				goItem(toStr("TBBSBRL_SEL_TERM_CHARGES"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_SEL_TERM_CHARGES.KEY-PREV-ITEM
		 GO_ITEM('TBBSBRL_CURRENT_DUE_DATE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_SEL_TERM_CHARGES.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="TBBSBRL_SEL_TERM_CHARGES", function=KeyFunction.PREVIOUS_ITEM)
		public void tbbsbrlSelTermCharges_PreviousItem()
		{
			
				goItem(toStr("TBBSBRL_CURRENT_DUE_DATE"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_SUM_TERM_CHARGES.KEY-PREV-ITEM
		 IF :TBBSBRL_SEL_TERM_CHARGES = 'A' THEN
   GO_ITEM('TBBSBRL_SEL_TERM_CHARGES');
ELSE
   GO_BLOCK('TBRSBRL');
   EXECUTE_QUERY;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_SUM_TERM_CHARGES.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="TBBSBRL_SUM_TERM_CHARGES", function=KeyFunction.PREVIOUS_ITEM)
		public void tbbsbrlSumTermCharges_PreviousItem()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				if ( tbbsbrlElement.getTbbsbrlSelTermCharges().equals("A") )
				{
					goItem(toStr("TBBSBRL_SEL_TERM_CHARGES"));
				}
				else {
					goBlock(toStr("TBRSBRL"));
					executeQuery();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_SUM_TERM_CHARGES.KEY-NEXT-ITEM
		 GO_ITEM('TBBSBRL_SUM_PAYMENTS');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_SUM_TERM_CHARGES.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBBSBRL_SUM_TERM_CHARGES", function=KeyFunction.NEXT_ITEM)
		public void tbbsbrlSumTermCharges_keyNexItem()
		{
			
				goItem(toStr("TBBSBRL_SUM_PAYMENTS"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_SUM_PAYMENTS.KEY-NEXT-ITEM
		 GO_ITEM('TBBSBRL_CURR_CODE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_SUM_PAYMENTS.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBBSBRL_SUM_PAYMENTS", function=KeyFunction.NEXT_ITEM)
		public void tbbsbrlSumPayments_keyNexItem()
		{
			
				goItem(toStr("TBBSBRL_CURR_CODE"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_SUM_PAYMENTS.KEY-PREV-ITEM
		 GO_ITEM('TBBSBRL_SUM_TERM_CHARGES');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_SUM_PAYMENTS.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="TBBSBRL_SUM_PAYMENTS", function=KeyFunction.PREVIOUS_ITEM)
		public void tbbsbrlSumPayments_PreviousItem()
		{
			
				goItem(toStr("TBBSBRL_SUM_TERM_CHARGES"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_CURR_CODE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('GTVCURR_CURR_CODE',
			'GTVCURR_TITLE',
			'');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_CURR_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="TBBSBRL_CURR_CODE")
		public void tbbsbrlCurrCode_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("GTVCURR_CURR_CODE"), toStr("GTVCURR_TITLE"), toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_CURR_CODE.KEY-NEXT-ITEM
		 G$_SEARCH.CODE_KEY_NEXT_ITEM;
GO_ITEM('TBBSBRL_PRINT_FIN_MEMO_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_CURR_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBBSBRL_CURR_CODE", function=KeyFunction.NEXT_ITEM)
		public void tbbsbrlCurrCode_keyNexItem()
		{
			
				getTask().getGoqrpls().getGSearch().codeKeyNextItem();
				goItem(toStr("TBBSBRL_PRINT_FIN_MEMO_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_CURR_CODE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   EXECUTE_TRIGGER( 'VALIDATE_CURR_CODE' ) ;
   G$_CHECK_FAILURE ;
--
   :GLOBAL.QUERY_MODE := '0' ;
EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0' ;
      RAISE FORM_TRIGGER_FAILURE ;
END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_CURR_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@AfterValueChangedTrigger(item="TBBSBRL_CURR_CODE")
		public void tbbsbrlCurrCode_PostChange()
		{
			
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					executeAction("VALIDATE_CURR_CODE");
					getTask().getGoqrpls().gCheckFailure();
					// 
					setGlobal("QUERY_MODE", toStr("0"));
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_CURR_CODE.WHEN-VALIDATE-ITEM
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   EXECUTE_TRIGGER( 'VALIDATE_CURR_CODE' ) ;
   G$_CHECK_FAILURE ;
--
   :GLOBAL.QUERY_MODE := '0' ;
EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0' ;
      RAISE FORM_TRIGGER_FAILURE ;
END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_CURR_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="TBBSBRL_CURR_CODE")
		public void tbbsbrlCurrCode_validate()
		{
			
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					executeAction("VALIDATE_CURR_CODE");
					getTask().getGoqrpls().gCheckFailure();
					// 
					setGlobal("QUERY_MODE", toStr("0"));
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_CURR_CODE.KEY-PREV-ITEM
		 GO_ITEM('TBBSBRL_SUM_PAYMENTS');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_CURR_CODE.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="TBBSBRL_CURR_CODE", function=KeyFunction.PREVIOUS_ITEM)
		public void tbbsbrlCurrCode_PreviousItem()
		{
			
				goItem(toStr("TBBSBRL_SUM_PAYMENTS"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBBSBRL_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void tbbsbrlActivityDate_keyNexItem()
		{
			
			getGDateClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="TBBSBRL_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void tbbsbrlActivityDate_itemChange()
		{
			
			getGDateClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="TBBSBRL_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void tbbsbrlActivityDate_itemOut()
		{
			
			getGDateClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_PROC_FINAID_IND.KEY-NEXT-ITEM
		 GO_ITEM('TBBSBRL_PRINT_DEP_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_PROC_FINAID_IND.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBBSBRL_PROC_FINAID_IND", function=KeyFunction.NEXT_ITEM)
		public void tbbsbrlProcFinaidInd_keyNexItem()
		{
			
				goItem(toStr("TBBSBRL_PRINT_DEP_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_PROC_FINAID_IND.KEY-PREV-ITEM
		 GO_ITEM('TBBSBRL_PRINT_FIN_MEMO_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_PROC_FINAID_IND.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="TBBSBRL_PROC_FINAID_IND", function=KeyFunction.PREVIOUS_ITEM)
		public void tbbsbrlProcFinaidInd_PreviousItem()
		{
			
				goItem(toStr("TBBSBRL_PRINT_FIN_MEMO_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_PTRM_CODE_IND.WHEN-CHECKBOX-CHANGED
		 IF CHECKBOX_CHECKED('TBBSBRL_PTRM_CODE_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + :PTRM_LNTH + 1;
ELSE
   :SELECT_TOTAL := :SELECT_TOTAL - :PTRM_LNTH - 1;
END IF;
EXECUTE_TRIGGER('CHECK_WIDTH');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_PTRM_CODE_IND.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="TBBSBRL_PTRM_CODE_IND")
		public void tbbsbrlPtrmCodeInd_checkBoxChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				if ( SupportClasses.FORMS40.CheckboxChecked("TBBSBRL_PTRM_CODE_IND").getValue() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().add(tbbsbrlElement.getPtrmLnth()).add(1));
				}
				else {
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().subtract(tbbsbrlElement.getPtrmLnth()).subtract(1));
				}
				executeAction("CHECK_WIDTH");
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_PTRM_CODE_IND.KEY-PREV-ITEM
		 GO_ITEM('TBBSBRL_GMOD_HDNG');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_PTRM_CODE_IND.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="TBBSBRL_PTRM_CODE_IND", function=KeyFunction.PREVIOUS_ITEM)
		public void tbbsbrlPtrmCodeInd_PreviousItem()
		{
			
				goItem(toStr("TBBSBRL_GMOD_HDNG"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_PTRM_HDNG.KEY-PREV-ITEM
		 GO_ITEM('TBBSBRL_PTRM_CODE_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_PTRM_HDNG.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="TBBSBRL_PTRM_HDNG", function=KeyFunction.PREVIOUS_ITEM)
		public void tbbsbrlPtrmHdng_PreviousItem()
		{
			
				goItem(toStr("TBBSBRL_PTRM_CODE_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_CRN_IND.WHEN-CHECKBOX-CHANGED
		 IF CHECKBOX_CHECKED('TBBSBRL_CRN_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + :CRN_LNTH + 1;
ELSE
   :SELECT_TOTAL := :SELECT_TOTAL - :CRN_LNTH - 1;
END IF;
EXECUTE_TRIGGER('CHECK_WIDTH');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_CRN_IND.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="TBBSBRL_CRN_IND")
		public void tbbsbrlCrnInd_checkBoxChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				if ( SupportClasses.FORMS40.CheckboxChecked("TBBSBRL_CRN_IND").getValue() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().add(tbbsbrlElement.getCrnLnth()).add(1));
				}
				else {
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().subtract(tbbsbrlElement.getCrnLnth()).subtract(1));
				}
				executeAction("CHECK_WIDTH");
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_SUBJ_CODE_IND.WHEN-CHECKBOX-CHANGED
		 IF CHECKBOX_CHECKED('TBBSBRL_SUBJ_CODE_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + :SUBJ_LNTH + 1;
ELSE
   :SELECT_TOTAL := :SELECT_TOTAL - :SUBJ_LNTH - 1;
END IF;
EXECUTE_TRIGGER('CHECK_WIDTH');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_SUBJ_CODE_IND.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="TBBSBRL_SUBJ_CODE_IND")
		public void tbbsbrlSubjCodeInd_checkBoxChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				if ( SupportClasses.FORMS40.CheckboxChecked("TBBSBRL_SUBJ_CODE_IND").getValue() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().add(tbbsbrlElement.getSubjLnth()).add(1));
				}
				else {
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().subtract(tbbsbrlElement.getSubjLnth()).subtract(1));
				}
				executeAction("CHECK_WIDTH");
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_CRSE_NUMB_IND.WHEN-CHECKBOX-CHANGED
		 IF CHECKBOX_CHECKED('TBBSBRL_CRSE_NUMB_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + :CRSE_LNTH + 1;
ELSE
   :SELECT_TOTAL := :SELECT_TOTAL - :CRSE_LNTH - 1;
END IF;
EXECUTE_TRIGGER('CHECK_WIDTH');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_CRSE_NUMB_IND.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="TBBSBRL_CRSE_NUMB_IND")
		public void tbbsbrlCrseNumbInd_checkBoxChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				if ( SupportClasses.FORMS40.CheckboxChecked("TBBSBRL_CRSE_NUMB_IND").getValue() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().add(tbbsbrlElement.getCrseLnth()).add(1));
				}
				else {
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().subtract(tbbsbrlElement.getCrseLnth()).subtract(1));
				}
				executeAction("CHECK_WIDTH");
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_SECT_IND.WHEN-CHECKBOX-CHANGED
		 IF CHECKBOX_CHECKED('TBBSBRL_SECT_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + :SECT_LNTH + 1;
ELSE
   :SELECT_TOTAL := :SELECT_TOTAL - :SECT_LNTH - 1;
END IF;
EXECUTE_TRIGGER('CHECK_WIDTH');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_SECT_IND.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="TBBSBRL_SECT_IND")
		public void tbbsbrlSectInd_checkBoxChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				if ( SupportClasses.FORMS40.CheckboxChecked("TBBSBRL_SECT_IND").getValue() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().add(tbbsbrlElement.getSectLnth()).add(1));
				}
				else {
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().subtract(tbbsbrlElement.getSectLnth()).subtract(1));
				}
				executeAction("CHECK_WIDTH");
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_CAMP_CODE_IND.WHEN-CHECKBOX-CHANGED
		 IF CHECKBOX_CHECKED('TBBSBRL_CAMP_CODE_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + :CAMP_LNTH + 1;
ELSE
   :SELECT_TOTAL := :SELECT_TOTAL - :CAMP_LNTH - 1;
END IF;
EXECUTE_TRIGGER('CHECK_WIDTH');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_CAMP_CODE_IND.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="TBBSBRL_CAMP_CODE_IND")
		public void tbbsbrlCampCodeInd_checkBoxChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				if ( SupportClasses.FORMS40.CheckboxChecked("TBBSBRL_CAMP_CODE_IND").getValue() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().add(tbbsbrlElement.getCampLnth()).add(1));
				}
				else {
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().subtract(tbbsbrlElement.getCampLnth()).subtract(1));
				}
				executeAction("CHECK_WIDTH");
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_CRSE_TITLE_IND.WHEN-CHECKBOX-CHANGED
		 IF CHECKBOX_CHECKED('TBBSBRL_CRSE_TITLE_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + :TBBSBRL_TITLE_LNTH + 1;
ELSE
   :SELECT_TOTAL := :SELECT_TOTAL - :TBBSBRL_TITLE_LNTH - 1;
END IF;
EXECUTE_TRIGGER('CHECK_WIDTH');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_CRSE_TITLE_IND.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="TBBSBRL_CRSE_TITLE_IND")
		public void tbbsbrlCrseTitleInd_checkBoxChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				if ( SupportClasses.FORMS40.CheckboxChecked("TBBSBRL_CRSE_TITLE_IND").getValue() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().add(tbbsbrlElement.getTbbsbrlTitleLnth()).add(1));
				}
				else {
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().subtract(tbbsbrlElement.getTbbsbrlTitleLnth()).subtract(1));
				}
				executeAction("CHECK_WIDTH");
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_TITLE_LNTH.WHEN-LIST-CHANGED
		 EXECUTE_TRIGGER('RECALC_COLUMNS');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_TITLE_LNTH.WHEN-LIST-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-LIST-CHANGED", item="TBBSBRL_TITLE_LNTH")
		public void tbbsbrlTitleLnth_listChange()
		{
			
				executeAction("RECALC_COLUMNS");
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_CREDIT_HR_IND.WHEN-CHECKBOX-CHANGED
		 IF CHECKBOX_CHECKED('TBBSBRL_CREDIT_HR_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + :CREDIT_HR_LNTH + 1;
ELSE
   :SELECT_TOTAL := :SELECT_TOTAL - :CREDIT_HR_LNTH - 1;
END IF;
EXECUTE_TRIGGER('CHECK_WIDTH');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_CREDIT_HR_IND.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="TBBSBRL_CREDIT_HR_IND")
		public void tbbsbrlCreditHrInd_checkBoxChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				if ( SupportClasses.FORMS40.CheckboxChecked("TBBSBRL_CREDIT_HR_IND").getValue() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().add(tbbsbrlElement.getCreditHrLnth()).add(1));
				}
				else {
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().subtract(tbbsbrlElement.getCreditHrLnth()).subtract(1));
				}
				executeAction("CHECK_WIDTH");
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_LEVL_CODE_IND.WHEN-CHECKBOX-CHANGED
		 IF CHECKBOX_CHECKED('TBBSBRL_LEVL_CODE_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + :LEVL_LNTH + 1;
ELSE
   :SELECT_TOTAL := :SELECT_TOTAL - :LEVL_LNTH - 1;
END IF;
EXECUTE_TRIGGER('CHECK_WIDTH');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_LEVL_CODE_IND.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="TBBSBRL_LEVL_CODE_IND")
		public void tbbsbrlLevlCodeInd_checkBoxChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				if ( SupportClasses.FORMS40.CheckboxChecked("TBBSBRL_LEVL_CODE_IND").getValue() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().add(tbbsbrlElement.getLevlLnth()).add(1));
				}
				else {
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().subtract(tbbsbrlElement.getLevlLnth()).subtract(1));
				}
				executeAction("CHECK_WIDTH");
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_RSTS_CODE_IND.WHEN-CHECKBOX-CHANGED
		 IF CHECKBOX_CHECKED('TBBSBRL_RSTS_CODE_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + :STAT_LNTH + 1;
ELSE
   :SELECT_TOTAL := :SELECT_TOTAL - :STAT_LNTH - 1;
END IF;
EXECUTE_TRIGGER('CHECK_WIDTH');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_RSTS_CODE_IND.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="TBBSBRL_RSTS_CODE_IND")
		public void tbbsbrlRstsCodeInd_checkBoxChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				if ( SupportClasses.FORMS40.CheckboxChecked("TBBSBRL_RSTS_CODE_IND").getValue() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().add(tbbsbrlElement.getStatLnth()).add(1));
				}
				else {
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().subtract(tbbsbrlElement.getStatLnth()).subtract(1));
				}
				executeAction("CHECK_WIDTH");
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_MEET_DAY_IND.WHEN-CHECKBOX-CHANGED
		 IF CHECKBOX_CHECKED('TBBSBRL_MEET_DAY_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + :MEET_DAY_LNTH + 1;
ELSE
   :SELECT_TOTAL := :SELECT_TOTAL - :MEET_DAY_LNTH - 1;
END IF;
EXECUTE_TRIGGER('CHECK_WIDTH');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_MEET_DAY_IND.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="TBBSBRL_MEET_DAY_IND")
		public void tbbsbrlMeetDayInd_checkBoxChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				if ( SupportClasses.FORMS40.CheckboxChecked("TBBSBRL_MEET_DAY_IND").getValue() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().add(tbbsbrlElement.getMeetDayLnth()).add(1));
				}
				else {
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().subtract(tbbsbrlElement.getMeetDayLnth()).subtract(1));
				}
				executeAction("CHECK_WIDTH");
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_MEET_TIME_IND.WHEN-CHECKBOX-CHANGED
		 IF CHECKBOX_CHECKED('TBBSBRL_MEET_TIME_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + :MEET_TIME_LNTH + 1;
ELSE
   :SELECT_TOTAL := :SELECT_TOTAL - :MEET_TIME_LNTH - 1;
END IF;
EXECUTE_TRIGGER('CHECK_WIDTH');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_MEET_TIME_IND.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="TBBSBRL_MEET_TIME_IND")
		public void tbbsbrlMeetTimeInd_checkBoxChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				if ( SupportClasses.FORMS40.CheckboxChecked("TBBSBRL_MEET_TIME_IND").getValue() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().add(tbbsbrlElement.getMeetTimeLnth()).add(1));
				}
				else {
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().subtract(tbbsbrlElement.getMeetTimeLnth()).subtract(1));
				}
				executeAction("CHECK_WIDTH");
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_BLDG_CODE_IND.WHEN-CHECKBOX-CHANGED
		 IF CHECKBOX_CHECKED('TBBSBRL_BLDG_CODE_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + :BLDG_LNTH + 1;
ELSE
   :SELECT_TOTAL := :SELECT_TOTAL - :BLDG_LNTH - 1;
END IF;
EXECUTE_TRIGGER('CHECK_WIDTH');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_BLDG_CODE_IND.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="TBBSBRL_BLDG_CODE_IND")
		public void tbbsbrlBldgCodeInd_checkBoxChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				if ( SupportClasses.FORMS40.CheckboxChecked("TBBSBRL_BLDG_CODE_IND").getValue() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().add(tbbsbrlElement.getBldgLnth()).add(1));
				}
				else {
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().subtract(tbbsbrlElement.getBldgLnth()).subtract(1));
				}
				executeAction("CHECK_WIDTH");
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_ROOM_CODE_IND.WHEN-CHECKBOX-CHANGED
		 IF CHECKBOX_CHECKED('TBBSBRL_ROOM_CODE_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + :TBBSBRL_ROOM_LNTH + 1;
ELSE
   :SELECT_TOTAL := :SELECT_TOTAL - :TBBSBRL_ROOM_LNTH - 1;
END IF;
EXECUTE_TRIGGER('CHECK_WIDTH');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_ROOM_CODE_IND.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="TBBSBRL_ROOM_CODE_IND")
		public void tbbsbrlRoomCodeInd_checkBoxChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				if ( SupportClasses.FORMS40.CheckboxChecked("TBBSBRL_ROOM_CODE_IND").getValue() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().add(tbbsbrlElement.getTbbsbrlRoomLnth()).add(1));
				}
				else {
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().subtract(tbbsbrlElement.getTbbsbrlRoomLnth()).subtract(1));
				}
				executeAction("CHECK_WIDTH");
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_ROOM_LNTH.WHEN-LIST-CHANGED
		 EXECUTE_TRIGGER('RECALC_COLUMNS');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_ROOM_LNTH.WHEN-LIST-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-LIST-CHANGED", item="TBBSBRL_ROOM_LNTH")
		public void tbbsbrlRoomLnth_listChange()
		{
			
				executeAction("RECALC_COLUMNS");
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_INSTRUCTOR_IND.WHEN-CHECKBOX-CHANGED
		 IF CHECKBOX_CHECKED('TBBSBRL_INSTRUCTOR_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + :TBBSBRL_INSTR_LNTH + 1;
ELSE
   :SELECT_TOTAL := :SELECT_TOTAL - :TBBSBRL_INSTR_LNTH - 1;
END IF;
EXECUTE_TRIGGER('CHECK_WIDTH');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_INSTRUCTOR_IND.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="TBBSBRL_INSTRUCTOR_IND")
		public void tbbsbrlInstructorInd_checkBoxChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				if ( SupportClasses.FORMS40.CheckboxChecked("TBBSBRL_INSTRUCTOR_IND").getValue() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().add(tbbsbrlElement.getTbbsbrlInstrLnth()).add(1));
				}
				else {
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().subtract(tbbsbrlElement.getTbbsbrlInstrLnth()).subtract(1));
				}
				executeAction("CHECK_WIDTH");
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_INSTR_LNTH.WHEN-LIST-CHANGED
		 EXECUTE_TRIGGER('RECALC_COLUMNS');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_INSTR_LNTH.WHEN-LIST-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-LIST-CHANGED", item="TBBSBRL_INSTR_LNTH")
		public void tbbsbrlInstrLnth_listChange()
		{
			
				executeAction("RECALC_COLUMNS");
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_GMOD_CODE_IND.WHEN-CHECKBOX-CHANGED
		 IF CHECKBOX_CHECKED('TBBSBRL_GMOD_CODE_IND') THEN
   :SELECT_TOTAL := :SELECT_TOTAL + :GMOD_LNTH + 1;
ELSE
   :SELECT_TOTAL := :SELECT_TOTAL - :GMOD_LNTH - 1;
END IF;
EXECUTE_TRIGGER('CHECK_WIDTH');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_GMOD_CODE_IND.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="TBBSBRL_GMOD_CODE_IND")
		public void tbbsbrlGmodCodeInd_checkBoxChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				if ( SupportClasses.FORMS40.CheckboxChecked("TBBSBRL_GMOD_CODE_IND").getValue() )
				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().add(tbbsbrlElement.getGmodLnth()).add(1));
				}
				else {
					tbbsbrlElement.setSelectTotal(tbbsbrlElement.getSelectTotal().subtract(tbbsbrlElement.getGmodLnth()).subtract(1));
				}
				executeAction("CHECK_WIDTH");
			}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_GMOD_HDNG.KEY-NEXT-ITEM
		 GO_ITEM('TBBSBRL_PTRM_CODE_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_GMOD_HDNG.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBBSBRL_GMOD_HDNG", function=KeyFunction.NEXT_ITEM)
		public void tbbsbrlGmodHdng_keyNexItem()
		{
			
				goItem(toStr("TBBSBRL_PTRM_CODE_IND"));
			}

		
	
	
}
