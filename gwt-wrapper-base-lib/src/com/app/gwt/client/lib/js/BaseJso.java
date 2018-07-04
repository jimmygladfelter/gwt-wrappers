package com.app.gwt.client.lib.js;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsDate;

/**
 * A base class for a javascript object. Contains helper methods to interact
 * cleanly with java.
 * 
 * @author James C. Gladfelter
 */
public class BaseJso extends JavaScriptObject {

	protected BaseJso() {
	}

	/**
	 * Retrieves a Boolean property of this object.
	 * 
	 * @param propertyName
	 *            - the name of the property.
	 * @return a Boolean value.
	 */
	public final Boolean getBooleanProperty(String propertyName) {
		Boolean b = null;
		Object obj = this.getProperty(propertyName);
		if (obj != null) {
			try {
				b = (boolean) obj;
			} catch (Exception ex) {
				// maybe its a string, try that?
				String str = this.getStringProperty(propertyName);
				if (str != null) {
					b = Boolean.parseBoolean(str);
				}
			}
		}
		return b;
	}

	/**
	 * Sets a Boolean property to this object.
	 * 
	 * @param propertyName
	 *            - the name of the property.
	 * @param value
	 *            - a Boolean value.
	 */
	public final void setBooleanProperty(String propertyName, Boolean value) {
		if (propertyName != null) {
			if (value != null) {
				boolean valToSet = value.booleanValue();
				this.setProperty(propertyName, valToSet);
			} else {
				this.deleteProperty(propertyName);
			}
		}
	}

	/**
	 * Retrieves a Double property of this object.
	 * 
	 * @param propertyName
	 *            - the name of the property.
	 * @return a Double value.
	 */
	public final Number getNumberProperty(String propertyName) {
		Number n = null;
		Object obj = this.getProperty(propertyName);
		if (obj != null) {
			try {
				n = (double) obj;
			} catch (Exception ex) {
				// maybe its a string, try that?
				String str = this.getStringProperty(propertyName);
				if (str != null) {
					try {
						n = Double.parseDouble(str);
					} catch (Exception ex2) {
						// could not cast...
					}
				}
			}
		}
		return n;
	}

	/**
	 * Sets a Number property to this object.
	 * 
	 * @param propertyName
	 *            - the name of the property.
	 * @param value
	 *            - a Number value.
	 */
	public final void setNumberProperty(String propertyName, Number value) {
		if (propertyName != null) {
			if (value != null) {
				double valToSet = value.doubleValue();
				this.setProperty(propertyName, valToSet);
			} else {
				this.deleteProperty(propertyName);
			}
		}
	}

	/**
	 * Retrieves a javascript date property of this object.
	 * 
	 * @param propertyName
	 *            - the name of the property.
	 * @return a javascript date.
	 */
	public final JsDate getJsDateProperty(String propertyName) {
		JsDate d = null;
		Object obj = this.getProperty(propertyName);
		if (obj != null) {
			try {
				d = (JsDate) obj;
			} catch (Exception ex) {
				// could not cast...
			}
		}
		return d;
	}

	/**
	 * Retrieves a Date property of this object.
	 * 
	 * @param propertyName
	 *            - the name of the property.
	 * @return a Date value.
	 */
	public final Date getDateProperty(String propertyName) {
		Date d = null;
		JsDate jsDate = this.getJsDateProperty(propertyName);
		if (jsDate != null) {
			d = new Date(new Double(jsDate.getTime()).longValue());
		}
		return d;
	}

	/**
	 * Sets a Date property to this object.
	 * 
	 * @param propertyName
	 *            - the name of the property.
	 * @param value
	 *            - a Date value.
	 */
	public final void setDateProperty(String propertyName, Date value) {
		if (propertyName != null) {
			if (value != null) {
				JsDate valToSet = JsDate.create(new Long(value.getTime()).doubleValue());
				this.setProperty(propertyName, valToSet);
			} else {
				this.deleteProperty(propertyName);
			}
		}
	}

	/**
	 * Retrieves a String property of this object.
	 * 
	 * @param propertyName
	 *            - the name of the property.
	 * @return a String value.
	 */
	public final String getStringProperty(String propertyName) {
		String s = null;
		Object obj = this.getProperty(propertyName);
		if (obj != null) {
			try {
				s = (String) obj;
			} catch (Exception ex) {
				// could not cast...
			}
		}
		return s;
	}

