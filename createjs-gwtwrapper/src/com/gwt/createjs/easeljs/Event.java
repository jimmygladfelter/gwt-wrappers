package com.gwt.createjs.easeljs;

import com.gwt.createjs.easeljs.properties.EventProperties;

/**
 * Represents the CreateJS - Event class.<br/>
 * Contains properties and methods shared by all events for use with
 * EventDispatcher.<br/>
 * Note that Event objects are often reused, so you should never rely on an
 * event object's state outside of the call stack it was received in.
 * 
 * @author James C. Gladfelter
 */
public class Event extends EventProperties {

	protected Event() {
	}
	
	public final native Event clone() /*-{
		return this.clone();
	}-*/;
}
