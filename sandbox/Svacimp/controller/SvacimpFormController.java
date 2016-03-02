package net.hedtech.las.studemre.banner.student.Svacimp.controller;

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

import net.hedtech.las.studemre.banner.student.Svacimp.model.*;
import net.hedtech.las.studemre.banner.student.Svacimp.*;
import net.hedtech.las.studemre.banner.student.Svacimp.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass;	
		
import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;
import net.hedtech.general.common.libraries.Goqolib.model.GSdispAdapter;
import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;

public class SvacimpFormController extends DefaultFormController  {

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	private GApplFormClass getGApplFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GApplFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_APPL_FORM_CLASS");
	}	
		
	
	
	public SvacimpFormController (ITask task) {
		super(task);
	}
	
	
	@Override
	public SvacimpTask getTask() {
		return (SvacimpTask)super.getTask();
	}
	
	
	public SvacimpModel getFormModel() {
		return this.getTask().getModel();
	}	
	
		//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.G$_VERIFY_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_VERIFY_ACCESS")
		public void Svacimp_GVerifyAccess()
		{
			
			getGFormClass().gVerifyAccess();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.G$_REVOKE_ACCESS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="G$_REVOKE_ACCESS")
		public void Svacimp_GRevokeAccess()
		{
			
			getGFormClass().gRevokeAccess();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.PRE-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStartedPre
		public void Svacimp_TaskStartedPre(EventObject args)
		{
			
			getGFormClass().taskStartedPre(args);
		}

		
		/* Original PL/SQL code code for TRIGGER SVACIMP.PRE_FORM_TRG
		 BEGIN
	NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.PRE_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_FORM_TRG")
		public void Svacimp_PreFormTrg()
		{
			
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.POST-FORM
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskEnded
		public void Svacimp_TaskEnded(EventObject args)
		{
			
			getGFormClass().taskEnded(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.POST_FORM_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORM_TRG")
		public void Svacimp_PostFormTrg()
		{
			
			getGFormClass().postFormTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.PRE-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		@Before
		public void Svacimp_blockIn()
		{
			
			getGFormClass().blockIn();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.PRE_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_BLOCK_TRG")
		public void Svacimp_PreBlockTrg()
		{
			
			getGFormClass().preBlockTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.POST-BLOCK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		@Before
		public void Svacimp_blockOut()
		{
			
			getGFormClass().blockOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.POST_BLOCK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_BLOCK_TRG")
		public void Svacimp_PostBlockTrg()
		{
			
			getGFormClass().postBlockTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.PRE-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeCommit
		public void Svacimp_BeforeCommit(CancelEvent args)
		{
			
			getGFormClass().beforeCommit(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.PRE_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="PRE_COMMIT_TRG")
		public void Svacimp_PreCommitTrg()
		{
			
			getGFormClass().preCommitTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowInsert
		public void Svacimp_BeforeRowInsert(RowAdapterEvent args)
		{
			
			getGFormClass().beforeRowInsert(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@BeforeRowUpdate
		public void Svacimp_BeforeRowUpdate(RowAdapterEvent args)
		{
			
			getGFormClass().beforeRowUpdate(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/
		@OnError
		public void Svacimp_OnError(EventObject args)
		{
			
			getGFormClass().onError(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.ON-ROLLBACK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON-ROLLBACK")
		public void Svacimp_OnRollback()
		{
			
			getGFormClass().onRollback();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.ON_ROLLBACK_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ON_ROLLBACK_TRG")
		public void Svacimp_OnRollbackTrg()
		{
			
			getGFormClass().onRollbackTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.ON-SELECT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@QueryExecute
		public void Svacimp_QueryExecute(EventObject args)
		{
			
			getGFormClass().queryExecute(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.POST-FORMS-COMMIT
		 *
		 *
		 *</p>
		 * @param args
		*/
		@AfterCommit
		public void Svacimp_AfterCommit(EventObject args)
		{
			
			getGFormClass().afterCommit(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.POST_FORMS_COMMIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="POST_FORMS_COMMIT_TRG")
		public void Svacimp_PostFormsCommitTrg()
		{
			
			getGFormClass().postFormsCommitTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void Svacimp_buttonClick()
		{
			
			getGFormClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		@Before
		public void Svacimp_blockChange()
		{
			
			getGFormClass().blockChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK")
		public void Svacimp_doubleClick()
		{
			
			getGFormClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.WHEN-TIMER-EXPIRED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-TIMER-EXPIRED")
		public void Svacimp_WhenTimerExpired(NString timerName)
		{
			
			getGFormClass().whenTimerExpired(timerName);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.WHEN-WINDOW-ACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-ACTIVATED")
		public void Svacimp_WhenWindowActivated()
		{
			
			getGFormClass().whenWindowActivated();
		}

		
		/* Original PL/SQL code code for TRIGGER SVACIMP.WHEN_WINDOW_ACTIVATED_TRG
		 --
IF :GLOBAL.VALUE = 'KEY-CLRFRM' THEN
   RETURN;
END IF;
--
G$_SET_WIN_PROPERTY;
if :system.event_window = 'MAIN_WINDOW' THEN
IF :HOLD_BLOCK_FIELD IS NULL THEN
    G$_DETERMINE_CURSOR_LOCATION('SVBCIMP.SVBCIMP_EXTERNAL_TABLENAME');
    RETURN;
else
   GO_ITEM(:HOLD_BLOCK_FIELD);
RETURN;
END IF;
end if;


IF :SYSTEM.EVENT_WINDOW = 'HISTORY_WINDOW' THEN
G$_DETERMINE_CURSOR_LOCATION('SVRCIMH.SVRCIMH_FILENAME'); 
          RETURN;
END IF;

IF :SYSTEM.EVENT_WINDOW IS NULL OR
   :SYSTEM.EVENT_WINDOW <> 'G$_OPT_WINDOW' THEN
    G$_SET_INST_PROPERTY;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.WHEN_WINDOW_ACTIVATED_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_WINDOW_ACTIVATED_TRG")
		public void Svacimp_WhenWindowActivatedTrg()
		{
			
				// 
				// 
				if ( getGlobal("VALUE").equals("KEY-CLRFRM") )
				{
					return ;
				}
				// 
				getTask().getGoqrpls().gSetWinProperty();
				if ( getCurrentWindow().equals("MAIN_WINDOW") )
				{
					if ( getFormModel().getFormHeader().getHoldBlockField().isNull() )
					{
						getTask().getGoqrpls().gDetermineCursorLocation(toStr("SVBCIMP.SVBCIMP_EXTERNAL_TABLENAME"));
						return ;
					}
					else {
						goItem(getFormModel().getFormHeader().getHoldBlockField());
						return ;
					}
				}
				if ( getCurrentWindow().equals("HISTORY_WINDOW") )
				{
					getTask().getGoqrpls().gDetermineCursorLocation(toStr("SVRCIMH.SVRCIMH_FILENAME"));
					return ;
				}
				if ( getCurrentWindow().isNull() || getCurrentWindow().notEquals("G$_OPT_WINDOW") )
				{
					getTask().getGoqrpls().gSetInstProperty();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.WHEN-WINDOW-CLOSED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-CLOSED")
		public void Svacimp_WhenWindowClosed()
		{
			
			getGFormClass().whenWindowClosed();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.KEY-HELP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-HELP", function=KeyFunction.HELP)
		public void Svacimp_Help()
		{
			
			getGFormClass().help();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.KEY-F0
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void Svacimp_F0()
		{
			
			getGFormClass().f0();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.KEY-F2
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-F2", function=KeyFunction.KEY_F2)
		public void Svacimp_F2()
		{
			
			getGFormClass().f2();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.KEY-DOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.DOWN)
		public void Svacimp_MoveDown()
		{
			
			getGFormClass().moveDown();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.KEY-UP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-UP", function=KeyFunction.UP)
		public void Svacimp_MoveUp()
		{
			
			getGFormClass().moveUp();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void Svacimp_ListValues()
		{
			
			getGFormClass().listValues();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.KEY-MENU
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-MENU")
		public void Svacimp_KeyMenu()
		{
			
			getGFormClass().keyMenu();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void Svacimp_NextBlock()
		{
			
			getGFormClass().nextBlock();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void Svacimp_PreviousBlock()
		{
			
			getGFormClass().previousBlock();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.KEY-NXTREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void Svacimp_NextRecord()
		{
			
			getGFormClass().nextRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.KEY-PRVREC
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void Svacimp_PreviousRecord()
		{
			
			getGFormClass().previousRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.KEY-NXTSET
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTSET")
		public void Svacimp_KeyNxtset()
		{
			
			getGFormClass().keyNxtset();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.KEY-SCRUP
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRUP")
		public void Svacimp_KeyScrup()
		{
			
			getGFormClass().keyScrup();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-SCRDOWN")
		public void Svacimp_KeyScrdown()
		{
			
			getGFormClass().keyScrdown();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.KEY-PRINT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-PRINT")
		public void Svacimp_KeyPrint()
		{
			
			getGFormClass().keyPrint();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void Svacimp_Search()
		{
			
			getGFormClass().search();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void Svacimp_ExecuteQuery()
		{
			
			getGFormClass().executeQuery();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.KEY_EXIT_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_EXIT_TRG")
		public void Svacimp_KeyExitTrg()
		{
			
			getGFormClass().keyExitTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-NXTKEY")
		public void Svacimp_KeyNxtkey()
		{
			
			getGFormClass().keyNxtkey();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.KEY_NXTKEY_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY_NXTKEY_TRG")
		public void Svacimp_KeyNxtkeyTrg()
		{
			
			getGFormClass().keyNxtkeyTrg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_COPY")
		public void Svacimp_ListValuesCopy()
		{
			
			getGFormClass().listValuesCopy();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.INVALID_OPTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_OPTION_MSG")
		public void Svacimp_InvalidOptionMsg()
		{
			
			getGFormClass().invalidOptionMsg();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.UPDATE_ACTIVITY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="UPDATE_ACTIVITY")
		public void Svacimp_UpdateActivity()
		{
			
			getGFormClass().updateActivity();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		@Before
		public void Svacimp_recordChange()
		{
			
			getGApplFormClass().recordChange();
		}

		
		/* Original PL/SQL code code for TRIGGER SVACIMP.CHECK_KEYS
		 if :KEY_BLOCK.PROCESS_CODE is null then
   message( G$_NLS.Get('SVACIMP-0000', 'FORM','*ERROR* Process Code must be entered') );
   Raise Form_Trigger_Failure;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.CHECK_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CHECK_KEYS")
		public void Svacimp_CheckKeys()
		{
			
				if ( getFormModel().getKeyBlock().getProcessCode().isNull() )
				{
					errorMessage(GNls.Fget(toStr("SVACIMP-0000"), toStr("FORM"), toStr("*ERROR* Process Code must be entered")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SVACIMP.WHEN_NEW_BLOCK_INSTANCE_TRG
		 BEGIN
IF :CHECK_KEYS = 'Y' THEN
   :CHECK_KEYS := 'N';
   GO_BLOCK('KEY_BLOCK');
   EXECUTE_TRIGGER('CHECK_KEYS');
   G$_CHECK_FAILURE;
   NEXT_BLOCK;
   EXECUTE_QUERY;
--
   :CHECK_KEYS := 'N';
   EXECUTE_TRIGGER('DISABLE_KEYS');
   G$_CHECK_FAILURE;
END IF; 
END; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.WHEN_NEW_BLOCK_INSTANCE_TRG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN_NEW_BLOCK_INSTANCE_TRG")
		public void Svacimp_WhenNewBlockInstanceTrg()
		{
			
				if ( getFormModel().getButtonControlBlock().getCheckKeys().equals("Y") )
				{
					getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
					goBlock(toStr("KEY_BLOCK"));
					executeAction("CHECK_KEYS");
					getTask().getGoqrpls().gCheckFailure();
					nextBlock();
					executeQuery();
					// 
					getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
					executeAction("DISABLE_KEYS");
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SVACIMP.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.0';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Svacimp_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER SVACIMP.SAVE_KEYS
		 :global.PROCESS_CODE := :PROCESS_CODE;






	--Banner XE Messaging Integration



DEFAULT_VALUE('N','GLOBAL.BANNER_XE_MODE');

IF :GLOBAL.BANNER_XE_MODE = 'Y' THEN

   :GLOBAL.SVACIMP_XE_CONTEXT := 'PROCESS_CODE';

   EXECUTE_TRIGGER('BANNER_XE_SEND_CONTEXT');

END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.SAVE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="SAVE_KEYS")
		public void Svacimp_SaveKeys()
		{
			
				setGlobal("PROCESS_CODE", getFormModel().getKeyBlock().getProcessCode());
				// Banner XE Messaging Integration
				setDefaultValue("N", "GLOBAL.BANNER_XE_MODE");
				if ( getGlobal("BANNER_XE_MODE").equals("Y") )
				{
					setGlobal("SVACIMP_XE_CONTEXT", toStr("PROCESS_CODE"));
					executeAction("BANNER_XE_SEND_CONTEXT");
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SVACIMP.LOAD_FORM_HEADER
		 :CURRENT_FORM := :SYSTEM.CURRENT_FORM;
--
:CURRENT_USER := USER;
:CURRENT_DATE := TO_CHAR(SYSDATE,G$_DATE.GET_NLS_DATE_FORMAT);
:CURRENT_TIME := TO_CHAR(SYSDATE,'HH24:MI:SS');
--
:CURRENT_INSTITUTION := :GLOBAL.INSTITUTION;
EXECUTE_TRIGGER('LOAD_CURRENT_RELEASE');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.LOAD_FORM_HEADER
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_FORM_HEADER")
		public void Svacimp_LoadFormHeader()
		{
			
				getFormModel().getFormHeader().setCurrentForm(toStr(getCurrentTaskName()));
				// 
				getFormModel().getFormHeader().setCurrentUser(getUser());
				getFormModel().getFormHeader().setCurrentDate(toChar(DbManager.getDBDateTime(), GDate.getNlsDateFormat()));
				getFormModel().getFormHeader().setCurrentTime(toChar(DbManager.getDBDateTime(), "HH24:MI:SS"));
				// 
				getFormModel().getFormHeader().setCurrentInstitution(getGlobal("INSTITUTION"));
				executeAction("LOAD_CURRENT_RELEASE");
			}

		
		/* Original PL/SQL code code for TRIGGER SVACIMP.LIST_VALUES_CALL
		 :CALLFLD := :SYSTEM.CURRENT_FIELD;
:CALLFLD := SUBSTR(:CALLFLD, 9, 4);
:CALLFLD := LPAD(:CALLFLD, 6, 'TV');
:CALLFLD := LPAD(:CALLFLD, 7, SUBSTR(:CURRENT_FORM, 1, 1));
--
G$_COPY_FLD_ATTR;
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,:CALLFLD,'QUERY');
G$_RESET_GLOBAL;
G$_CHECK_FAILURE;
--
IF :GLOBAL.VALUE IS NOT NULL THEN
   EXECUTE_TRIGGER('LIST_VALUES_COPY');
   G$_CHECK_FAILURE;
   NEXT_FIELD;
   G$_CHECK_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.LIST_VALUES_CALL
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LIST_VALUES_CALL")
		public void Svacimp_ListValuesCall()
		{
			
				getFormModel().getFormHeader().setCallfld(toStr(getCurrentField()));
				getFormModel().getFormHeader().setCallfld(substring(getFormModel().getFormHeader().getCallfld(), toInt(9), toInt(4)));
				getFormModel().getFormHeader().setCallfld(lpad(getFormModel().getFormHeader().getCallfld(), 6, "TV"));
				getFormModel().getFormHeader().setCallfld(lpad(getFormModel().getFormHeader().getCallfld(), 7, substring(getFormModel().getFormHeader().getCurrentForm(), toInt(1), toInt(1))));
				// 
				getTask().getGoqrpls().gCopyFldAttr();
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), getFormModel().getFormHeader().getCallfld(), toStr("QUERY"));
				getTask().getGoqrpls().gResetGlobal();
				getTask().getGoqrpls().gCheckFailure();
				// 
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getTask().getGoqrpls().gCheckFailure();
					nextItem();
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SVACIMP.INVALID_FUNCTION_MSG
		 MESSAGE(  G$_NLS.Get('SVACIMP-0001', 'FORM','*ERROR* Invalid function; press SHOW KEYS key for valid functions.')  
       ) ;
RAISE FORM_TRIGGER_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.INVALID_FUNCTION_MSG
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="INVALID_FUNCTION_MSG")
		public void Svacimp_InvalidFunctionMsg()
		{
			
				errorMessage(GNls.Fget(toStr("SVACIMP-0001"), toStr("FORM"), toStr("*ERROR* Invalid function; press SHOW KEYS key for valid functions.")));
				throw new ApplicationException();
			}

		
		/* Original PL/SQL code code for TRIGGER SVACIMP.GLOBAL_COPY
		 if  :global.PROCESS_CODE is not null then 
    :KEY_BLOCK.PROCESS_CODE := :global.PROCESS_CODE;
    IF  :KEY_BLOCK.PROCESS_CODE IS NOT NULL THEN
        next_item;
        previous_item;
    END IF;
end if;
 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.GLOBAL_COPY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="GLOBAL_COPY")
		public void Svacimp_GlobalCopy()
		{
			
				if ( !getGlobal("PROCESS_CODE").isNull() )
				{
					getFormModel().getKeyBlock().setProcessCode(getGlobal("PROCESS_CODE"));
					if ( !getFormModel().getKeyBlock().getProcessCode().isNull() )
					{
						nextItem();
						previousItem();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SVACIMP.ENABLE_KEYS
		 IF GET_ITEM_PROPERTY('KEY_BLOCK.PROCESS_CODE',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('KEY_BLOCK.PROCESS_CODE',ENABLED,PROPERTY_ON);
   SET_ITEM_PROPERTY('KEY_BLOCK.PROCESS_CODE',NAVIGABLE,PROPERTY_ON);
END IF;

IF GET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.PROCESS_CODE_LBT',ENABLED) = 'FALSE' THEN
   SET_ITEM_PROPERTY('BUTTON_CONTROL_BLOCK.PROCESS_CODE_LBT',ENABLED,PROPERTY_ON);
END IF;





		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_KEYS")
		public void Svacimp_EnableKeys()
		{
			
				if ( getItemEnabled("KEY_BLOCK.PROCESS_CODE").equals("FALSE") )
				{
					setItemEnabled("KEY_BLOCK.PROCESS_CODE", true);
					setItemNavigable("KEY_BLOCK.PROCESS_CODE", true);
				}
				if ( getItemEnabled("BUTTON_CONTROL_BLOCK.PROCESS_CODE_LBT").equals("FALSE") )
				{
					setItemEnabled("BUTTON_CONTROL_BLOCK.PROCESS_CODE_LBT", true);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SVACIMP.DISABLE_KEYS
		 SET_ITEM_PROPERTY('PROCESS_CODE',ENABLED,PROPERTY_OFF);
SET_ITEM_PROPERTY('PROCESS_CODE_LBT',ENABLED,PROPERTY_OFF);

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_KEYS")
		public void Svacimp_DisableKeys()
		{
			
				setItemEnabled("PROCESS_CODE", false);
				setItemEnabled("PROCESS_CODE_LBT", false);
			}

		
		/* Original PL/SQL code code for TRIGGER SVACIMP.WHEN-NEW-FORM-INSTANCE
		 default_value('','GLOBAL.PROCESS_CODE');
G$_SET_WIN_PROPERTY;
EXECUTE_TRIGGER('LOAD_FORM_HEADER');
G$_CHECK_FAILURE;
EXECUTE_TRIGGER('GLOBAL_COPY');
G$_CHECK_FAILURE;
G$_SET_INST_PROPERTY;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.WHEN-NEW-FORM-INSTANCE
		 *
		 *
		 *</p>
		 * @param args
		*/
		@TaskStarted
		public void Svacimp_TaskStarted(EventObject args)
		{
			
				setDefaultValue("", "GLOBAL.PROCESS_CODE");
				getTask().getGoqrpls().gSetWinProperty();
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("GLOBAL_COPY");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSetInstProperty();
			}

		
		/* Original PL/SQL code code for TRIGGER SVACIMP.KEY-EXIT
		 :GLOBAL.VALUE := '' ;
--
 G$_GOQOLIB_KEY_TRIGGER.B2K_EXIT_FORM ;
 G$_CHECK_FAILURE ;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.KEY-EXIT
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void Svacimp_Exit()
		{
			
				setGlobal("VALUE", toStr(""));
				// 
				getTask().getGoqrpls().getGGoqolibKeyTrigger().b2kExitForm();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SVACIMP.KEY-CLRFRM
		 BEGIN
   EXECUTE_TRIGGER( 'SAVE_KEYS' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER('ENABLE_KEYS');
   G$_CHECK_FAILURE;
   CLEAR_FORM;
   IF :SYSTEM.FORM_STATUS <> 'NEW' AND
      :SYSTEM.CURRENT_BLOCK <> 'KEY_BLOCK' THEN
      EXECUTE_TRIGGER('DISABLE_KEYS');
   END IF;
   EXECUTE_TRIGGER( 'LOAD_FORM_HEADER' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'GLOBAL_COPY' ) ;
   G$_CHECK_FAILURE ;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void Svacimp_ClearTask()
		{
			
				executeAction("SAVE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("ENABLE_KEYS");
				getTask().getGoqrpls().gCheckFailure();
				clearTask();
				if ( !getTaskStatus().equals("NEW") && getCurrentBlock().notEquals("KEY_BLOCK") )
				{
					executeAction("DISABLE_KEYS");
				}
				executeAction("LOAD_FORM_HEADER");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("GLOBAL_COPY");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SVACIMP.DISABLE_DEFAULTS_FIELDS
		 SET_ITEM_PROPERTY('SVBCIMP_EXTERNAL_TABLENAME',UPDATEABLE,PROPERTY_FALSE);
SET_ITEM_PROPERTY('SVBCIMP_FILE_LENGTH',UPDATEABLE,PROPERTY_FALSE);
SET_ITEM_PROPERTY('SVBCIMP_RECORD_DELIMITER',UPDATEABLE,PROPERTY_FALSE);
SET_ITEM_PROPERTY('SVBCIMP_FIELDS',UPDATEABLE,PROPERTY_FALSE);
SET_ITEM_PROPERTY('SVBCIMP_FIELD_DELIMITER',UPDATEABLE,PROPERTY_FALSE);
SET_ITEM_PROPERTY('SVBCIMP_INCL_FILE_NAME_IND',UPDATEABLE,PROPERTY_FALSE);
SET_ITEM_PROPERTY('SVBCIMP_LOAD_WHEN',UPDATEABLE,PROPERTY_FALSE);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.DISABLE_DEFAULTS_FIELDS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="DISABLE_DEFAULTS_FIELDS")
		public void Svacimp_DisableDefaultsFields()
		{
			
				setItemUpdateAllowed("SVBCIMP_EXTERNAL_TABLENAME", false);
				setItemUpdateAllowed("SVBCIMP_FILE_LENGTH", false);
				setItemUpdateAllowed("SVBCIMP_RECORD_DELIMITER", false);
				setItemUpdateAllowed("SVBCIMP_FIELDS", false);
				setItemUpdateAllowed("SVBCIMP_FIELD_DELIMITER", false);
				setItemUpdateAllowed("SVBCIMP_INCL_FILE_NAME_IND", false);
				setItemUpdateAllowed("SVBCIMP_LOAD_WHEN", false);
			}

		
		/* Original PL/SQL code code for TRIGGER SVACIMP.ENABLE_DEFAULTS_FIELDS
		 SET_ITEM_PROPERTY('SVBCIMP_EXTERNAL_TABLENAME',UPDATEABLE,PROPERTY_TRUE);
SET_ITEM_PROPERTY('SVBCIMP_FILE_LENGTH',UPDATEABLE,PROPERTY_TRUE);
SET_ITEM_PROPERTY('SVBCIMP_RECORD_DELIMITER',UPDATEABLE,PROPERTY_TRUE);
SET_ITEM_PROPERTY('SVBCIMP_FIELDS',UPDATEABLE,PROPERTY_TRUE);
SET_ITEM_PROPERTY('SVBCIMP_FIELD_DELIMITER',UPDATEABLE,PROPERTY_TRUE);
SET_ITEM_PROPERTY('SVBCIMP_INCL_FILE_NAME_IND',UPDATEABLE,PROPERTY_TRUE);
SET_ITEM_PROPERTY('SVBCIMP_LOAD_WHEN',UPDATEABLE,PROPERTY_TRUE);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.ENABLE_DEFAULTS_FIELDS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="ENABLE_DEFAULTS_FIELDS")
		public void Svacimp_EnableDefaultsFields()
		{
			
				setItemUpdateAllowed("SVBCIMP_EXTERNAL_TABLENAME", true);
				setItemUpdateAllowed("SVBCIMP_FILE_LENGTH", true);
				setItemUpdateAllowed("SVBCIMP_RECORD_DELIMITER", true);
				setItemUpdateAllowed("SVBCIMP_FIELDS", true);
				setItemUpdateAllowed("SVBCIMP_FIELD_DELIMITER", true);
				setItemUpdateAllowed("SVBCIMP_INCL_FILE_NAME_IND", true);
				setItemUpdateAllowed("SVBCIMP_LOAD_WHEN", true);
			}

		
		/* Original PL/SQL code code for TRIGGER SVACIMP.WHEN-WINDOW-DEACTIVATED
		 IF :SYSTEM.EVENT_WINDOW = 'HISTORY_WINDOW'  THEN
   :HOLD_BLOCK_FIELD := 'SVBCIMP.SVBCIMP_EXTERNAL_TABLENAME';
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.WHEN-WINDOW-DEACTIVATED
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="WHEN-WINDOW-DEACTIVATED")
		public void Svacimp_WhenWindowDeactivated()
		{
			
				if ( getCurrentWindow().equals("HISTORY_WINDOW") )
				{
					getFormModel().getFormHeader().setHoldBlockField(toStr("SVBCIMP.SVBCIMP_EXTERNAL_TABLENAME"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SVACIMP.VIEW_HISTORY
		  IF :SYSTEM.BLOCK_STATUS = 'CHANGED' THEN
  	MESSAGE( G$_NLS.Get('SVACIMP-0002', 'FORM','*ERROR* Must save your changes in order to view the history records.'));
    RAISE FORM_TRIGGER_FAILURE ;
   END IF;

SET_WINDOW_PROPERTY('HISTORY_WINDOW',VISIBLE,PROPERTY_TRUE);
go_block('SVRCIMH');
EXECUTE_QUERY;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.VIEW_HISTORY
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="VIEW_HISTORY")
		public void Svacimp_ViewHistory()
		{
			
				if ( getBlockStatus().equals("CHANGED") )
				{
					errorMessage(GNls.Fget(toStr("SVACIMP-0002"), toStr("FORM"), toStr("*ERROR* Must save your changes in order to view the history records.")));
					throw new ApplicationException();
				}
				// F2J_NOT_SUPPORTED : The property "WINDOW's VISIBLE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\SVACIMPF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
				//				SupportClasses.FORMS4W.SetWindowProperty("HISTORY_WINDOW", SupportClasses.Property.VISIBLE, true);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's VISIBLE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\SVACIMPF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
				
				goBlock(toStr("SVRCIMH"));
				executeQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER SVACIMP.CALL_FORM
		 DECLARE
	lv_current_item varchar2(60) := :system.cursor_item;
BEGIN
:global.PROCESS_CODE := :PROCESS_CODE; 

    EXECUTE_TRIGGER('CHECK_KEYS');
  G$_CHECK_FAILURE ;
--
  EXECUTE_TRIGGER('SAVE_KEYS');
  G$_CHECK_FAILURE ;
--
  
  :GLOBAL.SECRFRM := NAME_IN('GLOBAL.GUROPTM_NAME1');
  
  --:GLOBAL.SECRFRM := :GLOBAL.GUROPTM_NAME1 ;
  EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
  G$_CHECK_FAILURE;
  G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,:GLOBAL.SECRFRM,'');
--
  GO_ITEM(lv_current_item);
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVACIMP.CALL_FORM
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="CALL_FORM")
		public void Svacimp_CallForm()
		{
			
				{
					NString lvCurrentItem = getCursorItem();
					setGlobal("PROCESS_CODE", getFormModel().getKeyBlock().getProcessCode());
					executeAction("CHECK_KEYS");
					getTask().getGoqrpls().gCheckFailure();
					// 
					executeAction("SAVE_KEYS");
					getTask().getGoqrpls().gCheckFailure();
					// 
					setGlobal("SECRFRM", getNameIn("GLOBAL.GUROPTM_NAME1"));
					// :GLOBAL.SECRFRM := :GLOBAL.GUROPTM_NAME1 ;
					executeAction("G$_REVOKE_ACCESS");
					getTask().getGoqrpls().gCheckFailure();
					getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), getGlobal("SECRFRM"), toStr(""));
					// 
					goItem(lvCurrentItem);
				}
			}

		
	
}
	