	/**
	 * Converts a javascript array into a java list.
	 * 
	 * @param jsArray
	 *            - the array to convert.
	 * @return a list containing the values of the array.
	 */
	public static <M> List<M> convertToList(BaseJsoArray<M> jsArray) {
		List<M> list = null;
		if (jsArray != null) {
			list = new ArrayList<M>();
			int arrayLength = jsArray.length();
			for (int i = 0; i < arrayLength; i++) {
				M obj = jsArray.get(i);
				list.add(obj);
			}
		}
		return list;
	}

	/**
	 * Retrieves a list property of this object.
	 * 
	 * @param propertyName
	 *            - the name of the property.
	 * @return a list of objects.
	 */
	public final <M> List<M> getListProperty(String propertyName) {
		return convertToList(this.getJsArrayProperty(propertyName));
	}

	/**
	 * Converts a list into a javascript array.
	 * 
	 * @param list
	 *            - the list to convert.
	 * @return a javascript array containing the values of the list.
	 */
	public static <M> BaseJsoArray<M> convertToJsArray(Collection<M> list) {
		BaseJsoArray<M> jsArray = null;
		if (list != null) {
			jsArray = createObject().cast();
			for (M obj : list) {
				jsArray.push(obj);
			}
		}
		return jsArray;
	}

	/**
	 * Sets a list property to this object.
	 * 
	 * @param propertyName
	 *            - the name of the property.
	 * @param list
	 *            - a list of objects.
	 */
	public final <M> void setListProperty(String propertyName, List<M> list) {
		this.setProperty(propertyName, convertToJsArray(list));
	}

	/**
	 * Retrieves a javascript array property of this object.
	 * 
	 * @param propertyName
	 *            - the name of the property.
	 * @return an array of objects.
	 */
	public final <M> BaseJsoArray<M> getJsArrayProperty(String propertyName) {
		BaseJsoArray<M> array = null;
		JavaScriptObject arrayObj = this.getJsoProperty(propertyName);
		if (arrayObj != null) {
			try {
				array = arrayObj.cast();
			} catch (Exception ex) {
				// could not cast...
			}
		}
		return array;
	}

	/**
	 * Retrieves an object property of this object.
	 * 
	 * @param propertyName
	 *            - the name of the property.
	 * @return an object.
	 */
	public final native Object getProperty(String propertyName) /*-{
		var obj = null;
		if (propertyName != null) {
			obj = this[propertyName];
		}
		return obj;
	}-*/;

	/**
	 * Retrieves a javascript object property of this object.
	 * 
	 * @param propertyName
	 *            - the name of the property.
	 * @return a javascript object.
	 */
	public final BaseJso getJsoProperty(String propertyName) {
		BaseJso jso = null;
		Object obj = this.getProperty(propertyName);
		if (obj != null) {
			try {
				jso = (BaseJso) obj;
			} catch (Exception ex) {
				// could not cast...
			}
		}
		return jso;
	}

	/**
	 * Sets an object property to this object.
	 * 
	 * @param propertyName
	 *            - the name of the property.
	 * @param object
	 *            - an object
	 */
	public final native void setProperty(String propertyName, Object object) /*-{
		if (propertyName != null) {
			this[propertyName] = object;
		} else {
			delete this[propertyName];
		}
	}-*/;

	/**
	 * Deletes a property of this object.
	 * 
	 * @param propertyName
	 *            - the name of the property.
	 */
	public final native void deleteProperty(String propertyName) /*-{
		if (propertyName != null) {
			delete this[propertyName];
		}
	}-*/;

	/**
	 * Copies the projects from the specified object onto this object.
	 * 
	 * @param properties
	 *            - an object with properties.
	 */
	public final native void setProperties(BaseJso properties) /*-{
		if (properties != null) {
			for ( var k in properties) {
				this[k] = properties[k];
			}
		}
	}-*/;

	/**
	 * Copies the projects from the specified object onto this object.
	 * 
	 * @param propertiesToGet
	 *            - an object with properties.
	 * @return an object with the specified properties from this object.
	 */
	public final BaseJso getProperties(Set<String> propertiesToGet) {
		return getProperties(convertToJsArray(propertiesToGet));
	}

	/**
	 * Copies the projects from the specified object onto this object.
	 * 
	 * @param propertiesToGet
	 *            - an object with properties.
	 * @return an object with the specified properties from this object.
	 */
	protected final native BaseJso getProperties(BaseJsoArray<String> propertiesToGet) /*-{
		var obj = {};
		if (propertiesToGet != null) {
			for ( var k in propertiesToGet) {
				obj[k] = this[k];
			}
		}
		return obj;
	}-*/;
}
