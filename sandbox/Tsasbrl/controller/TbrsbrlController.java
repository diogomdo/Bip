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
		
public class TbrsbrlController extends DefaultBlockController {

	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	

	
	public TbrsbrlController(IFormController parentController, String name) 
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
	
		/* Original PL/SQL code code for TRIGGER TBRSBRL.PRE-UPDATE
		 :TBRSBRL_ACTIVITY_DATE := SYSDATE ;
:TBRSBRL_TYPE_IND := :TBBSBRL.TBBSBRL_SEL_TERM_CHARGES;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBRL.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void tbrsbrl_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);
				TbrsbrlAdapter tbrsbrlElement = (TbrsbrlAdapter)args.getRow();


				tbrsbrlElement.setTbrsbrlActivityDate(DbManager.getDBDateTime());
				tbrsbrlElement.setTbrsbrlTypeInd(tbbsbrlElement.getTbbsbrlSelTermCharges());
			}

		
		/* Original PL/SQL code code for TRIGGER TBRSBRL.PRE-INSERT
		 :TBRSBRL_ACTIVITY_DATE := SYSDATE ;
:TBRSBRL_TYPE_IND := :TBBSBRL.TBBSBRL_SEL_TERM_CHARGES;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBRL.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void tbrsbrl_BeforeRowInsert(RowAdapterEvent args)
		{
			
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);
				TbrsbrlAdapter tbrsbrlElement = (TbrsbrlAdapter)args.getRow();


				tbrsbrlElement.setTbrsbrlActivityDate(DbManager.getDBDateTime());
				tbrsbrlElement.setTbrsbrlTypeInd(tbbsbrlElement.getTbbsbrlSelTermCharges());
			}

		
		/* Original PL/SQL code code for TRIGGER TBRSBRL.KEY-DUPREC
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBRL.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void tbrsbrl_CopyRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER TBRSBRL.KEY-NXTBLK
		 GO_ITEM('TBBSBRL_PTRM_CODE_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBRL.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void tbrsbrl_NextBlock()
		{
			
				goItem(toStr("TBBSBRL_PTRM_CODE_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBRSBRL.KEY-PRVBLK
		 GO_ITEM('TBBSBRL_EXCL_REG_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBRL.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void tbrsbrl_PreviousBlock()
		{
			
				goItem(toStr("TBBSBRL_EXCL_REG_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBRSBRL_VALUE.KEY-PREV-ITEM
		 GO_ITEM('TBBSBRL.TBBSBRL_SEL_TERM_CHARGES');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBRL_VALUE.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="TBRSBRL_VALUE", function=KeyFunction.PREVIOUS_ITEM)
		public void tbrsbrlValue_PreviousItem()
		{
			
				goItem(toStr("TBBSBRL.TBBSBRL_SEL_TERM_CHARGES"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBRSBRL_VALUE.KEY-NEXT-ITEM
		 GO_ITEM('TBBSBRL.TBBSBRL_SUM_TERM_CHARGES');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBRL_VALUE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBRSBRL_VALUE", function=KeyFunction.NEXT_ITEM)
		public void tbrsbrlValue_keyNexItem()
		{
			
				goItem(toStr("TBBSBRL.TBBSBRL_SUM_TERM_CHARGES"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBRSBRL_VALUE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO PTI_END_TRIGGER ;
   END IF ;
--
-- Validate Category code
--
   IF :TBBSBRL_SEL_TERM_CHARGES = 'C' THEN
      DECLARE
         PTI_INTO_TEMP        VARCHAR2(255); 
            CURSOR PTI_CURSOR IS
               SELECT 'X'
               FROM   TTVDCAT
               WHERE  TTVDCAT_CODE = :TBRSBRL_VALUE ;
      BEGIN
         OPEN PTI_CURSOR ;
         FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
         G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
             G$_NLS.Get('TSASBRL-0027', 'FORM','*ERROR* Invalid Category code entered; press LIST for choices.') ,
            TRUE);
      END ;
--
-- See if this category already exists
--
      DECLARE
         PTI_INTO_TEMP        VARCHAR2(255); 
            CURSOR PTI_CURSOR IS
               SELECT 'X'
               FROM   TBRSBRL
               WHERE  TBRSBRL_SBRC_CODE = :TBRSBRL_SBRC_CODE
               AND    TBRSBRL_TYPE_IND  = :TBRSBRL_TYPE_IND
               AND    TBRSBRL_VALUE     = :TBRSBRL_VALUE ;
      BEGIN
         OPEN PTI_CURSOR ;
         FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
         G$_CHECK_VALUE (PTI_CURSOR%FOUND,
             G$_NLS.Get('TSASBRL-0028', 'FORM','*ERROR* This category code was already entered - duplicates not allowed.') ,
            TRUE);
      END ;
   END IF;
--
-- Validate Source code
--
   IF :TBBSBRL_SEL_TERM_CHARGES = 'S' THEN
      DECLARE
         PTI_INTO_TEMP        VARCHAR2(255); 
         CURSOR PTI_CURSOR IS
            SELECT 'X'
            FROM   TTVSRCE
            WHERE  TTVSRCE_CODE = :TBRSBRL_VALUE ;
      BEGIN
         OPEN PTI_CURSOR ;
         FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
         G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
             G$_NLS.Get('TSASBRL-0029', 'FORM','*ERROR* Invalid Source code entered; press LIST for choices.') ,
            TRUE);
      END ;
--
-- See if this source already exists
--
      DECLARE
         PTI_INTO_TEMP        VARCHAR2(255); 
            CURSOR PTI_CURSOR IS
               SELECT 'X'
               FROM   TBRSBRL
               WHERE  TBRSBRL_SBRC_CODE = :TBRSBRL_SBRC_CODE
               AND    TBRSBRL_TYPE_IND  = :TBRSBRL_TYPE_IND
               AND    TBRSBRL_VALUE     = :TBRSBRL_VALUE ;
      BEGIN
         OPEN PTI_CURSOR ;
         FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
         G$_CHECK_VALUE (PTI_CURSOR%FOUND,
             G$_NLS.Get('TSASBRL-0030', 'FORM','*ERROR* This source code was already entered - duplicates not allowed.') ,
            TRUE);
      END ;
   END IF;
--
   << PTI_END_TRIGGER >>
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
		 * TBRSBRL_VALUE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@AfterValueChangedTrigger(item="TBRSBRL_VALUE")
		public void tbrsbrlValue_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter)this.getFormModel().getTbbsbrl().getRowAdapter(true);
				TbrsbrlAdapter tbrsbrlElement = (TbrsbrlAdapter)this.getFormModel().getTbrsbrl().getRowAdapter(true);


				int rowCount = 0;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					if ((getGlobal("QUERY_MODE").equals("1")))
					{
						 goto PTI_END_TRIGGER;
					}
					// 
					//  Validate Category code
					// 
					if ( tbbsbrlElement.getTbbsbrlSelTermCharges().equals("C") )
					{
						{
							NString ptiIntoTemp= NString.getNull();
							String sqlptiCursor = "SELECT 'X' " +
	" FROM TTVDCAT " +
	" WHERE TTVDCAT_CODE = :TBRSBRL_VALUE ";
							DataCursor ptiCursor = new DataCursor(sqlptiCursor);
							try {
								//Setting query parameters
								ptiCursor.addParameter("TBRSBRL_VALUE", tbrsbrlElement.getTbrsbrlValue());
								//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
								ptiCursor.open();
								ResultSet ptiCursorResults = ptiCursor.fetchInto();
								if ( ptiCursorResults != null ) {
									ptiIntoTemp = ptiCursorResults.getStr(0);
								}
								getTask().getGoqrpls().gCheckValue(ptiCursor.notFound(), GNls.Fget(toStr("TSASBRL-0027"), toStr("FORM"), toStr("*ERROR* Invalid Category code entered; press LIST for choices.")), toBool(NBool.True));
							}
							finally{
								ptiCursor.close();
							}
						}
						{
							NString ptiIntoTemp= NString.getNull();
							String sqlptiCursor = "SELECT 'X' " +
	" FROM TBRSBRL " +
	" WHERE TBRSBRL_SBRC_CODE = :TBRSBRL_SBRC_CODE AND TBRSBRL_TYPE_IND = :TBRSBRL_TYPE_IND AND TBRSBRL_VALUE = :TBRSBRL_VALUE ";
							DataCursor ptiCursor = new DataCursor(sqlptiCursor);
							try {
								//Setting query parameters
								ptiCursor.addParameter("TBRSBRL_SBRC_CODE", tbrsbrlElement.getTbrsbrlSbrcCode());
								ptiCursor.addParameter("TBRSBRL_TYPE_IND", tbrsbrlElement.getTbrsbrlTypeInd());
								ptiCursor.addParameter("TBRSBRL_VALUE", tbrsbrlElement.getTbrsbrlValue());
								//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
								ptiCursor.open();
								ResultSet ptiCursorResults = ptiCursor.fetchInto();
								if ( ptiCursorResults != null ) {
									ptiIntoTemp = ptiCursorResults.getStr(0);
								}
								getTask().getGoqrpls().gCheckValue(ptiCursor.found(), GNls.Fget(toStr("TSASBRL-0028"), toStr("FORM"), toStr("*ERROR* This category code was already entered - duplicates not allowed.")), toBool(NBool.True));
							}
							finally{
								ptiCursor.close();
							}
						}
					}
					// 
					//  Validate Source code
					// 
					if ( tbbsbrlElement.getTbbsbrlSelTermCharges().equals("S") )
					{
						{
							NString ptiIntoTemp= NString.getNull();
							String sqlptiCursor = "SELECT 'X' " +
	" FROM TTVSRCE " +
	" WHERE TTVSRCE_CODE = :TBRSBRL_VALUE ";
							DataCursor ptiCursor = new DataCursor(sqlptiCursor);
							try {
								//Setting query parameters
								ptiCursor.addParameter("TBRSBRL_VALUE", tbrsbrlElement.getTbrsbrlValue());
								//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
								ptiCursor.open();
								ResultSet ptiCursorResults = ptiCursor.fetchInto();
								if ( ptiCursorResults != null ) {
									ptiIntoTemp = ptiCursorResults.getStr(0);
								}
								getTask().getGoqrpls().gCheckValue(ptiCursor.notFound(), GNls.Fget(toStr("TSASBRL-0029"), toStr("FORM"), toStr("*ERROR* Invalid Source code entered; press LIST for choices.")), toBool(NBool.True));
							}
							finally{
								ptiCursor.close();
							}
						}
						{
							NString ptiIntoTemp= NString.getNull();
							String sqlptiCursor = "SELECT 'X' " +
	" FROM TBRSBRL " +
	" WHERE TBRSBRL_SBRC_CODE = :TBRSBRL_SBRC_CODE AND TBRSBRL_TYPE_IND = :TBRSBRL_TYPE_IND AND TBRSBRL_VALUE = :TBRSBRL_VALUE ";
							DataCursor ptiCursor = new DataCursor(sqlptiCursor);
							try {
								//Setting query parameters
								ptiCursor.addParameter("TBRSBRL_SBRC_CODE", tbrsbrlElement.getTbrsbrlSbrcCode());
								ptiCursor.addParameter("TBRSBRL_TYPE_IND", tbrsbrlElement.getTbrsbrlTypeInd());
								ptiCursor.addParameter("TBRSBRL_VALUE", tbrsbrlElement.getTbrsbrlValue());
								//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
								ptiCursor.open();
								ResultSet ptiCursorResults = ptiCursor.fetchInto();
								if ( ptiCursorResults != null ) {
									ptiIntoTemp = ptiCursorResults.getStr(0);
								}
								getTask().getGoqrpls().gCheckValue(ptiCursor.found(), GNls.Fget(toStr("TSASBRL-0030"), toStr("FORM"), toStr("*ERROR* This source code was already entered - duplicates not allowed.")), toBool(NBool.True));
							}
							finally{
								ptiCursor.close();
							}
						}
					}
					 PTI_END_TRIGGER:;
					setGlobal("QUERY_MODE", toStr("0"));
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER TBRSBRL_TYPE_IND.POST-CHANGE
		 IF :TBRSBRL_TYPE_IND = 'C' THEN
--
  DECLARE
      CURSOR PTI_CURSOR IS
         SELECT TBRSBRL_TYPE_IND
         FROM   TBRSBRL
         WHERE  TBRSBRL_TYPE_IND = 'S';
      TYPE_IND  VARCHAR2(1);
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO TYPE_IND ;
--    G$_CHECK_VALUE (PTI_CURSOR%FOUND, '*ERROR* You must' ||
--       ' delete all Type S records before adding Type C' ||
--       ' records.', TRUE);
   END ;
--
   SET_ITEM_PROPERTY('TBRSBRL_VALUE',LOV_NAME,'TTVDCAT_LOV');
ELSIF :TBRSBRL_TYPE_IND = 'S' THEN
--
  DECLARE
      CURSOR PTI_CURSOR IS
         SELECT TBRSBRL_TYPE_IND
         FROM   TBRSBRL
         WHERE  TBRSBRL_TYPE_IND = 'C';
      TYPE_IND  VARCHAR2(1);
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO TYPE_IND ;
--    G$_CHECK_VALUE (PTI_CURSOR%FOUND, '*ERROR* You must' ||
--       ' delete all Type C records before adding Type S' ||
--       ' records.', TRUE);
   END ;
--
   SET_ITEM_PROPERTY('TBRSBRL_VALUE',LOV_NAME,'TTVSRCE_LOV');
ELSE MESSAGE(
 G$_NLS.Get('TSASBRL-0031', 'FORM','*ERROR* Invalid code; values are (C)ategory and (S)ource.')  ) ;
      RAISE FORM_TRIGGER_FAILURE ;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBRL_TYPE_IND.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@AfterValueChangedTrigger(item="TBRSBRL_TYPE_IND")
		public void tbrsbrlTypeInd_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbrsbrlAdapter tbrsbrlElement = (TbrsbrlAdapter)this.getFormModel().getTbrsbrl().getRowAdapter(true);


				int rowCount = 0;
				if ( tbrsbrlElement.getTbrsbrlTypeInd().equals("C") )
				{
					{
						String sqlptiCursor = "SELECT TBRSBRL_TYPE_IND " +
	" FROM TBRSBRL " +
	" WHERE TBRSBRL_TYPE_IND = 'S' ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						NString typeInd= NString.getNull();
						try {
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								typeInd = ptiCursorResults.getStr(0);
							}
						}
						finally{
							ptiCursor.close();
						}
					}
					// 
					setItemLovName("TBRSBRL_VALUE", "TTVDCAT_LOV");
				}
				else if ( tbrsbrlElement.getTbrsbrlTypeInd().equals("S") ) {
					{
						String sqlptiCursor = "SELECT TBRSBRL_TYPE_IND " +
	" FROM TBRSBRL " +
	" WHERE TBRSBRL_TYPE_IND = 'C' ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						NString typeInd= NString.getNull();
						try {
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								typeInd = ptiCursorResults.getStr(0);
							}
						}
						finally{
							ptiCursor.close();
						}
					}
					// 
					setItemLovName("TBRSBRL_VALUE", "TTVSRCE_LOV");
				}
				else {
					errorMessage(GNls.Fget(toStr("TSASBRL-0031"), toStr("FORM"), toStr("*ERROR* Invalid code; values are (C)ategory and (S)ource.")));
					throw new ApplicationException();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBRL_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBRSBRL_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void tbrsbrlActivityDate_keyNexItem()
		{
			
			getGDateClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBRL_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="TBRSBRL_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void tbrsbrlActivityDate_itemChange()
		{
			
			getGDateClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBRL_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="TBRSBRL_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void tbrsbrlActivityDate_itemOut()
		{
			
			getGDateClass().itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBRL.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void tbrsbrl_AfterQuery(RowAdapterEvent args)
		{
			
				// F2J_INFO : Empty AfterQuery automatically generated for POST-CHANGE support. Do not remove.
		}

		
	
	
}
