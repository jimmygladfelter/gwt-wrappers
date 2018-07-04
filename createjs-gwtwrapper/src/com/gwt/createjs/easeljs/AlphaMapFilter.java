package com.gwt.createjs.easeljs;

import com.app.gwt.client.lib.js.BaseJso;
import com.gwt.createjs.easeljs.properties.AlphaMapFilterProperties;

/**
 * Represents the CreateJS - AlphaMapFilter class.<br/>
 * Applies a greyscale alpha map image (or canvas) to the target, such that the
 * alpha channel of the result will be copied from the red channel of the map,
 * and the RGB channels will be copied from the target.
 * 
 * Generally, it is recommended that you use AlphaMaskFilter, because it has
 * much better performance.
 * 
 * @author James C. Gladfelter
 */
public class AlphaMapFilter extends Filter<AlphaMapFilterProperties> {

	/**
	 * Creates a new AlphaMapFilter.
	 * 
	 * @param alphaMap
	 *            - the greyscale image (or canvas) to use as the alpha value for
	 *            the result. This should be exactly the same dimensions as the
	 *            target.
	 * @return a new AlphaMapFilter.
	 */
	public final native static AlphaMapFilter create(BaseJso alphaMap) /*-{
		return new createjs.AlphaMapFilter(alphaMap);
	}-*/;

	protected AlphaMapFilter() {
	}
}
