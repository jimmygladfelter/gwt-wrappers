package com.gwt.createjs.easeljs.properties;

import com.app.gwt.client.lib.js.BaseJso;
import com.gwt.createjs.easeljs.propertynames.AlphaMaskFilterPropertyNames;

/**
 * Represents the CreateJS properties of the AlphaMaskFilter class.
 * 
 * @author James C. Gladfelter
 */
public class AlphaMaskFilterProperties extends FilterProperties implements AlphaMaskFilterPropertyNames {

	protected AlphaMaskFilterProperties() {
	}

	/**
	 * Retrieves the image (or canvas) to use as the mask.
	 * 
	 * @return the image (or canvas) to use as the mask.
	 */
	public BaseJso getAlphaMaskProperty() {
		return this.getJsoProperty(ALPHA_MASK);
	}
}
