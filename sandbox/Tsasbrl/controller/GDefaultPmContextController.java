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
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ViewServices.*;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ValueSetServices.*;
import static morphis.foundations.core.appsupportlib.runtime.LovServices.*;
import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;



import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

import net.hedtech.banner.arsys.Tsasbrl.model.*;
import net.hedtech.banner.arsys.Tsasbrl.*;
import net.hedtech.banner.arsys.Tsasbrl.services.*;





public class GDefaultPmContextController extends AbstractMenuController {

	
	public GDefaultPmContextController(IFormController parentController, String name) 
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
		/* Original PL/SQL code code for TRIGGER ROLLBACK.PLSQL_CMD
		G$_RECONNECT;
G$_CHECK_FAILURE;
--
DO_KEY('Clear_form');
		*/
		/// <summary>
		/// </summary>
		/// <remarks>
		///	ID:
		/// 
		///</remarks>
		/// <TriggerInfo>ROLLBACK.PLSQL_CMD</TriggerInfo>
		
		@MenuTrigger(item="ROLLBACK")
		public void itmGDefaultPmRollback_Click()
		{
				getTask().getGoqrpls().gReconnect();
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction(KeyFunction.CLEAR_FORM);
			}

		
		/* Original PL/SQL code code for TRIGGER SAVE.PLSQL_CMD
		G$_RECONNECT;
G$_CHECK_FAILURE;
--
DO_KEY('Commit_form');
		*/
		/// <summary>
		/// </summary>
		/// <remarks>
		///	ID:
		/// 
		///</remarks>
		/// <TriggerInfo>SAVE.PLSQL_CMD</TriggerInfo>
		
		@MenuTrigger(item="SAVE")
		public void itmGDefaultPmSave_Click()
		{
				getTask().getGoqrpls().gReconnect();
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction(KeyFunction.SAVE);
			}

		
		/* Original PL/SQL code code for TRIGGER EXIT.PLSQL_CMD
		G$_RECONNECT;
G$_CHECK_FAILURE;
--
DO_KEY('Exit_form');
		*/
		/// <summary>
		/// </summary>
		/// <remarks>
		///	ID:
		/// 
		///</remarks>
		/// <TriggerInfo>EXIT.PLSQL_CMD</TriggerInfo>
		
		@MenuTrigger(item="EXIT")
		public void itmGDefaultPmRwexit_Click()
		{
				getTask().getGoqrpls().gReconnect();
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction(KeyFunction.EXIT);
			}

		
		/* Original PL/SQL code code for TRIGGER PRINT.PLSQL_CMD
		DO_KEY('print');
		*/
		/// <summary>
		/// </summary>
		/// <remarks>
		///	ID:
		/// 
		///</remarks>
		/// <TriggerInfo>PRINT.PLSQL_CMD</TriggerInfo>
		
		@MenuTrigger(item="PRINT")
		public void itmGDefaultPmPrint_Click()
		{
				executeAction(KeyFunction.PRINT);
			}

		
		/* Original PL/SQL code code for TRIGGER ADD_FORM.PLSQL_CMD
		G$_ADD_TO_PERSONAL_MENU;
G$_CHECK_FAILURE;

		*/
		/// <summary>
		/// </summary>
		/// <remarks>
		///	ID:
		/// 
		///</remarks>
		/// <TriggerInfo>ADD_FORM.PLSQL_CMD</TriggerInfo>
		
