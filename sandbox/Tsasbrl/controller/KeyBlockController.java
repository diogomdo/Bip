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

import net.hedtech.general.common.libraries.Goqolib.services.GKeyBlockClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
    
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;
import net.hedtech.general.common.libraries.Goqolib.model.GSdispAdapter;
import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;
		
public class KeyBlockController extends DefaultBlockController {

	private GKeyBlockClass getGKeyBlockClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GKeyBlockClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_KEY_BLOCK_CLASS");
	}	
	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	

	
	public KeyBlockController(IFormController parentController, String name) 
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
		 * KEY_BLOCK.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void keyBlock_blockOut()
		{
			
			getGKeyBlockClass().blockOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void keyBlock_Save()
		{
			
			getGKeyBlockClass().save();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-UP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-UP", function=KeyFunction.UP)
		public void keyBlock_MoveUp()
		{
			
			getGKeyBlockClass().moveUp();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-DOWN
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.DOWN)
		public void keyBlock_MoveDown()
		{
			
			getGKeyBlockClass().moveDown();
		}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void keyBlock_CreateRecord()
		{
			
			getGKeyBlockClass().createRecord();
		}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void keyBlock_DeleteRecord()
		{
			
			getGKeyBlockClass().deleteRecord();
		}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void keyBlock_Search()
		{
			
			getGKeyBlockClass().search();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void keyBlock_ExecuteQuery()
		{
			
			getGKeyBlockClass().executeQuery();
		}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void keyBlock_NextRecord()
		{
			
			getGKeyBlockClass().nextRecord();
		}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-NXTSET
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTSET")
		public void keyBlock_KeyNxtset()
		{
			
			getGKeyBlockClass().keyNxtset();
		}

		
		/*
		 *<p>
		 *This trigger checks if a valid PIDM exists.  If it does, perform previous
		 *block and execute query.  If not, display error message.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void keyBlock_PreviousBlock()
		{
			
			getGKeyBlockClass().previousBlock();
		}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void keyBlock_PreviousRecord()
		{
			
			getGKeyBlockClass().previousRecord();
		}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-NXTBLK
		 NEXT_BLOCK;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void keyBlock_NextBlock()
		{
			
				nextBlock();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-CLRBLK
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
		public void keyBlock_keyClearBlock()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-PREV-ITEM
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", function=KeyFunction.PREVIOUS_ITEM)
		public void keyBlock_PreviousItem()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-CLRREC
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void keyBlock_ClearRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-CQUERY
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", function=KeyFunction.COUNT_QUERY)
		public void keyBlock_TotalResults()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEYBLOC_SBRC_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="KEYBLOC_SBRC_CODE")
		public void keyblocSbrcCode_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEYBLOC_SBRC_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="KEYBLOC_SBRC_CODE", function=KeyFunction.ITEM_CHANGE)
		public void keyblocSbrcCode_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEYBLOC_SBRC_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="KEYBLOC_SBRC_CODE")
		public void keyblocSbrcCode_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEYBLOC_SBRC_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="KEYBLOC_SBRC_CODE")
		public void keyblocSbrcCode_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEYBLOC_SBRC_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="KEYBLOC_SBRC_CODE", function=KeyFunction.NEXT_ITEM)
		public void keyblocSbrcCode_keyNexItem()
		{
			
			getGCodeClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEYBLOC_SBRC_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="KEYBLOC_SBRC_CODE", function=KeyFunction.ITEM_OUT)
		public void keyblocSbrcCode_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER KEYBLOC_SBRC_CODE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
-- IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
--    GOTO PTI_STEP_001 ;
-- END IF ;
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT TTVSBRC_DESC
         FROM   TTVSBRC
         WHERE  TTVSBRC_CODE =
            :KEY_BLOCK.KEYBLOC_SBRC_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :SBRC_DESC;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
 G$_NLS.Get('TSASBRL-0017', 'FORM','*ERROR* Invalid code; press LIST for valid codes') , TRUE);
   END ;
--
   <<PTI_STEP_001>>
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
		 * KEYBLOC_SBRC_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@AfterValueChangedTrigger(item="KEYBLOC_SBRC_CODE")
		public void keyblocSbrcCode_PostChange()
		{
			
				int rowCount = 0;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					{
						String sqlptiCursor = "SELECT TTVSBRC_DESC " +
	" FROM TTVSBRC " +
	" WHERE TTVSBRC_CODE = :KEY_BLOCK_KEYBLOC_SBRC_CODE ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("KEY_BLOCK_KEYBLOC_SBRC_CODE", getFormModel().getKeyBlock().getKeyblocSbrcCode());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								getFormModel().getKeyBlock().setSbrcDesc(ptiCursorResults.getStr(0));
							}
							getTask().getGoqrpls().gCheckValue(ptiCursor.notFound(), GNls.Fget(toStr("TSASBRL-0017"), toStr("FORM"), toStr("*ERROR* Invalid code; press LIST for valid codes")), toBool(NBool.True));
						}
						finally{
							ptiCursor.close();
						}
					}
					 PTI_STEP_001:;
					setGlobal("QUERY_MODE", toStr("0"));
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SBRC_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SBRC_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sbrcDesc_itemChange()
		{
			
			getGDescClass().itemChange();
		}

		
	
	
}
