package com.gwt.createjs.easeljs.properties;

import com.app.gwt.client.lib.js.BaseJso;
import com.gwt.createjs.easeljs.propertynames.AlphaMapFilterPropertyNames;

/**
 * Represents the CreateJS properties of the AlphaMapFilter class.
 * 
 * @author James C. Gladfelter
 */
public class AlphaMapFilterProperties extends FilterProperties implements AlphaMapFilterPropertyNames {

	protected AlphaMapFilterProperties() {
	}

	/**
	 * Retrieves the greyscale image (or canvas) to use as the alpha value for the
	 * result. This should be exactly the same dimensions as the target.
	 * 
	 * @return the greyscale image (or canvas) to use as the alpha value for the
	 *         result. This should be exactly the same dimensions as the target.
	 */
	public BaseJso getAlphaMapProperty() {
		return this.getJsoProperty(ALPHA_MAP);
	}
}
