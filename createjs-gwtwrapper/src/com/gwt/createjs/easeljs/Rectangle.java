package com.gwt.createjs.easeljs;

import com.gwt.createjs.base.CreateJsJso;
import com.gwt.createjs.easeljs.properties.RectangleProperties;

/**
 * Represents the CreateJS - Rectangle class.<br/>
 * Represents a rectangle as defined by the points (x, y) and (x+width,
 * y+height).
 * 
 * @author James C. Gladfelter
 */
public class Rectangle extends CreateJsJso<RectangleProperties> {

	/**
	 * Creates a new rectangle.
	 * 
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 * @return
	 */
	public final native static Rectangle create(double x, double y, double width, double height) /*-{
		return new createjs.Rectangle(x, y, width, height);
	}-*/;

	protected Rectangle() {
	}

	/**
	 * Returns a clone of the Rectangle instance.
	 */
	public final native Rectangle clone() /*-{
		return this.clone();
	}-*/;

	/**
	 * Returns true if this rectangle fully encloses the described point or
	 * rectangle.
	 * 
	 * @param x
	 *            - x position of the point or rectangle.
	 * @param y
	 *            - y position of the point or rectangle.
	 * @return true if the described point or rectangle is contained within this
	 *         rectangle.
	 */
	public final Boolean contains(double x, double y) {
		return this.contains(x, y, 0, 0);
	}

	/**
	 * Returns true if this rectangle fully encloses the described point or
	 * rectangle.
	 * 
	 * @param x
	 *            - x position of the point or rectangle.
	 * @param y
	 *            - y position of the point or rectangle.
	 * @param width
	 *            - the width of the rectangle.
	 * @param height
	 *            - the height of the rectangle.
	 * @return true if the described point or rectangle is contained within this
	 *         rectangle.
	 */
	public final native Boolean contains(double x, double y, double width, double height) /*-{
		return this.contains(x, y, width, height);
	}-*/;

	/**
	 * Copies all properties from the specified rectangle to this rectangle.
	 * 
	 * @param rect
	 *            - the rectangle to copy properties from.
	 * @return this rectangle. Useful for chaining method calls.
	 */
	public final native Rectangle copy(Rectangle rect) /*-{
		return this.copy(rect);
	}-*/;

	/**
	 * Extends the rectangle's bounds to include the described point or rectangle.
	 * 
	 * @param x
	 *            - x position of the point or rectangle.
	 * @param y
	 *            - y position of the point or rectangle.
	 * @return this instance. Useful for chaining method calls.
	 */
	public final Rectangle extend(double x, double y) {
		return this.extend(x, y, 0, 0);
	}

	/**
	 * Extends the rectangle's bounds to include the described point or rectangle.
	 * 
	 * @param x
	 *            - x position of the point or rectangle.
	 * @param y
	 *            - y position of the point or rectangle.
	 * @param width
	 *            - the width of the rectangle.
	 * @param height
	 *            - the height of the rectangle.
	 * @return this instance. Useful for chaining method calls.
	 */
	public final native Rectangle extend(double x, double y, double width, double height) /*-{
		return this.extend(x, y, width, height);
	}-*/;

	/**
	 * Returns a new rectangle which describes the intersection (overlap) of this
	 * rectangle and the specified rectangle, or null if they do not intersect.
	 * 
	 * @param rect
	 *            - the rectangle to calculate an intersection with.
	 * @return a new rectangle describing the intersection or null.
	 */
	public final native Rectangle intersection(Rectangle rect) /*-{
		return this.intersection(rect);
	}-*/;

	/**
	 * Returns true if the specified rectangle intersects (has any overlap) with
	 * this rectangle.
	 * 
	 * @param rect
	 *            - the rectangle to compare.
	 * @return true if the rectangles intersect.
	 */
	public final native Boolean intersects(Rectangle rect) /*-{
		return this.intersects(rect);
	}-*/;

	/**
	 * Returns true if the width or height are equal or less than 0.
	 * 
	 * @return true if the rectangle is empty.
	 */
	public final native Boolean isEmpty() /*-{
		return this.isEmpty();
	}-*/;

	/**
	 * Adds the specified padding to the rectangle's bounds.
	 * 
	 * @param top
	 *            - the top padding.
	 * @param left
	 *            - the left padding.
	 * @param bottom
	 *            - the bottom padding.
	 * @param right
	 *            - the right padding.
	 * @return this instance. Useful for chaining method calls.
	 */
	public final native Rectangle pad(double top, double left, double bottom, double right) /*-{
		return this.pad(top, left, bottom, right);
	}-*/;

	/**
	 * Returns a new rectangle which contains this rectangle and the specified
	 * rectangle.
	 * 
	 * @param rect
	 *            - the rectangle to calculate a union with.
	 * @return a new rectangle describing the union.
	 */
	public final native Rectangle union(Rectangle rect) /*-{
		return this.union(rect);
	}-*/;
}
