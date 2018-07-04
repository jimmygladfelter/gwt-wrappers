package com.gwt.createjs.easeljs.properties;

import com.app.gwt.client.lib.js.BaseJso;
import com.gwt.createjs.easeljs.propertynames.RectanglePropertyNames;

/**
 * Represents the CreateJS properties of the Rectangle class.
 * 
 * @author James C. Gladfelter
 */
public class RectangleProperties extends BaseJso implements RectanglePropertyNames {

	protected RectangleProperties() {
	}

	/**
	 * Retrieves the height of the rectangle.
	 * 
	 * @return the height of the rectangle.
	 */
	public Number getHeightProperty() {
		return this.getNumberProperty(HEIGHT);
	}

	/**
	 * Sets the height of the rectangle.
	 * 
	 * @param height
	 *            - the height of the rectangle.
	 */
	public void setHeightProperty(Number height) {
		this.setNumberProperty(HEIGHT, height);
	}

	/**
	 * Retrieves the width of the rectangle.
	 * 
	 * @return the width of the rectangle.
	 */
	public Number getWidthProperty() {
		return this.getNumberProperty(WIDTH);
	}

	/**
	 * Sets the width of the rectangle.
	 * 
	 * @param width
	 *            - the width of the rectangle.
	 */
	public void setWidthProperty(Number width) {
		this.setNumberProperty(WIDTH, width);
	}

	/**
	 * Retrieves the X position of the rectangle.
	 * 
	 * @return the X position of the rectangle.
	 */
	public Number getXProperty() {
		return this.getNumberProperty(X);
	}

	/**
	 * Sets the X position of the rectangle.
	 * 
	 * @param x
	 *            - the X position of the rectangle.
	 */
	public void setXProperty(Number x) {
		this.setNumberProperty(X, x);
	}

	/**
	 * Retrieves the Y position of the rectangle.
	 * 
	 * @return the Y position of the rectangle.
	 */
	public Number getYProperty() {
		return this.getNumberProperty(Y);
	}

	/**
	 * Retrieves the Y position of the rectangle.
	 * 
	 * @param y
	 *            - the Y position of the rectangle.
	 */
	public void setYProperty(Number y) {
		this.setNumberProperty(Y, y);
	}
}
