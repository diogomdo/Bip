package net.hedtech.las.studemre.banner.student.Svacimp;


import java.util.Hashtable;
import net.hedtech.general.common.forms.BaseTask;
import morphis.foundations.core.appsupportlib.runtime.Task;

	
/// <summary>
/// DEMRE Import Files
/// </summary>
public class SvacimpTask extends BaseTask
{
	public SvacimpTask (String taskName) {
		super(taskName);
	}

	public SvacimpTask (String taskName, Hashtable sharedLibraries, Hashtable parameters) {
		super(taskName, sharedLibraries, parameters);
	}

	@Override
	public net.hedtech.las.studemre.banner.student.Svacimp.model.SvacimpModel getModel() {
		return (net.hedtech.las.studemre.banner.student.Svacimp.model.SvacimpModel)super.getModel();
	}

	public net.hedtech.las.studemre.banner.student.Svacimp.services.SvacimpServices getServices() {
		return (net.hedtech.las.studemre.banner.student.Svacimp.services.SvacimpServices)getSupportCodeManager().getServices();
	}
	
	
	// Package Acessors
		
	
		// Attached Libraries
    public net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices getGoqrpls()
    {
		return (net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices)getSupportCodeManager().getLibrary("GOQRPLS");
    }
    public net.hedtech.general.common.libraries.Goqwflw.GoqwflwServices getGoqwflw()
    {
		return (net.hedtech.general.common.libraries.Goqwflw.GoqwflwServices)getSupportCodeManager().getLibrary("GOQWFLW");
    }
    public net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices getEoqrpls()
    {
		return (net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices)getSupportCodeManager().getLibrary("EOQRPLS");
    }


}
