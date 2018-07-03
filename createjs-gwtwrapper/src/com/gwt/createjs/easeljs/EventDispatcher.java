package com.gwt.createjs.easeljs;

import com.app.gwt.client.lib.js.BaseJso;
import com.gwt.createjs.base.CreateJsEventHandler;
import com.gwt.createjs.easeljs.properties.EventDispatcherProperties;

/**
 * Represents the CreateJS - EventDispatcher class.<br/>
 * EventDispatcher provides methods for managing queues of event listeners and
 * dispatching events.
 * 
 * You can either extend EventDispatcher or mix its methods into an existing
 * prototype or instance by using the EventDispatcher initialize method.
 * 
 * Together with the CreateJS Event class, EventDispatcher provides an extended
 * event model that is based on the DOM Level 2 event model, including
 * addEventListener, removeEventListener, and dispatchEvent. It supports
 * bubbling / capture, preventDefault, stopPropagation,
 * stopImmediatePropagation, and handleEvent.
 * 
 * EventDispatcher also exposes a on method, which makes it easier to create
 * scoped listeners, listeners that only run once, and listeners with associated
 * arbitrary data. The off method is merely an alias to removeEventListener.
 * 
 * Another addition to the DOM Level 2 model is the removeAllEventListeners
 * method, which can be used to listeners for all events, or listeners for a
 * specific event. The Event object also includes a remove method which removes
 * the active listener.
 * 
 * @author James C. Gladfelter
 */
public class EventDispatcher extends EventDispatcherProperties {

	protected EventDispatcher() {
	}

	/**
	 * Adds the specified event listener. Note that adding multiple listeners to the
	 * same function will result in multiple callbacks getting fired.
	 * 
	 * @param type
	 *            - the string type of the event.
	 * @param handler
	 *            - an object with a handleEvent method, or a function that will be
	 *            called when the event is dispatched.
	 * @return the listener for chaining or assignment.
	 */
	public final void addEventListener(String type, CreateJsEventHandler handler) {
		this.addEventListener(type, handler, false);
	}

	/**
	 * Adds the specified event listener. Note that adding multiple listeners to the
	 * same function will result in multiple callbacks getting fired.
	 * 
	 * @param type
	 *            - the string type of the event.
	 * @param handler
	 *            - an object with a handleEvent method, or a function that will be
	 *            called when the event is dispatched.
	 * @param useCapture
	 *            - For events that bubble, indicates whether to listen for the
	 *            event in the capture or bubbling/target phase.
	 * @return the listener for chaining or assignment.
	 */
	public final native void addEventListener(String type, CreateJsEventHandler handler, boolean useCapture) /*-{
		if (type != null && handler != null) {
			var listener = function handleEvent(event) {
				handler.@com.gwt.createjs.base.CreateJsEventHandler::onEvent(Lcom/gwt/createjs/easeljs/Event;Lcom/app/gwt/client/lib/js/BaseJso;)(event, data);
			};
			handler['listener'] = listener;
			this.addEventListener(type, listener, useCapture);
		}
	}-*/;

	/**
	 * Dispatches the specified event to all listeners.
	 * 
	 * @param type
	 *            - an object with a "type" property, or a string type. While a
	 *            generic object will work, it is recommended to use a CreateJS
	 *            Event instance. If a string is used, dispatchEvent will construct
	 *            an Event instance if necessary with the specified type. This
	 *            latter approach can be used to avoid event object instantiation
	 *            for non-bubbling events that may not have any listeners.
	 * @return false if preventDefault() was called on a cancelable event, true
	 *         otherwise.
	 */
	public final native boolean dispatchEvent(String type) /*-{
		return this.dispatchEvent(type);
	}-*/;

	/**
	 * Dispatches the specified event to all listeners.
	 * 
	 * @param type
	 *            - an object with a "type" property, or a string type. While a
	 *            generic object will work, it is recommended to use a CreateJS
	 *            Event instance. If a string is used, dispatchEvent will construct
	 *            an Event instance if necessary with the specified type. This
	 *            latter approach can be used to avoid event object instantiation
	 *            for non-bubbling events that may not have any listeners.
	 * @param bubbles
	 *            - specifies the bubbles value when a string was passed to
	 *            eventObj.
	 * @param cancelable
	 *            - specifies the cancelable value when a string was passed to
	 *            eventObj.
	 * @return false if preventDefault() was called on a cancelable event, true
	 *         otherwise.
	 */
	public final native boolean dispatchEvent(String type, boolean bubbles, boolean cancelable) /*-{
		return this.dispatchEvent(type, bubbles, cancelable);
	}-*/;

