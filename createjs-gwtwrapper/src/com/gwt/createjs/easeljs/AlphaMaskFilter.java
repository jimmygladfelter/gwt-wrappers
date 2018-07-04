package com.gwt.createjs.easeljs;

import com.app.gwt.client.lib.js.BaseJso;
import com.gwt.createjs.easeljs.properties.AlphaMaskFilterProperties;

/**
 * Represents the CreateJS - AlphaMaskFilter class.<br/>
 * Applies the alpha from the mask image (or canvas) to the target, such that
 * the alpha channel of the result will be derived from the mask, and the RGB
 * channels will be copied from the target. This can be used, for example, to
 * apply an alpha mask to a display object. This can also be used to combine a
 * JPG compressed RGB image with a PNG32 alpha mask, which can result in a much
 * smaller file size than a single PNG32 containing ARGB.
 * 
 * IMPORTANT NOTE: This filter currently does not support the targetCtx, or
 * targetX/Y parameters correctly.
 * 
 * @author James C. Gladfelter
 */
public class AlphaMaskFilter extends Filter<AlphaMaskFilterProperties> {

	/**
	 * Creates a new AlphaMapFilter.
	 * 
	 * @param alphaMask
	 *            - the greyscale image (or canvas) to use as the alpha value for
	 *            the result. This should be exactly the same dimensions as the
	 *            target.
	 * @return a new AlphaMapFilter.
	 */
	public final native static AlphaMaskFilter create(BaseJso alphaMask) /*-{
		return new createjs.AlphaMapFilter(alphaMask);
	}-*/;

	protected AlphaMaskFilter() {
	}
}
