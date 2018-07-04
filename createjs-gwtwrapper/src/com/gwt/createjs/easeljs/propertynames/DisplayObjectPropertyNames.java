package com.gwt.createjs.easeljs.propertynames;

/**
 * Represents the CreateJS property names of the DisplayObject class.
 * 
 * @author James C. Gladfelter
 */
public interface DisplayObjectPropertyNames extends EventDispatcherPropertyNames {

	/**
	 * The alpha (transparency) for this display object. 0 is fully transparent, 1
	 * is fully opaque.
	 */
	public static final String ALPHA = "alpha";

	/**
	 * If a cache has been made, this returns the class that is managing the
	 * cacheCanvas and its properties. See BitmapCache for more information. Use
	 * this to control, inspect, and change the cache. In special circumstances this
	 * may be a modified or subclassed BitmapCache
	 */
	public static final String BITMAP_CACHE = "bitmapCache";

	/**
	 * If a cache is active, this returns the canvas that holds the image of this
	 * display object. See cache for more information. Use this to display the
	 * result of a cache. This will be a HTMLCanvasElement unless special cache
	 * rules have been deliberately enabled for this cache.
	 */
	public static final String CACHE_CANVAS = "cacheCanvas";

	/**
	 * The composite operation indicates how the pixels of this display object will
	 * be composited with the elements behind it. If null, this property is
	 * inherited from the parent container. For more information, read the whatwg
	 * spec on compositing. For a list of supported compositeOperation value, visit
	 * the W3C draft on Compositing and Blending.
	 */
	public static final String COMPOSITE_OPERATION = "compositeOperation";

	/**
	 * A CSS cursor (ex. "pointer", "help", "text", etc) that will be displayed when
	 * the user hovers over this display object. You must enable mouseover events
	 * using the enableMouseOver method to use this property. Setting a non-null
	 * cursor on a Container will override the cursor set on its descendants.
	 */
	public static final String CURSOR = "cursor";

	/**
	 * An array of Filter objects to apply to this display object. Filters are only
	 * applied / updated when Cache or UpdateCache is called on the display object,
	 * and only apply to the area that is cached.
	 */
	public static final String FILTERS = "filters";

	/**
	 * A display object that will be tested when checking mouse interactions or
	 * testing getObjectsUnderPoint. The hit area will have its transformation
	 * applied relative to this display object's coordinate space (as though the hit
	 * test object were a child of this display object and relative to its regX/Y).
	 * The hitArea will be tested using only its own alpha value regardless of the
	 * alpha value on the target display object, or the target's ancestors
	 * (parents).
	 * 
	 * If set on a Container, children of the Container will not receive mouse
	 * events. This is similar to setting MouseChildren to false.
	 * 
	 * Note that hitArea is NOT currently used by the hitTest() method, nor is it
	 * supported for Stage.
	 */
	public static final String HIT_AREA = "hitArea";

	/**
	 * Unique ID for this display object. Makes display objects easier for some
	 * uses.
	 */
	public static final String ID = "id";

	/**
	 * A Shape instance that defines a vector mask (clipping path) for this display
	 * object. The shape's transformation will be applied relative to the display
	 * object's parent coordinates (as if it were a child of the parent).
	 */
	public static final String MASK = "mask";

	/**
	 * Indicates whether to include this object when running mouse interactions.
	 * Setting this to false for children of a Container will cause events on the
	 * Container to not fire when that child is clicked. Setting this property to
	 * false does not prevent the getObjectsUnderPoint method from returning the
	 * child.
	 * 
	 * Note: In EaselJS 0.7.0, the mouseEnabled property will not work properly with
	 * nested Containers. Please check out the latest NEXT version in GitHub for an
	 * updated version with this issue resolved. The fix will be provided in the
	 * next release of EaselJS.
	 */
	public static final String MOUSE_ENABLED = "mouseEnabled";

	/**
	 * An optional name for this display object. Included in toString . Useful for
	 * debugging.
	 */
	public static final String NAME = "name";

	/**
	 * A reference to the Container or Stage object that contains this display
	 * object, or null if it has not been added to one.
	 */
	public static final String PARENT = "parent";

	/**
	 * The left offset for this display object's registration point. For example, to
	 * make a 100x100px Bitmap rotate around its center, you would set regX and regY
	 * to 50. Cached object's registration points should be set based on pre-cache
	 * conditions, not cached size.
	 */
	public static final String REG_X = "regX";

	/**
	 * The y offset for this display object's registration point. For example, to
	 * make a 100x100px Bitmap rotate around its center, you would set regX and regY
	 * to 50. Cached object's registration points should be set based on pre-cache
	 * conditions, not cached size.
	 */
	public static final String REG_Y = "regY";

	/**
	 * The rotation in degrees for this display object.
	 */
	public static final String ROTATION = "rotation";

	/**
	 * Set both the scaleX and the scaleY property to the same value. Note that when
	 * you get the value, if the scaleX and scaleY are different values, it will
	 * return only the scaleX.
	 */
	public static final String SCALE = "scale";

	/**
	 * The factor to stretch this display object horizontally. For example, setting
	 * scaleX to 2 will stretch the display object to twice its nominal width. To
	 * horizontally flip an object, set the scale to a negative number.
	 */
	public static final String SCALE_X = "scaleX";

	/**
	 * The factor to stretch this display object vertically. For example, setting
	 * scaleY to 0.5 will stretch the display object to half its nominal height. To
	 * vertically flip an object, set the scale to a negative number.
	 */
	public static final String SCALE_Y = "scaleY";

	/**
	 * A shadow object that defines the shadow to render on this display object. Set
	 * to null to remove a shadow. If null, this property is inherited from the
	 * parent container.
	 */
	public static final String SHADOW = "shadow";

	/**
	 * The factor to skew this display object horizontally.
	 */
	public static final String SKEW_X = "skewX";

	/**
	 * The factor to skew this display object vertically.
	 */
	public static final String SKEW_Y = "skewY";

	/**
	 * Indicates whether the display object should be drawn to a whole pixel when
	 * snapToPixelEnabled is true. To enable/disable snapping on whole categories of
	 * display objects, set this value on the prototype (Ex.
	 * Text.prototype.snapToPixel = true).
	 */
	public static final String SNAP_TO_PIXEL = "snapToPixel";

	/**
	 * Returns the Stage instance that this display object will be rendered on, or
	 * null if it has not been added to one.
	 */
	public static final String STAGE = "stage";

	/**
	 * If false, the tick will not run on this display object (or its children).
	 * This can provide some performance benefits. In addition to preventing the
	 * "tick" event from being dispatched, it will also prevent tick related updates
	 * on some display objects (ex. Sprite & MovieClip frame advancing, and
	 * DOMElement display properties).
	 */
	public static final String TICK_ENABLED = "tickEnabled";

	/**
	 * If set, defines the transformation for this display object, overriding all
	 * other transformation properties (x, y, rotation, scale, skew).
	 */
	public static final String TRANSFORM_MATRIX = "transformMatrix";

	/**
	 * Indicates whether this display object should be rendered to the canvas and
	 * included when running the Stage getObjectsUnderPoint method.
	 */
	public static final String VISIBLE = "visible";

	/**
	 * The x (horizontal) position of the display object, relative to its parent.
	 */
	public static final String X = "x";

	/**
	 * The y (vertical) position of the display object, relative to its parent.
	 */
	public static final String Y = "y";
}