	/**
	 * Dispatches the specified event to all listeners.
	 * 
	 * @param event
	 *            - an object with a "type" property, or a string type. While a
	 *            generic object will work, it is recommended to use a CreateJS
	 *            Event instance. If a string is used, dispatchEvent will construct
	 *            an Event instance if necessary with the specified type. This
	 *            latter approach can be used to avoid event object instantiation
	 *            for non-bubbling events that may not have any listeners.
	 * @return false if preventDefault() was called on a cancelable event, true
	 *         otherwise.
	 */
	public final native boolean dispatchEvent(Event event) /*-{
		return this.dispatchEvent(event);
	}-*/;

	/**
	 * Dispatches the specified event to all listeners.
	 * 
	 * @param event
	 *            - an object with a "type" property, or a string type. While a
	 *            generic object will work, it is recommended to use a CreateJS
	 *            Event instance. If a string is used, dispatchEvent will construct
	 *            an Event instance if necessary with the specified type. This
	 *            latter approach can be used to avoid event object instantiation
	 *            for non-bubbling events that may not have any listeners.
	 * @param bubbles
	 *            - specifies the bubbles value when a string was passed to
	 *            eventObj.
	 * @param cancelable
	 *            - specifies the cancelable value when a string was passed to
	 *            eventObj.
	 * @return false if preventDefault() was called on a cancelable event, true
	 *         otherwise.
	 */
	public final native boolean dispatchEvent(Event event, boolean bubbles, boolean cancelable) /*-{
		return this.dispatchEvent(event, bubbles, cancelable);
	}-*/;

	/**
	 * Determines whether or not there is at least one listener for the specified
	 * event type.
	 * 
	 * @param type
	 *            -the string type of the event.
	 * @return true / false whether or not there is at least one listener for the
	 *         specified event type.
	 */
	public final native boolean hasEventListener(String type) /*-{
		return this.hasEventListener(type);
	}-*/;

	/**
	 * A shortcut to the removeEventListener method, with the same parameters and
	 * return value. This is a companion to the .on method.
	 * 
	 * IMPORTANT: To remove a listener added with on, you must pass in the returned
	 * wrapper function as the listener. See on for an example.
	 * 
	 * @param type
	 *            - the string type of the event.
	 * @param listener
	 *            - the listener function or object.
	 */
	public final void off(String type, CreateJsEventHandler handler) {
		this.off(type, handler, false);
	}

	/**
	 * A shortcut to the removeEventListener method, with the same parameters and
	 * return value. This is a companion to the .on method.
	 * 
	 * IMPORTANT: To remove a listener added with on, you must pass in the returned
	 * wrapper function as the listener. See on for an example.
	 * 
	 * @param type
	 *            - the string type of the event.
	 * @param listener
	 *            - the listener function or object.
	 * @param useCapture
	 *            - for events that bubble, indicates whether to listen for the
	 *            event in the capture or bubbling/target phase.
	 */
	public final native void off(String type, CreateJsEventHandler handler, boolean useCapture) /*-{
		if (type != null && handler != null) {
			this.off(type, handler['listener'], useCapture);
		}
	}-*/;

	/**
	 * A shortcut method for using addEventListener that makes it easier to specify
	 * an execution scope, have a listener only run once, associate arbitrary data
	 * with the listener, and remove the listener.
	 * 
	 * This method works by creating an anonymous wrapper function and subscribing
	 * it with addEventListener. The wrapper function is returned for use with
	 * removeEventListener (or off).
	 * 
	 * IMPORTANT: To remove a listener added with on, you must pass in the returned
	 * wrapper function as the listener, or use remove. Likewise, each time you call
	 * on a NEW wrapper function is subscribed, so multiple calls to on with the
	 * same params will create multiple listeners.
	 * 
	 * @param type
	 *            - the string type of the event.
	 * @param listener
	 *            - an object with a handleEvent method, or a function that will be
	 *            called when the event is dispatched.
	 */
	public final void on(String type, CreateJsEventHandler handler) {
		this.on(type, handler, null, false, null, false);
	}

