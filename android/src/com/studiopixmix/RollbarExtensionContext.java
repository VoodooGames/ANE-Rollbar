package com.studiopixmix;
import java.util.HashMap;
import java.util.Map;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.studiopixmix.functions.RollbarInitFunction;
import com.studiopixmix.functions.RollbarReportErrorFunction;
import com.studiopixmix.functions.RollbarSetPersonDataFunction;


/**
 * The extension context, describing all the functions available from ActionScript.
 */
public class RollbarExtensionContext extends FREContext {

	@Override
	public void dispose() {
		RollbarExtension.log("Disposing.");
	}

	/**
	 * Returns the list of available functions.
	 */
	@Override
	public Map<String, FREFunction> getFunctions() {
		
		RollbarExtension.log("Declaring functions ...");
		Map<String, FREFunction> functions = new HashMap<String, FREFunction>();
		
		functions.put("rollbarANE_init", new RollbarInitFunction());
		functions.put("rollbarANE_setPersonData", new RollbarSetPersonDataFunction());
		functions.put("rollbarANE_reportError", new RollbarReportErrorFunction());
		
		RollbarExtension.log("Functions declared.");
		
		return functions;
	}

}
