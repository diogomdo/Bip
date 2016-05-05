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

import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GNonIconBtnClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GCalendarBtnClass;	
    
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;
import net.hedtech.general.common.libraries.Goqolib.model.GSdispAdapter;
import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;
		
public class ButtonControlBlockController extends DefaultBlockController {

	private GIconBtnClass getGIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}	
	private GNonIconBtnClass getGNonIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GNonIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_NON_ICON_BTN_CLASS");
	}	
	private GCalendarBtnClass getGCalendarBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCalendarBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CALENDAR_BTN_CLASS");
	}	

	
	public ButtonControlBlockController(IFormController parentController, String name) 
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
	
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEYBLOC_SBRC_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="KEYBLOC_SBRC_CODE_LBT")
		@Before
		public void keyblocSbrcCodeLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_1_PERS_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBBSBRL_1_PERS_BTN")
		@Before
		public void tbbsbrl1PersBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_1_PERS_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('GO_PAGE2');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_1_PERS_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="TBBSBRL_1_PERS_BTN")
		public void tbbsbrl1PersBtn_buttonClick()
		{
			
				executeAction("GO_PAGE2");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_1_PARM_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBBSBRL_1_PARM_BTN")
		@Before
		public void tbbsbrl1ParmBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_1_PARM_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('GO_PAGE3');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_1_PARM_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="TBBSBRL_1_PARM_BTN")
		public void tbbsbrl1ParmBtn_buttonClick()
		{
			
				executeAction("GO_PAGE3");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_1_COLS_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBBSBRL_1_COLS_BTN")
		@Before
		public void tbbsbrl1ColsBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_1_COLS_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('GO_PAGE4');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_1_COLS_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="TBBSBRL_1_COLS_BTN")
		public void tbbsbrl1ColsBtn_buttonClick()
		{
			
				executeAction("GO_PAGE4");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_1_MSGS_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBBSBRL_1_MSGS_BTN")
		@Before
		public void tbbsbrl1MsgsBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_1_MSGS_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('GO_PAGE5');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_1_MSGS_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="TBBSBRL_1_MSGS_BTN")
		public void tbbsbrl1MsgsBtn_buttonClick()
		{
			
				executeAction("GO_PAGE5");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_1_ROLLBACK_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBBSBRL_1_ROLLBACK_BTN")
		@Before
		public void tbbsbrl1RollbackBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_1_EXIT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBBSBRL_1_EXIT_BTN")
		@Before
		public void tbbsbrl1ExitBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_2_PARM_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBBSBRL_2_PARM_BTN")
		@Before
		public void tbbsbrl2ParmBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_2_PARM_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('GO_PAGE3');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_2_PARM_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="TBBSBRL_2_PARM_BTN")
		public void tbbsbrl2ParmBtn_buttonClick()
		{
			
				executeAction("GO_PAGE3");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_2_COLS_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBBSBRL_2_COLS_BTN")
		@Before
		public void tbbsbrl2ColsBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_2_COLS_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('GO_PAGE4');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_2_COLS_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="TBBSBRL_2_COLS_BTN")
		public void tbbsbrl2ColsBtn_buttonClick()
		{
			
				executeAction("GO_PAGE4");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_2_MSGS_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBBSBRL_2_MSGS_BTN")
		@Before
		public void tbbsbrl2MsgsBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_2_MSGS_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('GO_PAGE5');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_2_MSGS_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="TBBSBRL_2_MSGS_BTN")
		public void tbbsbrl2MsgsBtn_buttonClick()
		{
			
				executeAction("GO_PAGE5");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_2_ROLLBACK_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBBSBRL_2_ROLLBACK_BTN")
		@Before
		public void tbbsbrl2RollbackBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_2_SAVE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBBSBRL_2_SAVE_BTN")
		@Before
		public void tbbsbrl2SaveBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_2_EXIT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBBSBRL_2_EXIT_BTN")
		@Before
		public void tbbsbrl2ExitBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_3_PERS_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBBSBRL_3_PERS_BTN")
		@Before
		public void tbbsbrl3PersBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_3_PERS_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('GO_PAGE2');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_3_PERS_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="TBBSBRL_3_PERS_BTN")
		public void tbbsbrl3PersBtn_buttonClick()
		{
			
				executeAction("GO_PAGE2");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_3_COLS_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBBSBRL_3_COLS_BTN")
		@Before
		public void tbbsbrl3ColsBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_3_COLS_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('GO_PAGE4');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_3_COLS_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="TBBSBRL_3_COLS_BTN")
		public void tbbsbrl3ColsBtn_buttonClick()
		{
			
				executeAction("GO_PAGE4");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_3_MSGS_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBBSBRL_3_MSGS_BTN")
		@Before
		public void tbbsbrl3MsgsBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_3_MSGS_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('GO_PAGE5');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_3_MSGS_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="TBBSBRL_3_MSGS_BTN")
		public void tbbsbrl3MsgsBtn_buttonClick()
		{
			
				executeAction("GO_PAGE5");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_3_ROLLBACK_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBBSBRL_3_ROLLBACK_BTN")
		@Before
		public void tbbsbrl3RollbackBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_3_SAVE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBBSBRL_3_SAVE_BTN")
		@Before
		public void tbbsbrl3SaveBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_3_EXIT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBBSBRL_3_EXIT_BTN")
		@Before
		public void tbbsbrl3ExitBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_4_PERS_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBBSBRL_4_PERS_BTN")
		@Before
		public void tbbsbrl4PersBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_4_PERS_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('GO_PAGE2');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_4_PERS_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="TBBSBRL_4_PERS_BTN")
		public void tbbsbrl4PersBtn_buttonClick()
		{
			
				executeAction("GO_PAGE2");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_4_PARM_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBBSBRL_4_PARM_BTN")
		@Before
		public void tbbsbrl4ParmBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_4_PARM_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('GO_PAGE3');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_4_PARM_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="TBBSBRL_4_PARM_BTN")
		public void tbbsbrl4ParmBtn_buttonClick()
		{
			
				executeAction("GO_PAGE3");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_4_MSGS_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBBSBRL_4_MSGS_BTN")
		@Before
		public void tbbsbrl4MsgsBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_4_MSGS_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('GO_PAGE5');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_4_MSGS_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="TBBSBRL_4_MSGS_BTN")
		public void tbbsbrl4MsgsBtn_buttonClick()
		{
			
				executeAction("GO_PAGE5");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_4_ROLLBACK_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBBSBRL_4_ROLLBACK_BTN")
		@Before
		public void tbbsbrl4RollbackBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_4_SAVE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBBSBRL_4_SAVE_BTN")
		@Before
		public void tbbsbrl4SaveBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_4_EXIT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBBSBRL_4_EXIT_BTN")
		@Before
		public void tbbsbrl4ExitBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_5_PERS_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBBSBRL_5_PERS_BTN")
		@Before
		public void tbbsbrl5PersBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_5_PERS_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('GO_PAGE2');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_5_PERS_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="TBBSBRL_5_PERS_BTN")
		public void tbbsbrl5PersBtn_buttonClick()
		{
			
				executeAction("GO_PAGE2");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_5_PARM_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBBSBRL_5_PARM_BTN")
		@Before
		public void tbbsbrl5ParmBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_5_PARM_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('GO_PAGE3');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_5_PARM_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="TBBSBRL_5_PARM_BTN")
		public void tbbsbrl5ParmBtn_buttonClick()
		{
			
				executeAction("GO_PAGE3");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_5_COLS_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBBSBRL_5_COLS_BTN")
		@Before
		public void tbbsbrl5ColsBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_5_COLS_BTN.WHEN-BUTTON-PRESSED
		 EXECUTE_TRIGGER('GO_PAGE4');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_5_COLS_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="TBBSBRL_5_COLS_BTN")
		public void tbbsbrl5ColsBtn_buttonClick()
		{
			
				executeAction("GO_PAGE4");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_5_ROLLBACK_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBBSBRL_5_ROLLBACK_BTN")
		@Before
		public void tbbsbrl5RollbackBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_5_SAVE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBBSBRL_5_SAVE_BTN")
		@Before
		public void tbbsbrl5SaveBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_CURR_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBBSBRL_CURR_CODE_LBT")
		@Before
		public void tbbsbrlCurrCodeLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBRL_VALUE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBRSBRL_VALUE_LBT")
		@Before
		public void tbrsbrlValueLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_5_EXIT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBBSBRL_5_EXIT_BTN")
		@Before
		public void tbbsbrl5ExitBtn_click()
		{
			
			getGNonIconBtnClass().click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_CURRENT_DUE_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBBSBRL_CURRENT_DUE_DATE_DBT")
		@Before
		public void tbbsbrlCurrentDueDateDbt_click()
		{
			
			getGCalendarBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER TBBSBRL_CURRENT_DUE_DATE_DBT.WHEN-BUTTON-PRESSED
		 DECLARE
  ITEM_ID           ITEM;
  AL_BUT            NUMBER;
  CUR_ITEM          VARCHAR2(100) := NAME_IN('SYSTEM.TRIGGER_ITEM');
  CURRENT_BLOCK_FLD VARCHAR2(61);
BEGIN
  ITEM_ID := FIND_ITEM(NAME_IN('SYSTEM.CURSOR_BLOCK') ||
               SUBSTR(CUR_ITEM,INSTR(CUR_ITEM,'.'),
                 INSTR(CUR_ITEM,'_DBT') - 1 - INSTR(CUR_ITEM,'.') + 1));
  IF ID_NULL(ITEM_ID) THEN
    MESSAGE(G$_NLS.Get('TSASBRL-0039','FORM','*ERROR* Date button is outside the current block.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
  CURRENT_BLOCK_FLD := NAME_IN('SYSTEM.CURSOR_BLOCK')||
                         SUBSTR(CUR_ITEM,INSTR(CUR_ITEM,'.'),
                           INSTR(CUR_ITEM,'_DBT') - 1 - INSTR(CUR_ITEM,'.') + 1);
--
-- If calculate item is not visible, exit.
--
  IF GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,ENABLED) = 'FALSE' THEN
    RETURN;
  END IF;
--
-- Check if item is protected or not.  If not, launch the form.
--
  IF GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,UPDATEABLE) = 'TRUE' OR
     (GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,UPDATE_NULL) = 'TRUE' AND
      NAME_IN('SYSTEM.CURSOR_VALUE') IS NULL) OR
     (NAME_IN('SYSTEM.MODE') <> 'NORMAL' AND
      GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,QUERYABLE) = 'TRUE') OR
     (NAME_IN('SYSTEM.RECORD_STATUS') = 'NEW' AND
      GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,INSERT_ALLOWED) = 'TRUE') OR
     (NAME_IN('SYSTEM.RECORD_STATUS') = 'INSERT' AND
      GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,INSERT_ALLOWED) = 'TRUE') THEN
