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

    
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;
import net.hedtech.general.common.libraries.Goqolib.model.GSdispAdapter;
import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;
		
public class GVpdiBlockController extends DefaultBlockController {


	private net.hedtech.general.common.libraries.Goqolib.controller.GVpdiBlockController getGoqolibGVpdiBlockController() {
		return (net.hedtech.general.common.libraries.Goqolib.controller.GVpdiBlockController) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_VPDI_BLOCK");
	}	
	
	public GVpdiBlockController(IFormController parentController, String name) 
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
		 * G$_VPDI_BLOCK.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void gVpdiBlock_blockChange()
		{
			
			getGoqolibGVpdiBlockController().gVpdiBlock_blockChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_VPDI_BLOCK.PRE-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void gVpdiBlock_blockIn()
		{
			
			getGoqolibGVpdiBlockController().gVpdiBlock_blockIn();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_VPDI_BLOCK.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void gVpdiBlock_blockOut()
		{
			
			getGoqolibGVpdiBlockController().gVpdiBlock_blockOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_VPDI_BLOCK.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
		public void gVpdiBlock_keyClearBlock()
		{
			
			getGoqolibGVpdiBlockController().gVpdiBlock_keyClearBlock();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_VPDI_BLOCK.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void gVpdiBlock_ClearTask()
		{
			
			getGoqolibGVpdiBlockController().gVpdiBlock_ClearTask();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_VPDI_BLOCK.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void gVpdiBlock_ClearRecord()
		{
			
			getGoqolibGVpdiBlockController().gVpdiBlock_ClearRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_VPDI_BLOCK.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void gVpdiBlock_Save()
		{
			
			getGoqolibGVpdiBlockController().gVpdiBlock_Save();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_VPDI_BLOCK.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", function=KeyFunction.COUNT_QUERY)
		public void gVpdiBlock_TotalResults()
		{
			
			getGoqolibGVpdiBlockController().gVpdiBlock_TotalResults();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_VPDI_BLOCK.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void gVpdiBlock_CreateRecord()
		{
			
			getGoqolibGVpdiBlockController().gVpdiBlock_CreateRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_VPDI_BLOCK.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void gVpdiBlock_DeleteRecord()
		{
			
			getGoqolibGVpdiBlockController().gVpdiBlock_DeleteRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_VPDI_BLOCK.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUP-ITEM")
		public void gVpdiBlock_KeyDupItem()
		{
			
			getGoqolibGVpdiBlockController().gVpdiBlock_KeyDupItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_VPDI_BLOCK.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void gVpdiBlock_CopyRecord()
		{
			
			getGoqolibGVpdiBlockController().gVpdiBlock_CopyRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_VPDI_BLOCK.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void gVpdiBlock_Search()
		{
			
			getGoqolibGVpdiBlockController().gVpdiBlock_Search();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_VPDI_BLOCK.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void gVpdiBlock_ExecuteQuery()
		{
			
			getGoqolibGVpdiBlockController().gVpdiBlock_ExecuteQuery();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_VPDI_BLOCK.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void gVpdiBlock_NextBlock()
		{
			
			getGoqolibGVpdiBlockController().gVpdiBlock_NextBlock();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_VPDI_BLOCK.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void gVpdiBlock_NextRecord()
		{
			
			getGoqolibGVpdiBlockController().gVpdiBlock_NextRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_VPDI_BLOCK.KEY-OTHERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-OTHERS")
		public void gVpdiBlock_KeyOthers()
		{
			
			getGoqolibGVpdiBlockController().gVpdiBlock_KeyOthers();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_VPDI_BLOCK.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void gVpdiBlock_PreviousBlock()
		{
			
			getGoqolibGVpdiBlockController().gVpdiBlock_PreviousBlock();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_VPDI_BLOCK.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void gVpdiBlock_PreviousRecord()
		{
			
			getGoqolibGVpdiBlockController().gVpdiBlock_PreviousRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * VPDI_CODE.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="VPDI_CODE", function=KeyFunction.COUNT_QUERY)
		public void vpdiCode_TotalResults()
		{
			
			getGoqolibGVpdiBlockController().vpdiCode_TotalResults();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * VPDI_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="VPDI_CODE")
		public void vpdiCode_doubleClick()
		{
			
			getGoqolibGVpdiBlockController().vpdiCode_doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * VPDI_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="VPDI_CODE", function=KeyFunction.ITEM_CHANGE)
		public void vpdiCode_itemChange()
		{
			
			getGoqolibGVpdiBlockController().vpdiCode_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * VPDI_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="VPDI_CODE")
		public void vpdiCode_GSearchParameters()
		{
			
			getGoqolibGVpdiBlockController().vpdiCode_GSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * VPDI_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="VPDI_CODE")
		public void vpdiCode_GSearchOptions()
		{
			
			getGoqolibGVpdiBlockController().vpdiCode_GSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * VPDI_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="VPDI_CODE", function=KeyFunction.NEXT_ITEM)
		public void vpdiCode_keyNexItem()
		{
			
			getGoqolibGVpdiBlockController().vpdiCode_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * VPDI_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="VPDI_CODE", function=KeyFunction.ITEM_OUT)
		public void vpdiCode_itemOut()
		{
			
			getGoqolibGVpdiBlockController().vpdiCode_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * VPDI_CODE.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-TEXT-ITEM", item="VPDI_CODE", function=KeyFunction.ITEM_IN)
		public void vpdiCode_itemIn()
		{
			
			getGoqolibGVpdiBlockController().vpdiCode_itemIn();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * VPDI_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@AfterValueChangedTrigger(item="VPDI_CODE")
		public void vpdiCode_PostChange()
		{
			
			getGoqolibGVpdiBlockController().vpdiCode_PostChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * VPDI_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="VPDI_CODE")
		public void vpdiCode_validate()
		{
			
			getGoqolibGVpdiBlockController().vpdiCode_validate();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * VPDI_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="VPDI_DESC", function=KeyFunction.ITEM_CHANGE)
		public void vpdiDesc_itemChange()
		{
			
			getGoqolibGVpdiBlockController().vpdiDesc_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * VPDI_CODE_LBT.WHEN_BUTTON_PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN_BUTTON_PRESSED", item="VPDI_CODE_LBT")
		@Before
		public void vpdiCodeLbt_WhenButtonPressed()
		{
			
			getGoqolibGVpdiBlockController().vpdiCodeLbt_WhenButtonPressed();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * VPDI_OTHER_INSTITUTIONS.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="VPDI_OTHER_INSTITUTIONS")
		public void vpdiOtherInstitutions_buttonClick()
		{
			
			getGoqolibGVpdiBlockController().vpdiOtherInstitutions_buttonClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * VPDI_CANCEL_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="VPDI_CANCEL_BTN")
		public void vpdiCancelBtn_buttonClick()
		{
			
			getGoqolibGVpdiBlockController().vpdiCancelBtn_buttonClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * VPDI_OK_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="VPDI_OK_BTN")
		public void vpdiOkBtn_buttonClick()
		{
			
			getGoqolibGVpdiBlockController().vpdiOkBtn_buttonClick();
		}

		
	
	
}
