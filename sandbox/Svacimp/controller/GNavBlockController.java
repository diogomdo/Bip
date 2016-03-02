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
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
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

import net.hedtech.general.common.forms.controller.DefaultBlockController;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

import net.hedtech.las.studemre.banner.student.Svacimp.model.*;
import net.hedtech.las.studemre.banner.student.Svacimp.*;
import net.hedtech.las.studemre.banner.student.Svacimp.services.*;

    
import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;
import net.hedtech.general.common.libraries.Goqolib.model.GSdispAdapter;
import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;
		
public class GNavBlockController extends DefaultBlockController {


	private net.hedtech.general.common.libraries.Goqolib.controller.GNavBlockController getGoqolibGNavBlockController() {
		return (net.hedtech.general.common.libraries.Goqolib.controller.GNavBlockController) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_NAV_BLOCK");
	}	
	
	public GNavBlockController(IFormController parentController, String name) 
	{
		super(parentController, name);
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
		 * G$_NAV_BLOCK.PRE-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void gNavBlock_blockIn()
		{
			
			getGoqolibGNavBlockController().gNavBlock_blockIn();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void gNavBlock_blockChange()
		{
			
			getGoqolibGNavBlockController().gNavBlock_blockChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.CHECK_TYPE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_TYPE")
		public void gNavBlock_CheckType()
		{
			
			getGoqolibGNavBlockController().gNavBlock_CheckType();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.CALL_ROUTINE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CALL_ROUTINE")
		public void gNavBlock_CallRoutine()
		{
			
			getGoqolibGNavBlockController().gNavBlock_CallRoutine();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.INIT_NEXT_SELECTION
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="INIT_NEXT_SELECTION")
		public void gNavBlock_InitNextSelection()
		{
			
			getGoqolibGNavBlockController().gNavBlock_InitNextSelection();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.GET_EAWTE_MESSAGES
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="GET_EAWTE_MESSAGES")
		public void gNavBlock_GetEawteMessages()
		{
			
			getGoqolibGNavBlockController().gNavBlock_GetEawteMessages();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.GLO_INIT_ROUTINE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="GLO_INIT_ROUTINE")
		public void gNavBlock_GloInitRoutine()
		{
			
			getGoqolibGNavBlockController().gNavBlock_GloInitRoutine();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void gNavBlock_ClearTask()
		{
			
			getGoqolibGNavBlockController().gNavBlock_ClearTask();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void gNavBlock_ClearRecord()
		{
			
			getGoqolibGNavBlockController().gNavBlock_ClearRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void gNavBlock_Save()
		{
			
			getGoqolibGNavBlockController().gNavBlock_Save();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void gNavBlock_CreateRecord()
		{
			
			getGoqolibGNavBlockController().gNavBlock_CreateRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void gNavBlock_DeleteRecord()
		{
			
			getGoqolibGNavBlockController().gNavBlock_DeleteRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-DOWN
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.DOWN)
		public void gNavBlock_MoveDown()
		{
			
			getGoqolibGNavBlockController().gNavBlock_MoveDown();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-MENU
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-MENU")
		public void gNavBlock_KeyMenu()
		{
			
			getGoqolibGNavBlockController().gNavBlock_KeyMenu();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void gNavBlock_NextBlock()
		{
			
			getGoqolibGNavBlockController().gNavBlock_NextBlock();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void gNavBlock_NextRecord()
		{
			
			getGoqolibGNavBlockController().gNavBlock_NextRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-OTHERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-OTHERS")
		public void gNavBlock_KeyOthers()
		{
			
			getGoqolibGNavBlockController().gNavBlock_KeyOthers();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void gNavBlock_PreviousBlock()
		{
			
			getGoqolibGNavBlockController().gNavBlock_PreviousBlock();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void gNavBlock_PreviousRecord()
		{
			
			getGoqolibGNavBlockController().gNavBlock_PreviousRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_NAV_BLOCK.KEY-UP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-UP", function=KeyFunction.UP)
		public void gNavBlock_MoveUp()
		{
			
			getGoqolibGNavBlockController().gNavBlock_MoveUp();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GO_ITEM.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GO_ITEM")
		public void goItem_doubleClick()
		{
			
			getGoqolibGNavBlockController().goItem_doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GO_ITEM.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GO_ITEM", function=KeyFunction.ITEM_CHANGE)
		public void goItem_itemChange()
		{
			
			getGoqolibGNavBlockController().goItem_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GO_ITEM.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="GO_ITEM")
		public void goItem_GSearchParameters()
		{
			
			getGoqolibGNavBlockController().goItem_GSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GO_ITEM.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="GO_ITEM")
		public void goItem_GSearchOptions()
		{
			
			getGoqolibGNavBlockController().goItem_GSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GO_ITEM.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GO_ITEM", function=KeyFunction.NEXT_ITEM)
		public void goItem_keyNexItem()
		{
			
			getGoqolibGNavBlockController().goItem_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GO_ITEM.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GO_ITEM", function=KeyFunction.ITEM_OUT)
		public void goItem_itemOut()
		{
			
			getGoqolibGNavBlockController().goItem_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GO_ITEM.KEY-ENTER
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTER", item="GO_ITEM")
		public void goItem_KeyEnter()
		{
			
			getGoqolibGNavBlockController().goItem_KeyEnter();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GO_ITEM.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="GO_ITEM", function=KeyFunction.LIST_VALUES)
		public void goItem_ListValues()
		{
			
			getGoqolibGNavBlockController().goItem_ListValues();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GO_ITEM_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GO_ITEM_BTN")
		@Before
		public void goItemBtn_click()
		{
			
			getGoqolibGNavBlockController().goItemBtn_click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GO_ITEM_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="GO_ITEM_BTN")
		public void goItemBtn_buttonClick()
		{
			
			getGoqolibGNavBlockController().goItemBtn_buttonClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * URL_MY_INSTITUTION.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="URL_MY_INSTITUTION")
		public void urlMyInstitution_buttonClick()
		{
			
			getGoqolibGNavBlockController().urlMyInstitution_buttonClick();
		}

		
	
	
}
