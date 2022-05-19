package com.selenium.sample;

import org.slf4j.LoggerFactory;

public class Usinglog4j1 {

	private static final org.slf4j.Logger Log = LoggerFactory.getLogger(Usinglog4j1.class);

	public static void main(String[] args) {
		
		Log.trace("the built-in TRACE level");
	//	Log.verbose("a custom level: a VERBOSE message");
		Log.debug("the built-in DEBUG level");
		//Log.notice("a custom level: a NOTICE message");
		Log.info("the built-in INFO level");
		//Log.diag("a custom level: a DIAG message");
		Log.warn("the built-in WARN level");
		Log.error("the built-in ERROR level");
	//	Log.fatal("the built-in FATAL level");
	//	Log.notice("java 8 lambda expression only executed if NOTICE is enabled: {}", () -> someMethod());
	}
	
}