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
		
public class TbrsbmsController extends DefaultBlockController {

	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	

	
	public TbrsbmsController(IFormController parentController, String name) 
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
	
		/* Original PL/SQL code code for TRIGGER TBRSBMS.PRE-UPDATE
		 :TBRSBMS_ACTIVITY_DATE := TO_DATE(:CURRENT_DATE,G$_DATE.GET_NLS_DATE_FORMAT) ;

G$_CHECK_VALUE (F_DUP_TBRSBMS_SEQ(:TBRSBMS_SEQ_NUMBER),
    G$_NLS.Get('TSASBRL-0037', 'FORM','*ERROR* Update creates duplicate sequence number. Execute Query to refresh messages.') , TRUE);

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBMS.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void tbrsbms_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				TbrsbmsAdapter tbrsbmsElement = (TbrsbmsAdapter)args.getRow();


				tbrsbmsElement.setTbrsbmsActivityDate(toDate(getFormModel().getFormHeader().getCurrentDate(), GDate.getNlsDateFormat()));
				getTask().getGoqrpls().gCheckValue(this.getTask().getServices().fDupTbrsbmsSeq(tbrsbmsElement.getTbrsbmsSeqNumber()), GNls.Fget(toStr("TSASBRL-0037"), toStr("FORM"), toStr("*ERROR* Update creates duplicate sequence number. Execute Query to refresh messages.")), toBool(NBool.True));
			}

		
		/* Original PL/SQL code code for TRIGGER TBRSBMS.PRE-INSERT
		 :TBRSBMS_ACTIVITY_DATE := TO_DATE(:CURRENT_DATE,G$_DATE.GET_NLS_DATE_FORMAT) ;
--
  DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   TBRSBMS
         WHERE  TBRSBMS_SBRC_CODE = :TBRSBMS_SBRC_CODE
           AND  TBRSBMS_SEQ_NUMBER = :TBRSBMS_SEQ_NUMBER
           AND  :RESEQUENCE_IND IS NULL ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      G$_CHECK_VALUE (PTI_CURSOR%FOUND,
 G$_NLS.Get('TSASBRL-0038', 'FORM','*ERROR* Please correct duplicate sequence number') , TRUE);
   END ;
--
   IF G$_NCHK((:TBRSBMS_SEQ_NUMBER IS NOT NULL)) THEN
      RETURN ;
   END IF ;
--
   << NUMBER_NEW_ROWS >>
   DECLARE
      CURSOR PTI_CURSOR IS
         SELECT NVL(MAX(TBRSBMS_SEQ_NUMBER), 0) + 1
         FROM   TBRSBMS
         WHERE  TBRSBMS_SBRC_CODE = :TBRSBMS_SBRC_CODE;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO :TBRSBMS_SEQ_NUMBER ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND, NULL, TRUE);
   END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBMS.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void tbrsbms_BeforeRowInsert(RowAdapterEvent args)
		{
			
				TbrsbmsAdapter tbrsbmsElement = (TbrsbmsAdapter)args.getRow();


				int rowCount = 0;
				tbrsbmsElement.setTbrsbmsActivityDate(toDate(getFormModel().getFormHeader().getCurrentDate(), GDate.getNlsDateFormat()));
				{
					NString ptiIntoTemp= NString.getNull();
					String sqlptiCursor = "SELECT 'X' " +
	" FROM TBRSBMS " +
	" WHERE TBRSBMS_SBRC_CODE = :TBRSBMS_SBRC_CODE AND TBRSBMS_SEQ_NUMBER = :TBRSBMS_SEQ_NUMBER AND :RESEQUENCE_IND IS NULL ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("TBRSBMS_SBRC_CODE", tbrsbmsElement.getTbrsbmsSbrcCode());
						ptiCursor.addParameter("TBRSBMS_SEQ_NUMBER", tbrsbmsElement.getTbrsbmsSeqNumber());
						ptiCursor.addParameter("RESEQUENCE_IND", getFormModel().getFormHeader().getResequenceInd());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiIntoTemp = ptiCursorResults.getStr(0);
						}
						getTask().getGoqrpls().gCheckValue(ptiCursor.found(), GNls.Fget(toStr("TSASBRL-0038"), toStr("FORM"), toStr("*ERROR* Please correct duplicate sequence number")), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
				// 
				if ( getTask().getGoqrpls().gNchk(((!tbrsbmsElement.getTbrsbmsSeqNumber().isNull()))).getValue() )
				{
					return ;
				}
				 NUMBER_NEW_ROWS:;
				{
					String sqlptiCursor = "SELECT NVL(MAX(TBRSBMS_SEQ_NUMBER), 0) + 1 " +
	" FROM TBRSBMS " +
	" WHERE TBRSBMS_SBRC_CODE = :TBRSBMS_SBRC_CODE ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("TBRSBMS_SBRC_CODE", tbrsbmsElement.getTbrsbmsSbrcCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							tbrsbmsElement.setTbrsbmsSeqNumber(ptiCursorResults.getNumber(0));
						}
						getTask().getGoqrpls().gCheckValue(ptiCursor.notFound(), toStr(null), toBool(NBool.True));
					}
					finally{
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER TBRSBMS.KEY-DUPREC
		 duplicate_record;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBMS.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void tbrsbms_CopyRecord()
		{
			
				duplicateRecord();
			}

		
		/* Original PL/SQL code code for TRIGGER TBRSBMS.KEY-NXTBLK
		 GO_ITEM('TBBSBRL_USE_RULES_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBMS.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void tbrsbms_NextBlock()
		{
			
				goItem(toStr("TBBSBRL_USE_RULES_IND"));
			}

		
		/* Original PL/SQL code code for TRIGGER TBRSBMS.KEY-PRVBLK
		 GO_ITEM('TBBSBRL_PTRM_CODE_IND');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBMS.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void tbrsbms_PreviousBlock()
		{
			
				goItem(toStr("TBBSBRL_PTRM_CODE_IND"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBMS.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void tbrsbms_BeforeQuery(QueryEvent args)
		{
			
               // F2J_WARNING : Query Parameters initialization. Make sure that all the query parameters are properly initialized

                // F2J_WARNING : Caution, the variable may be null.                  
                TbbsbrlAdapter tbbsbrlElement = (TbbsbrlAdapter) this.getFormModel().getTbbsbrl().getRowAdapter();                       
				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("TBBSBRL_SBRC_CODE", tbbsbrlElement.getTbbsbrlSbrcCode()));             


           
               }

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBMS_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBRSBMS_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void tbrsbmsActivityDate_keyNexItem()
		{
			
			getGDateClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBMS_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="TBRSBMS_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void tbrsbmsActivityDate_itemChange()
		{
			
			getGDateClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBMS_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="TBRSBMS_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void tbrsbmsActivityDate_itemOut()
		{
			
			getGDateClass().itemOut();
		}

		
	
	
}
