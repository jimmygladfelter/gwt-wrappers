package com.gwt.createjs.easeljs;

import com.google.gwt.core.client.JavaScriptObject;
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

	/**
	 * Returns a clone of the Event instance.
	 */
	public final native Event clone() /*-{
		return this.clone();
	}-*/;

	/**
	 * Sets defaultPrevented to true if the event is cancelable. Mirrors the DOM
	 * level 2 event standard. In general, cancelable events that have
	 * preventDefault() called will cancel the default behaviour associated with the
	 * event.
	 */
	public final native void preventDefault() /*-{
		this.preventDefault();
	}-*/;

	/**
	 * Causes the active listener to be removed via removeEventListener();
	 */
	public final native void remove() /*-{
		this.remove();
	}-*/;

	/**
	 * Provides a chainable shortcut method for setting a number of properties on
	 * the instance.
	 * 
	 * @param jso
	 *            - a generic object containing properties to copy to the instance.
	 * @return returns the instance the method is called on (useful for chaining
	 *         calls.)
	 */
	public final native Event set(JavaScriptObject jso) /*-{
		return this.set(jso);
	}-*/;

	/**
	 * Sets propagationStopped and immediatePropagationStopped to true. Mirrors the
	 * DOM event standard.
	 */
	public final native void stopImmediatePropagation() /*-{
		this.stopImmediatePropagation();
	}-*/;

	/**
	 * Sets propagationStopped to true. Mirrors the DOM event standard.
	 */
	public final native void stopPropagation() /*-{
		this.stopPropagation();
	}-*/;
}
