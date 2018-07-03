package com.gwt.createjs.base;

import com.app.gwt.client.lib.js.BaseJso;
import com.google.gwt.event.shared.EventHandler;
import com.gwt.createjs.easeljs.Event;

/**
 * Handler for different events fired in CreateJs.
 */
public interface CreateJsEventHandler extends EventHandler {
	/**
	 * Called when a CreateJs event is fired.
	 * 
	 * @param event
	 *            the {@link Event} that was fired
	 * @param data
	 *            - arbitrary secondary data.
	 */
	void onEvent(Event event, BaseJso data);

}