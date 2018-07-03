package com.gwt.createjs.easeljs.properties;

import com.app.gwt.client.lib.js.BaseJso;
import com.gwt.createjs.easeljs.propertynames.EaselJSPropertyNames;

/**
 * Represents the CreateJS properties of the EaselJS class.
 * 
 * @author James C. Gladfelter
 */
public class EaselJSProperties extends BaseJso implements EaselJSPropertyNames {

	protected EaselJSProperties() {
	}

	/**
	 * Retrieves the build date for this release in UTC format.
	 * 
	 * @return the build date for this release in UTC format.
	 */
	public final String getBuildDateProperty() {
		return this.getStringProperty(BUILD_DATE);
	}

	/**
	 * Retrieves the version string for this release.
	 * 
	 * @return the version string for this release.
	 */
	public final String getVersionProperty() {
		return this.getStringProperty(VERSION);
	}
}
