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
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;
import net.hedtech.general.common.libraries.Goqolib.model.GVpdiBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;
import net.hedtech.general.common.libraries.Goqolib.model.GSdispAdapter;
import net.hedtech.general.common.libraries.Goqolib.model.GNavBlock;

public class SvrcimhController extends DefaultBlockController {

    /* this is a method */
    private GDateClass getGDateClass() {
        return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
    }

    public SvrcimhController(IFormController parentController, String name) {
        super(parentController, name);
    }

    /* this is a method */
    @Override
    public SvacimpTask getTask() {
        return (SvacimpTask) super.getTask();
    }

    /* this is a method */
    public SvacimpModel getFormModel() {
        return this.getTask().getModel();
    }

    //action methods generated from triggers
    /* Original PL/SQL code code for TRIGGER SVRCIMH.KEY-PRVBLK
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;
		*/
    /*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVRCIMH.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/
    /* this is a method */
    @ActionTrigger(action = "KEY-PRVBLK", function = KeyFunction.PREVIOUS_BLOCK)
    public void svrcimh_PreviousBlock() {
        executeAction("INVALID_FUNCTION_MSG");
        getTask().getGoqrpls().gCheckFailure();
    }

    /* Original PL/SQL code code for TRIGGER SVRCIMH.KEY-NXTBLK
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;
		*/
    /*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVRCIMH.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/
    /* this is a method */
    @ActionTrigger(action = "KEY-NXTBLK", function = KeyFunction.NEXT_BLOCK)
    public void svrcimh_NextBlock() {
        executeAction("INVALID_FUNCTION_MSG");
        getTask().getGoqrpls().gCheckFailure();
    }

    /*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVRCIMH.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/
    //		@BeforeQuery
    //		public void svrcimh_BeforeQuery(QueryEvent args)
    //		{
    //			
    //               // F2J_WARNING : Query Parameters initialization. Make sure that all the query parameters are properly initialized
    //
    //				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_PROCESS_CODE", this.getFormModel().getKeyBlock().getProcessCode()));             
    //
    //
    //                // F2J_WARNING : Caution, the variable may be null.                  
    //                SvbcimpAdapter svbcimpElement = (SvbcimpAdapter) this.getFormModel().getSvbcimp().getRowAdapter();                       
    //				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("SVBCIMP_DEFINITION_YEAR", svbcimpElement.getSvbcimpDefinitionYear()));             
    //
    //
    //           
    //               }
    /*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVRCIMH_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/
    /* this is a method */
    @ActionTrigger(action = "KEY-NEXT-ITEM", item = "SVRCIMH_ACTIVITY_DATE", function = KeyFunction.NEXT_ITEM)
    public void svrcimhActivityDate_keyNexItem() {
        getGDateClass().nextItem();
    }

    /*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVRCIMH_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/
    /* this is a method */
    @ActionTrigger(action = "WHEN-NEW-ITEM-INSTANCE", item = "SVRCIMH_ACTIVITY_DATE", function = KeyFunction.ITEM_CHANGE)
    public void svrcimhActivityDate_itemChange() {
        getGDateClass().itemChange();
    }

    /*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SVRCIMH_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/
    /* this is a method */
    @ActionTrigger(action = "POST-TEXT-ITEM", item = "SVRCIMH_ACTIVITY_DATE", function = KeyFunction.ITEM_OUT)
    public void svrcimhActivityDate_itemOut() {
        getGDateClass().itemOut();
    }

    public static void Svrcimh_BeforeQuery(QueryEvent... args) {
        System.out.println("Hello World!");
    }
}
