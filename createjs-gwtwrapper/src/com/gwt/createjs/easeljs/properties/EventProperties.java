package com.gwt.createjs.easeljs.properties;

import com.app.gwt.client.lib.js.BaseJso;
import com.gwt.createjs.easeljs.propertynames.EventPropertyNames;

/**
 * Represents the CreateJS properties of the Event class.
 * 
 * @author James C. Gladfelter
 */
public class EventProperties extends BaseJso implements EventPropertyNames {

	protected EventProperties() {
	}

	/**
	 * Determines whether or not the event will bubble through the display list.
	 * 
	 * @return true / false whether or not the event will bubble through the display
	 *         list.
	 */
	public final Boolean getBubblesProperty() {
		return this.getBooleanProperty(BUBBLES);
	}

	/**
	 * Determines whether or not the default behaviour of this event can be
	 * cancelled via preventDefault. This is set via the Event constructor.
	 * 
	 * @return true / false whether or not the default behaviour of this event can
	 *         be cancelled via preventDefault. This is set via the Event
	 *         constructor.
	 */
	public final Boolean getCancelableProperty() {
		return this.getBooleanProperty(CANCELABLE);
	}

	/**
	 * Retrieves the current target that a bubbling event is being dispatched from.
	 * For non-bubbling events, this will always be the same as target. For example,
	 * if childObj.parent = parentObj, and a bubbling event is generated from
	 * childObj, then a listener on parentObj would receive the event with
	 * target=childObj (the original target) and currentTarget=parentObj (where the
	 * listener was added).
	 * 
	 * @return the current target.
	 */
	public final Object getCurrentTargetProperty() {
		return this.getProperty(CURRENT_TARGET);
	}

	/**
	 * Determinesn whether or not preventDefault has been called on this event.
	 * 
	 * @return true / false whether or not preventDefault has been called on this
	 *         event.
	 */
	public final Boolean getDefaultPreventedProperty() {
		return this.getBooleanProperty(DEFAULT_PREVENTED);
	}

	/**
	 * For bubbling events, this indicates the current event phase:
	 * 
	 * capture phase: starting from the top parent to the target at target phase:
	 * currently being dispatched from the target bubbling phase: from the target to
	 * the top parent
	 * 
	 * @return the current event phase.
	 */
	public final Number getEventPhaseProperty() {
		return this.getNumberProperty(EVENT_PHASE);
	}

	/**
	 * Determines whether or not stopImmediatePropagation has been called on this
	 * event.
	 * 
	 * @return true / false whether or not stopImmediatePropagation has been called
	 *         on this event.
	 */
	public final Boolean getImmediatePropagationStoppedProperty() {
		return this.getBooleanProperty(IMMEDIATE_PROPAGATION_STOPPED);
	}

	/**
	 * Determines whether or not stopPropagation or stopImmediatePropagation has
	 * been called on this event.
	 * 
	 * @return true / false whether or not stopPropagation or
	 *         stopImmediatePropagation has been called on this event.
	 */
	public final Boolean getPropagationStoppedProperty() {
		return this.getBooleanProperty(PROPAGATION_STOPPED);
	}

	/**
	 * Determines whether or not remove has been called on this event.
	 * 
	 * @return true / false whether or not remove has been called on this event.
	 */
	public final Boolean getRemovedProperty() {
		return this.getBooleanProperty(REMOVED);
	}

	/**
	 * Retrieves the object that generated an event.
	 * 
	 * @return the object that generated an event.
	 */
	public final Object getTargetProperty() {
		return this.getProperty(TARGET);
	}

	/**
	 * Retrieves the epoch time at which this event was created.
	 * 
	 * @return the epoch time at which this event was created.
	 */
	public final Number getTimeStampProperty() {
		return this.getNumberProperty(TIME_STAMP);
	}

	/**
	 * Retrieves the type of event
	 * 
	 * @return the type of event
	 */
	public final String getTypeProperty() {
		return this.getStringProperty(TYPE);
	}

	/**
	 * Sets the type of event
	 * 
	 * @param type
	 *            - the type of event
	 */
	public final void setTypeProperty(String type) {
		this.setProperty(TYPE, type);
	}
}
