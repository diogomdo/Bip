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

import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	
    
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;
import net.hedtech.general.common.libraries.Goqolib.model.GSdispAdapter;
import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;
		
public class TbrsbepController extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	

	
	public TbrsbepController(IFormController parentController, String name) 
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
	
		/* Original PL/SQL code code for TRIGGER TBRSBEP.PRE-INSERT
		 :TBRSBEP.TBRSBEP_SBRC_CODE := :KEYBLOC_SBRC_CODE;
:TBRSBEP.TBRSBEP_ACTIVITY_DATE := SYSDATE;
:TBRSBEP.TBRSBEP_USER_ID := USER;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBEP.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void tbrsbep_BeforeRowInsert(RowAdapterEvent args)
		{
			
				TbrsbepAdapter tbrsbepElement = (TbrsbepAdapter)args.getRow();


				tbrsbepElement.setTbrsbepSbrcCode(getFormModel().getKeyBlock().getKeyblocSbrcCode());
				tbrsbepElement.setTbrsbepActivityDate(DbManager.getDBDateTime());
				tbrsbepElement.setTbrsbepUserId(getUser());
			}

		
		/* Original PL/SQL code code for TRIGGER TBRSBEP.ON-ERROR
		 DECLARE <multilinecomment>RPE added</multilinecomment>
 errcode NUMBER := ERROR_CODE;
 dbmserrcode NUMBER;
 dbmserrtext VARCHAR2(200);
BEGIN
 IF errcode = 40508 THEN
 <multilinecomment>
 ** Form Builder had a problem INSERTing, so
 ** look at the Database error which
 ** caused the problem.
 </multilinecomment>
   dbmserrcode := DBMS_ERROR_CODE;
   dbmserrtext := DBMS_ERROR_TEXT;
   IF dbmserrcode = -1 THEN
   <multilinecomment>
   ** ORA-00001 is "unique constraint violated"
   </multilinecomment>
      MESSAGE( G$_NLS.Get('TSASBRL-0032', 'FORM','*ERROR* Term Code already exists for this rule.') );
   ELSE
   <multilinecomment>
   ** Printout a generic message with the database
   ** error string in it.
   </multilinecomment>
     MESSAGE( G$_NLS.Get('TSASBRL-0033', 'FORM','*ERROR* Insert failed because of  %01%',dbmserrtext) );
     --MESSAGE( G$_NLS.Get('X', 'FORM',dbmserrtext) );
   END IF;
 END IF;
END;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBEP.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/

		@OnError
		public void tbrsbep_OnError(EventObject args)
		{
			
				{
					// RPE added
					NNumber errcode = SupportClasses.SQLFORMS.ErrorCode();
					NNumber dbmserrcode= NNumber.getNull();
					NString dbmserrtext= NString.getNull();
					if ( errcode.equals(40508) )
					{
						// ** Form Builder had a problem INSERTing, so
						// ** look at the Database error which
						// ** caused the problem.
						dbmserrcode = toNumber(errorCode());
						dbmserrtext = errorMessage();
						if ( dbmserrcode.equals(- (1)) )
						{
							// ** ORA-00001 is "unique constraint violated"
							errorMessage(GNls.Fget(toStr("TSASBRL-0032"), toStr("FORM"), toStr("*ERROR* Term Code already exists for this rule.")));
						}
						else {
							// ** Printout a generic message with the database
							// ** error string in it.
							errorMessage(GNls.Fget(toStr("TSASBRL-0033"), toStr("FORM"), toStr("*ERROR* Insert failed because of  %01%"), dbmserrtext));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER TBRSBEP.WHEN-VALIDATE-RECORD
		 if :TBRSBEP_TERM_CODE is not null and :TBRSBEP_CUTOFF_DATE is null then
	MESSAGE( G$_NLS.Get('TSASBRL-0034', 'FORM','*ERROR* Enrollment Period Cutoff Date must be entered when term code exists.') );
	RAISE FORM_TRIGGER_FAILURE ;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBEP.WHEN-VALIDATE-RECORD
		 *
		 *
		 *</p>
		*/

		@RecordValidationTrigger
		public void tbrsbep_WhenValidateRecord()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbrsbepAdapter tbrsbepElement = (TbrsbepAdapter)this.getFormModel().getTbrsbep().getRowAdapter(true);


				if ( !tbrsbepElement.getTbrsbepTermCode().isNull() && tbrsbepElement.getTbrsbepCutoffDate().isNull() )
				{
					errorMessage(GNls.Fget(toStr("TSASBRL-0034"), toStr("FORM"), toStr("*ERROR* Enrollment Period Cutoff Date must be entered when term code exists.")));
					throw new ApplicationException();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBEP_TERM_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="TBRSBEP_TERM_CODE")
		public void tbrsbepTermCode_doubleClick()
		{
			
			getGCodeClass().doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBEP_TERM_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="TBRSBEP_TERM_CODE", function=KeyFunction.ITEM_CHANGE)
		public void tbrsbepTermCode_itemChange()
		{
			
			getGCodeClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBEP_TERM_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="TBRSBEP_TERM_CODE")
		public void tbrsbepTermCode_GSearchParameters()
		{
			
			getGCodeClass().gSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBEP_TERM_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="TBRSBEP_TERM_CODE")
		public void tbrsbepTermCode_GSearchOptions()
		{
			
			getGCodeClass().gSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBEP_TERM_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBRSBEP_TERM_CODE", function=KeyFunction.NEXT_ITEM)
		public void tbrsbepTermCode_keyNexItem()
		{
			
			getGCodeClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBEP_TERM_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="TBRSBEP_TERM_CODE", function=KeyFunction.ITEM_OUT)
		public void tbrsbepTermCode_itemOut()
		{
			
			getGCodeClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER TBRSBEP_TERM_CODE.WHEN-VALIDATE-ITEM
		 <multilinecomment>RPE added this</multilinecomment>
      DECLARE
         PTI_INTO_TEMP        VARCHAR2(255); 
            CURSOR C1 IS
               SELECT 'X'
               FROM tbrsbep where tbrsbep_term_code=:tbrsbep_term_code and tbrsbep_sbrc_code=:KEYBLOC_SBRC_CODE;
      BEGIN
         OPEN C1 ;
         FETCH C1 INTO PTI_INTO_TEMP ;
         G$_CHECK_VALUE (C1%FOUND,
             G$_NLS.Get('TSASBRL-0035', 'FORM','*ERROR* Term Code already exists for this rule.') ,
            TRUE);
      END ;

	
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBEP_TERM_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="TBRSBEP_TERM_CODE")
		public void tbrsbepTermCode_validate()
		{
			
				// RPE added this

				//F2J_WARNING : Caution, the variable may be null.
				TbrsbepAdapter tbrsbepElement = (TbrsbepAdapter)this.getFormModel().getTbrsbep().getRowAdapter(true);


				int rowCount = 0;
				{
					NString ptiIntoTemp= NString.getNull();
					String sqlc1 = "SELECT 'X' " +
	" FROM tbrsbep " +
	" WHERE tbrsbep_term_code = :TBRSBEP_TERM_CODE AND tbrsbep_sbrc_code = :KEYBLOC_SBRC_CODE ";
					DataCursor c1 = new DataCursor(sqlc1);
					try {
						//Setting query parameters
						c1.addParameter("TBRSBEP_TERM_CODE", tbrsbepElement.getTbrsbepTermCode());
						c1.addParameter("KEYBLOC_SBRC_CODE", getFormModel().getKeyBlock().getKeyblocSbrcCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable c1.
						c1.open();
						ResultSet c1Results = c1.fetchInto();
						if ( c1Results != null ) {
							ptiIntoTemp = c1Results.getStr(0);
						}
						getTask().getGoqrpls().gCheckValue(c1.found(), GNls.Fget(toStr("TSASBRL-0035"), toStr("FORM"), toStr("*ERROR* Term Code already exists for this rule.")), toBool(NBool.True));
					}
					finally{
						c1.close();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBEP_CUTOFF_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBRSBEP_CUTOFF_DATE", function=KeyFunction.NEXT_ITEM)
		public void tbrsbepCutoffDate_keyNexItem()
		{
			
			getGDateClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBEP_CUTOFF_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="TBRSBEP_CUTOFF_DATE", function=KeyFunction.ITEM_CHANGE)
		public void tbrsbepCutoffDate_itemChange()
		{
			
			getGDateClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBEP_CUTOFF_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="TBRSBEP_CUTOFF_DATE", function=KeyFunction.ITEM_OUT)
		public void tbrsbepCutoffDate_itemOut()
		{
			
			getGDateClass().itemOut();
		}

		
		/* Original PL/SQL code code for TRIGGER TBRSBEP_CUTOFF_DATE.WHEN-VALIDATE-ITEM
		 if :TBRSBEP_TERM_CODE is not null and :TBRSBEP_CUTOFF_DATE is null then
	MESSAGE( G$_NLS.Get('TSASBRL-0036', 'FORM','*ERROR* Enrollment Period Cutoff Date must be entered when term code exists.') );
	RAISE FORM_TRIGGER_FAILURE ;
end if;

	
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBEP_CUTOFF_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="TBRSBEP_CUTOFF_DATE")
		public void tbrsbepCutoffDate_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				TbrsbepAdapter tbrsbepElement = (TbrsbepAdapter)this.getFormModel().getTbrsbep().getRowAdapter(true);


				if ( !tbrsbepElement.getTbrsbepTermCode().isNull() && tbrsbepElement.getTbrsbepCutoffDate().isNull() )
				{
					errorMessage(GNls.Fget(toStr("TSASBRL-0036"), toStr("FORM"), toStr("*ERROR* Enrollment Period Cutoff Date must be entered when term code exists.")));
					throw new ApplicationException();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBEP_DUE_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TBRSBEP_DUE_DATE", function=KeyFunction.NEXT_ITEM)
		public void tbrsbepDueDate_keyNexItem()
		{
			
			getGDateClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBEP_DUE_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="TBRSBEP_DUE_DATE", function=KeyFunction.ITEM_CHANGE)
		public void tbrsbepDueDate_itemChange()
		{
			
			getGDateClass().itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TBRSBEP_DUE_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="TBRSBEP_DUE_DATE", function=KeyFunction.ITEM_OUT)
		public void tbrsbepDueDate_itemOut()
		{
			
			getGDateClass().itemOut();
		}

		
	
	
}
