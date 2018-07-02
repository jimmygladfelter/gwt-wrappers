package com.app.gwt.client.lib.js;

/**
 * A simple wrapper around a native array of values.
 */
public class BaseJsoArray<M> extends BaseJso {

	protected BaseJsoArray() {
	}

	/**
	 * Gets the value at a given index.
	 * 
	 * @param index
	 *            the index to be retrieved
	 * @return the value at the given index, or <code>null</code> if none exists
	 */
	public final native M get(int index) /*-{
		return this[index];
	}-*/;

	/**
	 * Gets the length of the array.
	 * 
	 * @return the array length
	 */
	public final native int length() /*-{
		return this.length;
	}-*/;

	/**
	 * Pushes the given value onto the end of the array.
	 */
	public final native void push(M value) /*-{
		this[this.length] = value;
	}-*/;

	/**
	 * Sets the value value at a given index.
	 * 
	 * If the index is out of bounds, the value will still be set. The array's
	 * length will be updated to encompass the bounds implied by the added value.
	 * 
	 * @param index
	 *            the index to be set
	 * @param value
	 *            the value to be stored
	 */
	public final native void set(int index, M value) /*-{
		this[index] = value;
	}-*/;

	/**
	 * Reset the length of the array.
	 * 
	 * @param newLength
	 *            the new length of the array
	 */
	public final native void setLength(int newLength) /*-{
		this.length = newLength;
	}-*/;

	/**
	 * Shifts the first value off the array.
	 * 
	 * @return the shifted value
	 */
	public final native M shift() /*-{
		return this.shift();
	}-*/;

	/**
	 * Shifts a value onto the beginning of the array.
	 * 
	 * @param value
	 *            the value to the stored
	 */
	public final native void unshift(M value) /*-{
		this.unshift(value);
	}-*/;
}
