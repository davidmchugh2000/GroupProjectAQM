package edu.ycp.cs320.lab02a_tgerst.controller;


import edu.ycp.cs320.lab02a_tgerst.persist.DatabaseProvider;
import edu.ycp.cs320.lab02a_tgerst.persist.DerbyDatabase;
import edu.ycp.cs320.lab02a_tgerst.persist.IDatabase;

import java.util.ArrayList;
import java.util.List;

import edu.ycp.cs320.lab02a_tgerst.model.Module;

public class ModuleController {
	//create a Numbers model
	private Module model;
	
	private IDatabase db    = null;

	public ModuleController() {
		// creating DB instance here
		DatabaseProvider.setInstance(new DerbyDatabase());
		db = DatabaseProvider.getInstance();		
	}
	
	public List<Module> getModuleData (String module_name){
		IDatabase db = DatabaseProvider.getInstance();
		List<Module> moduleList = db.findDataByModuleLocation(module_name);
		
		// check if anything was returned and output the list
		if (moduleList.isEmpty()) {
			System.out.println("There are no modules in the database");
		}
		else {
			for (Module module : moduleList) {
				//print the tings here
				System.out.println(module.getAQI() +","+ module.getHumidity() +","+ module.getMainPol() +","+ module.getPressure() +","+ module.getTemp() +","+ module.getWindDir() +","+ module.getWindSpeed());
			}
		}
		return moduleList;
	}
	
}