	/**
	 * A shortcut method for using addEventListener that makes it easier to specify
	 * an execution scope, have a listener only run once, associate arbitrary data
	 * with the listener, and remove the listener.
	 * 
	 * This method works by creating an anonymous wrapper function and subscribing
	 * it with addEventListener. The wrapper function is returned for use with
	 * removeEventListener (or off).
	 * 
	 * IMPORTANT: To remove a listener added with on, you must pass in the returned
	 * wrapper function as the listener, or use remove. Likewise, each time you call
	 * on a NEW wrapper function is subscribed, so multiple calls to on with the
	 * same params will create multiple listeners.
	 * 
	 * @param type
	 *            - the string type of the event.
	 * @param listener
	 *            - an object with a handleEvent method, or a function that will be
	 *            called when the event is dispatched.
	 * @param scope
	 *            - the scope to execute the listener in. Defaults to the
	 *            dispatcher/currentTarget for function listeners, and to the
	 *            listener itself for object listeners (ie. using handleEvent).
	 * @param once
	 *            - if true, the listener will remove itself after the first time it
	 *            is triggered.
	 * @param data
	 *            - arbitrary data that will be included as the second parameter
	 *            when the listener is called.
	 * @param useCapture
	 *            - for events that bubble, indicates whether to listen for the
	 *            event in the capture or bubbling/target phase
	 */
	public final native void on(String type, CreateJsEventHandler handler, BaseJso scope, boolean once, BaseJso data,
			boolean useCapture) /*-{
		if (type != null && handler != null) {
			var listener = function handleEvent(event, data) {
				handler.@com.gwt.createjs.base.CreateJsEventHandler::onEvent(Lcom/gwt/createjs/easeljs/Event;Lcom/app/gwt/client/lib/js/BaseJso;)(event, data);
			};
			handler['listener'] = listener;
			this.on(type, listener, scope, once, data, useCapture);
		}
	}-*/;

	/**
	 * Removes all listeners for the specified type, or all listeners of all types.
	 */
	public final void removeAllEventListeners() {
		this.removeAllEventListeners(null);
	}

	/**
	 * Removes all listeners for the specified type, or all listeners of all types.
	 * 
	 * @param type
	 *            - the string type of the event. If omitted, all listeners for all
	 *            types will be removed.
	 */
	public final native void removeAllEventListeners(String type) /*-{
		if (type != null) {
			this.removeAllEventListeners(type);
		} else {
			this.removeAllEventListeners();
		}
	}-*/;

	/**
	 * Removes the specified event listener.
	 * 
	 * Important Note: that you must pass the exact function reference used when the
	 * event was added. If a proxy function, or function closure is used as the
	 * callback, the proxy/closure reference must be used - a new proxy or closure
	 * will not work.
	 * 
	 * @param type
	 *            - the string type of the event.
	 * @param handler
	 *            - the listener function or object.
	 */
	public final void removeEventListener(String type, CreateJsEventHandler handler) {
		this.removeEventListener(type, handler, false);
	}

	/**
	 * Removes the specified event listener.
	 * 
	 * Important Note: that you must pass the exact function reference used when the
	 * event was added. If a proxy function, or function closure is used as the
	 * callback, the proxy/closure reference must be used - a new proxy or closure
	 * will not work.
	 * 
	 * @param type
	 *            - the string type of the event.
	 * @param handler
	 *            - the listener function or object.
	 * @param useCapture
	 *            - for events that bubble, indicates whether to listen for the
	 *            event in the capture or bubbling/target phase.
	 */
	public final native void removeEventListener(String type, CreateJsEventHandler handler, boolean useCapture) /*-{
		if (type != null && handler != null) {
			this.removeEventListener(type, handler['listener'], useCapture);
		}
	}-*/;

	/**
	 * Indicates whether there is at least one listener for the specified event type
	 * on this object or any of its ancestors (parent, parent's parent, etc). A
	 * return value of true indicates that if a bubbling event of the specified type
	 * is dispatched from this object, it will trigger at least one listener.
	 * 
	 * This is similar to hasEventListener, but it searches the entire event flow
	 * for a listener, not just this object.
	 * 
	 * @param type
	 *            - the string type of the event.
	 * @return true if there is at least one listener for the specified event.
	 */
	public final native boolean willTrigger(String type) /*-{
		return this.willTrigger(type);
	}-*/;
}
