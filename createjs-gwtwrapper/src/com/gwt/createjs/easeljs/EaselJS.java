package com.gwt.createjs.easeljs;

import com.gwt.createjs.base.CreateJsJso;
import com.gwt.createjs.easeljs.properties.EaselJSProperties;

/**
 * Represents the CreateJS - EaselJS class.<br/>
 * Static class holding library specific information such as the version and
 * buildDate of the library.
 * 
 * @author James C. Gladfelter
 */
public class EaselJS extends CreateJsJso<EaselJSProperties> {

	protected EaselJS() {
	}

	/**
	 * Retrieves the build date for this release in UTC format.
	 * 
	 * @return the build date for this release in UTC format.
	 */
	public final native String getBuildDate() /*-{
		return EaselJS.buildDate;
	}-*/;

	/**
	 * Retrieves the version string for this release.
	 * 
	 * @return the version string for this release.
	 */
	public final native String getVersion() /*-{
		return EaselJS.version;
	}-*/;
}
