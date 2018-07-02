package com.app.gwt.client.lib.js;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
				b = (Boolean) obj;
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
	 * Retrieves a Short property of this object.
	 * 
	 * @param propertyName
	 *            - the name of the property.
	 * @return a Short value.
	 */
	public final Short getShortProperty(String propertyName) {
		Short s = null;
		Object obj = this.getProperty(propertyName);
		if (obj != null) {
			try {
				s = (Short) obj;
			} catch (Exception ex) {
				// maybe its a string, try that?
				String str = this.getStringProperty(propertyName);
				if (str != null) {
					try {
						s = Short.parseShort(str);
					} catch (Exception ex2) {
						// could not cast...
					}
				}
			}
		}
		return s;
	}

	/**
	 * Retrieves an Integer property of this object.
	 * 
	 * @param propertyName
	 *            - the name of the property.
	 * @return an Integer value.
	 */
	public final Integer getIntegerProperty(String propertyName) {
		Integer i = null;
		Object obj = this.getProperty(propertyName);
		if (obj != null) {
			try {
				i = (Integer) obj;
			} catch (Exception ex) {
				// maybe its a string, try that?
				String str = this.getStringProperty(propertyName);
				if (str != null) {
					try {
						i = Integer.parseInt(str);
					} catch (Exception ex2) {
						// could not cast...
					}
				}
			}
		}
		return i;
	}

	/**
	 * Retrieves a Long property of this object.
	 * 
	 * @param propertyName
	 *            - the name of the property.
	 * @return a Long value.
	 */
	public final Long getLongProperty(String propertyName) {
		Long l = null;
		Object obj = this.getProperty(propertyName);
		if (obj != null) {
			try {
				l = (Long) obj;
			} catch (Exception ex) {
				// maybe its a date, try that?
				Date d = this.getDateProperty(propertyName);
				if (d != null) {
					l = d.getTime();
				} else {
					// maybe its a string, try that?
					String str = this.getStringProperty(propertyName);
					if (str != null) {
						try {
							l = Long.parseLong(str);
						} catch (Exception ex2) {
							// could not cast...
						}
					}
				}
			}
		}
		return l;
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
				// maybe its a long?
				Long dateTime = this.getLongProperty(propertyName);
				if (dateTime != null) {
					d = JsDate.create(dateTime.doubleValue());
				} else {
					// maybe its a string?
					String dateString = this.getStringProperty(propertyName);
					d = JsDate.create(dateString);
				}
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
	public static <M> BaseJsoArray<M> convertToJsArray(List<M> list) {
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
		Object arrayObj = this.getProperty(propertyName);
		if (arrayObj != null) {
			try {
				array = (BaseJsoArray<M>) arrayObj;
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
}
