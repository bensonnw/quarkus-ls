package com.redhat.quarkus.jdt.core.ls;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the Quarkus JDT LS Extension plug-in life cycle
 */
public class QuarkusActivator implements BundleActivator {

	// The plug-in ID
	public static final String PLUGIN_ID = "com.redhat.quarkus.jdt.core";

	// The shared instance
	private static QuarkusActivator plugin;

	public void start(BundleContext context) throws Exception {
		plugin = this;
	}

	public void stop(BundleContext context) throws Exception {
		plugin = null;
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static QuarkusActivator getDefault() {
		return plugin;
	}
}