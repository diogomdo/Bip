package net.hedtech.banner.arsys.Tsasbrl.services;

import java.util.*;
import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.events.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.control.*;
import morphis.foundations.core.appsupportlib.runtime.events.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;

import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;
import static net.hedtech.general.common.forms.services.BaseTaskServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ViewServices.*;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ValueSetServices.*;
import static morphis.foundations.core.appsupportlib.runtime.LovServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ListServices.*;
import static morphis.foundations.core.appsupportlib.runtime.TreeServices.*;

import morphis.foundations.flavors.forms.appsupportlib.runtime.*;

import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;


import net.hedtech.banner.arsys.Tsasbrl.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.arsys.Tsasbrl.model.*;



public class TsasbrlServices extends AbstractSupportCodeObject{
	
	
	public TsasbrlServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public TsasbrlTask  getTask() {
		return (TsasbrlTask )super.getContainer();
	}

	
	public net.hedtech.banner.arsys.Tsasbrl.model.TsasbrlModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit DISPLAY_LOV
	
	<multilinecomment>******************************************
   Code modified by the Forms Migration Assistant
   19-Nov-2003 05:31 PM
 ******************************************</multilinecomment>

PROCEDURE DISPLAY_LOV (ITEM_NAME_IN IN VARCHAR2,LIST_NAME_IN IN VARCHAR2) IS

<multilinecomment> If the item name parameter is null, the cursor field will be used. If the list_name parameter is null, the lov associated with the item will be used. </multilinecomment>


ITEM_Y NUMBER := 0;
ITEM_X NUMBER := 0;
WIN_Y NUMBER := 0;
WIN_X NUMBER := 0;
LOV_X NUMBER := 0;
LOV_Y NUMBER := 0;
VIEW_X NUMBER := 0;
VIEW_Y NUMBER := 0;
ITEM_NAME VARCHAR2(80);
LIST_NAME VARCHAR2(80);
DUMMY BOOLEAN;
--
LOV_ID    LOV;
RG_NAME   VARCHAR2(80);
RG_ID     RECORDGROUP;
RG_STATUS NUMBER;


BEGIN 
   :GLOBAL.VALUE := '';
   WIN_Y:=GET_WINDOW_PROPERTY('MAIN_WINDOW',Y_POS);
   WIN_X :=GET_WINDOW_PROPERTY('MAIN_WINDOW',X_POS);
   ITEM_NAME :=NVL(ITEM_NAME_IN,NAME_IN('SYSTEM.CURSOR_ITEM'));
   ITEM_Y := GET_ITEM_PROPERTY(ITEM_NAME,Y_POS);           
   ITEM_X := GET_ITEM_PROPERTY(ITEM_NAME,X_POS);     
   VIEW_X := get_window_property(GET_VIEW_PROPERTY(GET_ITEM_PROPERTY(ITEM_NAME,ITEM_CANVAS),
                window_name),x_pos);
   VIEW_Y := get_window_property(GET_VIEW_PROPERTY(GET_ITEM_PROPERTY(ITEM_NAME,ITEM_CANVAS),
               window_name),y_pos);
   LIST_NAME := NVL(LIST_NAME_IN,GET_ITEM_PROPERTY(ITEM_NAME,LOV_NAME));
   IF LIST_NAME IS  NULL THEN
      MESSAGE( G$_NLS.Get('TSASBRL-0043', 'FORM','*ERROR* LOV does not exist for this item') );
      RETURN;
   ELSE
      IF ITEM_X + view_x < 39 THEN 
         LOV_X := WIN_X + 38;
      else
         LOV_X := WIN_X;
      END IF;
      IF ITEM_Y + VIEW_Y < 9 THEN 
         LOV_Y := WIN_Y + 10;
      ELSE
         LOV_y := WIN_Y + 3;
      END IF;
--
-- Obtain the id for the LOV and use that to get the
-- record group.
--
      LOV_ID := FIND_LOV(LIST_NAME);
      RG_NAME := GET_LOV_PROPERTY(LOV_ID, GROUP_NAME);
      RG_ID := FIND_GROUP(RG_NAME);
--
-- Populate the record group and use the returned status
-- to determine whether or not any records exist.  If no
-- records exist, issue warning and return.
--
      RG_STATUS := POPULATE_GROUP(RG_ID);
      IF RG_STATUS <> 0 THEN
         MESSAGE( G$_NLS.Get('TSASBRL-0044', 'FORM','*WARNING* No records exist to query LOV.') );
         RETURN;
      END IF;
--
-- Display LOV.
--
DEBUG.SUSPEND;
      SET_LOV_PROPERTY (LIST_NAME,LOV_SIZE,39,10);
      :GLOBAL.VALUE_SELECTED := 'N';
      IF SHOW_LOV (LIST_NAME,LOV_X,LOV_Y) THEN
        :GLOBAL.VALUE_SELECTED := 'Y';
        IF GET_ITEM_PROPERTY(ITEM_NAME,UPDATEABLE) = 'TRUE' OR
           (GET_ITEM_PROPERTY(ITEM_NAME,UPDATE_NULL) = 'TRUE'
            AND :SYSTEM.CURSOR_VALUE IS NULL) OR  
            :SYSTEM.MODE <> 'NORMAL' OR
            :SYSTEM.RECORD_STATUS = 'NEW' OR
            :SYSTEM.RECORD_STATUS = 'INSERT' THEN 
            EXECUTE_TRIGGER('LIST_VALUES_COPY'); 
            :GLOBAL.VALUE := '';
--
-- Don't do next_item like G$_display_lov does
--          DO_KEY('NEXT_ITEM');
        ELSE
             MESSAGE( G$_NLS.Get('TSASBRL-0045', 'FORM','*ERROR* Item is protected against update.') );              
         END IF;  
      END IF;
   END IF;
END;
	*/
	//ID:1431
	/* <p>
		* ******************************************
		* Code modified by the Forms Migration Assistant
		* 19-Nov-2003 05:31 PM
		* ******************************************
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param itemNameIn
		* @param listNameIn
		*/
		public void displayLov(NString itemNameIn, NString listNameIn)
		{
			//  If the item name parameter is null, the cursor field will be used. If the list_name parameter is null, the lov associated with the item will be used. 
			NNumber itemY = toNumber(0);
			NNumber itemX = toNumber(0);
			NNumber winY = toNumber(0);
			NNumber winX = toNumber(0);
			NNumber lovX = toNumber(0);
			NNumber lovY = toNumber(0);
			NNumber viewX = toNumber(0);
			NNumber viewY = toNumber(0);
			NString itemName= NString.getNull();
			NString listName= NString.getNull();
			NBool dummy= NBool.getNull();
			// 
			LovDescriptor lovId= null;
			NString rgName= NString.getNull();
			ValueSet rgId= null;
			NNumber rgStatus= NNumber.getNull();
			setGlobal("VALUE", toStr(""));
			// F2J_NOT_SUPPORTED : The property "WINDOW's Y_POS" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\TSASBRLF2NMigrationGuide.xml#PROPERTY.WINDOW.POS".
			//			winY = toNumber(SupportClasses.FORMS4W.GetWindowProperty("MAIN_WINDOW", SupportClasses.Property.Y_POS));
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's Y_POS' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\TSASBRLF2NMigrationGuide.xml#PROPERTY.WINDOW.POS'.");
			
			// F2J_TO_REMOVE : The property "WINDOW's X_POS" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\TSASBRLF2NMigrationGuide.xml#PROPERTY.WINDOW.POS".
			//			winX = toNumber(SupportClasses.FORMS4W.GetWindowProperty("MAIN_WINDOW", SupportClasses.Property.X_POS));
			this.getLogger().trace(this, "// F2J_TO_REMOVE : The property 'WINDOW's X_POS' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\TSASBRLF2NMigrationGuide.xml#PROPERTY.WINDOW.POS'.");
			
			itemName = isNull(itemNameIn, getCursorItem());
			itemY = toNumber(getItemYPos(itemName));
			itemX = toNumber(getItemXPos(itemName));
			// F2J_TO_REMOVE : The property "WINDOW's X_POS" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\TSASBRLF2NMigrationGuide.xml#PROPERTY.WINDOW.POS".
			//			viewX = toNumber(SupportClasses.FORMS4W.GetWindowProperty(getViewWindowName(getItemCanvas(itemName)), SupportClasses.Property.X_POS));
			this.getLogger().trace(this, "// F2J_TO_REMOVE : The property 'WINDOW's X_POS' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\TSASBRLF2NMigrationGuide.xml#PROPERTY.WINDOW.POS'.");
			
			// F2J_NOT_SUPPORTED : The property "WINDOW's Y_POS" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\TSASBRLF2NMigrationGuide.xml#PROPERTY.WINDOW.POS".
			//			viewY = toNumber(SupportClasses.FORMS4W.GetWindowProperty(getViewWindowName(getItemCanvas(itemName)), SupportClasses.Property.Y_POS));
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's Y_POS' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\TSASBRLF2NMigrationGuide.xml#PROPERTY.WINDOW.POS'.");
			
			listName = isNull(listNameIn, getItemLovName(itemName));
			if ( listName.isNull() )
			{
				errorMessage(GNls.Fget(toStr("TSASBRL-0043"), toStr("FORM"), toStr("*ERROR* LOV does not exist for this item")));
				return ;
			}
			else {
				if ( itemX.add(viewX).lesser(39) )
				{
					lovX = winX.add(38);
				}
				else {
					lovX = winX;
				}
				if ( itemY.add(viewY).lesser(9) )
				{
					lovY = winY.add(10);
				}
				else {
					lovY = winY.add(3);
				}
				// 
				//  Obtain the id for the LOV and use that to get the
				//  record group.
				// 
				lovId = findLov(listName);
				rgName = toStr(getLovGroupName(lovId));
				rgId = findGroup(rgName);
				// 
				//  Populate the record group and use the returned status
				//  to determine whether or not any records exist.  If no
				//  records exist, issue warning and return.
				// 
				rgStatus = populateGroup(rgId);
				if ( rgStatus.notEquals(0) )
				{
					warningMessage(GNls.Fget(toStr("TSASBRL-0044"), toStr("FORM"), toStr("*WARNING* No records exist to query LOV.")));
					return ;
				}
				// 
				//  Display LOV.
				// 
				// F2J_NOT_SUPPORTED : Call to built-in "SUSPEND" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\TSASBRLF2NMigrationGuide.xml#DefaultExcludeBuiltin2".
				//				SupportClasses.DEBUG.Suspend();
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'SUSPEND' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\TSASBRLF2NMigrationGuide.xml#DefaultExcludeBuiltin2'.");
				
				// F2J_NOT_SUPPORTED : The property "LOV's LOV_SIZE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\TSASBRLF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
				//				SupportClasses.FORMS4W.SetLovProperty(listName, SupportClasses.Constants.LOV_SIZE, 39, 10);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'LOV's LOV_SIZE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\TSASBRLF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
				
				setGlobal("VALUE_SELECTED", toStr("N"));
				if ( showLov(listName, lovX, lovY) )
				{
					setGlobal("VALUE_SELECTED", toStr("Y"));
					// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
					if ( getItemUpdateAllowed(itemName).equals("TRUE") || (SupportClasses.FORMS40.GetItemProperty(itemName, SupportClasses.Property.UPDATE_NULL).equals("TRUE") && getCursorValue().isNull()) || !getMode().equals("NORMAL") || getRecordStatus().equals("NEW") || getRecordStatus().equals("INSERT") )
					{
						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
						executeAction("LIST_VALUES_COPY");
						setGlobal("VALUE", toStr(""));
					}
					else {
						errorMessage(GNls.Fget(toStr("TSASBRL-0045"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_0_B2K
	
	PROCEDURE AUDIT_TRAIL_3_0_B2K IS
<multilinecomment>
AUDIT TRAIL: 3.0                                        INIT   DATE
1. Enhancements for Banner2000 upgrade.  These include   SQ  01/01/97
   adding an object group which contains the objects for
   the toolbar, adding an object group which highlights
   the active record within a block, a mouse-doubleclick
   and when-timer-expired trigger at the form level and
   this audit trail.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1432
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail30B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_3_1
	
	PROCEDURE AUDIT_TRAIL_3_1 IS
<multilinecomment> AUDIT TRAIL: 3.1
1. Defect.....6032
   Signoff....Galina Andronov     01/22/98
   Problem....No default value present when selecting current cutoff 
              date from tbbsbrl. If this parm is left blank it should
              default in schedule/bill run date; if you are in this section 
              and do not fill it in you are stuck. 
   Fix........Turned Required Off for TBBSBRL_CURRENT_DUE_DATE.   
AUDIT TRAIL END   </multilinecomment>             
BEGIN
  NULL;
END;
	*/
	//ID:1433
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail31()
		{
		}

	
	/* Original PL/SQL code for Prog Unit DISABLE_ENABLE
	
	PROCEDURE DISABLE_ENABLE (LINE_NUMBER IN NUMBER) IS
   CUR_ITEM VARCHAR2(80);
   CUR_BLK  VARCHAR2(80) :='BUTTON_CONTROL_BLOCK';
BEGIN
   CUR_ITEM :=GET_BLOCK_PROPERTY(CUR_BLK,FIRST_ITEM);
   WHILE (CUR_ITEM IS NOT NULL) LOOP
      CUR_ITEM:=CUR_BLK||'.'||CUR_ITEM;
      IF GET_ITEM_PROPERTY(CUR_ITEM,ITEM_CANVAS) IS NOT NULL THEN
         IF  (INSTR(GET_ITEM_PROPERTY(CUR_ITEM,ITEM_NAME),'EXIT') = 0
             and INSTR(GET_ITEM_PROPERTY(CUR_ITEM,ITEM_NAME),'SAVE') = 0
             and INSTR(GET_ITEM_PROPERTY(CUR_ITEM,ITEM_NAME),'ROLLBACK') = 0) THEN
               IF GET_ITEM_PROPERTY(CUR_ITEM,Y_POS) > LINE_NUMBER THEN
                  IF :SYSTEM.CURSOR_BLOCK = 'KEY_BLOCK' THEN
                     IF GET_ITEM_PROPERTY(CUR_ITEM,ENABLED) = 'TRUE' THEN
                        SET_ITEM_PROPERTY(CUR_ITEM,ENABLED, PROPERTY_OFF);
                     END IF;
                  ELSE
                     IF GET_ITEM_PROPERTY(CUR_ITEM,ENABLED) = 'FALSE' THEN
                        SET_ITEM_PROPERTY(CUR_ITEM,ENABLED, PROPERTY_ON);
                     END IF;
                  END IF;
               END IF;
         END IF;
      END IF;
      CUR_ITEM:=GET_ITEM_PROPERTY(CUR_ITEM,NEXTITEM);
   END LOOP;
END;

	*/
	//ID:1434
	/* <p>
/* </p>
		* @param lineNumber
		*/
		public void disableEnable(NNumber lineNumber)
		{
			NString curItem= NString.getNull();
			NString curBlk = toStr("BUTTON_CONTROL_BLOCK");
			curItem = getBlockFirstItem(curBlk);
			while ((!curItem.isNull())) {
				curItem = curBlk.append(".").append(curItem);
				if ( !getItemCanvas(curItem).isNull() )
				{
					if ((inStr(getItemName(curItem), toStr("EXIT")).equals(0) && inStr(getItemName(curItem), toStr("SAVE")).equals(0) && inStr(getItemName(curItem), toStr("ROLLBACK")).equals(0)))
					{
						if ( getItemYPos(curItem).greater(lineNumber) )
						{
							if ( getCursorBlock().equals("KEY_BLOCK") )
							{
								if ( getItemEnabled(curItem).equals("TRUE") )
								{
									setItemEnabled(curItem, false);
								}
							}
							else {
								if ( getItemEnabled(curItem).equals("FALSE") )
								{
									setItemEnabled(curItem, true);
								}
							}
						}
					}
				}
				curItem = getItemNextItem(curItem);
			}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0
	
	PROCEDURE AUDIT_TRAIL_4_0 IS
<multilinecomment>
AUDIT TRAIL: 4.0
1. Defect.....None
   Signoff....Galina Andronov  10/06/98
   Fix........Increased TBBSBRL_CAMP_HDNG and TBBSBRL_PTRM_HDNG form 1 to 3 and
              and changed Defauls Values for those items.
AUDIT TRAIL END   </multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1435
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail40()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_4_0_B2K
	
	PROCEDURE AUDIT_TRAIL_4_0_B2K IS
<multilinecomment>
AUDIT TRAIL: 4.0
1. Tom Mack  10/29/98
   Enhancements for Banner2000 4.0 upgrade.  These include replacing the toolbar
   object group which contains the new horizontal and vertical toolbars, the 
   navigational frame.  Also changes the coordinate system to REAL and resizes
   the windows and canvases.  Changes to name visual attributes, many new property
   classes and reduced number of redundant triggers.  See the General 4.0 TRM 
   for more details.
2. John Lavin 01/27/1999
   Phase II UI Changes.
3. John Lavin 02/08/1999
   Replaced When-window-activated logic with standard logic.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1436
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail40B2k()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_0_APICONVERT
	
	PROCEDURE AUDIT_TRAIL_5_0_APICONVERT IS 
<multilinecomment>
AUDIT_TRAIL 5.0 
1. API conversion   EFD  06/23/00 
Do not modify this program unit. 
</multilinecomment> 
BEGIN
NULL;
END; 
	*/
	//ID:1437
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail50Apiconvert()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_5_4
	
	PROCEDURE AUDIT_TRAIL_5_4 IS
<multilinecomment> AUDIT TRAIL: 5.4
1. Defect......#76855
   Signoff.....Galina Andronov  07/25/2002
   Problem.....The use of the NEXT BLOCK/PREVIOUS BLOCK function should be allowed to navigate to different windows of 
               this form.
   Fix.........Modified KEY-NXTBLK and KEY-PRVBLK to allow to navigate to different windows.
2. Defect......#34618
   Signoff.....Galina Andronov   07/25/2002
   Problem.....In TSASBRL, once you commit a rule, it won't allow delete/remove record functionality.  
   Fix.........Modified KEY-DELREC to allow delete Rule.

AUDIT TRAIL END </multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1438
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail54()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_6_0
	
	PROCEDURE AUDIT_TRAIL_6_0 IS
<multilinecomment>AUDIT TRAIL: 6.0
1. Signoff.....Gallina Andronov   10/09/2002
   Apply changes from 5.4 System Test.
AUDIT TRAIL END </multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1439
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail60()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0_FORMSCNV
	
	PROCEDURE AUDIT_TRAIL_7_0_FORMSCNV IS 
<multilinecomment> 
AUDIT TRAIL: 7.0 FORMSCNV 
1. Michael Hitrik  01/30/2004 
  Auto conversion of UI enhancements. Refer to the General UI documentation for more details. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:1440
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail70Formscnv()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_0
	
	PROCEDURE AUDIT_TRAIL_7_0 IS 
<multilinecomment> 
AUDIT TRAIL: 7.0
1. BGourlie 04/07/2004
   Application of enhanced UI methodology.  Please refer to the SCT Banner 7.0 User Interface Technical
   Methodology for more details.
2. Defect....82888
   Signoff...BGourlie 04/07/2004
   Problem...Messages cannot be re-sequenced.
   Fix.......Display and allow update of sequence number so that it may be updated
             to create space to insert a new record.  Sequence is not 'required' in that
             the PRE-INSERT trigger will populate on commit.  Added error if attempt to update
             creates duplicate sequence (need to commit one change at a time to increment
             several sequence numbers).
3. Defect....92923
   Signoff...BGourlie 06/04/2004
   Problem...Source and Category Codes do not appear when accessing the Bill
             Parameters page, even though they are in the database.
   Fix.......Call SETUP_TBRSBRL_BLOCK_INIT from WHEN_WINDOW_ACTIVATED_TRG to query
             the data and set prompt and LOV.  
             Also set prompt in SETUP_TBRSBRL_BLOCK_CHANGE, and if value is changed
             to 'All' then delete the TBRSBRL records.
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:1441
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail70()
		{
		}

	
	/* Original PL/SQL code for Prog Unit F_MAX_TBRSBMS_SEQ
	
	FUNCTION f_max_tbrsbms_seq RETURN NUMBER IS
   lv_sequence  NUMBER;
   CURSOR PTI_CURSOR IS
      SELECT NVL(MAX(TBRSBMS_SEQ_NUMBER), 0)
      FROM   TBRSBMS
      WHERE  TBRSBMS_SBRC_CODE = :KEY_BLOCK.KEYBLOC_SBRC_CODE;
BEGIN
   OPEN PTI_CURSOR;
   FETCH PTI_CURSOR INTO lv_sequence;
   CLOSE PTI_CURSOR;
   RETURN lv_sequence;
END;
	*/
	//ID:1442
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NNumber fMaxTbrsbmsSeq()
		{
			int rowCount = 0;
			NNumber lvSequence= NNumber.getNull();
			String sqlptiCursor = "SELECT NVL(MAX(TBRSBMS_SEQ_NUMBER), 0) " +
	" FROM TBRSBMS " +
	" WHERE TBRSBMS_SBRC_CODE = :KEY_BLOCK_KEYBLOC_SBRC_CODE ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("KEY_BLOCK_KEYBLOC_SBRC_CODE", getFormModel().getKeyBlock().getKeyblocSbrcCode());
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					lvSequence = ptiCursorResults.getNumber(0);
				}
				ptiCursor.close();
				return  toNumber(lvSequence);
				}finally{
					ptiCursor.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit F_DUP_TBRSBMS_SEQ
	
	FUNCTION F_DUP_TBRSBMS_SEQ (SEQ_NUMBER IN NUMBER)
RETURN BOOLEAN IS
     PTI_VAR  VARCHAR2(1);
   CURSOR PTI_CURSOR IS
      SELECT 'x'
      FROM   TBRSBMS
      WHERE  TBRSBMS_SBRC_CODE = :KEY_BLOCK.KEYBLOC_SBRC_CODE
      AND    TBRSBMS_SEQ_NUMBER = SEQ_NUMBER;
BEGIN
   OPEN PTI_CURSOR;
   FETCH PTI_CURSOR INTO PTI_VAR;
   IF PTI_CURSOR%FOUND THEN
      CLOSE PTI_CURSOR;
      RETURN TRUE;
   ELSE
      CLOSE PTI_CURSOR;
      RETURN FALSE;
   END IF;
END;
	*/
	//ID:1443
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param seqNumber
		*/
		public NBool fDupTbrsbmsSeq(NNumber seqNumber)
		{
			int rowCount = 0;
			NString ptiVar= NString.getNull();
			String sqlptiCursor = "SELECT 'x' " +
	" FROM TBRSBMS " +
	" WHERE TBRSBMS_SBRC_CODE = :KEY_BLOCK_KEYBLOC_SBRC_CODE AND TBRSBMS_SEQ_NUMBER = :P_SEQ_NUMBER ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("KEY_BLOCK_KEYBLOC_SBRC_CODE", getFormModel().getKeyBlock().getKeyblocSbrcCode());
				ptiCursor.addParameter("P_SEQ_NUMBER", seqNumber);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					ptiVar = ptiCursorResults.getStr(0);
				}
				if ( ptiCursor.found() )
				{
					ptiCursor.close();
					return  toBool( toBool(NBool.True));
				}
				else {
					ptiCursor.close();
					return  toBool( toBool(NBool.False));
				}
				}finally{
					ptiCursor.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_7_1
	
	PROCEDURE AUDIT_TRAIl_7_1 IS
<multilinecomment>AUDIT TRAIL: 7.1
1. Signoff.....Anandhi Pitchai   20/Feb/2005
   Defect......76363
   Problem......It is possible on SLARDEF to define a Room Number that is 
                10-characters. The Schedule Form [SSASECT] will accept this 10-character
                Room Number without error. However, the Schedule/Bill Rules Form was 
                not modified to give an option of printing a 10-character room number. 
                Currently, the process only prints the first five characters.
   Fix..........Add New database column TBBSBRL_ROOM_LNTH and provide drop-down that allows 
                the user to choose to include 5-6-7-8-9- or 10 characters for the Room.
                Modify the length of TBBSBRL_ROOM_HDNG in DB and the form.
                Modify copy_lengths, recalc_columns , and when_checkbox_changed of tbbsbrl_room_code_ind
AUDIT TRAIL END </multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:1444
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail71()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_NLS_DATE_SUPPORT
	
	PROCEDURE AUDIT_TRAIL_NLS_DATE_SUPPORT IS
-- AUDIT TRAIL: NLS_DATE_SUPPORT 
-- 1. TGKinderman   11/11/2005
--    This object was passed through a conversion process relative to preparing
--    the object to support internationalization needs.  Basically, hard coded
--    date format masks of DD-MON-YYYY are converted to a G$_DATE function that
--    returns nls_date_format.  The release number of this object was NOT
--    modified as part of this effort.  This object may or may not have had 
--    conversion process code modifications.  However, this audit trail entry
--    does indicate that the object has been passed through the conversion.
-- AUDIT TRAIL END
-- 
BEGIN
  NULL;
END AUDIT_TRAIL_NLS_DATE_SUPPORT;

	*/
	//ID:1445
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailNlsDateSupport()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0_I18N
	
	PROCEDURE AUDIT_TRAIL_8_0_I18N IS 
<multilinecomment> 
AUDIT TRAIL: 8.0 I18N 
1. Michael Hitrik  06/29/2007
   This form has been modified to increase the bio-demographics fields 
   to support internationalization requirements. 
   Added the G$_CHAR_FIELD_CLASS or G$_CHAR_MULTILINE_FIELD_CLASS Property Class to support internationalization requirements. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:1446
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail80I18n()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_1
	
	PROCEDURE AUDIT_TRAIL_8_1 IS 
<multilinecomment> 
AUDIT TRAIL: 8.1 
1. Lan Nguyen  04/16/2009
   RPE# 1-4US9HN - I18N Expose Field. 
AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:1447
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail81()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : TSASBRL
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Mon Jan 09 11:10:47 2012
-- MSGSIGN : #021699eb55f6bfa9
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:1448
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_4
	
	PROCEDURE AUDIT_TRAIL_8_4 IS 
<multilinecomment> 
AUDIT TRAIL: 8.4 
1. Shalini Jha  25/10/2011
   Enrollment Peroid Enhancement.
   1. Removed "Process Financial Aid" checkbox.
   2. Added Print Financial Aid Memos ind.
   3. Changed label "Process Contract, Exemption, Deposits" to 
   "Print Contract and Exemption Memos" to reflect what the indicator actually does. 
   4. Modify autohint to "Check to Print Contract and Exemption Memos. 
   5. Add new indicator called "Print Other Memos". 
   6. Add new indicator called "Print Note on Enrollment Period bill indicating terms 
   included in Enrollment Period".  
   7. Add new indicator called "Other Memos affect Amount Due". 
   8. Add New section called "Enrollment Period Dates by Term"

AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:1449
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail84()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_5
	
	PROCEDURE AUDIT_TRAIL_8_5 IS
<multilinecomment> 
AUDIT TRAIL: 8.5 
1. Shalini Jha  04/06/2014
   Adding columns TBBSBRL_PRINT_OTHER_MEMOS and TBBSBRL_OTHER_MEMO_AFFECT_DUE

AUDIT TRAIL END 
</multilinecomment> 
BEGIN 
  NULL; 
END;
	*/
	//ID:1450
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail85()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_SEAMLESS_NAV
	
	PROCEDURE AUDIT_TRAIL_SEAMLESS_NAV IS

<multilinecomment>

AUDIT TRAIL: SEAMLESS NAVIGATION ENHANCEMENT UTILITY

1.	Seamless Navigation Enhancement Utility ver 1.0  Jul-01-2014

    Trigger SAVE_KEYS modified to support mapping Banner8/Banner9 global variable metadata

AUDIT TRAIL END

</multilinecomment>

BEGIN

null;

END;
	*/
	//ID:1451
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailSeamlessNav()
		{
		}

	
	

}
