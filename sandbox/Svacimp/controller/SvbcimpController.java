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

public class SvbcimpController extends DefaultBlockController {

    public SvbcimpController(IFormController parentController, String name) {
        super(parentController, name);
    }

    @Override
    public SvacimpTask getTask() {
        return (SvacimpTask) super.getTask();
    }

    public SvacimpModel getFormModel() {
        return this.getTask().getModel();
    }

    //action methods generated from triggers
    /* Original PL/SQL code code for TRIGGER SVBCIMP.KEY-PRVBLK
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;
		*/
    /*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVBCIMP.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
    @ActionTrigger(action = "KEY-PRVBLK", function = KeyFunction.PREVIOUS_BLOCK)
    public void svbcimp_PreviousBlock() {
        executeAction("INVALID_FUNCTION_MSG");
        getTask().getGoqrpls().gCheckFailure();
    }

    /* Original PL/SQL code code for TRIGGER SVBCIMP.KEY-NXTBLK
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;
		*/
    /*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVBCIMP.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
    @ActionTrigger(action = "KEY-NXTBLK", function = KeyFunction.NEXT_BLOCK)
    public void svbcimp_NextBlock() {
        executeAction("INVALID_FUNCTION_MSG");
        getTask().getGoqrpls().gCheckFailure();
    }

    /* Original PL/SQL code code for TRIGGER SVBCIMP.PRE-UPDATE
		 :SVBCIMP.SVBCIMP_ACTIVITY_DATE := SYSDATE;
:SVBCIMP.SVBCIMP_USER_ID := :GLOBAL.CURRENT_USER;
		*/
    /*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVBCIMP.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
    @BeforeRowUpdate
    public void svbcimp_BeforeRowUpdate(RowAdapterEvent args) {
        SvbcimpAdapter svbcimpElement = (SvbcimpAdapter) args.getRow();
        svbcimpElement.setSvbcimpActivityDate(DbManager.getDBDateTime());
        svbcimpElement.setSvbcimpUserId(getGlobal("CURRENT_USER"));
    }

    /* Original PL/SQL code code for TRIGGER SVBCIMP.PRE-INSERT
		 :SVBCIMP.SVBCIMP_ACTIVITY_DATE := SYSDATE;
:SVBCIMP.SVBCIMP_USER_ID := :GLOBAL.CURRENT_USER;
		*/
    /*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVBCIMP.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
    @BeforeRowInsert
    public void svbcimp_BeforeRowInsert(RowAdapterEvent args) {
        SvbcimpAdapter svbcimpElement = (SvbcimpAdapter) args.getRow();
        svbcimpElement.setSvbcimpActivityDate(DbManager.getDBDateTime());
        svbcimpElement.setSvbcimpUserId(getGlobal("CURRENT_USER"));
    }

    /* Original PL/SQL code code for TRIGGER SVBCIMP.POST-QUERY
		 IF NVL(:SVBCIMP.SVBCIMP_SYSTEM_REQ_IND,'N') = 'Y' THEN
	EXECUTE_TRIGGER('DISABLE_DEFAULTS_FIELDS');
	G$_CHECK_FAILURE;
ELSE
	EXECUTE_TRIGGER('ENABLE_DEFAULTS_FIELDS');
	G$_CHECK_FAILURE;

END IF;
		*/
    /*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVBCIMP.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/
    @AfterQuery
    public void svbcimp_AfterQuery(RowAdapterEvent args) {
        SvbcimpAdapter svbcimpElement = (SvbcimpAdapter) args.getRow();
        try {
            svbcimpElement.setLockDbValues(true);
            try {
                this.svbcimpDirectory_PostChange();
            } catch (Exception ex) {
            }
        } finally {
            svbcimpElement.setLockDbValues(false);
        }
        if (isNull(svbcimpElement.getSvbcimpSystemReqInd(), "N").equals("Y")) {
            executeAction("DISABLE_DEFAULTS_FIELDS");
            getTask().getGoqrpls().gCheckFailure();
        } else {
            executeAction("ENABLE_DEFAULTS_FIELDS");
            getTask().getGoqrpls().gCheckFailure();
        }
    }

    /* Original PL/SQL code code for TRIGGER SVBCIMP.ON-DELETE
		 BEGIN
	sv_load_file_definition.p_delete(p_sqpr_code => :svbcimp.svbcimp_sqpr_code,
	                                 p_rowid     =>:SVBCIMP.ROWID
	                                 );
EXCEPTION
  WHEN OTHERS THEN
    G$_DISPLAY_ERR_MSG(SQLERRM);
    RAISE FORM_TRIGGER_FAILURE;
	
END;	
		*/
    /*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVBCIMP.ON-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/
    @RowDelete
    public void svbcimp_RowDelete(RowAdapterEvent args) {
        SvbcimpAdapter svbcimpElement = (SvbcimpAdapter) args.getRow();
        try {
            // F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
            // F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
            SvLoadFileDefinition.pDelete(/*pSqprCode=>*/
            svbcimpElement.getSvbcimpSqprCode(), svbcimpElement.getROWID());
        } catch (Exception e) {
            getTask().getGoqrpls().gDisplayErrMsg(errorMessage());
            throw new  ApplicationException();
        }
    }

    /* Original PL/SQL code code for TRIGGER SVBCIMP.ON-INSERT
		 BEGIN
  sv_load_file_definition.p_create(
    p_sqpr_code           =>    :svbcimp.svbcimp_sqpr_code,
    p_system_req_ind      =>    :svbcimp.svbcimp_system_req_ind,
    p_external_tablename  =>    :svbcimp.svbcimp_external_tablename,
    p_record_delimiter    =>    :svbcimp.svbcimp_record_delimiter,
    p_fields              =>    :svbcimp.svbcimp_fields,
    p_field_delimiter     =>    :svbcimp.svbcimp_field_delimiter,
    p_definition_year     =>    :svbcimp.SVBCIMP_DEFINITION_YEAR,
    p_incl_file_name_ind  =>    :svbcimp.svbcimp_incl_file_name_ind,
    p_directory           =>    :svbcimp.svbcimp_directory,
    p_filename            =>    :svbcimp.svbcimp_filename,
    p_load_when           =>    :svbcimp.svbcimp_load_when,
    p_file_length         =>    :svbcimp.svbcimp_file_length,
    p_user_id             =>    :svbcimp.svbcimp_user_id,
    p_data_origin         =>    'SVACIMP',
    p_rowid_out           =>   :SVBCIMP.ROWID);
    
EXCEPTION
  WHEN OTHERS THEN
    G$_DISPLAY_ERR_MSG(SQLERRM);
    RAISE FORM_TRIGGER_FAILURE;
END; 
    
		*/
    /*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVBCIMP.ON-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/
    @RowInsert
    public void svbcimp_RowInsert(RowAdapterEvent args) {
        SvbcimpAdapter svbcimpElement = (SvbcimpAdapter) args.getRow();
        try {
            // F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
            // F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
            SvLoadFileDefinition.pCreate(/*pSqprCode=>*/
            svbcimpElement.getSvbcimpSqprCode(), /*pSystemReqInd=>*/
            svbcimpElement.getSvbcimpSystemReqInd(), /*pExternalTablename=>*/
            svbcimpElement.getSvbcimpExternalTablename(), /*pRecordDelimiter=>*/
            svbcimpElement.getSvbcimpRecordDelimiter(), svbcimpElement.getSvbcimpFields(), /*pFieldDelimiter=>*/
            svbcimpElement.getSvbcimpFieldDelimiter(), /*pDefinitionYear=>*/
            svbcimpElement.getSvbcimpDefinitionYear(), /*pInclFileNameInd=>*/
            svbcimpElement.getSvbcimpInclFileNameInd(), svbcimpElement.getSvbcimpDirectory(), svbcimpElement.getSvbcimpFilename(), /*pLoadWhen=>*/
            toNumber(svbcimpElement.getSvbcimpLoadWhen()), /*pFileLength=>*/
            toStr(svbcimpElement.getSvbcimpFileLength()), /*pUserId=>*/
            toDate(svbcimpElement.getSvbcimpUserId()), /*pRowidOut=>*/
            "SVACIMP", svbcimpElement.getROWID());
        } catch (Exception e) {
            getTask().getGoqrpls().gDisplayErrMsg(errorMessage());
            throw new  ApplicationException();
        }
    }

    /* Original PL/SQL code code for TRIGGER SVBCIMP.PRE-DELETE
		 IF  :SVBCIMP.SVBCIMP_SYSTEM_REQ_IND  = 'Y' THEN
    Message( G$_NLS.Get('SVACIMP-0005', 'FORM','*ERROR* You can not delete this record; Definition is being used by the System.') );
    RAISE FORM_TRIGGER_FAILURE;
END IF;
		*/
    /*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVBCIMP.PRE-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/
    @BeforeRowDelete
    public void svbcimp_BeforeRowDelete(RowAdapterEvent args) {
        SvbcimpAdapter svbcimpElement = (SvbcimpAdapter) args.getRow();
        if (svbcimpElement.getSvbcimpSystemReqInd().equals("Y")) {
            errorMessage(GNls.Fget(toStr("SVACIMP-0005"), toStr("FORM"), toStr("*ERROR* You can not delete this record; Definition is being used by the System.")));
            throw new  ApplicationException();
        }
    }

    /* Original PL/SQL code code for TRIGGER SVBCIMP.ON-UPDATE
		 BEGIN
  sv_load_file_definition.p_update(
    p_sqpr_code           =>    :svbcimp.svbcimp_sqpr_code,
    p_system_req_ind      =>    :svbcimp.svbcimp_system_req_ind,
    p_external_tablename  =>    :svbcimp.svbcimp_external_tablename,
    p_record_delimiter    =>    :svbcimp.svbcimp_record_delimiter,
    p_fields              =>    :svbcimp.svbcimp_fields,
    p_field_delimiter     =>    :svbcimp.svbcimp_field_delimiter,
    p_definition_year     =>    :svbcimp.SVBCIMP_DEFINITION_YEAR,
    p_incl_file_name_ind  =>    :svbcimp.svbcimp_incl_file_name_ind,
    p_directory           =>    :svbcimp.svbcimp_directory,
    p_filename            =>    :svbcimp.svbcimp_filename,
    p_load_when           =>    :svbcimp.svbcimp_load_when,
    p_file_length         =>    :svbcimp.svbcimp_file_length,
    p_user_id             =>    :svbcimp.svbcimp_user_id,
    p_data_origin         =>    'SVACIMP',
    p_rowid               =>   :SVBCIMP.ROWID);
    
EXCEPTION
  WHEN OTHERS THEN
    G$_DISPLAY_ERR_MSG(SQLERRM);
    RAISE FORM_TRIGGER_FAILURE;
END; 

		*/
    /*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVBCIMP.ON-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/
    @RowUpdate
    public void svbcimp_RowUpdate(RowAdapterEvent args) {
        SvbcimpAdapter svbcimpElement = (SvbcimpAdapter) args.getRow();
        try {
            // F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
            // F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
            SvLoadFileDefinition.pUpdate(/*pSqprCode=>*/
            svbcimpElement.getSvbcimpSqprCode(), /*pSystemReqInd=>*/
            svbcimpElement.getSvbcimpSystemReqInd(), /*pExternalTablename=>*/
            svbcimpElement.getSvbcimpExternalTablename(), /*pRecordDelimiter=>*/
            svbcimpElement.getSvbcimpRecordDelimiter(), svbcimpElement.getSvbcimpFields(), /*pFieldDelimiter=>*/
            svbcimpElement.getSvbcimpFieldDelimiter(), /*pDefinitionYear=>*/
            svbcimpElement.getSvbcimpDefinitionYear(), /*pInclFileNameInd=>*/
            svbcimpElement.getSvbcimpInclFileNameInd(), svbcimpElement.getSvbcimpDirectory(), svbcimpElement.getSvbcimpFilename(), /*pLoadWhen=>*/
            toNumber(svbcimpElement.getSvbcimpLoadWhen()), /*pFileLength=>*/
            toStr(svbcimpElement.getSvbcimpFileLength()), /*pUserId=>*/
            toDate(svbcimpElement.getSvbcimpUserId()), /*pRowid=>*/
            "SVACIMP", svbcimpElement.getROWID());
        } catch (Exception e) {
            getTask().getGoqrpls().gDisplayErrMsg(errorMessage());
            throw new  ApplicationException();
        }
    }

    /* Original PL/SQL code code for TRIGGER SVBCIMP.UPDATE_LOADED_FIELDS
		 BEGIN
:SYSTEM.MESSAGE_LEVEL := '5';
:SVBCIMP_LAST_LOADED_FILE:= :SVBCIMP_FILENAME;
:SVBCIMP_LOADED_FILE_DATE := SYSDATE;

UPDATE SVBCIMP
SET SVBCIMP_LAST_LOADED_FILE = :SVBCIMP_LAST_LOADED_FILE,
    SVBCIMP_LOADED_FILE_DATE = :SVBCIMP_LOADED_FILE_DATE
WHERE  SVBCIMP_SQPR_CODE = :PROCESS_CODE  ;



END;
		*/
    /*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVBCIMP.UPDATE_LOADED_FIELDS
		 *
		 *
		 *</p>
		*/
    @ActionTrigger(action = "UPDATE_LOADED_FIELDS")
    public void svbcimp_UpdateLoadedFields() {
        //F2J_WARNING : Caution, the variable may be null.
        SvbcimpAdapter svbcimpElement = (SvbcimpAdapter) this.getFormModel().getSvbcimp().getRowAdapter(true);
        int rowCount = 0;
        // F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
        MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
        svbcimpElement.setSvbcimpLastLoadedFile(svbcimpElement.getSvbcimpFilename());
        svbcimpElement.setSvbcimpLoadedFileDate(DbManager.getDBDateTime());
        String sql1 = "UPDATE SVBCIMP " + "SET SVBCIMP_LAST_LOADED_FILE = :SVBCIMP_LAST_LOADED_FILE, SVBCIMP_LOADED_FILE_DATE = :SVBCIMP_LOADED_FILE_DATE " + " WHERE SVBCIMP_SQPR_CODE = :PROCESS_CODE";
        DataCommand command1 = new  DataCommand(sql1);
        //Setting query parameters
        command1.addParameter("SVBCIMP_LAST_LOADED_FILE", svbcimpElement.getSvbcimpLastLoadedFile());
        command1.addParameter("SVBCIMP_LOADED_FILE_DATE", svbcimpElement.getSvbcimpLoadedFileDate());
        command1.addParameter("PROCESS_CODE", getFormModel().getKeyBlock().getProcessCode());
        rowCount = command1.execute();
    }

    /* Original PL/SQL code code for TRIGGER SVBCIMP.CREATE_HISTORY_RECORD
		 DECLARE
	CURSOR SVRCIMH_SEQ_C IS
  SELECT nvl(MAX(svrcimh_seq_num),0) + 1
	FROM SVRCIMH
	WHERE svrcimh_sqpr_code = :PROCESS_CODE;
		
lv_seq_no SVRCIMH.svrcimh_seq_num%TYPE;
lv_rowid   gb_common.internal_record_id_type;
	
BEGIN
	OPEN SVRCIMH_SEQ_C;
	FETCH SVRCIMH_SEQ_C INTO lv_seq_no;
	CLOSE SVRCIMH_SEQ_C;
	
	sv_load_history.p_create(
    p_seq_num            =>  lv_seq_no ,
    p_sqpr_code          => :PROCESS_CODE,
    p_definition_year    => :SVBCIMP.SVBCIMP_DEFINITION_YEAR,
    p_filename    =>  :SVBCIMP_FILENAME,
    p_user_id      => USER,
    p_data_origin  => 'SVACIMP',
    p_rowid_out  =>    lv_rowid  );
    
    COMMIT;
	:SYSTEM.MESSAGE_LEVEL := '0';
EXCEPTION
  WHEN OTHERS THEN
    G$_DISPLAY_ERR_MSG(SQLERRM);
    RAISE FORM_TRIGGER_FAILURE;
END; 

		*/
    /*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVBCIMP.CREATE_HISTORY_RECORD
		 *
		 *
		 *</p>
		*/
    @ActionTrigger(action = "CREATE_HISTORY_RECORD")
    public void svbcimp_CreateHistoryRecord() {
        //F2J_WARNING : Caution, the variable may be null.
        SvbcimpAdapter svbcimpElement = (SvbcimpAdapter) this.getFormModel().getSvbcimp().getRowAdapter(true);
        int rowCount = 0;
        {
            String sqlsvrcimhSeqC = "SELECT nvl(MAX(svrcimh_seq_num), 0) + 1 " + " FROM SVRCIMH " + " WHERE svrcimh_sqpr_code = :PROCESS_CODE ";
            DataCursor svrcimhSeqC = new  DataCursor(sqlsvrcimhSeqC);
            NNumber lvSeqNo = NNumber.getNull();
            UnknownTypes.GbCommonInternalRecordIdType lvRowid = null;
            try {
                try {
                    //Setting query parameters
                    svrcimhSeqC.addParameter("PROCESS_CODE", getFormModel().getKeyBlock().getProcessCode());
                    //F2J_WARNING : Make sure that the method "Close" is being called over the variable svrcimhSeqC.
                    svrcimhSeqC.open();
                    ResultSet svrcimhSeqCResults = svrcimhSeqC.fetchInto();
                    if (svrcimhSeqCResults != null) {
                        lvSeqNo = svrcimhSeqCResults.getNumber(0);
                    }
                    svrcimhSeqC.close();
                    // F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
                    Ref<NString> p_rowid_out_ref = new  Ref<NString>(lvRowid);
                    /*pSeqNum=>*/
                    SvLoadHistory.pCreate(/*pSqprCode=>*/
                    lvSeqNo, getFormModel().getKeyBlock().getProcessCode(), svbcimpElement.getSvbcimpDefinitionYear(), svbcimpElement.getSvbcimpFilename(), /*pDataOrigin=>*/
                    getUser(), "SVACIMP", p_rowid_out_ref);
                    lvRowid = p_rowid_out_ref.val;
                    commitTask();
                    // F2J_WARNING : Please validate if you need to surround the message level manipulation with a try/finally block
                    MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
                } catch (Exception e) {
                    getTask().getGoqrpls().gDisplayErrMsg(errorMessage());
                    throw new  ApplicationException();
                }
            } finally {
                svrcimhSeqC.close();
            }
        }
    }

    /* Original PL/SQL code code for TRIGGER SVBCIMP.VALIDATE_FILE_NAME
		 DECLARE
	CURSOR SVRCIMH_C IS
	SELECT 'Y'
	FROM SVRCIMH
	WHERE svrcimh_sqpr_code = :PROCESS_CODE
	AND  svrcimh_filename = :SVBCIMP_FILENAME
	AND  svrcimh_definition_year =  :SVBCIMP.SVBCIMP_DEFINITION_YEAR ;
	
	lv_file_is_loaded VARCHAR2(1):='N';
	ALERT_ID      ALERT; 
  ALERT_BUTTON  NUMBER;	

BEGIN
	OPEN SVRCIMH_C;
	FETCH SVRCIMH_C INTO lv_file_is_loaded;
	CLOSE SVRCIMH_C;
	
	IF lv_file_is_loaded = 'Y' THEN
	  SET_ALERT_PROPERTY ('G$_CAUTION_ALERT', ALERT_MESSAGE_TEXT, G$_NLS.Get('SVACIMP-0006', 'FORM','The file that you are trying to import has been already imported for this year.Are you sure you want to re-import it?'));
    ALERT_BUTTON := SHOW_ALERT ('G$_CAUTION_ALERT');
    IF ALERT_BUTTON = ALERT_BUTTON2 THEN    --If cancel do not import the file 
       -- :REIMPORT_FILE='N';
         RAISE FORM_TRIGGER_FAILURE ;
    END IF;    
	END IF;
END;	

		*/
    /*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVBCIMP.VALIDATE_FILE_NAME
		 *
		 *
		 *</p>
		*/
    @ActionTrigger(action = "VALIDATE_FILE_NAME")
    public void svbcimp_ValidateFileName() {
        //F2J_WARNING : Caution, the variable may be null.
        SvbcimpAdapter svbcimpElement = (SvbcimpAdapter) this.getFormModel().getSvbcimp().getRowAdapter(true);
        int rowCount = 0;
        {
            String sqlsvrcimhC = "SELECT 'Y' " + " FROM SVRCIMH " + " WHERE svrcimh_sqpr_code = :PROCESS_CODE AND svrcimh_filename = :SVBCIMP_FILENAME AND svrcimh_definition_year = :SVBCIMP_SVBCIMP_DEFINITION_YEAR ";
            DataCursor svrcimhC = new  DataCursor(sqlsvrcimhC);
            NString lvFileIsLoaded = toStr("N");
            AlertDescriptor alertId = null;
            NNumber alertButton = NNumber.getNull();
            try {
                //Setting query parameters
                svrcimhC.addParameter("PROCESS_CODE", getFormModel().getKeyBlock().getProcessCode());
                svrcimhC.addParameter("SVBCIMP_FILENAME", svbcimpElement.getSvbcimpFilename());
                svrcimhC.addParameter("SVBCIMP_SVBCIMP_DEFINITION_YEAR", svbcimpElement.getSvbcimpDefinitionYear());
                //F2J_WARNING : Make sure that the method "Close" is being called over the variable svrcimhC.
                svrcimhC.open();
                ResultSet svrcimhCResults = svrcimhC.fetchInto();
                if (svrcimhCResults != null) {
                    lvFileIsLoaded = svrcimhCResults.getStr(0);
                }
                svrcimhC.close();
                if (lvFileIsLoaded.equals("Y")) {
                    setAlertMessageText("G$_CAUTION_ALERT", GNls.Fget(toStr("SVACIMP-0006"), toStr("FORM"), toStr("The file that you are trying to import has been already imported for this year.Are you sure you want to re-import it?")));
                    alertButton = toNumber(showAlert("G$_CAUTION_ALERT"));
                    if (alertButton.equals(MessageServices.BUTTON2)) {
                        //  :REIMPORT_FILE='N';
                        throw new  ApplicationException();
                    }
                }
            } finally {
                svrcimhC.close();
            }
        }
    }

    /* Original PL/SQL code code for TRIGGER SVBCIMP.VALIDATE_EXT_TABLE
		 DECLARE
	lv_message_out varchar2(4000);
BEGIN
   IF NOT svkcimp.F_VALIDATE_EXT_TABLE (P_TABLE_NAME=> :SVBCIMP_EXTERNAL_TABLENAME, 
   	                                    MESSAGEOUT=> lv_message_out
   	                                    )
   THEN   	                                    
     :REGISTERFILE_MESSAGEOUT	:= lv_message_out;
     RAISE FORM_TRIGGER_FAILURE;
	 
   ELSE
   	 :REGISTERFILE_MESSAGEOUT	:= lv_message_out;
	 
	 END IF;
	  
END;	
		*/
    /*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVBCIMP.VALIDATE_EXT_TABLE
		 *
		 *
		 *</p>
		*/
    //		@ActionTrigger(action="VALIDATE_EXT_TABLE")
    //		public void svbcimp_ValidateExtTable()
    //		{
    //			
    //
    //				//F2J_WARNING : Caution, the variable may be null.
    //				SvbcimpAdapter svbcimpElement = (SvbcimpAdapter)this.getFormModel().getSvbcimp().getRowAdapter(true);
    //
    //
    //				{
    //					NString lvMessageOut= NString.getNull();
    //					// F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
    //					if ( !Svkcimp.fValidateExtTable(/*pTableName=>*/svbcimpElement.getSvbcimpExternalTablename(), /*messageout=>*/lvMessageOut) )
    //					{
    //						svbcimpElement.setRegisterfileMessageout(lvMessageOut);
    //						throw new ApplicationException();
    //					}
    //					else {
    //						svbcimpElement.setRegisterfileMessageout(lvMessageOut);
    //					}
    //				}
    //			}
    /*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVBCIMP.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/
    /* Original PL/SQL code code for TRIGGER SVBCIMP_DIRECTORY.WHEN-VALIDATE-ITEM
		 DECLARE
	CURSOR DIR_C IS SELECT 'Y',directory_path FROM all_directories  WHERE directory_name = :SVBCIMP_DIRECTORY;
  dummy VARCHAR2(1) := 'N';
BEGIN
	IF :SVBCIMP_DIRECTORY IS NOT NULL THEN
		OPEN DIR_C;
		FETCH DIR_C INTO dummy, :REGISTERFILE_PATH;
		CLOSE DIR_C;
		IF dummy <> 'Y' THEN
        MESSAGE(G$_NLS.GET('SVACIMP-0007','FORM','*ERROR* Invalid directory name.'));
        RAISE FORM_TRIGGER_FAILURE;
		END IF;
	END IF;
END;

		*/
    /*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVBCIMP_DIRECTORY.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/
    @ValidationTrigger(item = "SVBCIMP_DIRECTORY")
    public void svbcimpDirectory_validate() {
        //F2J_WARNING : Caution, the variable may be null.
        SvbcimpAdapter svbcimpElement = (SvbcimpAdapter) this.getFormModel().getSvbcimp().getRowAdapter(true);
        int rowCount = 0;
        this.svbcimpDirectory_PostChange();
        {
            String sqldirC = "SELECT 'Y', directory_path " + " FROM all_directories " + " WHERE directory_name = :SVBCIMP_DIRECTORY ";
            DataCursor dirC = new  DataCursor(sqldirC);
            NString dummy = toStr("N");
            try {
                if (!svbcimpElement.getSvbcimpDirectory().isNull()) {
                    //Setting query parameters
                    dirC.addParameter("SVBCIMP_DIRECTORY", svbcimpElement.getSvbcimpDirectory());
                    //F2J_WARNING : Make sure that the method "Close" is being called over the variable dirC.
                    dirC.open();
                    ResultSet dirCResults = dirC.fetchInto();
                    if (dirCResults != null) {
                        dummy = dirCResults.getStr(0);
                        svbcimpElement.setRegisterfilePath(dirCResults.getStr(1));
                    }
                    dirC.close();
                    if (dummy.notEquals("Y")) {
                        errorMessage(GNls.Fget(toStr("SVACIMP-0007"), toStr("FORM"), toStr("*ERROR* Invalid directory name.")));
                        throw new  ApplicationException();
                    }
                }
            } finally {
                dirC.close();
            }
        }
    }

    /* Original PL/SQL code code for TRIGGER SVBCIMP_DIRECTORY.KEY-NEXT-ITEM
		 DECLARE
	l_var VARCHAR2(2) := '%';
BEGIN
--F2J_TODO: not supported key word 'escape'
	IF :SVBCIMP.SVBCIMP_DIRECTORY LIKE '%!%%' <multilinecomment>escape'!'</multilinecomment> THEN
			G$_DISPLAY_LOV('SVBCIMP.SVBCIMP_DIRECTORY','DIRECTORY_LOV','N');
			G$_CHECK_FAILURE;
			IF ( :GLOBAL.VALUE IS NOT NULL ) THEN
			     :SVBCIMP.SVBCIMP_DIRECTORY := :GLOBAL.VALUE;
			
			END IF;
		
	END IF;
END;
NEXT_ITEM;


		*/
    /*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVBCIMP_DIRECTORY.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/
    @ActionTrigger(action = "KEY-NEXT-ITEM", item = "SVBCIMP_DIRECTORY", function = KeyFunction.NEXT_ITEM)
    public void svbcimpDirectory_keyNexItem() {
        //F2J_WARNING : Caution, the variable may be null.
        SvbcimpAdapter svbcimpElement = (SvbcimpAdapter) this.getFormModel().getSvbcimp().getRowAdapter(true);
        {
            NString lVar = toStr("%");
            // F2J_TODO: not supported key word 'escape'
            if (like(svbcimpElement.getSvbcimpDirectory(), "%!%%")) {
                getTask().getGoqrpls().gDisplayLov(toStr("SVBCIMP.SVBCIMP_DIRECTORY"), toStr("DIRECTORY_LOV"), toStr("N"));
                getTask().getGoqrpls().gCheckFailure();
                if ((!getGlobal("VALUE").isNull())) {
                    svbcimpElement.setSvbcimpDirectory(getGlobal("VALUE"));
                }
            }
        }
        nextItem();
    }

    /* Original PL/SQL code code for TRIGGER SVBCIMP_DIRECTORY.POST-CHANGE
		 DECLARE
	CURSOR DIR_C IS SELECT 'Y',directory_path FROM all_directories  WHERE directory_name = :SVBCIMP_DIRECTORY;
  dummy VARCHAR2(1) := 'N';
BEGIN
	IF :SVBCIMP_DIRECTORY IS NOT NULL THEN
		OPEN DIR_C;
		FETCH DIR_C INTO dummy, :REGISTERFILE_PATH;
		CLOSE DIR_C;
		IF dummy <> 'Y' THEN
        MESSAGE(G$_NLS.GET('SVACIMP-0008','FORM','*ERROR* Invalid directory name.'));
        RAISE FORM_TRIGGER_FAILURE;
		END IF;
	END IF;
END;

		*/
    /*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVBCIMP_DIRECTORY.POST-CHANGE
		 *
		 *
		 *</p>
		*/
    @ActionTrigger(action = "POST-CHANGE", item = "SVBCIMP_DIRECTORY")
    public void svbcimpDirectory_PostChange() {
        //F2J_WARNING : Caution, the variable may be null.
        SvbcimpAdapter svbcimpElement = (SvbcimpAdapter) this.getFormModel().getSvbcimp().getRowAdapter(true);
        int rowCount = 0;
        if (svbcimpElement.getSvbcimpDirectory().isNull())
            return;
        {
            String sqldirC = "SELECT 'Y', directory_path " + " FROM all_directories " + " WHERE directory_name = :SVBCIMP_DIRECTORY ";
            DataCursor dirC = new  DataCursor(sqldirC);
            NString dummy = toStr("N");
            try {
                if (!svbcimpElement.getSvbcimpDirectory().isNull()) {
                    //Setting query parameters
                    dirC.addParameter("SVBCIMP_DIRECTORY", svbcimpElement.getSvbcimpDirectory());
                    //F2J_WARNING : Make sure that the method "Close" is being called over the variable dirC.
                    dirC.open();
                    ResultSet dirCResults = dirC.fetchInto();
                    if (dirCResults != null) {
                        dummy = dirCResults.getStr(0);
                        svbcimpElement.setRegisterfilePath(dirCResults.getStr(1));
                    }
                    dirC.close();
                    if (dummy.notEquals("Y")) {
                        errorMessage(GNls.Fget(toStr("SVACIMP-0008"), toStr("FORM"), toStr("*ERROR* Invalid directory name.")));
                        throw new  ApplicationException();
                    }
                }
            } finally {
                dirC.close();
            }
        }
    }

    /* Original PL/SQL code code for TRIGGER SVBCIMP_DIRECTORY_LBT.WHEN-MOUSE-CLICK
		 BEGIN
  NULL;
END;
		*/
    /*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVBCIMP_DIRECTORY_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/
    @ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "SVBCIMP_DIRECTORY_LBT")
    @Before
    public void svbcimpDirectoryLbt_click() {
    }

    /* Original PL/SQL code code for TRIGGER REGISTERFILE_BUTTON.WHEN-MOUSE-CLICK
		 BEGIN
  NULL;
END;
		*/
    /*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * REGISTERFILE_BUTTON.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/
    @ActionTrigger(action = "WHEN-MOUSE-CLICK", item = "REGISTERFILE_BUTTON")
    @Before
    public void registerfileButton_click() {
    }

    /* Original PL/SQL code code for TRIGGER REGISTERFILE_BUTTON.WHEN-BUTTON-PRESSED
		 declare
	temp number;
	lv_temp_fields VARCHAR2(4000);
	lv_file_name   VARCHAR2(50) := '_FILE_NAME';
	
	
lv_file_length NUMBER:= 90;
lv_file_column VARCHAR2(30);
	
begin
	IF :SVBCIMP_EXTERNAL_TABLENAME IS NULL THEN
        MESSAGE(G$_NLS.GET('SVACIMP-0009','FORM','*ERROR* Enter external table name.'));
        GO_ITEM('SVBCIMP_EXTERNAL_TABLENAME');
        RAISE FORM_TRIGGER_FAILURE;
	ELSIF :SVBCIMP_DIRECTORY IS NULL THEN
        MESSAGE(G$_NLS.GET('SVACIMP-0010','FORM','*ERROR* Enter directory name.'));
        GO_ITEM('SVBCIMP_DIRECTORY');
        RAISE FORM_TRIGGER_FAILURE;
	ELSIF :SVBCIMP_FILENAME IS NULL THEN
        MESSAGE(G$_NLS.GET('SVACIMP-0011','FORM','*ERROR* Enter file name.'));
        GO_ITEM('SVBCIMP_FILENAME');
        RAISE FORM_TRIGGER_FAILURE;
	ELSIF :SVBCIMP_FILE_LENGTH IS NULL THEN
        MESSAGE(G$_NLS.GET('SVACIMP-0012','FORM','*ERROR* Enter file Length.'));
        GO_ITEM('SVBCIMP_FILE_LENGTH');
        RAISE FORM_TRIGGER_FAILURE;
	ELSIF :SVBCIMP_RECORD_DELIMITER IS NULL THEN
        MESSAGE(G$_NLS.GET('SVACIMP-0013','FORM','*ERROR* Enter record delimiter name.'));
        GO_ITEM('SVBCIMP_RECORD_DELIMITER');
        RAISE FORM_TRIGGER_FAILURE;
	ELSIF :SVBCIMP_FIELDS IS NULL THEN
        MESSAGE(G$_NLS.GET('SVACIMP-0014','FORM','*ERROR* Enter fields.'));
        GO_ITEM('SVBCIMP_FIELDS');
        RAISE FORM_TRIGGER_FAILURE;
  ELSIF  :SVBCIMP_DEFINITION_YEAR  IS NULL THEN
        MESSAGE(G$_NLS.GET('SVACIMP-0015','FORM','*ERROR* Enter the definition year.'));
        GO_ITEM('SVBCIMP_DEFINITION_YEAR');
        RAISE FORM_TRIGGER_FAILURE;
	ELSIF :SVBCIMP_FIELD_DELIMITER IS NULL THEN
        MESSAGE(G$_NLS.GET('SVACIMP-0016','FORM','*ERROR* Enter field delimiter.'));
        GO_ITEM('SVBCIMP_FIELD_DELIMITER');
        RAISE FORM_TRIGGER_FAILURE;
	ELSE   
   IF :SYSTEM.BLOCK_STATUS = 'CHANGED' THEN
  	MESSAGE( G$_NLS.Get('SVACIMP-0017', 'FORM','*ERROR* Must save your changes before Importing the File.'));
    RAISE FORM_TRIGGER_FAILURE ;
   END IF;
   
   :REIMPORT_FILE:='Y';
 
   EXECUTE_TRIGGER('VALIDATE_FILE_NAME');
   G$_CHECK_FAILURE;
	
	:registerfile_messageout:='';
	IF :SVBCIMP_INCL_FILE_NAME_IND = 'Y' THEN
  	lv_file_column:=:SVBCIMP_EXTERNAL_TABLENAME||lv_file_name;	
	  lv_temp_fields:= :SVBCIMP_FIELDS||','||lv_file_column||'('||TO_CHAR(NVL(TO_NUMBER(:SVBCIMP_FILE_LENGTH),0) + 1) ||':'||TO_CHAR(lv_file_length)||')';
	
	ELSE
		 lv_temp_fields := :SVBCIMP_FIELDS;
	END IF;	 
	 
	 
	   temp:=svkcimp.generate_ext_table (
	      P_TABLE_NAME        => :SVBCIMP_EXTERNAL_TABLENAME,
	      P_DIR               => :SVBCIMP_DIRECTORY,
	      P_FILE_NAME         => :SVBCIMP_FILENAME,
	      P_RECORD_DELIMITER  => nvl(:SVBCIMP_RECORD_DELIMITER,'NEWLINE'),
	      P_FIELD_DELIMITER   => nvl(:SVBCIMP_FIELD_DELIMITER,'FIXEDLENGTH'),
	      P_FIELDS            => lv_temp_fields,
	      P_FILE_FIELDS       => :SVBCIMP_FIELDS,
	      P_FIELD_TRANSFORM   => lv_file_column,
	      P_DROPIFEXISTS      => nvl(:registerfile_drop, 'N'),
	      P_LOAD_WHEN        => :SVBCIMP_LOAD_WHEN  ,
	      P_INCLUDE_FILE_NAME_IND  => :SVBCIMP_INCL_FILE_NAME_IND ,
	      MESSAGEOUT=>  :registerfile_messageout);


    -- If the file was successfully loaded
    IF temp = 1 THEN
       EXECUTE_TRIGGER('VALIDATE_EXT_TABLE');
       G$_CHECK_FAILURE;
    
      EXECUTE_TRIGGER('UPDATE_LOADED_FIELDS');
      G$_CHECK_FAILURE;
      EXECUTE_TRIGGER('CREATE_HISTORY_RECORD');
      G$_CHECK_FAILURE;
    END IF;
	END IF;
end;
		*/
    /*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * REGISTERFILE_BUTTON.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/
    @ActionTrigger(action = "WHEN-BUTTON-PRESSED", item = "REGISTERFILE_BUTTON")
    public void registerfileButton_buttonClick() {
        //F2J_WARNING : Caution, the variable may be null.
        SvbcimpAdapter svbcimpElement = (SvbcimpAdapter) this.getFormModel().getSvbcimp().getRowAdapter(true);
        {
            NNumber temp = NNumber.getNull();
            NString lvTempFields = NString.getNull();
            NString lvFileName = toStr("_FILE_NAME");
            NNumber lvFileLength = toNumber(90);
            NString lvFileColumn = NString.getNull();
            if (svbcimpElement.getSvbcimpExternalTablename().isNull()) {
                errorMessage(GNls.Fget(toStr("SVACIMP-0009"), toStr("FORM"), toStr("*ERROR* Enter external table name.")));
                goItem(toStr("SVBCIMP_EXTERNAL_TABLENAME"));
                throw new  ApplicationException();
            } else if (svbcimpElement.getSvbcimpDirectory().isNull()) {
                errorMessage(GNls.Fget(toStr("SVACIMP-0010"), toStr("FORM"), toStr("*ERROR* Enter directory name.")));
                goItem(toStr("SVBCIMP_DIRECTORY"));
                throw new  ApplicationException();
            } else if (svbcimpElement.getSvbcimpFilename().isNull()) {
                errorMessage(GNls.Fget(toStr("SVACIMP-0011"), toStr("FORM"), toStr("*ERROR* Enter file name.")));
                goItem(toStr("SVBCIMP_FILENAME"));
                throw new  ApplicationException();
            } else if (svbcimpElement.getSvbcimpFileLength().isNull()) {
                errorMessage(GNls.Fget(toStr("SVACIMP-0012"), toStr("FORM"), toStr("*ERROR* Enter file Length.")));
                goItem(toStr("SVBCIMP_FILE_LENGTH"));
                throw new  ApplicationException();
            } else if (svbcimpElement.getSvbcimpRecordDelimiter().isNull()) {
                errorMessage(GNls.Fget(toStr("SVACIMP-0013"), toStr("FORM"), toStr("*ERROR* Enter record delimiter name.")));
                goItem(toStr("SVBCIMP_RECORD_DELIMITER"));
                throw new  ApplicationException();
            } else if (svbcimpElement.getSvbcimpFields().isNull()) {
                errorMessage(GNls.Fget(toStr("SVACIMP-0014"), toStr("FORM"), toStr("*ERROR* Enter fields.")));
                goItem(toStr("SVBCIMP_FIELDS"));
                throw new  ApplicationException();
            } else if (svbcimpElement.getSvbcimpDefinitionYear().isNull()) {
                errorMessage(GNls.Fget(toStr("SVACIMP-0015"), toStr("FORM"), toStr("*ERROR* Enter the definition year.")));
                goItem(toStr("SVBCIMP_DEFINITION_YEAR"));
                throw new  ApplicationException();
            } else if (svbcimpElement.getSvbcimpFieldDelimiter().isNull()) {
                errorMessage(GNls.Fget(toStr("SVACIMP-0016"), toStr("FORM"), toStr("*ERROR* Enter field delimiter.")));
                goItem(toStr("SVBCIMP_FIELD_DELIMITER"));
                throw new  ApplicationException();
            } else {
                if (getBlockStatus().equals("CHANGED")) {
                    errorMessage(GNls.Fget(toStr("SVACIMP-0017"), toStr("FORM"), toStr("*ERROR* Must save your changes before Importing the File.")));
                    throw new  ApplicationException();
                }
                svbcimpElement.setReimportFile(toStr("Y"));
                executeAction("VALIDATE_FILE_NAME");
                getTask().getGoqrpls().gCheckFailure();
                svbcimpElement.setRegisterfileMessageout(toStr(""));
                if (svbcimpElement.getSvbcimpInclFileNameInd().equals("Y")) {
                    lvFileColumn = svbcimpElement.getSvbcimpExternalTablename().append(lvFileName);
                    lvTempFields = svbcimpElement.getSvbcimpFields().append(",").append(lvFileColumn).append("(").append(toChar(isNull(toNumber(svbcimpElement.getSvbcimpFileLength()), 0).add(1))).append(":").append(toChar(lvFileLength)).append(")");
                } else {
                    lvTempFields = svbcimpElement.getSvbcimpFields();
                }
                // F2J_WARNING : Passing parameters by name is not supported. Please check that the parameters are in the correct order.
                Ref<NString> messageout_ref = new  Ref<NString>(svbcimpElement.getSvbcimpLoadWhen());
                temp = Svkcimp.FgenerateExtTable(/*pTableName=>*/
                svbcimpElement.getSvbcimpExternalTablename(), svbcimpElement.getSvbcimpDirectory(), svbcimpElement.getSvbcimpFilename(), /*pRecordDelimiter=>*/
                isNull(svbcimpElement.getSvbcimpRecordDelimiter(), /*pFieldDelimiter=>*/
                "NEWLINE"), isNull(svbcimpElement.getSvbcimpFieldDelimiter(), /*pFields=>*/
                "FIXEDLENGTH"), /*pFileFields=>*/
                lvTempFields, svbcimpElement.getSvbcimpFields(), /*pDropifexists=>*/
                lvFileColumn, isNull(svbcimpElement.getRegisterfileDrop(), "N"), /*pIncludeFileNameInd=>*/
                messageout_ref, svbcimpElement.getSvbcimpInclFileNameInd(), svbcimpElement.getRegisterfileMessageout());
                svbcimpElement.setSvbcimpLoadWhen(messageout_ref.val);
                //  If the file was successfully loaded
                if (temp.equals(1)) {
                    executeAction("VALIDATE_EXT_TABLE");
                    getTask().getGoqrpls().gCheckFailure();
                    executeAction("UPDATE_LOADED_FIELDS");
                    getTask().getGoqrpls().gCheckFailure();
                    executeAction("CREATE_HISTORY_RECORD");
                    getTask().getGoqrpls().gCheckFailure();
                }
            }
        }
    }

    /* Original PL/SQL code code for TRIGGER SVBCIMP_ACTIVITY_DATE.KEY-NEXT-ITEM
		 BEGIN
  G$_DATE_NEXT_ITEM;
  G$_CHECK_FAILURE;
END;
		*/
    /*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVBCIMP_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/
    @ActionTrigger(action = "KEY-NEXT-ITEM", item = "SVBCIMP_ACTIVITY_DATE", function = KeyFunction.NEXT_ITEM)
    public void svbcimpActivityDate_keyNexItem() {
        getTask().getGoqrpls().gDateNextItem();
        getTask().getGoqrpls().gCheckFailure();
    }

    /* Original PL/SQL code code for TRIGGER SVBCIMP_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 BEGIN
  G$_DATE_WHEN_NEW_ITEM;
  G$_CHECK_FAILURE;
END;
		*/
    /*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVBCIMP_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/
    @ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SVBCIMP_ACTIVITY_DATE", function = KeyFunction.ITEM_CHANGE)
    public void svbcimpActivityDate_itemChange() {
        getTask().getGoqrpls().gDateWhenNewItem();
        getTask().getGoqrpls().gCheckFailure();
    }

    /* Original PL/SQL code code for TRIGGER SVBCIMP_ACTIVITY_DATE.POST-TEXT-ITEM
		 BEGIN
  G$_DATE_POST_ITEM;
  G$_CHECK_FAILURE;
END;
		*/
    /*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVBCIMP_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/
    @ActionTrigger(action = "POST-TEXT-ITEM", item = "SVBCIMP_ACTIVITY_DATE", function = KeyFunction.ITEM_OUT)
    public void svbcimpActivityDate_itemOut() {
        getTask().getGoqrpls().gDatePostItem();
        getTask().getGoqrpls().gCheckFailure();
    }

    public static void Svrcimh_BeforeQuery(QueryEvent... args) {
        System.out.println("Hello World!");
    }
}