		@MenuTrigger(item="ADD_FORM")
		public void itmGDefaultPmAddForm_Click()
		{
				getTask().getGoqrpls().gAddToPersonalMenu();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER SUB_MENU_01.PLSQL_CMD
		BEGIN
  G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_01');
END;
		*/
		/// <summary>
		/// </summary>
		/// <remarks>
		///	ID:
		/// 
		///</remarks>
		/// <TriggerInfo>SUB_MENU_01.PLSQL_CMD</TriggerInfo>
		
		@MenuTrigger(item="SUB_MENU_01")
		public void itmGDefaultPmSubMenu01_Click()
		{
				getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_01"));
			}

		
		/* Original PL/SQL code code for TRIGGER SUB_MENU_02.PLSQL_CMD
		BEGIN
  G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_02');
END;
		*/
		/// <summary>
		/// </summary>
		/// <remarks>
		///	ID:
		/// 
		///</remarks>
		/// <TriggerInfo>SUB_MENU_02.PLSQL_CMD</TriggerInfo>
		
		@MenuTrigger(item="SUB_MENU_02")
		public void itmGDefaultPmSubMenu02_Click()
		{
				getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_02"));
			}

		
		/* Original PL/SQL code code for TRIGGER SUB_MENU_03.PLSQL_CMD
		BEGIN
  G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_03');
END;
		*/
		/// <summary>
		/// </summary>
		/// <remarks>
		///	ID:
		/// 
		///</remarks>
		/// <TriggerInfo>SUB_MENU_03.PLSQL_CMD</TriggerInfo>
		
		@MenuTrigger(item="SUB_MENU_03")
		public void itmGDefaultPmSubMenu03_Click()
		{
				getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_03"));
			}

		
		/* Original PL/SQL code code for TRIGGER SUB_MENU_04.PLSQL_CMD
		BEGIN
  G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_04');
END;
		*/
		/// <summary>
		/// </summary>
		/// <remarks>
		///	ID:
		/// 
		///</remarks>
		/// <TriggerInfo>SUB_MENU_04.PLSQL_CMD</TriggerInfo>
		
		@MenuTrigger(item="SUB_MENU_04")
		public void itmGDefaultPmSubMenu04_Click()
		{
				getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_04"));
			}

		
		/* Original PL/SQL code code for TRIGGER SUB_MENU_05.PLSQL_CMD
		BEGIN
  G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_05');
END;
		*/
		/// <summary>
		/// </summary>
		/// <remarks>
		///	ID:
		/// 
		///</remarks>
		/// <TriggerInfo>SUB_MENU_05.PLSQL_CMD</TriggerInfo>
		
		@MenuTrigger(item="SUB_MENU_05")
		public void itmGDefaultPmSubMenu05_Click()
		{
				getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_05"));
			}

		
		/* Original PL/SQL code code for TRIGGER SUB_MENU_06.PLSQL_CMD
		BEGIN
  G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_06');
END;
		*/
		/// <summary>
		/// </summary>
		/// <remarks>
		///	ID:
		/// 
		///</remarks>
		/// <TriggerInfo>SUB_MENU_06.PLSQL_CMD</TriggerInfo>
		
		@MenuTrigger(item="SUB_MENU_06")
		public void itmGDefaultPmSubMenu06_Click()
		{
				getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_06"));
			}

		
		/* Original PL/SQL code code for TRIGGER SUB_MENU_07.PLSQL_CMD
		BEGIN
  G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_07');
END;
		*/
		/// <summary>
		/// </summary>
		/// <remarks>
		///	ID:
		/// 
		///</remarks>
		/// <TriggerInfo>SUB_MENU_07.PLSQL_CMD</TriggerInfo>
		
		@MenuTrigger(item="SUB_MENU_07")
		public void itmGDefaultPmSubMenu07_Click()
		{
				getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_07"));
			}

		
		/* Original PL/SQL code code for TRIGGER SUB_MENU_08.PLSQL_CMD
		BEGIN
  G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_08');
END;
		*/
		/// <summary>
		/// </summary>
		/// <remarks>
		///	ID:
		/// 
		///</remarks>
		/// <TriggerInfo>SUB_MENU_08.PLSQL_CMD</TriggerInfo>
		
		@MenuTrigger(item="SUB_MENU_08")
		public void itmGDefaultPmSubMenu08_Click()
		{
				getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_08"));
			}

		
		/* Original PL/SQL code code for TRIGGER SUB_MENU_09.PLSQL_CMD
		BEGIN
  G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_09');
END;
		*/
		/// <summary>
		/// </summary>
		/// <remarks>
		///	ID:
		/// 
		///</remarks>
		/// <TriggerInfo>SUB_MENU_09.PLSQL_CMD</TriggerInfo>
		
		@MenuTrigger(item="SUB_MENU_09")
		public void itmGDefaultPmSubMenu09_Click()
		{
				getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_09"));
			}

		
		/* Original PL/SQL code code for TRIGGER SUB_MENU_10.PLSQL_CMD
		BEGIN
  G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_10');
END;
		*/
		/// <summary>
		/// </summary>
		/// <remarks>
		///	ID:
		/// 
		///</remarks>
		/// <TriggerInfo>SUB_MENU_10.PLSQL_CMD</TriggerInfo>
		
		@MenuTrigger(item="SUB_MENU_10")
		public void itmGDefaultPmSubMenu10_Click()
		{
				getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_10"));
			}

		
		/* Original PL/SQL code code for TRIGGER SUB_MENU_11.PLSQL_CMD
		BEGIN
  G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_11');
END;
		*/
		/// <summary>
		/// </summary>
		/// <remarks>
		///	ID:
		/// 
		///</remarks>
		/// <TriggerInfo>SUB_MENU_11.PLSQL_CMD</TriggerInfo>
		
		@MenuTrigger(item="SUB_MENU_11")
		public void itmGDefaultPmSubMenu11_Click()
		{
				getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_11"));
			}

		
		/* Original PL/SQL code code for TRIGGER SUB_MENU_12.PLSQL_CMD
		BEGIN
  G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_12');
END;
		*/
		/// <summary>
		/// </summary>
		/// <remarks>
		///	ID:
		/// 
		///</remarks>
		/// <TriggerInfo>SUB_MENU_12.PLSQL_CMD</TriggerInfo>
		
		@MenuTrigger(item="SUB_MENU_12")
		public void itmGDefaultPmSubMenu12_Click()
		{
				getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_12"));
			}

		
		/* Original PL/SQL code code for TRIGGER SUB_MENU_13.PLSQL_CMD
		BEGIN
  G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_13');
END;
		*/
		/// <summary>
		/// </summary>
		/// <remarks>
		///	ID:
		/// 
		///</remarks>
		/// <TriggerInfo>SUB_MENU_13.PLSQL_CMD</TriggerInfo>
		
		@MenuTrigger(item="SUB_MENU_13")
		public void itmGDefaultPmSubMenu13_Click()
		{
				getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_13"));
			}

		
		/* Original PL/SQL code code for TRIGGER SUB_MENU_14.PLSQL_CMD
		BEGIN
  G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_14');
END;
		*/
		/// <summary>
		/// </summary>
		/// <remarks>
		///	ID:
		/// 
		///</remarks>
		/// <TriggerInfo>SUB_MENU_14.PLSQL_CMD</TriggerInfo>
		
		@MenuTrigger(item="SUB_MENU_14")
		public void itmGDefaultPmSubMenu14_Click()
		{
				getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_14"));
			}

		
		/* Original PL/SQL code code for TRIGGER SUB_MENU_15.PLSQL_CMD
		BEGIN
  G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_15');
END;
		*/
		/// <summary>
		/// </summary>
		/// <remarks>
		///	ID:
		/// 
		///</remarks>
		/// <TriggerInfo>SUB_MENU_15.PLSQL_CMD</TriggerInfo>
		
		@MenuTrigger(item="SUB_MENU_15")
		public void itmGDefaultPmSubMenu15_Click()
		{
				getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_15"));
			}

		
		/* Original PL/SQL code code for TRIGGER SUB_MENU_16.PLSQL_CMD
		BEGIN
  G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_16');
END;
		*/
		/// <summary>
		/// </summary>
		/// <remarks>
		///	ID:
		/// 
		///</remarks>
		/// <TriggerInfo>SUB_MENU_16.PLSQL_CMD</TriggerInfo>
		
		@MenuTrigger(item="SUB_MENU_16")
		public void itmGDefaultPmSubMenu16_Click()
		{
				getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_16"));
			}

		
		/* Original PL/SQL code code for TRIGGER SUB_MENU_17.PLSQL_CMD
		BEGIN
  G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_17');
END;
		*/
		/// <summary>
		/// </summary>
		/// <remarks>
		///	ID:
		/// 
		///</remarks>
		/// <TriggerInfo>SUB_MENU_17.PLSQL_CMD</TriggerInfo>
		
		@MenuTrigger(item="SUB_MENU_17")
		public void itmGDefaultPmSubMenu17_Click()
		{
				getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_17"));
			}

		
		/* Original PL/SQL code code for TRIGGER SUB_MENU_18.PLSQL_CMD
		BEGIN
  G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_18');
END;
		*/
		/// <summary>
		/// </summary>
		/// <remarks>
		///	ID:
		/// 
		///</remarks>
		/// <TriggerInfo>SUB_MENU_18.PLSQL_CMD</TriggerInfo>
		
		@MenuTrigger(item="SUB_MENU_18")
		public void itmGDefaultPmSubMenu18_Click()
		{
				getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_18"));
			}

		
		/* Original PL/SQL code code for TRIGGER SUB_MENU_19.PLSQL_CMD
		BEGIN
  G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_19');
END;
		*/
		/// <summary>
		/// </summary>
		/// <remarks>
		///	ID:
		/// 
		///</remarks>
		/// <TriggerInfo>SUB_MENU_19.PLSQL_CMD</TriggerInfo>
		
		@MenuTrigger(item="SUB_MENU_19")
		public void itmGDefaultPmSubMenu19_Click()
		{
				getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_19"));
			}

		
		/* Original PL/SQL code code for TRIGGER SUB_MENU_20.PLSQL_CMD
		BEGIN
  G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_20');
END;
		*/
		/// <summary>
		/// </summary>
		/// <remarks>
		///	ID:
		/// 
		///</remarks>
		/// <TriggerInfo>SUB_MENU_20.PLSQL_CMD</TriggerInfo>
		
		@MenuTrigger(item="SUB_MENU_20")
		public void itmGDefaultPmSubMenu20_Click()
		{
				getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_20"));
			}

		
		/* Original PL/SQL code code for TRIGGER SUB_MENU_21.PLSQL_CMD
		BEGIN
  G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_21');
END;
		*/
		/// <summary>
		/// </summary>
		/// <remarks>
		///	ID:
		/// 
		///</remarks>
		/// <TriggerInfo>SUB_MENU_21.PLSQL_CMD</TriggerInfo>
		
		@MenuTrigger(item="SUB_MENU_21")
		public void itmGDefaultPmSubMenu21_Click()
		{
				getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_21"));
			}

		
		/* Original PL/SQL code code for TRIGGER SUB_MENU_22.PLSQL_CMD
		BEGIN
  G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_22');
END;
		*/
		/// <summary>
		/// </summary>
		/// <remarks>
		///	ID:
		/// 
		///</remarks>
		/// <TriggerInfo>SUB_MENU_22.PLSQL_CMD</TriggerInfo>
		
		@MenuTrigger(item="SUB_MENU_22")
		public void itmGDefaultPmSubMenu22_Click()
		{
				getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_22"));
			}

		
		/* Original PL/SQL code code for TRIGGER SUB_MENU_23.PLSQL_CMD
		BEGIN
  G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_23');
END;
		*/
		/// <summary>
		/// </summary>
		/// <remarks>
		///	ID:
		/// 
		///</remarks>
		/// <TriggerInfo>SUB_MENU_23.PLSQL_CMD</TriggerInfo>
		
		@MenuTrigger(item="SUB_MENU_23")
		public void itmGDefaultPmSubMenu23_Click()
		{
				getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_23"));
			}

		
		/* Original PL/SQL code code for TRIGGER SUB_MENU_24.PLSQL_CMD
		BEGIN
  G$_NAVIGATION_FRAME.EXECUTE_MENU('OPTIONS.SUB_MENU_24');
END;
		*/
		/// <summary>
		/// </summary>
		/// <remarks>
		///	ID:
		/// 
		///</remarks>
		/// <TriggerInfo>SUB_MENU_24.PLSQL_CMD</TriggerInfo>
		
		@MenuTrigger(item="SUB_MENU_24")
		public void itmGDefaultPmSubMenu24_Click()
		{
				getTask().getGoqrpls().getGNavigationFrame().executeMenu(toStr("OPTIONS.SUB_MENU_24"));
			}

		
	
	
}

