package net.hedtech.las.studemre.banner.student.Svacimp.services;

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


import net.hedtech.las.studemre.banner.student.Svacimp.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.las.studemre.banner.student.Svacimp.model.*;



public class SvacimpServices extends AbstractSupportCodeObject{
	
	
	public SvacimpServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public SvacimpTask  getTask() {
		return (SvacimpTask )super.getContainer();
	}

	
	public net.hedtech.las.studemre.banner.student.Svacimp.model.SvacimpModel getFormModel() {
		return getTask().getModel();
	}

	/* Original PL/SQL code for Prog Unit CHK_PROCESS_CODE
	
	FUNCTION CHK_PROCESS_CODE(PROCESS_CODE varchar2) RETURN BOOLEAN IS
--
  CURSOR CHK_GKVSQPR_CODE IS
  SELECT '0'
    FROM GKVSQPR
   WHERE TRUNC(GKVSQPR_START_DATE) <= TRUNC(SYSDATE)
     AND TRUNC(NVL(GKVSQPR_END_DATE,TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099', 'DD-MM-YYYY'),G$_DATE.GET_NLS_DATE_FORMAT))) >= TRUNC(SYSDATE)
     AND GKVSQPR_CODE = PROCESS_CODE;
--
  hold_value varchar2(1);
 
BEGIN
  OPEN  CHK_GKVSQPR_CODE;
  FETCH CHK_GKVSQPR_CODE INTO hold_value;
--
  IF  CHK_GKVSQPR_CODE%FOUND THEN
  	  CLOSE CHK_GKVSQPR_CODE;
      RETURN TRUE;
  ELSE
  	  CLOSE CHK_GKVSQPR_CODE;
      RETURN FALSE;
  END IF;
RETURN NULL;
END;
	*/
	//ID:765
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param processCode
		*/
		public NBool chkProcessCode(NString processCode)
		{
			int rowCount = 0;
			String sqlchkGkvsqprCode = "SELECT '0' " +
	" FROM GKVSQPR " +
	" WHERE TRUNC(GKVSQPR_START_DATE) <= TRUNC(SYSDATE) AND TRUNC(NVL(GKVSQPR_END_DATE, TO_DATE(G$_DATE.NORMALISE_GREG_DATE('31-12-2099', 'DD-MM-YYYY'), G$_DATE.GET_NLS_DATE_FORMAT))) >= TRUNC(SYSDATE) AND GKVSQPR_CODE = :P_PROCESS_CODE ";
			DataCursor chkGkvsqprCode = new DataCursor(sqlchkGkvsqprCode);
			// 
			NString holdValue= NString.getNull();
			try {
				//Setting query parameters
				chkGkvsqprCode.addParameter("P_PROCESS_CODE", processCode);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable chkGkvsqprCode.
				chkGkvsqprCode.open();
				ResultSet chkGkvsqprCodeResults = chkGkvsqprCode.fetchInto();
				if ( chkGkvsqprCodeResults != null ) {
					holdValue = chkGkvsqprCodeResults.getStr(0);
				}
				// 
				if ( chkGkvsqprCode.found() )
				{
					chkGkvsqprCode.close();
					return  toBool( toBool(NBool.True));
				}
				else {
					chkGkvsqprCode.close();
					return  toBool( toBool(NBool.False));
				}
				return  toBool(NBool.getNull());
				}finally{
					chkGkvsqprCode.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit GET_PROCESS_DESC
	
	FUNCTION GET_PROCESS_DESC(PROCESS_CODE varchar2) RETURN varchar2 IS

HOLD_DESC GKVSQPR.GKVSQPR_DESC%TYPE;

CURSOR GET_GKVSQPR_DESC IS
SELECT GKVSQPR_DESC
  FROM GKVSQPR
 WHERE GKVSQPR_CODE = :KEY_BLOCK.PROCESS_CODE;

BEGIN
  OPEN  GET_GKVSQPR_DESC;
  FETCH GET_GKVSQPR_DESC INTO HOLD_DESC;
  CLOSE GET_GKVSQPR_DESC;
--
  RETURN HOLD_DESC;
END;
	*/
	//ID:766
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param processCode
		*/
		public NString getProcessDesc(NString processCode)
		{
			int rowCount = 0;
			NString holdDesc= NString.getNull();
			String sqlgetGkvsqprDesc = "SELECT GKVSQPR_DESC " +
	" FROM GKVSQPR " +
	" WHERE GKVSQPR_CODE = :KEY_BLOCK_PROCESS_CODE ";
			DataCursor getGkvsqprDesc = new DataCursor(sqlgetGkvsqprDesc);
			try {
				//Setting query parameters
				getGkvsqprDesc.addParameter("KEY_BLOCK_PROCESS_CODE", getFormModel().getKeyBlock().getProcessCode());
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable getGkvsqprDesc.
				getGkvsqprDesc.open();
				ResultSet getGkvsqprDescResults = getGkvsqprDesc.fetchInto();
				if ( getGkvsqprDescResults != null ) {
					holdDesc = getGkvsqprDescResults.getStr(0);
				}
				getGkvsqprDesc.close();
				// 
				return  toStr(holdDesc);
				}finally{
					getGkvsqprDesc.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_0
	
	PROCEDURE AUDIT_TRAIL_8_0 IS
<multilinecomment> 
AUDIT TRAIL: 8.0 
1. GRS 23/SEPT/2014
Initial Version of the form.    
AUDIT TRAIL END 
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:767
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail80()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : SVACIMP
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Wed May 13 18:37:02 2015
-- MSGSIGN : #2399644198101dd4
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:768
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_SEAMLESS_NAV
	
	PROCEDURE AUDIT_TRAIL_SEAMLESS_NAV IS

<multilinecomment>

AUDIT TRAIL: SEAMLESS NAVIGATION ENHANCEMENT UTILITY

1.	Seamless Navigation Enhancement Utility ver 1.0  Sep-29-2014

    Trigger SAVE_KEYS modified to support mapping Banner8/Banner9 global variable metadata

AUDIT TRAIL END

</multilinecomment>

BEGIN

null;

END;
	*/
	//ID:769
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailSeamlessNav()
		{
		}

	
	/* Original PL/SQL code for Prog Unit COPYRIGHT
	
	PROCEDURE COPYRIGHT IS
<multilinecomment>*************************************************************</multilinecomment> 
<multilinecomment> SVACIMP.FMB Copyright 2014 Ellucian. All Rights Reserved. </multilinecomment>
<multilinecomment>****************************************************************</multilinecomment> 
BEGIN
  null;
END;
	*/
	//ID:770
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void copyright()
		{
		}

	
	

}
