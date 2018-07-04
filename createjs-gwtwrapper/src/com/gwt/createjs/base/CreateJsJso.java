package com.gwt.createjs.base;

import com.app.gwt.client.lib.js.BaseJso;

/**
 * Represents the base class of all primary classes in CreateJs.
 * 
 * @author James C. Gladfelter
 */
public class CreateJsJso<M extends BaseJso> extends BaseJso {

	protected CreateJsJso() {
	}

	/**
	 * Retrieves the properties of the object.
	 * 
	 * @return
	 */
	public M getProperties() {
		return (M) this.cast();
	}
}
