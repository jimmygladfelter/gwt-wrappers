package com.gwt.createjs.easeljs.propertynames;

/**
 * Represents the CreateJS property names of the Event class.
 * 
 * @author James C. Gladfelter
 */
public interface EventPropertyNames {

	/**
	 * Indicates whether the event will bubble through the display list.
	 */
	public static final String BUBBLES = "bubbles";

	/**
	 * Indicates whether the default behaviour of this event can be cancelled via
	 * preventDefault. This is set via the Event constructor.
	 */
	public static final String CANCELABLE = "cancelable";

	/**
	 * The current target that a bubbling event is being dispatched from. For
	 * non-bubbling events, this will always be the same as target. For example, if
	 * childObj.parent = parentObj, and a bubbling event is generated from childObj,
	 * then a listener on parentObj would receive the event with target=childObj
	 * (the original target) and currentTarget=parentObj (where the listener was
	 * added).
	 */
	public static final String CURRENT_TARGET = "currentTarget";

	/**
	 * Indicates if preventDefault has been called on this event.
	 */
	public static final String DEFAULT_PREVENTED = "defaultPrevented";

	/**
	 * For bubbling events, this indicates the current event phase:
	 * 
	 * capture phase: starting from the top parent to the target at target phase:
	 * currently being dispatched from the target bubbling phase: from the target to
	 * the top parent
	 */
	public static final String EVENT_PHASE = "eventPhase";

	/**
	 * Indicates if stopImmediatePropagation has been called on this event.
	 */
	public static final String IMMEDIATE_PROPAGATION_STOPPED = "immediatePropagationStopped";

	/**
	 * Indicates if stopPropagation or stopImmediatePropagation has been called on
	 * this event.
	 */
	public static final String PROPAGATION_STOPPED = "propagationStopped";

	/**
	 * Indicates if remove has been called on this event.
	 */
	public static final String REMOVED = "removed";

	/**
	 * The object that generated an event.
	 */
	public static final String TARGET = "target";

	/**
	 * The epoch time at which this event was created.
	 */
	public static final String TIME_STAMP = "timeStamp";

	/**
	 * The type of event.
	 */
	public static final String TYPE = "type";
}
