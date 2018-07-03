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
	public int getHeightProperty() {
		return this.getIntegerProperty(HEIGHT);
	}

	/**
	 * Sets the height of the rectangle.
	 * 
	 * @param height
	 *            - the height of the rectangle.
	 */
	public void setHeightProperty(int height) {
		this.setProperty(HEIGHT, height);
	}

	/**
	 * Retrieves the width of the rectangle.
	 * 
	 * @return the width of the rectangle.
	 */
	public int getWidthProperty() {
		return this.getIntegerProperty(WIDTH);
	}

	/**
	 * Sets the width of the rectangle.
	 * 
	 * @param width
	 *            - the width of the rectangle.
	 */
	public void setWidthProperty(int width) {
		this.setProperty(WIDTH, width);
	}

	/**
	 * Retrieves the X position of the rectangle.
	 * 
	 * @return the X position of the rectangle.
	 */
	public int getXProperty() {
		return this.getIntegerProperty(X);
	}

	/**
	 * Sets the X position of the rectangle.
	 * 
	 * @param x
	 *            - the X position of the rectangle.
	 */
	public void setXProperty(int x) {
		this.setProperty(X, x);
	}

	/**
	 * Retrieves the Y position of the rectangle.
	 * 
	 * @return the Y position of the rectangle.
	 */
	public int getYProperty() {
		return this.getIntegerProperty(Y);
	}

	/**
	 * Retrieves the Y position of the rectangle.
	 * 
	 * @param y
	 *            - the Y position of the rectangle.
	 */
	public void setYProperty(int y) {
		this.setProperty(Y, y);
	}
}
