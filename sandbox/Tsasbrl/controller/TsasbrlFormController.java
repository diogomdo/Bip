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
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
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

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.forms.controller.DefaultFormController;

import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

import net.hedtech.banner.arsys.Tsasbrl.model.*;
import net.hedtech.banner.arsys.Tsasbrl.*;
import net.hedtech.banner.arsys.Tsasbrl.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass;	
		
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;
import net.hedtech.general.common.libraries.Goqolib.model.GSdispAdapter;
import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;

public class TsasbrlFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private GApplFormClass getGApplFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_APPL_FORM_CLASS");
	}	
		
	
	
	public TsasbrlFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public TsasbrlTask getTask() {
		return (TsasbrlTask)super.getTask();
	}
	
	
	public TsasbrlModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Tsasbrl_GVerifyAccess()
		{
			
			getGFormClass().gVerifyAccess();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Tsasbrl_GRevokeAccess()
		{
			
			getGFormClass().gRevokeAccess();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Tsasbrl_TaskStartedPre(EventObject args)
		{
			
			getGFormClass().taskStartedPre(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Tsasbrl_PreFormTrg()
		{
			
			getGFormClass().preFormTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Tsasbrl_TaskEnded(EventObject args)
		{
			
			getGFormClass().taskEnded(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Tsasbrl_PostFormTrg()
		{
			
			getGFormClass().postFormTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		@Before
		public void Tsasbrl_blockIn()
		{
			
			getGFormClass().blockIn();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Tsasbrl_PreBlockTrg()
		{
			
			getGFormClass().preBlockTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		@Before
		public void Tsasbrl_blockOut()
		{
			
			getGFormClass().blockOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Tsasbrl_PostBlockTrg()
		{
			
			getGFormClass().postBlockTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Tsasbrl_PreCommitTrg()
		{
			
			getGFormClass().preCommitTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Tsasbrl_BeforeRowInsert(RowAdapterEvent args)
		{
			
			getGFormClass().beforeRowInsert(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Tsasbrl_BeforeRowUpdate(RowAdapterEvent args)
		{
			
			getGFormClass().beforeRowUpdate(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Tsasbrl_OnError(EventObject args)
		{
			
			getGFormClass().onError(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Tsasbrl_OnRollback()
		{
			
			getGFormClass().onRollback();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Tsasbrl_OnRollbackTrg()
		{
			
			getGFormClass().onRollbackTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.ON-SELECT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@QueryExecute
		public void Tsasbrl_QueryExecute(EventObject args)
		{
			
			getGFormClass().queryExecute(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Tsasbrl_AfterCommit(EventObject args)
		{
			
			getGFormClass().afterCommit(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Tsasbrl_PostFormsCommitTrg()
		{
			
			getGFormClass().postFormsCommitTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Tsasbrl_buttonClick()
		{
			
			getGFormClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		@Before
		public void Tsasbrl_blockChange()
		{
			
			getGFormClass().blockChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Tsasbrl_doubleClick()
		{
			
			getGFormClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Tsasbrl_WhenTimerExpired(NString timerName)
		{
			
			getGFormClass().whenTimerExpired(timerName);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Tsasbrl_WhenWindowActivated()
		{
			
			getGFormClass().whenWindowActivated();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Tsasbrl_WhenWindowClosed()
		{
			
			getGFormClass().whenWindowClosed();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Tsasbrl_Help()
		{
			
			getGFormClass().help();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Tsasbrl_F0()
		{
			
			getGFormClass().f0();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Tsasbrl_F2()
		{
			
			getGFormClass().f2();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.DOWN)
		public void Tsasbrl_MoveDown()
		{
			
			getGFormClass().moveDown();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.UP)
		public void Tsasbrl_MoveUp()
		{
			
			getGFormClass().moveUp();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Tsasbrl_ListValues()
		{
			
			getGFormClass().listValues();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Tsasbrl_KeyMenu()
		{
			
			getGFormClass().keyMenu();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Tsasbrl_NextRecord()
		{
			
			getGFormClass().nextRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Tsasbrl_PreviousRecord()
		{
			
			getGFormClass().previousRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Tsasbrl_KeyNxtset()
		{
			
			getGFormClass().keyNxtset();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Tsasbrl_KeyScrup()
		{
			
			getGFormClass().keyScrup();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Tsasbrl_KeyScrdown()
		{
			
			getGFormClass().keyScrdown();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Tsasbrl_KeyPrint()
		{
			
			getGFormClass().keyPrint();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Tsasbrl_Search()
		{
			
			getGFormClass().search();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Tsasbrl_ExecuteQuery()
		{
			
			getGFormClass().executeQuery();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Tsasbrl_Exit()
		{
			
			getGFormClass().exit();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Tsasbrl_KeyExitTrg()
		{
			
			getGFormClass().keyExitTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Tsasbrl_KeyNxtkeyTrg()
		{
			
			getGFormClass().keyNxtkeyTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Tsasbrl_ListValuesCopy()
		{
			
			getGFormClass().listValuesCopy();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Tsasbrl_LoadFormHeader()
		{
			
			getGFormClass().loadFormHeader();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Tsasbrl_InvalidOptionMsg()
		{
			
			getGFormClass().invalidOptionMsg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Tsasbrl_UpdateActivity()
		{
			
			getGFormClass().updateActivity();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void Tsasbrl_CheckKeys()
		{
			
			getGApplFormClass().checkKeys();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		@Before
		public void Tsasbrl_recordChange()
		{
			
			getGApplFormClass().recordChange();
		}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.PRE-COMMIT
		 -- Same validation as in KEY-COMMIT trigger, but without the GO-ITEMs

BEGIN

-- Check total width of columns selected (as in CHECK_WIDTH trigger)

    IF :TBBSBRL_FORM_TYPE = 'M' THEN
       IF :SELECT_TOTAL > 76 THEN
          :GLOBAL.DUMMY_VAR := SHOW_ALERT('TOO_WIDE1');
--          MESSAGE('*ERROR* Total width of selected columns exceeds 76.' ) ;
--        GO_ITEM('TBBSBRL_PTRM_CODE_IND');
          RAISE FORM_TRIGGER_FAILURE ;
       END IF;
    END IF;
--
    IF :TBBSBRL_FORM_TYPE = 'B' THEN
       IF :SELECT_TOTAL > 132 THEN
          :GLOBAL.DUMMY_VAR := SHOW_ALERT('TOO_WIDE2');
--          MESSAGE('*ERROR* Total width of selected columns exceeds 132.' ) ;
--        GO_ITEM('TBBSBRL_PTRM_CODE_IND');
          RAISE FORM_TRIGGER_FAILURE ;
       ELSIF :SELECT_TOTAL > 80 THEN
          :GLOBAL.DUMMY_VAR := SHOW_ALERT('TOO_WIDE3');
--          MESSAGE('*ERROR* Total width of selected columns exceeds 80.' ) ;
--        GO_ITEM('TBBSBRL_PTRM_CODE_IND');
-- not fatal   RAISE FORM_TRIGGER_FAILURE ;
       END IF;
    END IF;

-- Check combination of Term selection and summary fields (as in CHECK_SEL_SUM trigger)

    IF :TBBSBRL_SUM_TERM_CHARGES = 'T' THEN
       IF :TBBSBRL_SEL_TERM_CHARGES <> 'A' THEN
          :GLOBAL.DUMMY_VAR := SHOW_ALERT('INVALID_COMBO');
--        GO_ITEM('TBBSBRL_SEL_TERM_CHARGES');
          RAISE FORM_TRIGGER_FAILURE ;
       END IF;
    END IF;

-- Check that Category or Source codes were entered if 'Select charges by
--   Category or Source' was selected (as in CHECK_TBRSBRL trigger)

   IF :TBBSBRL_SEL_TERM_CHARGES = 'C' THEN
      IF :TBRSBRL_VALUE IS NULL THEN 
         MESSAGE( G$_NLS.Get('TSASBRL-0000', 'FORM','*ERROR* If selecting term charges by category, must enter category codes.') );
         RAISE FORM_TRIGGER_FAILURE ;
      END IF;
   END IF;
--
   IF :TBBSBRL_SEL_TERM_CHARGES = 'S' THEN
      IF :TBRSBRL_VALUE IS NULL THEN 
         MESSAGE( G$_NLS.Get('TSASBRL-0001', 'FORM','*ERROR* If selecting term charges by source, must enter source codes.') );
         RAISE FORM_TRIGGER_FAILURE ;
      END IF;
   END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Tsasbrl_BeforeCommit(CancelEvent args)
		{
			
				//  Same validation as in KEY-COMMIT trigger, but without the GO-ITEMs
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);
				TbrsbrlAdapter tbrsbrlElement = (TbrsbrlAdapter)this.getFormModel().getTbrsbrl().getRowAdapter(true);


				//  Check total width of columns selected (as in CHECK_WIDTH trigger)
				if ( tbbsbrlElement.getTbbsbrlFormType().equals("M") )
				{
					if ( tbbsbrlElement.getSelectTotal().greater(76) )
					{
						setGlobal("DUMMY_VAR", toStr(showAlert("TOO_WIDE1")));
						//           MESSAGE('*ERROR* Total width of selected columns exceeds 76.' ) ;
						//         GO_ITEM('TBBSBRL_PTRM_CODE_IND');
						throw new ApplicationException();
					}
				}
				// 
				if ( tbbsbrlElement.getTbbsbrlFormType().equals("B") )
				{
					if ( tbbsbrlElement.getSelectTotal().greater(132) )
					{
						setGlobal("DUMMY_VAR", toStr(showAlert("TOO_WIDE2")));
						//           MESSAGE('*ERROR* Total width of selected columns exceeds 132.' ) ;
						//         GO_ITEM('TBBSBRL_PTRM_CODE_IND');
						throw new ApplicationException();
					}
					else if ( tbbsbrlElement.getSelectTotal().greater(80) ) {
						setGlobal("DUMMY_VAR", toStr(showAlert("TOO_WIDE3")));
					}
				}
				//  Check combination of Term selection and summary fields (as in CHECK_SEL_SUM trigger)
				if ( tbbsbrlElement.getTbbsbrlSumTermCharges().equals("T") )
				{
					if ( tbbsbrlElement.getTbbsbrlSelTermCharges().notEquals("A") )
					{
						setGlobal("DUMMY_VAR", toStr(showAlert("INVALID_COMBO")));
						//         GO_ITEM('TBBSBRL_SEL_TERM_CHARGES');
						throw new ApplicationException();
					}
				}
				//  Check that Category or Source codes were entered if 'Select charges by
				//    Category or Source' was selected (as in CHECK_TBRSBRL trigger)
				if ( tbbsbrlElement.getTbbsbrlSelTermCharges().equals("C") )
				{
					if ( tbrsbrlElement.getTbrsbrlValue().isNull() )
					{
						errorMessage(GNls.Fget(toStr("TSASBRL-0000"), toStr("FORM"), toStr("*ERROR* If selecting term charges by category, must enter category codes.")));
						throw new ApplicationException();
					}
				}
				// 
				if ( tbbsbrlElement.getTbbsbrlSelTermCharges().equals("S") )
				{
					if ( tbrsbrlElement.getTbrsbrlValue().isNull() )
					{
						errorMessage(GNls.Fget(toStr("TSASBRL-0001"), toStr("FORM"), toStr("*ERROR* If selecting term charges by source, must enter source codes.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.CHECK_TBRSBRL
		 IF :TBBSBRL_SEL_TERM_CHARGES = 'C' THEN
   IF :TBRSBRL_VALUE IS NULL THEN 
      MESSAGE( G$_NLS.Get('TSASBRL-0002', 'FORM','*ERROR* If selecting term charges by category, must enter category codes.') );
      RAISE FORM_TRIGGER_FAILURE ;
   END IF;
END IF;
--
IF :TBBSBRL_SEL_TERM_CHARGES = 'S' THEN
   IF :TBRSBRL_VALUE IS NULL THEN 
      MESSAGE( G$_NLS.Get('TSASBRL-0003', 'FORM','*ERROR* If selecting term charges by source, must enter source codes.') );
      RAISE FORM_TRIGGER_FAILURE ;
   END IF;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.CHECK_TBRSBRL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_TBRSBRL")
		public void Tsasbrl_CheckTbrsbrl()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);
				TbrsbrlAdapter tbrsbrlElement = (TbrsbrlAdapter)this.getFormModel().getTbrsbrl().getRowAdapter(true);


				if ( tbbsbrlElement.getTbbsbrlSelTermCharges().equals("C") )
				{
					if ( tbrsbrlElement.getTbrsbrlValue().isNull() )
					{
						errorMessage(GNls.Fget(toStr("TSASBRL-0002"), toStr("FORM"), toStr("*ERROR* If selecting term charges by category, must enter category codes.")));
						throw new ApplicationException();
					}
				}
				// 
				if ( tbbsbrlElement.getTbbsbrlSelTermCharges().equals("S") )
				{
					if ( tbrsbrlElement.getTbrsbrlValue().isNull() )
					{
						errorMessage(GNls.Fget(toStr("TSASBRL-0003"), toStr("FORM"), toStr("*ERROR* If selecting term charges by source, must enter source codes.")));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.CHECK_SEL_SUM
		 DECLARE
BEGIN
    IF :TBBSBRL_SUM_TERM_CHARGES = 'T' THEN
       IF :TBBSBRL_SEL_TERM_CHARGES <> 'A' THEN
          :GLOBAL.DUMMY_VAR := SHOW_ALERT('INVALID_COMBO');
          GO_ITEM('TBBSBRL_SEL_TERM_CHARGES');
          RAISE FORM_TRIGGER_FAILURE ;
       END IF;
    END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.CHECK_SEL_SUM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_SEL_SUM")
		public void Tsasbrl_CheckSelSum()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				{
					if ( tbbsbrlElement.getTbbsbrlSumTermCharges().equals("T") )
					{
						if ( tbbsbrlElement.getTbbsbrlSelTermCharges().notEquals("A") )
						{
							setGlobal("DUMMY_VAR", toStr(showAlert("INVALID_COMBO")));
							goItem(toStr("TBBSBRL_SEL_TERM_CHARGES"));
							throw new ApplicationException();
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.SETUP_TBRSBRL_BLOCK_INIT
		 IF :TBBSBRL_SEL_TERM_CHARGES = 'C' THEN
--   SET_ITEM_PROPERTY('TBRSBRL_VALUE_LBT',ENABLED,PROPERTY_ON); [outside of block]
--   SET_ITEM_PROPERTY('TBRSBRL_VALUE_LBT',LABEL,'Category');
   SET_ITEM_PROPERTY('TBRSBRL_VALUE',PROMPT_TEXT, G$_NLS.Get('TSASBRL-0004', 'FORM','Category Code') );
   SET_ITEM_PROPERTY('TBRSBRL_VALUE',    ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('TBRSBRL_VALUE',    NAVIGABLE,PROPERTY_ON);
   SET_ITEM_PROPERTY('TBRSBRL_VALUE',    LOV_NAME,'TTVDCAT_LOV');
   GO_BLOCK('TBRSBRL');
   EXECUTE_QUERY;
ELSIF :TBBSBRL_SEL_TERM_CHARGES = 'S' THEN
--   SET_ITEM_PROPERTY('TBRSBRL_VALUE_LBT',ENABLED,PROPERTY_ON); [outside of block]
--   SET_ITEM_PROPERTY('TBRSBRL_VALUE_LBT',LABEL,'Source');
   SET_ITEM_PROPERTY('TBRSBRL_VALUE',PROMPT_TEXT, G$_NLS.Get('TSASBRL-0005', 'FORM','Source Code') );
   SET_ITEM_PROPERTY('TBRSBRL_VALUE',    ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('TBRSBRL_VALUE',    NAVIGABLE,PROPERTY_ON);
   SET_ITEM_PROPERTY('TBRSBRL_VALUE',    LOV_NAME,'TTVSRCE_LOV');
   GO_BLOCK('TBRSBRL');
   EXECUTE_QUERY;
ELSIF :TBBSBRL_SEL_TERM_CHARGES = 'A' THEN 
-- GO_BLOCK('TBRSBRL');
-- CLEAR_BLOCK;
-- GO_ITEM('TBBSBRL_SEL_TERM_CHARGES');
--   SET_ITEM_PROPERTY('TBRSBRL_VALUE_LBT',LABEL,' ');
   SET_ITEM_PROPERTY('TBRSBRL_VALUE',PROMPT_TEXT,' ');
   SET_ITEM_PROPERTY('TBRSBRL_VALUE_LBT',ENABLED,PROPERTY_OFF);   
   SET_ITEM_PROPERTY('TBRSBRL_VALUE',    ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('TBRSBRL_VALUE',    NAVIGABLE,PROPERTY_OFF);
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.SETUP_TBRSBRL_BLOCK_INIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SETUP_TBRSBRL_BLOCK_INIT")
		public void Tsasbrl_SetupTbrsbrlBlockInit()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				if ( tbbsbrlElement.getTbbsbrlSelTermCharges().equals("C") )
				{
					//    SET_ITEM_PROPERTY('TBRSBRL_VALUE_LBT',ENABLED,PROPERTY_ON); [outside of block]
					//    SET_ITEM_PROPERTY('TBRSBRL_VALUE_LBT',LABEL,'Category');
					setItemPromptText("TBRSBRL_VALUE", GNls.Fget(toStr("TSASBRL-0004"), toStr("FORM"), toStr("Category Code")));
					setItemEnabled("TBRSBRL_VALUE", true);
					setItemNavigable("TBRSBRL_VALUE", true);
					setItemLovName("TBRSBRL_VALUE", "TTVDCAT_LOV");
					goBlock(toStr("TBRSBRL"));
					executeQuery();
				}
				else if ( tbbsbrlElement.getTbbsbrlSelTermCharges().equals("S") ) {
					//    SET_ITEM_PROPERTY('TBRSBRL_VALUE_LBT',ENABLED,PROPERTY_ON); [outside of block]
					//    SET_ITEM_PROPERTY('TBRSBRL_VALUE_LBT',LABEL,'Source');
					setItemPromptText("TBRSBRL_VALUE", GNls.Fget(toStr("TSASBRL-0005"), toStr("FORM"), toStr("Source Code")));
					setItemEnabled("TBRSBRL_VALUE", true);
					setItemNavigable("TBRSBRL_VALUE", true);
					setItemLovName("TBRSBRL_VALUE", "TTVSRCE_LOV");
					goBlock(toStr("TBRSBRL"));
					executeQuery();
				}
				else if ( tbbsbrlElement.getTbbsbrlSelTermCharges().equals("A") ) {
					//  GO_BLOCK('TBRSBRL');
					//  CLEAR_BLOCK;
					//  GO_ITEM('TBBSBRL_SEL_TERM_CHARGES');
					//    SET_ITEM_PROPERTY('TBRSBRL_VALUE_LBT',LABEL,' ');
					setItemPromptText("TBRSBRL_VALUE", " ");
					setItemEnabled("TBRSBRL_VALUE_LBT", false);
					setItemEnabled("TBRSBRL_VALUE", false);
					setItemNavigable("TBRSBRL_VALUE", false);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.KEY-NXTKEY
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Tsasbrl_KeyNxtkey()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.KEY-NXTBLK
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Tsasbrl_NextBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.KEY-PRVBLK
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Tsasbrl_PreviousBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.KEY-DUP-ITEM
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUP-ITEM")
		public void Tsasbrl_KeyDupItem()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.KEY-DUPREC
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.KEY-DUPREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void Tsasbrl_CopyRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.VALIDATE_CURR_CODE
		   :EFFDATE_EFF_DATE_TIME := TO_CHAR(SYSDATE, 'YYYYMMDD') ||
      '235959' ;
--
   EXECUTE_TRIGGER( 'EDIT_CURR_CODE' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.VALIDATE_CURR_CODE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="VALIDATE_CURR_CODE")
		public void Tsasbrl_ValidateCurrCode()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				tbbsbrlElement.setEffdateEffDateTime(toChar(DbManager.getDBDateTime(), "YYYYMMDD").append("235959"));
				// 
				executeAction("EDIT_CURR_CODE");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.EDIT_CURR_CODE
		    IF :TBBSBRL_CURR_CODE IS NULL  THEN
      :CURR_TITLE := '';
      GOTO TRIGEND ;
   END IF ;
--
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT GTVCURR_TITLE
         FROM   GTVCURR
         WHERE  GTVCURR_CURR_CODE = :TBBSBRL_CURR_CODE
           AND  TRUNC(GTVCURR_RATE_EFF_DATE) <= TRUNC(TO_DATE(
              :EFFDATE_EFF_DATE_TIME, 'YYYYMMDDHH24MISS'))
           AND  (TRUNC(GTVCURR_RATE_TERM_DATE) > TRUNC(TO_DATE(
              :EFFDATE_EFF_DATE_TIME, 'YYYYMMDDHH24MISS'))
            OR  GTVCURR_RATE_TERM_DATE IS NULL)
           AND  (TRUNC(GTVCURR_RATE_NCHG_DATE) > TRUNC(TO_DATE(
              :EFFDATE_EFF_DATE_TIME, 'YYYYMMDDHH24MISS'))
            OR  GTVCURR_RATE_NCHG_DATE IS NULL)
           AND  GTVCURR_STATUS_IND = 'A' ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :CURR_TITLE ;
      IF PTI_CURSOR%NOTFOUND THEN
         MESSAGE(
 G$_NLS.Get('TSASBRL-0006', 'FORM','*ERROR* Currency code is not valid at this point in time.')  ) ;
         RAISE FORM_TRIGGER_FAILURE ;
      ELSE
         GOTO TRIGEND ;
      END IF ;
   END ;
--
-- THIS STEP IS NOT EXECUTED SINCE, CURRENTLY, IT IS NOT NECESSARY FOR
--  THE
-- INSTALLATION TO BUILD THIS INFO. SHOULD IT BECOME NECESSARY, CHANGE
--  THE
-- ERROR MESSAGE OF THIS STEP TO NOT SAY 'SEE COMMENT' AND REMOVE THE
-- SUCCESS LABEL ON THE PREVIOUS STEP.                              TM
--  10/31/91
--
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT gurcurr_conv_rate
         FROM   gurcurr
         WHERE  gurcurr_curr_code = :TBBSBRL_CURR_CODE
           AND  TRUNC(gurcurr_rate_eff_date) <= TRUNC(TO_DATE(
              :effdate_eff_date_time, 'yyyymmddhh24miss'))
           AND  (TRUNC(gurcurr_rate_nchg_date) > TRUNC(TO_DATE(
              :effdate_eff_date_time, 'yyyymmddhh24miss'))
            OR  gurcurr_rate_nchg_date IS NULL) ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :hold_conv_rate ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,  G$_NLS.Get('TSASBRL-0007', 'FORM','*ERROR* Conversion rate is not effective for the currency code. SEE COMMENT')  
         , TRUE)
         ;
   END ;
--
   << TRIGEND >>
   NULL ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.EDIT_CURR_CODE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="EDIT_CURR_CODE")
		public void Tsasbrl_EditCurrCode()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				int rowCount = 0;
				if ( tbbsbrlElement.getTbbsbrlCurrCode().isNull() )
				{
					tbbsbrlElement.setCurrTitle(toStr(""));
					 goto TRIGEND;
				}
				{
					String sqlptiCursor = "SELECT GTVCURR_TITLE " +
	" FROM GTVCURR " +
	" WHERE GTVCURR_CURR_CODE = :TBBSBRL_CURR_CODE AND TRUNC(GTVCURR_RATE_EFF_DATE) <= TRUNC(TO_DATE(:EFFDATE_EFF_DATE_TIME, 'YYYYMMDDHH24MISS')) AND (TRUNC(GTVCURR_RATE_TERM_DATE) > TRUNC(TO_DATE(:EFFDATE_EFF_DATE_TIME, 'YYYYMMDDHH24MISS')) OR GTVCURR_RATE_TERM_DATE IS NULL) AND (TRUNC(GTVCURR_RATE_NCHG_DATE) > TRUNC(TO_DATE(:EFFDATE_EFF_DATE_TIME, 'YYYYMMDDHH24MISS')) OR GTVCURR_RATE_NCHG_DATE IS NULL) AND GTVCURR_STATUS_IND = 'A' ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("TBBSBRL_CURR_CODE", tbbsbrlElement.getTbbsbrlCurrCode());
						ptiCursor.addParameter("EFFDATE_EFF_DATE_TIME", tbbsbrlElement.getEffdateEffDateTime());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							tbbsbrlElement.setCurrTitle(ptiCursorResults.getStr(0));
						}
						if ( ptiCursor.notFound() )
						{
							errorMessage(GNls.Fget(toStr("TSASBRL-0006"), toStr("FORM"), toStr("*ERROR* Currency code is not valid at this point in time.")));
							throw new ApplicationException();
						}
						else {
							 goto TRIGEND;
						}
					}
					finally{
						ptiCursor.close();
					}
				}
				{
					String sqlptiCursor = "SELECT gurcurr_conv_rate " +
	" FROM gurcurr " +
	" WHERE gurcurr_curr_code = :TBBSBRL_CURR_CODE AND TRUNC(gurcurr_rate_eff_date) <= TRUNC(TO_DATE(:EFFDATE_EFF_DATE_TIME, 'yyyymmddhh24miss')) AND (TRUNC(gurcurr_rate_nchg_date) > TRUNC(TO_DATE(:EFFDATE_EFF_DATE_TIME, 'yyyymmddhh24miss')) OR gurcurr_rate_nchg_date IS NULL) ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("TBBSBRL_CURR_CODE", tbbsbrlElement.getTbbsbrlCurrCode());
						ptiCursor.addParameter("EFFDATE_EFF_DATE_TIME", tbbsbrlElement.getEffdateEffDateTime());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							tbbsbrlElement.setHoldConvRate(ptiCursorResults.getNumber(0));
						}
						getTask().getGoqrpls().gCheckValue(ptiCursor.notFound(), GNls.Fget(toStr("TSASBRL-0007"), toStr("FORM"), toStr("*ERROR* Conversion rate is not effective for the currency code. SEE COMMENT")), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
				 TRIGEND:;
			}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.SETUP_TBRSBRL_BLOCK_CHANGE
		 IF :TBBSBRL_SEL_TERM_CHARGES = 'C' THEN
   SET_ITEM_PROPERTY('TBRSBRL_VALUE_LBT',ENABLED,PROPERTY_ON);
--   SET_ITEM_PROPERTY('TBRSBRL_VALUE_LBT',LABEL,'Category');
   SET_ITEM_PROPERTY('TBRSBRL_VALUE',PROMPT_TEXT, G$_NLS.Get('TSASBRL-0008', 'FORM','Category Code') );
   SET_ITEM_PROPERTY('TBRSBRL_VALUE',    ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('TBRSBRL_VALUE',    NAVIGABLE,PROPERTY_ON);
   SET_ITEM_PROPERTY('TBRSBRL_VALUE',    LOV_NAME,'TTVDCAT_LOV');
   GO_BLOCK('TBRSBRL');
   EXECUTE_QUERY;
ELSIF :TBBSBRL_SEL_TERM_CHARGES = 'S' THEN
   SET_ITEM_PROPERTY('TBRSBRL_VALUE_LBT',ENABLED,PROPERTY_ON);
--   SET_ITEM_PROPERTY('TBRSBRL_VALUE_LBT',LABEL,'Source');
   SET_ITEM_PROPERTY('TBRSBRL_VALUE',PROMPT_TEXT, G$_NLS.Get('TSASBRL-0009', 'FORM','Source Code') );
   SET_ITEM_PROPERTY('TBRSBRL_VALUE',    ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('TBRSBRL_VALUE',    NAVIGABLE,PROPERTY_ON);
   SET_ITEM_PROPERTY('TBRSBRL_VALUE',    LOV_NAME,'TTVSRCE_LOV');
   GO_BLOCK('TBRSBRL');
   EXECUTE_QUERY;
ELSIF :TBBSBRL_SEL_TERM_CHARGES = 'A' THEN 
   EXECUTE_TRIGGER('DEL_TBRSBRL');
   G$_CHECK_FAILURE ;
   GO_BLOCK('TBRSBRL');
   CLEAR_BLOCK;
   GO_ITEM('TBBSBRL_SEL_TERM_CHARGES');
--   SET_ITEM_PROPERTY('TBRSBRL_VALUE_LBT',LABEL,' ');
   SET_ITEM_PROPERTY('TBRSBRL_VALUE',PROMPT_TEXT,' ');
   SET_ITEM_PROPERTY('TBRSBRL_VALUE_LBT',ENABLED,PROPERTY_OFF);   
   SET_ITEM_PROPERTY('TBRSBRL_VALUE',    ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('TBRSBRL_VALUE',    NAVIGABLE,PROPERTY_OFF);
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.SETUP_TBRSBRL_BLOCK_CHANGE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SETUP_TBRSBRL_BLOCK_CHANGE")
		public void Tsasbrl_SetupTbrsbrlBlockChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				if ( tbbsbrlElement.getTbbsbrlSelTermCharges().equals("C") )
				{
					setItemEnabled("TBRSBRL_VALUE_LBT", true);
					//    SET_ITEM_PROPERTY('TBRSBRL_VALUE_LBT',LABEL,'Category');
					setItemPromptText("TBRSBRL_VALUE", GNls.Fget(toStr("TSASBRL-0008"), toStr("FORM"), toStr("Category Code")));
					setItemEnabled("TBRSBRL_VALUE", true);
					setItemNavigable("TBRSBRL_VALUE", true);
					setItemLovName("TBRSBRL_VALUE", "TTVDCAT_LOV");
					goBlock(toStr("TBRSBRL"));
					executeQuery();
				}
				else if ( tbbsbrlElement.getTbbsbrlSelTermCharges().equals("S") ) {
					setItemEnabled("TBRSBRL_VALUE_LBT", true);
					//    SET_ITEM_PROPERTY('TBRSBRL_VALUE_LBT',LABEL,'Source');
					setItemPromptText("TBRSBRL_VALUE", GNls.Fget(toStr("TSASBRL-0009"), toStr("FORM"), toStr("Source Code")));
					setItemEnabled("TBRSBRL_VALUE", true);
					setItemNavigable("TBRSBRL_VALUE", true);
					setItemLovName("TBRSBRL_VALUE", "TTVSRCE_LOV");
					goBlock(toStr("TBRSBRL"));
					executeQuery();
				}
				else if ( tbbsbrlElement.getTbbsbrlSelTermCharges().equals("A") ) {
					executeAction("DEL_TBRSBRL");
					getTask().getGoqrpls().gCheckFailure();
					goBlock(toStr("TBRSBRL"));
					clearBlock();
					goItem(toStr("TBBSBRL_SEL_TERM_CHARGES"));
					//    SET_ITEM_PROPERTY('TBRSBRL_VALUE_LBT',LABEL,' ');
					setItemPromptText("TBRSBRL_VALUE", " ");
					setItemEnabled("TBRSBRL_VALUE_LBT", false);
					setItemEnabled("TBRSBRL_VALUE", false);
					setItemNavigable("TBRSBRL_VALUE", false);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.5';



		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Tsasbrl_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.GO_PAGE5
		 IF :TBBSBRL_USE_RULES_IND IS NULL THEN
   GO_ITEM('TBBSBRL_USE_RULES_IND');
   MESSAGE( G$_NLS.Get('TSASBRL-0010', 'FORM','Selection Criteria must be entered before navigating to Schedule/Bill Messages.') );
   RAISE FORM_TRIGGER_FAILURE;
END IF;
GO_ITEM('TBRSBMS_MESSAGE');
EXECUTE_QUERY;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.GO_PAGE5
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GO_PAGE5")
		public void Tsasbrl_GoPage5()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				if ( tbbsbrlElement.getTbbsbrlUseRulesInd().isNull() )
				{
					goItem(toStr("TBBSBRL_USE_RULES_IND"));
					message(GNls.Fget(toStr("TSASBRL-0010"), toStr("FORM"), toStr("Selection Criteria must be entered before navigating to Schedule/Bill Messages.")));
					throw new ApplicationException();
				}
				goItem(toStr("TBRSBMS_MESSAGE"));
				executeQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.GO_PAGE4
		 IF :TBBSBRL_USE_RULES_IND IS NULL THEN
   GO_ITEM('TBBSBRL_USE_RULES_IND');
   MESSAGE( G$_NLS.Get('TSASBRL-0011', 'FORM','Selection Criteria must be entered before navigating to Select Items for Schedule.') );
   RAISE FORM_TRIGGER_FAILURE;
END IF;
GO_ITEM('TBBSBRL_PTRM_CODE_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.GO_PAGE4
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GO_PAGE4")
		public void Tsasbrl_GoPage4()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				if ( tbbsbrlElement.getTbbsbrlUseRulesInd().isNull() )
				{
					goItem(toStr("TBBSBRL_USE_RULES_IND"));
					message(GNls.Fget(toStr("TSASBRL-0011"), toStr("FORM"), toStr("Selection Criteria must be entered before navigating to Select Items for Schedule.")));
					throw new ApplicationException();
				}
				goItem(toStr("TBBSBRL_PTRM_CODE_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.INVALID_FUNCTION_MSG
		   MESSAGE(  G$_NLS.Get('TSASBRL-0012', 'FORM','*ERROR* Invalid function; press SHOW KEYS key for valid functions.')  
       ) ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.INVALID_FUNCTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_FUNCTION_MSG")
		public void Tsasbrl_InvalidFunctionMsg()
		{
			
				errorMessage(GNls.Fget(toStr("TSASBRL-0012"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS key for valid functions.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.GO_PAGE1
		 GO_ITEM('TBBSBRL_USE_RULES_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.GO_PAGE1
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GO_PAGE1")
		public void Tsasbrl_GoPage1()
		{
			
				goItem(toStr("TBBSBRL_USE_RULES_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.GO_PAGE2
		 IF :TBBSBRL_USE_RULES_IND IS NULL THEN
   GO_ITEM('TBBSBRL_USE_RULES_IND');
   MESSAGE( G$_NLS.Get('TSASBRL-0013', 'FORM','Selection Criteria must be entered before navigating to Student Selection.') );
   RAISE FORM_TRIGGER_FAILURE;
END IF;
GO_ITEM('TBBSBRL_EXCL_REG_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.GO_PAGE2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GO_PAGE2")
		public void Tsasbrl_GoPage2()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				if ( tbbsbrlElement.getTbbsbrlUseRulesInd().isNull() )
				{
					goItem(toStr("TBBSBRL_USE_RULES_IND"));
					message(GNls.Fget(toStr("TSASBRL-0013"), toStr("FORM"), toStr("Selection Criteria must be entered before navigating to Student Selection.")));
					throw new ApplicationException();
				}
				goItem(toStr("TBBSBRL_EXCL_REG_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.GO_PAGE3
		 IF :TBBSBRL_USE_RULES_IND IS NULL THEN
   GO_ITEM('TBBSBRL_USE_RULES_IND');
   MESSAGE( G$_NLS.Get('TSASBRL-0014', 'FORM','Selection Criteria must be entered before navigating to Bill Selection Parameters.') );
   RAISE FORM_TRIGGER_FAILURE;
END IF;
go_block('TBRSBEP'); <multilinecomment>shalini added these 2 lines</multilinecomment>
execute_query;	
GO_ITEM('TBBSBRL_PRINT_FIN_MEMO_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.GO_PAGE3
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GO_PAGE3")
		public void Tsasbrl_GoPage3()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				if ( tbbsbrlElement.getTbbsbrlUseRulesInd().isNull() )
				{
					goItem(toStr("TBBSBRL_USE_RULES_IND"));
					message(GNls.Fget(toStr("TSASBRL-0014"), toStr("FORM"), toStr("Selection Criteria must be entered before navigating to Bill Selection Parameters.")));
					throw new ApplicationException();
				}
				goBlock(toStr("TBRSBEP"));
				// shalini added these 2 lines
				executeQuery();
				goItem(toStr("TBBSBRL_PRINT_FIN_MEMO_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.WHEN_WINDOW_ACTIVATED_TRG
		 BEGIN
   IF :SYSTEM.EVENT_WINDOW IS NULL OR
      :SYSTEM.EVENT_WINDOW <> 'G$_OPT_WINDOW' THEN
      G$_SET_INST_PROPERTY;
      G$_SET_WIN_PROPERTY;
   END IF;
   IF :SYSTEM.EVENT_WINDOW IS not NULL and
      :SYSTEM.EVENT_WINDOW <> 'G$_OPT_WINDOW' THEN
       g$_determine_cursor_location ('TBBSBRL_USE_RULES_IND');
   END IF;
END;
IF :SYSTEM.EVENT_WINDOW = 'BILL_WINDOW3' THEN
   EXECUTE_TRIGGER('SETUP_TBRSBRL_BLOCK_INIT');
   GO_ITEM('TBBSBRL_PRINT_FIN_MEMO_IND');
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Tsasbrl_WhenWindowActivatedTrg()
		{
			
				if ( getCurrentWindow().isNull() || getCurrentWindow().notEquals("G$_OPT_WINDOW") )
				{
					getTask().getGoqrpls().gSetInstProperty();
					getTask().getGoqrpls().gSetWinProperty();
				}
				if ( getCurrentWindow().isNotNull() && getCurrentWindow().notEquals("G$_OPT_WINDOW") )
				{
					getTask().getGoqrpls().gDetermineCursorLocation(toStr("TBBSBRL_USE_RULES_IND"));
				}
				if ( getCurrentWindow().equals("BILL_WINDOW3") )
				{
					executeAction("SETUP_TBRSBRL_BLOCK_INIT");
					goItem(toStr("TBBSBRL_PRINT_FIN_MEMO_IND"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.WHEN_NEW_BLOCK_INSTANCE_TRG
		 DISABLE_ENABLE (20);
IF :CHECK_KEYS = 'Y' THEN
   :CHECK_KEYS := 'N';
   GO_BLOCK('KEY_BLOCK'); 
   G$_CHECK_VALUE ((:KEY_BLOCK.KEYBLOC_SBRC_CODE IS NULL),
    G$_NLS.Get('TSASBRL-0015', 'FORM','*ERROR* Valid key information must be entered before proceeding.') , TRUE, TRUE);
   GO_ITEM('TBBSBRL_USE_RULES_IND') ;
-- (Above line functions as next_block command - used due to MAC problems)
--
   :CHECK_KEYS := 'N';
   EXECUTE_TRIGGER('DISABLE_KEYS');
   G$_CHECK_FAILURE;
   EXECUTE_QUERY ;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Tsasbrl_WhenNewBlockInstanceTrg()
		{
			
				this.getTask().getServices().disableEnable(toNumber(20));
				if ( getFormModel().getButtonControlBlock().getCheckKeys().equals("Y") )
				{
					getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
					goBlock(toStr("KEY_BLOCK"));
					getTask().getGoqrpls().gCheckValue(((getFormModel().getKeyBlock().getKeyblocSbrcCode().isNull())), GNls.Fget(toStr("TSASBRL-0015"), toStr("FORM"), toStr("*ERROR* Valid key information must be entered before proceeding.")), toBool(NBool.True), toBool(NBool.True));
					goItem(toStr("TBBSBRL_USE_RULES_IND"));
					//  (Above line functions as next_block command - used due to MAC problems)
					// 
					getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
					executeAction("DISABLE_KEYS");
					getTask().getGoqrpls().gCheckFailure();
					executeQuery();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.GLOBAL_COPY
		 CLEAR_RECORD;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void Tsasbrl_GlobalCopy()
		{
			
				clearRecord();
			}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.SAVE_KEYS
		    IF :GLOBAL.FORM_WAS_CALLED IS NULL  THEN
      EXECUTE_TRIGGER( 'SAVE_GLOBAL_KEYS' ) ;
   END IF ;

	--Banner XE Messaging Integration



DEFAULT_VALUE('N','GLOBAL.BANNER_XE_MODE');

IF :GLOBAL.BANNER_XE_MODE = 'Y' THEN

   :GLOBAL.TSASBRL_XE_CONTEXT := 'FORM_WAS_CALLEDISNULLTHEN|OBAL_KEYS';

   EXECUTE_TRIGGER('BANNER_XE_SEND_CONTEXT');

END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Tsasbrl_SaveKeys()
		{
			
				if ( getGlobal("FORM_WAS_CALLED").isNull() )
				{
					executeAction("SAVE_GLOBAL_KEYS");
				}
				// Banner XE Messaging Integration
				setDefaultValue("N", "GLOBAL.BANNER_XE_MODE");
				if ( getGlobal("BANNER_XE_MODE").equals("Y") )
				{
					setGlobal("TSASBRL_XE_CONTEXT", toStr("FORM_WAS_CALLEDISNULLTHEN|OBAL_KEYS"));
					executeAction("BANNER_XE_SEND_CONTEXT");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.SAVE_GLOBAL_KEYS
		 NULL;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.SAVE_GLOBAL_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_GLOBAL_KEYS")
		public void Tsasbrl_SaveGlobalKeys()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.WHEN-NEW-FORM-INSTANCE
		    EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'GLOBAL_COPY' ) ;
   G$_CHECK_FAILURE ;
--
   G$_SET_INST_PROPERTY;
   G$_SET_WIN_PROPERTY;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Tsasbrl_TaskStarted(EventObject args)
		{
			
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("GLOBAL_COPY");
				getTask().getGoqrpls().gCheckFailure();
				// 
				getTask().getGoqrpls().gSetInstProperty();
				getTask().getGoqrpls().gSetWinProperty();
			}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.CLOSE_WINDOWS
		 SET_WINDOW_PROPERTY('STU_WINDOW2',VISIBLE,PROPERTY_OFF);
SET_WINDOW_PROPERTY('BILL_WINDOW3',VISIBLE,PROPERTY_OFF);
SET_WINDOW_PROPERTY('SCHEDULE_WINDOW4',VISIBLE,PROPERTY_OFF);
SET_WINDOW_PROPERTY('MESSAGE_WINDOW5',VISIBLE,PROPERTY_OFF);
<multilinecomment>shalini added this as additional issue</multilinecomment>
SET_WINDOW_PROPERTY('STU_WINDOW2',HIDE_ON_EXIT,PROPERTY_TRUE);
SET_WINDOW_PROPERTY('BILL_WINDOW3',HIDE_ON_EXIT,PROPERTY_TRUE);
SET_WINDOW_PROPERTY('SCHEDULE_WINDOW4',HIDE_ON_EXIT,PROPERTY_TRUE);
SET_WINDOW_PROPERTY('MESSAGE_WINDOW5',HIDE_ON_EXIT,PROPERTY_TRUE);

SHOW_WINDOW('MAIN_WINDOW');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.CLOSE_WINDOWS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CLOSE_WINDOWS")
		public void Tsasbrl_CloseWindows()
		{
			
				// F2J_NOT_SUPPORTED : The property "WINDOW's VISIBLE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\TSASBRLF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
				//				SupportClasses.FORMS4W.SetWindowProperty("STU_WINDOW2", SupportClasses.Property.VISIBLE, false);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's VISIBLE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\TSASBRLF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
				
				// F2J_NOT_SUPPORTED : The property "WINDOW's VISIBLE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\TSASBRLF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
				//				SupportClasses.FORMS4W.SetWindowProperty("BILL_WINDOW3", SupportClasses.Property.VISIBLE, false);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's VISIBLE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\TSASBRLF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
				
				// F2J_NOT_SUPPORTED : The property "WINDOW's VISIBLE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\TSASBRLF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
				//				SupportClasses.FORMS4W.SetWindowProperty("SCHEDULE_WINDOW4", SupportClasses.Property.VISIBLE, false);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's VISIBLE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\TSASBRLF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
				
				// F2J_NOT_SUPPORTED : The property "WINDOW's VISIBLE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\TSASBRLF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
				//				SupportClasses.FORMS4W.SetWindowProperty("MESSAGE_WINDOW5", SupportClasses.Property.VISIBLE, false);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's VISIBLE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\TSASBRLF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
				
				// shalini added this as additional issue
				// F2J_NOT_SUPPORTED : The property "WINDOW's HIDE_ON_EXIT" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\TSASBRLF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
				//				SupportClasses.FORMS4W.SetWindowProperty("STU_WINDOW2", SupportClasses.Property.HIDE_ON_EXIT, true);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's HIDE_ON_EXIT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\TSASBRLF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
				
				// F2J_NOT_SUPPORTED : The property "WINDOW's HIDE_ON_EXIT" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\TSASBRLF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
				//				SupportClasses.FORMS4W.SetWindowProperty("BILL_WINDOW3", SupportClasses.Property.HIDE_ON_EXIT, true);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's HIDE_ON_EXIT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\TSASBRLF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
				
				// F2J_NOT_SUPPORTED : The property "WINDOW's HIDE_ON_EXIT" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\TSASBRLF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
				//				SupportClasses.FORMS4W.SetWindowProperty("SCHEDULE_WINDOW4", SupportClasses.Property.HIDE_ON_EXIT, true);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's HIDE_ON_EXIT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\TSASBRLF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
				
				// F2J_NOT_SUPPORTED : The property "WINDOW's HIDE_ON_EXIT" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\TSASBRLF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
				//				SupportClasses.FORMS4W.SetWindowProperty("MESSAGE_WINDOW5", SupportClasses.Property.HIDE_ON_EXIT, true);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's HIDE_ON_EXIT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\TSASBRLF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
				
				showWindow("MAIN_WINDOW");
			}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.KEY-CLRFRM
		    EXECUTE_TRIGGER( 'CLOSE_WINDOWS' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'SAVE_KEYS' ) ;
   G$_CHECK_FAILURE ;
   CLEAR_FORM ;
   G$_CHECK_FAILURE ;
   IF :SYSTEM.FORM_STATUS NOT IN ('NEW', 'QUERY') THEN
      RETURN;
   END IF;
   EXECUTE_TRIGGER( 'ENABLE_KEYS' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'GLOBAL_COPY' ) ;
   G$_CHECK_FAILURE ;
   GO_BLOCK('KEY_BLOCK');
   
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Tsasbrl_ClearTask()
		{
			
				executeAction("CLOSE_WINDOWS");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				clearTask();
				getTask().getGoqrpls().gCheckFailure();
				if ( !(getTaskStatus().equals("NEW") || getTaskStatus().equals("QUERY")) )
				{
					return ;
				}
				executeAction("ENABLE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("GLOBAL_COPY");
				getTask().getGoqrpls().gCheckFailure();
				goBlock(toStr("KEY_BLOCK"));
			}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.ENABLE_KEYS
		 IF GET_ITEM_PROPERTY('KEYBLOC_SBRC_CODE',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('KEYBLOC_SBRC_CODE',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('KEYBLOC_SBRC_CODE',NAVIGABLE,PROPERTY_ON);
END IF;
IF GET_ITEM_PROPERTY('KEYBLOC_SBRC_CODE_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('KEYBLOC_SBRC_CODE_LBT',ENABLED,PROPERTY_ON);
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Tsasbrl_EnableKeys()
		{
			
				if ( getItemEnabled("KEYBLOC_SBRC_CODE").equals("FALSE") )
				{
					setItemEnabled("KEYBLOC_SBRC_CODE", true);
					setItemNavigable("KEYBLOC_SBRC_CODE", true);
				}
				if ( getItemEnabled("KEYBLOC_SBRC_CODE_LBT").equals("FALSE") )
				{
					setItemEnabled("KEYBLOC_SBRC_CODE_LBT", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.DISABLE_KEYS
		    SET_ITEM_PROPERTY('KEYBLOC_SBRC_CODE',ENABLED,PROPERTY_OFF);
   SET_ITEM_PROPERTY('KEYBLOC_SBRC_CODE_LBT',ENABLED,PROPERTY_OFF);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Tsasbrl_DisableKeys()
		{
			
				setItemEnabled("KEYBLOC_SBRC_CODE", false);
				setItemEnabled("KEYBLOC_SBRC_CODE_LBT", false);
			}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.KEY-COMMIT
		  EXECUTE_TRIGGER('CHECK_WIDTH');
 G$_CHECK_FAILURE;
--
 EXECUTE_TRIGGER('CHECK_SEL_SUM');
 G$_CHECK_FAILURE;
--
 EXECUTE_TRIGGER('CHECK_TBRSBRL');
 G$_CHECK_FAILURE;
--
 COMMIT_FORM;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.KEY-COMMIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void Tsasbrl_Save()
		{
			
				executeAction("CHECK_WIDTH");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("CHECK_SEL_SUM");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("CHECK_TBRSBRL");
				getTask().getGoqrpls().gCheckFailure();
				// 
				commitTask();
			}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.CHECK_WIDTH
		 DECLARE
BEGIN
    IF :TBBSBRL_FORM_TYPE = 'M' THEN
       IF :SELECT_TOTAL > 76 THEN
          :GLOBAL.DUMMY_VAR := SHOW_ALERT('TOO_WIDE1');
--          MESSAGE('*ERROR* Total width of selected columns exceeds 76.' ) ;
          GO_ITEM('TBBSBRL_PTRM_CODE_IND');
          RAISE FORM_TRIGGER_FAILURE ;
       END IF;
    END IF;
--
    IF :TBBSBRL_FORM_TYPE = 'B' THEN
       IF :SELECT_TOTAL > 132 THEN
          :GLOBAL.DUMMY_VAR := SHOW_ALERT('TOO_WIDE2');
--          MESSAGE('*ERROR* Total width of selected columns exceeds 132.' ) ;
          GO_ITEM('TBBSBRL_PTRM_CODE_IND');
          RAISE FORM_TRIGGER_FAILURE ;
       ELSIF :SELECT_TOTAL > 80 THEN
          :GLOBAL.DUMMY_VAR := SHOW_ALERT('TOO_WIDE3');
--          MESSAGE('*ERROR* Total width of selected columns exceeds 80.' ) ;
          GO_ITEM('TBBSBRL_PTRM_CODE_IND');
-- not fatal   RAISE FORM_TRIGGER_FAILURE ;
       END IF;
    END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.CHECK_WIDTH
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_WIDTH")
		public void Tsasbrl_CheckWidth()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);


				{
					if ( tbbsbrlElement.getTbbsbrlFormType().equals("M") )
					{
						if ( tbbsbrlElement.getSelectTotal().greater(76) )
						{
							setGlobal("DUMMY_VAR", toStr(showAlert("TOO_WIDE1")));
							//           MESSAGE('*ERROR* Total width of selected columns exceeds 76.' ) ;
							goItem(toStr("TBBSBRL_PTRM_CODE_IND"));
							throw new ApplicationException();
						}
					}
					// 
					if ( tbbsbrlElement.getTbbsbrlFormType().equals("B") )
					{
						if ( tbbsbrlElement.getSelectTotal().greater(132) )
						{
							setGlobal("DUMMY_VAR", toStr(showAlert("TOO_WIDE2")));
							//           MESSAGE('*ERROR* Total width of selected columns exceeds 132.' ) ;
							goItem(toStr("TBBSBRL_PTRM_CODE_IND"));
							throw new ApplicationException();
						}
						else if ( tbbsbrlElement.getSelectTotal().greater(80) ) {
							setGlobal("DUMMY_VAR", toStr(showAlert("TOO_WIDE3")));
							//           MESSAGE('*ERROR* Total width of selected columns exceeds 80.' ) ;
							goItem(toStr("TBBSBRL_PTRM_CODE_IND"));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.DEL_PROMPT
		 :DEL_PENDING := 'Y' ;
--
   EXECUTE_TRIGGER( 'TRG_FAIL' ) ;
   G$_CHECK_VALUE (NOT FORM_SUCCESS,
       G$_NLS.Get('TSASBRL-0016', 'FORM','Press ''Delete Record'' again to Delete this Record.') , FALSE
      );
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.DEL_PROMPT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DEL_PROMPT")
		public void Tsasbrl_DelPrompt()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);



				// F2J_TODO : This trigger does not fire on Enter Query mode. See documentation for details.
				tbbsbrlElement.setDelPending(toStr("Y"));
				// 
				executeAction("TRG_FAIL");
				// F2J_TO_REMOVE : Call to built-in "FORM_SUCCESS" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\TSASBRLF2NMigrationGuide.xml#ExcludeErrorBuiltins".
				//				getTask().getGoqrpls().gCheckValue(SupportClasses.SQLFORMS.FormSuccess().not(), GNls.Fget(toStr("TSASBRL-0016"), toStr("FORM"), toStr("Press 'Delete Record' again to Delete this Record.")), toBool(NBool.False));
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'FORM_SUCCESS' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\TSASBRLF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
				
			}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.DEL_TBRSBRL
		 	DECLARE 
		CURSOR GET_TBRSBRL_REC IS
     SELECT 'X'
       FROM TBRSBRL
      WHERE TBRSBRL_SBRC_CODE = :KEYBLOC_SBRC_CODE;
		 
		 VAR_TEMP VARCHAR2(1);
	BEGIN		  
		OPEN GET_TBRSBRL_REC;
		FETCH GET_TBRSBRL_REC INTO VAR_TEMP;
		IF GET_TBRSBRL_REC%FOUND THEN
			 DELETE FROM TBRSBRL WHERE TBRSBRL_SBRC_CODE = :KEYBLOC_SBRC_CODE;
		END IF;
		CLOSE GET_TBRSBRL_REC;
	END;
	
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.DEL_TBRSBRL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DEL_TBRSBRL")
		public void Tsasbrl_DelTbrsbrl()
		{
			
				int rowCount = 0;

				// F2J_TODO : This trigger does not fire on Enter Query mode. See documentation for details.
				{
					String sqlgetTbrsbrlRec = "SELECT 'X' " +
	" FROM TBRSBRL " +
	" WHERE TBRSBRL_SBRC_CODE = :KEYBLOC_SBRC_CODE ";
					DataCursor getTbrsbrlRec = new DataCursor(sqlgetTbrsbrlRec);
					NString varTemp= NString.getNull();
					try {
						//Setting query parameters
						getTbrsbrlRec.addParameter("KEYBLOC_SBRC_CODE", getFormModel().getKeyBlock().getKeyblocSbrcCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable getTbrsbrlRec.
						getTbrsbrlRec.open();
						ResultSet getTbrsbrlRecResults = getTbrsbrlRec.fetchInto();
						if ( getTbrsbrlRecResults != null ) {
							varTemp = getTbrsbrlRecResults.getStr(0);
						}
						if ( getTbrsbrlRec.found() )
						{
							String sql1 = "DELETE FROM TBRSBRL " +
	" WHERE TBRSBRL_SBRC_CODE = :KEYBLOC_SBRC_CODE";
							DataCommand command1 = new DataCommand(sql1);
							//Setting query parameters
							command1.addParameter("KEYBLOC_SBRC_CODE", getFormModel().getKeyBlock().getKeyblocSbrcCode());
							rowCount = command1.execute();
						}
						getTbrsbrlRec.close();
					}
					finally{
						getTbrsbrlRec.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER TSASBRL.TRG_FAIL
		    NULL ;
   RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TSASBRL.TRG_FAIL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="TRG_FAIL")
		public void Tsasbrl_TrgFail()
		{
			

				// F2J_TODO : This trigger does not fire on Enter Query mode. See documentation for details.
				throw new ApplicationException();
			}

		
	
}
	
