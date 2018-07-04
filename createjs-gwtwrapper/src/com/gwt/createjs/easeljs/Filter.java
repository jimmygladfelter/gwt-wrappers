package com.gwt.createjs.easeljs;

import com.gargoylesoftware.htmlunit.javascript.host.canvas.CanvasRenderingContext2D;
import com.gwt.createjs.base.CreateJsJso;
import com.gwt.createjs.easeljs.properties.FilterProperties;

/**
 * Represents the CreateJS - Filter class.<br/>
 * Base class that all filters should inherit from. Filters need to be applied
 * to objects that have been cached using the cache method. If an object
 * changes, please cache it again, or use updateCache. Note that the filters
 * must be applied before caching. <br/>
 * Note that each filter can implement a getBounds method, which returns the
 * margins that need to be applied in order to fully display the filter. For
 * example, the BlurFilter will cause an object to feather outwards, resulting
 * in a margin around the shape.<br/>
 * EaselJS Filters<br/>
 * EaselJS comes with a number of pre-built filters: AlphaMapFilter : Map a
 * greyscale image to the alpha channel of a display object AlphaMaskFilter: Map
 * an image's alpha channel to the alpha channel of a display object BlurFilter:
 * Apply vertical and horizontal blur to a display object ColorFilter: Color
 * transform a display object ColorMatrixFilter: Transform an image using a
 * ColorMatrix
 * 
 * @author James C. Gladfelter
 */
public class Filter<M extends FilterProperties> extends CreateJsJso<M> {

	protected Filter() {
	}

	/**
	 * Applies the filter to the specified context.
	 * 
	 * @param ctx
	 *            - the 2D context to use as the source.
	 * @param x
	 *            - the x position to use for the source rect.
	 * @param y
	 *            - the y position to use for the source rect.
	 * @param width
	 *            - the width to use for the source rect.
	 * @param height
	 *            - the height to use for the source rect.
	 * @return true if the filter was applied successfully.
	 */
	public final native boolean applyFilter(CanvasRenderingContext2D ctx, double x, double y, double width,
			double height) /*-{
		return this.applyFilter(ctx, x, y, width, height);
	}-*/;

	/**
	 * Applies the filter to the specified context.
	 * 
	 * @param ctx
	 *            - the 2D context to use as the source.
	 * @param x
	 *            - the x position to use for the source rect.
	 * @param y
	 *            - the y position to use for the source rect.
	 * @param width
	 *            - the width to use for the source rect.
	 * @param height
	 *            - the height to use for the source rect.
	 * @param targetCtx
	 *            - the 2D context to draw the result to. Defaults to the context
	 *            passed to ctx.
	 * @param targetX
	 *            - the x position to draw the result to. Defaults to the value
	 *            passed to x.
	 * @param targetY
	 *            - the y position to draw the result to. Defaults to the value
	 *            passed to y.
	 * @return true if the filter was applied successfully.
	 */
	public final native boolean applyFilter(CanvasRenderingContext2D ctx, double x, double y, double width,
			double height, CanvasRenderingContext2D targetCtx, double targetX, double targetY) /*-{
		return this.applyFilter(ctx, x, y, width, height, targetCtx, targetX,
				targetY);
	}-*/;

	/**
	 * Returns a clone of this Filter instance.
	 */
	public final native Filter clone() /*-{
		return this.clone();
	}-*/;

	/**
	 * Provides padding values for this filter. That is, how much the filter will
	 * extend the visual bounds of an object it is applied to.
	 * 
	 * @return if a rect param was provided, it is returned. If not, either a new
	 *         rectangle with the padding values, or null if no padding is required
	 *         for this filter.
	 */
	public final Rectangle getBounds() {
		return this.getBounds(null);
	}

	/**
	 * Provides padding values for this filter. That is, how much the filter will
	 * extend the visual bounds of an object it is applied to.
	 * 
	 * @param rect
	 *            - if specified, the provided Rectangle instance will be expanded
	 *            by the padding amounts and returned.
	 * @return if a rect param was provided, it is returned. If not, either a new
	 *         rectangle with the padding values, or null if no padding is required
	 *         for this filter.
	 */
	public final native Rectangle getBounds(Rectangle rect) /*-{
		var r = null;
		if (rect != null) {
			r = this.getBounds(rect);
		} else {
			r = this.getBounds();
		}
		return r;
	}-*/;
}