--
-- Not protected, so call the form.
-- 
    GO_ITEM(CURRENT_BLOCK_FLD);
    G$_CHECK_FAILURE; 
    COPY(NAME_IN('SYSTEM.CURSOR_VALUE'),'GLOBAL.VALUE');
    EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
    G$_CHECK_FAILURE;
    G$_SECURED_FORM_CALL(USER,'GUACALN','QUERY_NOHIDE');
--
    IF NAME_IN('GLOBAL.VALUE') IS NOT NULL THEN
      COPY(NAME_IN('GLOBAL.VALUE'),CURRENT_BLOCK_FLD);
      COPY('','GLOBAL.VALUE');
      DO_KEY('NEXT_ITEM');
    END IF;  
--
-- Protected, don't launch form.
--
  ELSE
    MESSAGE(G$_NLS.Get('TSASBRL-0040','FORM','*ERROR* Item is protected against update.'));              
    NULL;
  END IF;  
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBBSBRL_CURRENT_DUE_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="TBBSBRL_CURRENT_DUE_DATE_DBT")
		public void tbbsbrlCurrentDueDateDbt_buttonClick()
		{
			
				{
					ItemDescriptor itemId= null;
					NNumber alBut= NNumber.getNull();
					NString curItem = getTriggerItem();
					NString currentBlockFld= NString.getNull();
					itemId = findItem(getCursorBlock().append(substring(curItem, inStr(curItem, toStr(".")), inStr(curItem, toStr("_DBT")).subtract(1).subtract(inStr(curItem, toStr("."))).add(1))));
					if ( (itemId == null) )
					{
						errorMessage(GNls.Fget(toStr("TSASBRL-0039"), toStr("FORM"), toStr("*ERROR* Date button is outside the current block.")));
						throw new ApplicationException();
					}
					currentBlockFld = getCursorBlock().append(substring(curItem, inStr(curItem, toStr(".")), inStr(curItem, toStr("_DBT")).subtract(1).subtract(inStr(curItem, toStr("."))).add(1)));
					// 
					//  If calculate item is not visible, exit.
					// 
					if ( getItemEnabled(currentBlockFld).equals("FALSE") )
					{
						return ;
					}
					// 
					//  Check if item is protected or not.  If not, launch the form.
					// 
					// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
					if ( getItemUpdateAllowed(currentBlockFld).equals("TRUE") || (SupportClasses.FORMS40.GetItemProperty(currentBlockFld, SupportClasses.Property.UPDATE_NULL).equals("TRUE") && getCursorValue().isNull()) || (getMode().notEquals("NORMAL") && getItemQueryAllowed(currentBlockFld).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(currentBlockFld).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(currentBlockFld).equals("TRUE")) )
					{
						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
						// 
						//  Not protected, so call the form.
						//  
						goItem(currentBlockFld);
						getTask().getGoqrpls().gCheckFailure();
						copy(getCursorValue(),"GLOBAL.VALUE");
						executeAction("G$_REVOKE_ACCESS");
						getTask().getGoqrpls().gCheckFailure();
						getTask().getGoqrpls().gSecuredFormCall(getUser(), toStr("GUACALN"), toStr("QUERY_NOHIDE"));
						// 
						if ( !getNameIn("GLOBAL.VALUE").isNull() )
						{
							copy(getNameIn("GLOBAL.VALUE"),currentBlockFld);
							copy("","GLOBAL.VALUE");
							executeAction(KeyFunction.NEXT_ITEM);
						}
					}
					else {
						errorMessage(GNls.Fget(toStr("TSASBRL-0040"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER TBRSBEP_TERM_CODE_LBT.WHEN-MOUSE-CLICK
		 BEGIN
  NULL;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBEP_TERM_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBRSBEP_TERM_CODE_LBT")
		@Before
		public void tbrsbepTermCodeLbt_click()
		{
			
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBEP_CUTOFF_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBRSBEP_CUTOFF_DATE_DBT")
		@Before
		public void tbrsbepCutoffDateDbt_click()
		{
			
			getGCalendarBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER TBRSBEP_CUTOFF_DATE_DBT.WHEN-BUTTON-PRESSED
		 DECLARE
  ITEM_ID           ITEM;
  AL_BUT            NUMBER;
  CUR_ITEM          VARCHAR2(100) := NAME_IN('SYSTEM.TRIGGER_ITEM');
  CURRENT_BLOCK_FLD VARCHAR2(61);
BEGIN
  ITEM_ID := FIND_ITEM(NAME_IN('SYSTEM.CURSOR_BLOCK') ||
               SUBSTR(CUR_ITEM,INSTR(CUR_ITEM,'.'),
                 INSTR(CUR_ITEM,'_DBT') - 1 - INSTR(CUR_ITEM,'.') + 1));
  IF ID_NULL(ITEM_ID) THEN
    MESSAGE(G$_NLS.Get('TSASBRL-0041','FORM','*ERROR* Date button is outside the current block.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
  CURRENT_BLOCK_FLD := NAME_IN('SYSTEM.CURSOR_BLOCK')||
                         SUBSTR(CUR_ITEM,INSTR(CUR_ITEM,'.'),
                           INSTR(CUR_ITEM,'_DBT') - 1 - INSTR(CUR_ITEM,'.') + 1);
--
-- If calculate item is not visible, exit.
--
  IF GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,ENABLED) = 'FALSE' THEN
    RETURN;
  END IF;
--
-- Check if item is protected or not.  If not, launch the form.
--
  IF GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,UPDATEABLE) = 'TRUE' OR
     (GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,UPDATE_NULL) = 'TRUE' AND
      NAME_IN('SYSTEM.CURSOR_VALUE') IS NULL) OR
     (NAME_IN('SYSTEM.MODE') <> 'NORMAL' AND
      GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,QUERYABLE) = 'TRUE') OR
     (NAME_IN('SYSTEM.RECORD_STATUS') = 'NEW' AND
      GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,INSERT_ALLOWED) = 'TRUE') OR
     (NAME_IN('SYSTEM.RECORD_STATUS') = 'INSERT' AND
      GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,INSERT_ALLOWED) = 'TRUE') THEN
--
-- Not protected, so call the form.
-- 
    GO_ITEM(CURRENT_BLOCK_FLD);
    G$_CHECK_FAILURE; 
    COPY(NAME_IN('SYSTEM.CURSOR_VALUE'),'GLOBAL.VALUE');
    EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
    G$_CHECK_FAILURE;
    G$_SECURED_FORM_CALL(USER,'GUACALN','QUERY_NOHIDE');
--
    IF NAME_IN('GLOBAL.VALUE') IS NOT NULL THEN
      COPY(NAME_IN('GLOBAL.VALUE'),CURRENT_BLOCK_FLD);
      COPY('','GLOBAL.VALUE');
      DO_KEY('NEXT_ITEM');
    END IF;  
--
-- Protected, don't launch form.
--
  ELSE
    MESSAGE(G$_NLS.Get('TSASBRL-0042','FORM','*ERROR* Item is protected against update.'));              
    NULL;
  END IF;  
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBEP_CUTOFF_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="TBRSBEP_CUTOFF_DATE_DBT")
		public void tbrsbepCutoffDateDbt_buttonClick()
		{
			
				{
					ItemDescriptor itemId= null;
					NNumber alBut= NNumber.getNull();
					NString curItem = getTriggerItem();
					NString currentBlockFld= NString.getNull();
					itemId = findItem(getCursorBlock().append(substring(curItem, inStr(curItem, toStr(".")), inStr(curItem, toStr("_DBT")).subtract(1).subtract(inStr(curItem, toStr("."))).add(1))));
					if ( (itemId == null) )
					{
						errorMessage(GNls.Fget(toStr("TSASBRL-0041"), toStr("FORM"), toStr("*ERROR* Date button is outside the current block.")));
						throw new ApplicationException();
					}
					currentBlockFld = getCursorBlock().append(substring(curItem, inStr(curItem, toStr(".")), inStr(curItem, toStr("_DBT")).subtract(1).subtract(inStr(curItem, toStr("."))).add(1)));
					// 
					//  If calculate item is not visible, exit.
					// 
					if ( getItemEnabled(currentBlockFld).equals("FALSE") )
					{
						return ;
					}
					// 
					//  Check if item is protected or not.  If not, launch the form.
					// 
					// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
					if ( getItemUpdateAllowed(currentBlockFld).equals("TRUE") || (SupportClasses.FORMS40.GetItemProperty(currentBlockFld, SupportClasses.Property.UPDATE_NULL).equals("TRUE") && getCursorValue().isNull()) || (getMode().notEquals("NORMAL") && getItemQueryAllowed(currentBlockFld).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(currentBlockFld).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(currentBlockFld).equals("TRUE")) )
					{
						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
						// 
						//  Not protected, so call the form.
						//  
						goItem(currentBlockFld);
						getTask().getGoqrpls().gCheckFailure();
						copy(getCursorValue(),"GLOBAL.VALUE");
						executeAction("G$_REVOKE_ACCESS");
						getTask().getGoqrpls().gCheckFailure();
						getTask().getGoqrpls().gSecuredFormCall(getUser(), toStr("GUACALN"), toStr("QUERY_NOHIDE"));
						// 
						if ( !getNameIn("GLOBAL.VALUE").isNull() )
						{
							copy(getNameIn("GLOBAL.VALUE"),currentBlockFld);
							copy("","GLOBAL.VALUE");
							executeAction(KeyFunction.NEXT_ITEM);
						}
					}
					else {
						errorMessage(GNls.Fget(toStr("TSASBRL-0042"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBEP_DUE_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TBRSBEP_DUE_DATE_DBT")
		@Before
		public void tbrsbepDueDateDbt_click()
		{
			
			getGCalendarBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER TBRSBEP_DUE_DATE_DBT.WHEN-BUTTON-PRESSED
		 DECLARE
  ITEM_ID           ITEM;
  AL_BUT            NUMBER;
  CUR_ITEM          VARCHAR2(100) := NAME_IN('SYSTEM.TRIGGER_ITEM');
  CURRENT_BLOCK_FLD VARCHAR2(61);
BEGIN
  ITEM_ID := FIND_ITEM(NAME_IN('SYSTEM.CURSOR_BLOCK') ||
               SUBSTR(CUR_ITEM,INSTR(CUR_ITEM,'.'),
                 INSTR(CUR_ITEM,'_DBT') - 1 - INSTR(CUR_ITEM,'.') + 1));
  IF ID_NULL(ITEM_ID) THEN
    MESSAGE(G$_NLS.Get('TSASBRL-0046','FORM','*ERROR* Date button is outside the current block.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
  CURRENT_BLOCK_FLD := NAME_IN('SYSTEM.CURSOR_BLOCK')||
                         SUBSTR(CUR_ITEM,INSTR(CUR_ITEM,'.'),
                           INSTR(CUR_ITEM,'_DBT') - 1 - INSTR(CUR_ITEM,'.') + 1);
--
-- If calculate item is not visible, exit.
--
  IF GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,ENABLED) = 'FALSE' THEN
    RETURN;
  END IF;
--
-- Check if item is protected or not.  If not, launch the form.
--
  IF GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,UPDATEABLE) = 'TRUE' OR
     (GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,UPDATE_NULL) = 'TRUE' AND
      NAME_IN('SYSTEM.CURSOR_VALUE') IS NULL) OR
     (NAME_IN('SYSTEM.MODE') <> 'NORMAL' AND
      GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,QUERYABLE) = 'TRUE') OR
     (NAME_IN('SYSTEM.RECORD_STATUS') = 'NEW' AND
      GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,INSERT_ALLOWED) = 'TRUE') OR
     (NAME_IN('SYSTEM.RECORD_STATUS') = 'INSERT' AND
      GET_ITEM_PROPERTY(CURRENT_BLOCK_FLD,INSERT_ALLOWED) = 'TRUE') THEN
--
-- Not protected, so call the form.
-- 
    GO_ITEM(CURRENT_BLOCK_FLD);
    G$_CHECK_FAILURE; 
    COPY(NAME_IN('SYSTEM.CURSOR_VALUE'),'GLOBAL.VALUE');
    EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
    G$_CHECK_FAILURE;
    G$_SECURED_FORM_CALL(USER,'GUACALN','QUERY_NOHIDE');
--
    IF NAME_IN('GLOBAL.VALUE') IS NOT NULL THEN
      COPY(NAME_IN('GLOBAL.VALUE'),CURRENT_BLOCK_FLD);
      COPY('','GLOBAL.VALUE');
      DO_KEY('NEXT_ITEM');
    END IF;  
--
-- Protected, don't launch form.
--
  ELSE
    MESSAGE(G$_NLS.Get('TSASBRL-0047','FORM','*ERROR* Item is protected against update.'));              
    NULL;
  END IF;  
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBEP_DUE_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="TBRSBEP_DUE_DATE_DBT")
		public void tbrsbepDueDateDbt_buttonClick()
		{
			
				{
					ItemDescriptor itemId= null;
					NNumber alBut= NNumber.getNull();
					NString curItem = getTriggerItem();
					NString currentBlockFld= NString.getNull();
					itemId = findItem(getCursorBlock().append(substring(curItem, inStr(curItem, toStr(".")), inStr(curItem, toStr("_DBT")).subtract(1).subtract(inStr(curItem, toStr("."))).add(1))));
					if ( (itemId == null) )
					{
						errorMessage(GNls.Fget(toStr("TSASBRL-0046"), toStr("FORM"), toStr("*ERROR* Date button is outside the current block.")));
						throw new ApplicationException();
					}
					currentBlockFld = getCursorBlock().append(substring(curItem, inStr(curItem, toStr(".")), inStr(curItem, toStr("_DBT")).subtract(1).subtract(inStr(curItem, toStr("."))).add(1)));
					// 
					//  If calculate item is not visible, exit.
					// 
					if ( getItemEnabled(currentBlockFld).equals("FALSE") )
					{
						return ;
					}
					// 
					//  Check if item is protected or not.  If not, launch the form.
					// 
					// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
					if ( getItemUpdateAllowed(currentBlockFld).equals("TRUE") || (SupportClasses.FORMS40.GetItemProperty(currentBlockFld, SupportClasses.Property.UPDATE_NULL).equals("TRUE") && getCursorValue().isNull()) || (getMode().notEquals("NORMAL") && getItemQueryAllowed(currentBlockFld).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(currentBlockFld).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(currentBlockFld).equals("TRUE")) )
					{
						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
						// 
						//  Not protected, so call the form.
						//  
						goItem(currentBlockFld);
						getTask().getGoqrpls().gCheckFailure();
						copy(getCursorValue(),"GLOBAL.VALUE");
						executeAction("G$_REVOKE_ACCESS");
						getTask().getGoqrpls().gCheckFailure();
						getTask().getGoqrpls().gSecuredFormCall(getUser(), toStr("GUACALN"), toStr("QUERY_NOHIDE"));
						// 
						if ( !getNameIn("GLOBAL.VALUE").isNull() )
						{
							copy(getNameIn("GLOBAL.VALUE"),currentBlockFld);
							copy("","GLOBAL.VALUE");
							executeAction(KeyFunction.NEXT_ITEM);
						}
					}
					else {
						errorMessage(GNls.Fget(toStr("TSASBRL-0047"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
	
	
}
