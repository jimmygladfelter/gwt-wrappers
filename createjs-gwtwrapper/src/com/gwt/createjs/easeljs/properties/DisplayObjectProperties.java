package com.gwt.createjs.easeljs.properties;

import java.util.List;

import com.app.gwt.client.lib.js.BaseJso;
import com.gwt.createjs.easeljs.Filter;
import com.gwt.createjs.easeljs.propertynames.DisplayObjectPropertyNames;

/**
 * Represents the CreateJS properties of the DisplayObject class. DisplayObject
 * is an abstract class that should not be constructed directly. Instead
 * construct subclasses such as Container, Bitmap, and Shape. DisplayObject is
 * the base class for all display classes in the EaselJS library. It defines the
 * core properties and methods that are shared between all display objects, such
 * as transformation properties (x, y, scaleX, scaleY, etc), caching, and mouse
 * handlers.
 * 
 * @author James C. Gladfelter
 */
public class DisplayObjectProperties extends EventDispatcherProperties implements DisplayObjectPropertyNames {

	protected DisplayObjectProperties() {
	}

	/**
	 * Retrieves the alpha (transparency) for this display object. 0 is fully
	 * transparent, 1 is fully opaque.
	 * 
	 * @return the alpha (transparency) for this display object. 0 is fully
	 *         transparent, 1 is fully opaque.
	 */
	public Number getAlphaProperty() {
		return this.getNumberProperty(ALPHA);
	}

	/**
	 * Sets the alpha (transparency) for this display object. 0 is fully
	 * transparent, 1 is fully opaque.
	 * 
	 * @param alpha
	 *            - the alpha (transparency) for this display object. 0 is fully
	 *            transparent, 1 is fully opaque.
	 */
	public void setAlphaProperty(Number alpha) {
		this.setProperty(ALPHA, alpha);
	}

	/**
	 * If a cache has been made, this returns the class that is managing the
	 * cacheCanvas and its properties. See BitmapCache for more information. Use
	 * this to control, inspect, and change the cache. In special circumstances this
	 * may be a modified or subclassed BitmapCache.
	 * 
	 * @return If a cache has been made, this returns the class that is managing the
	 *         cacheCanvas and its properties. See BitmapCache for more information.
	 *         Use this to control, inspect, and change the cache. In special
	 *         circumstances this may be a modified or subclassed BitmapCache.
	 */
	public BitmapCache getBitmapCacheProperty() {

	}

	/**
	 * If a cache is active, this returns the canvas that holds the image of this
	 * display object. See cache for more information. Use this to display the
	 * result of a cache. This will be a HTMLCanvasElement unless special cache
	 * rules have been deliberately enabled for this cache.
	 * 
	 * @return If a cache is active, this returns the canvas that holds the image of
	 *         this display object. See cache for more information. Use this to
	 *         display the result of a cache. This will be a HTMLCanvasElement
	 *         unless special cache rules have been deliberately enabled for this
	 *         cache.
	 */
	public BaseJso getCacheCanvasProperty() {
		return this.getJsoProperty(CACHE_CANVAS);
	}

	/**
	 * Retrieves the composite operation indicates how the pixels of this display
	 * object will be composited with the elements behind it. If null, this property
	 * is inherited from the parent container. For more information, read the whatwg
	 * spec on compositing. For a list of supported compositeOperation value, visit
	 * the W3C draft on Compositing and Blending.
	 * 
	 * @return the composite operation indicates how the pixels of this display
	 *         object will be composited with the elements behind it. If null, this
	 *         property is inherited from the parent container. For more
	 *         information, read the whatwg spec on compositing. For a list of
	 *         supported compositeOperation value, visit the W3C draft on
	 *         Compositing and Blending.
	 */
	public String getCompositeOperationProperty() {
		return this.getStringProperty(COMPOSITE_OPERATION);
	}

	/**
	 * Sets the composite operation indicates how the pixels of this display object
	 * will be composited with the elements behind it. If null, this property is
	 * inherited from the parent container. For more information, read the whatwg
	 * spec on compositing. For a list of supported compositeOperation value, visit
	 * the W3C draft on Compositing and Blending.
	 * 
	 * @param compositeOperation
	 *            - the composite operation indicates how the pixels of this display
	 *            object will be composited with the elements behind it. If null,
	 *            this property is inherited from the parent container. For more
	 *            information, read the whatwg spec on compositing. For a list of
	 *            supported compositeOperation value, visit the W3C draft on
	 *            Compositing and Blending.
	 */
	public void setCompositeOperationProperty(String compositeOperation) {
		this.setProperty(COMPOSITE_OPERATION, compositeOperation);
	}

	/**
	 * Retrieves a CSS cursor (ex. "pointer", "help", "text", etc) that will be
	 * displayed when the user hovers over this display object. You must enable
	 * mouseover events using the enableMouseOver method to use this property.
	 * Setting a non-null cursor on a Container will override the cursor set on its
	 * descendants.
	 * 
	 * @return a CSS cursor (ex. "pointer", "help", "text", etc) that will be
	 *         displayed when the user hovers over this display object. You must
	 *         enable mouseover events using the enableMouseOver method to use this
	 *         property. Setting a non-null cursor on a Container will override the
	 *         cursor set on its descendants.
	 */
	public String getCursorProperty() {
		return this.getStringProperty(CURSOR);
	}

	/**
	 * Sets a CSS cursor (ex. "pointer", "help", "text", etc) that will be displayed
	 * when the user hovers over this display object. You must enable mouseover
	 * events using the enableMouseOver method to use this property. Setting a
	 * non-null cursor on a Container will override the cursor set on its
	 * descendants.
	 * 
	 * @param cursor
	 *            - a CSS cursor (ex. "pointer", "help", "text", etc) that will be
	 *            displayed when the user hovers over this display object. You must
	 *            enable mouseover events using the enableMouseOver method to use
	 *            this property. Setting a non-null cursor on a Container will
	 *            override the cursor set on its descendants.
	 */
	public void setCursorProperty(String cursor) {
		this.setProperty(CURSOR, cursor);
	}

	/**
	 * Retrieves an array of Filter objects to apply to this display object. Filters
	 * are only applied / updated when Cache or UpdateCache is called on the display
	 * object, and only apply to the area that is cached.
	 * 
	 * @return an array of Filter objects to apply to this display object. Filters
	 *         are only applied / updated when Cache or UpdateCache is called on the
	 *         display object, and only apply to the area that is cached.
	 */
	public List<? extends Filter<?>> getFiltersProperty() {
		return this.getListProperty(FILTERS);
	}

	/**
	 * Sets an array of Filter objects to apply to this display object. Filters are
	 * only applied / updated when Cache or UpdateCache is called on the display
	 * object, and only apply to the area that is cached.
	 * 
	 * @param filters
	 *            - an array of Filter objects to apply to this display object.
	 *            Filters are only applied / updated when Cache or UpdateCache is
	 *            called on the display object, and only apply to the area that is
	 *            cached.
	 */
	public void setFiltersProperty(List<? extends Filter<?>> filters) {
		this.setListProperty(FILTERS, filters);
	}

	/**
	 * Retrieves a display object that will be tested when checking mouse
	 * interactions or testing getObjectsUnderPoint. The hit area will have its
	 * transformation applied relative to this display object's coordinate space (as
	 * though the hit test object were a child of this display object and relative
	 * to its regX/Y). The hitArea will be tested using only its own alpha value
	 * regardless of the alpha value on the target display object, or the target's
	 * ancestors (parents).
	 * 
	 * If set on a Container, children of the Container will not receive mouse
	 * events. This is similar to setting MouseChildren to false.
	 * 
	 * Note that hitArea is NOT currently used by the hitTest() method, nor is it
	 * supported for Stage.
	 * 
	 * @return see above
	 */
	public DisplayObject getHitAreaProperty() {

	}

	/**
	 * Sets a display object that will be tested when checking mouse interactions or
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
	 * 
	 * @param hitArea
	 *            - see above
	 */
	public void setHitAreaProperty(DisplayObject hitArea) {

	}

	/**
	 * Retrieves a unique ID for this display object. Makes display objects easier
	 * for some uses.
	 * 
	 * @return a unique ID for this display object. Makes display objects easier for
	 *         some uses.
	 */
	public Number getIdProperty() {
		return this.getNumberProperty(ID);
	}

	/**
	 * Sets a unique ID for this display object. Makes display objects easier for
	 * some uses.
	 * 
	 * @param id
	 *            - a unique ID for this display object. Makes display objects
	 *            easier for some uses.
	 */
	public void setIdProperty(Number id) {
		this.setNumberProperty(ID, id);
	}

	/**
	 * Retrieves a Shape instance that defines a vector mask (clipping path) for
	 * this display object. The shape's transformation will be applied relative to
	 * the display object's parent coordinates (as if it were a child of the
	 * parent).
	 * 
	 * @return - a Shape instance that defines a vector mask (clipping path) for
	 *         this display object. The shape's transformation will be applied
	 *         relative to the display object's parent coordinates (as if it were a
	 *         child of the parent).
	 */
	public Shape getMaskProperty() {
	}

	/**
	 * Sets a Shape instance that defines a vector mask (clipping path) for this
	 * display object. The shape's transformation will be applied relative to the
	 * display object's parent coordinates (as if it were a child of the parent).
	 * 
	 * @param mask
	 *            - a Shape instance that defines a vector mask (clipping path) for
	 *            this display object. The shape's transformation will be applied
	 *            relative to the display object's parent coordinates (as if it were
	 *            a child of the parent).
	 */
	public void setMaskProperty(Shape mask) {
	}

	/**
	 * Determines whether to include this object when running mouse interactions.
	 * Setting this to false for children of a Container will cause events on the
	 * Container to not fire when that child is clicked. Setting this property to
	 * false does not prevent the getObjectsUnderPoint method from returning the
	 * child.
	 * 
	 * Note: In EaselJS 0.7.0, the mouseEnabled property will not work properly with
	 * nested Containers. Please check out the latest NEXT version in GitHub for an
	 * updated version with this issue resolved. The fix will be provided in the
	 * next release of EaselJS.
	 * 
	 * @return true / false whether to include this object when running mouse
	 *         interactions.
	 */
	public Boolean getMouseEnabledProperty() {
		return this.getBooleanProperty(MOUSE_ENABLED);
	}

	/**
	 * Sets whether to include this object when running mouse interactions. Setting
	 * this to false for children of a Container will cause events on the Container
	 * to not fire when that child is clicked. Setting this property to false does
	 * not prevent the getObjectsUnderPoint method from returning the child.
	 * 
	 * Note: In EaselJS 0.7.0, the mouseEnabled property will not work properly with
	 * nested Containers. Please check out the latest NEXT version in GitHub for an
	 * updated version with this issue resolved. The fix will be provided in the
	 * next release of EaselJS.
	 * 
	 * @param mouseEnabled
	 *            - true / false whether to include this object when running mouse
	 *            interactions.
	 */
	public void setMouseEnabledProperty(Boolean mouseEnabled) {
		this.setBooleanProperty(MOUSE_ENABLED, mouseEnabled);
	}

	/**
	 * Retrieves an optional name for this display object. Included in toString .
	 * Useful for debugging.
	 * 
	 * @return an optional name for this display object. Included in toString .
	 *         Useful for debugging.
	 */
	public String getNameProperty() {
		return this.getStringProperty(NAME);
	}

	/**
	 * Sets an optional name for this display object. Included in toString . Useful
	 * for debugging.
	 * 
	 * @param name
	 *            - an optional name for this display object. Included in toString .
	 *            Useful for debugging.
	 */
	public void setNameProperty(String name) {
		this.setProperty(NAME, name);
	}

	/**
	 * Retrieves a reference to the Container or Stage object that contains this
	 * display object, or null if it has not been added to one.
	 * 
	 * @return a reference to the Container or Stage object that contains this
	 *         display object, or null if it has not been added to one.
	 */
	public Container getParentProperty() {
		
	}

	/**
	 * Retrieves the left offset for this display object's registration point. For
	 * example, to make a 100x100px Bitmap rotate around its center, you would set
	 * regX and regY to 50. Cached object's registration points should be set based
	 * on pre-cache conditions, not cached size.
	 * 
	 * @return the left offset for this display object's registration point. For
	 *         example, to make a 100x100px Bitmap rotate around its center, you
	 *         would set regX and regY to 50. Cached object's registration points
	 *         should be set based on pre-cache conditions, not cached size.
	 */
	public Number getRegXProperty() {
		return this.getNumberProperty(REG_X);
	}

	/**
	 * Sets the left offset for this display object's registration point. For
	 * example, to make a 100x100px Bitmap rotate around its center, you would set
	 * regX and regY to 50. Cached object's registration points should be set based
	 * on pre-cache conditions, not cached size.
	 * 
	 * @param regX
	 *            - the left offset for this display object's registration point.
	 *            For example, to make a 100x100px Bitmap rotate around its center,
	 *            you would set regX and regY to 50. Cached object's registration
	 *            points should be set based on pre-cache conditions, not cached
	 *            size.
	 */
	public void setRegXProperty(Number regX) {
		this.setNumberProperty(REG_X, regX);
	}

	/**
	 * Retrieves the y offset for this display object's registration point. For
	 * example, to make a 100x100px Bitmap rotate around its center, you would set
	 * regX and regY to 50. Cached object's registration points should be set based
	 * on pre-cache conditions, not cached size.
	 * 
	 * @return the y offset for this display object's registration point. For
	 *         example, to make a 100x100px Bitmap rotate around its center, you
	 *         would set regX and regY to 50. Cached object's registration points
	 *         should be set based on pre-cache conditions, not cached size.
	 */
	public Number getRegYProperty() {
		return this.getNumberProperty(REG_Y);
	}

	/**
	 * Sets the y offset for this display object's registration point. For example,
	 * to make a 100x100px Bitmap rotate around its center, you would set regX and
	 * regY to 50. Cached object's registration points should be set based on
	 * pre-cache conditions, not cached size.
	 * 
	 * @param regY
	 *            - the y offset for this display object's registration point. For
	 *            example, to make a 100x100px Bitmap rotate around its center, you
	 *            would set regX and regY to 50. Cached object's registration points
	 *            should be set based on pre-cache conditions, not cached size.
	 */
	public void setRegYProperty(Number regY) {
		this.setNumberProperty(REG_Y, regY);
	}

	/**
	 * Retrieves the rotation in degrees for this display object.
	 * 
	 * @return the rotation in degrees for this display object.
	 */
	public Number getRotationProperty() {
		return this.getNumberProperty(ROTATION);
	}

	/**
	 * Sets the rotation in degrees for this display object.
	 * 
	 * @param rotation
	 *            - the rotation in degrees for this display object.
	 */
	public void setRotationProperty(Number rotation) {
		this.setNumberProperty(ROTATION, rotation);
	}

	/**
	 * Set both the scaleX and the scaleY property to the same value. Note that when
	 * you get the value, if the scaleX and scaleY are different values, it will
	 * return only the scaleX.
	 * 
	 * @return the scale value or scaleX if both scaleX and scaleY are different.
	 */
	public Number getScaleProperty() {
		return this.getNumberProperty(SCALE);
	}

	/**
	 * Set both the scaleX and the scaleY property to the same value. Note that when
	 * you get the value, if the scaleX and scaleY are different values, it will
	 * return only the scaleX.
	 * 
	 * @param scale
	 *            - the scale value.
	 */
	public void setScaleProperty(Number scale) {
		this.setNumberProperty(SCALE, scale);
	}

	/**
	 * Retrieves the factor to stretch this display object horizontally. For
	 * example, setting scaleX to 2 will stretch the display object to twice its
	 * nominal width. To horizontally flip an object, set the scale to a negative
	 * number.
	 * 
	 * @return the factor to stretch this display object horizontally. For example,
	 *         setting scaleX to 2 will stretch the display object to twice its
	 *         nominal width. To horizontally flip an object, set the scale to a
	 *         negative number.
	 */
	public Number getScaleXProperty() {
		return this.getNumberProperty(SCALE_X);
	}

	/**
	 * Sets the factor to stretch this display object horizontally. For example,
	 * setting scaleX to 2 will stretch the display object to twice its nominal
	 * width. To horizontally flip an object, set the scale to a negative number.
	 * 
	 * @param scaleX
	 *            - the factor to stretch this display object horizontally. For
	 *            example, setting scaleX to 2 will stretch the display object to
	 *            twice its nominal width. To horizontally flip an object, set the
	 *            scale to a negative number.
	 */
	public void setScaleXProperty(Number scaleX) {
		this.setNumberProperty(SCALE_X, scaleX);
	}

	/**
	 * Retrieves the factor to stretch this display object vertically. For example,
	 * setting scaleY to 0.5 will stretch the display object to half its nominal
	 * height. To vertically flip an object, set the scale to a negative number.
	 * 
	 * @return the factor to stretch this display object vertically. For example,
	 *         setting scaleY to 0.5 will stretch the display object to half its
	 *         nominal height. To vertically flip an object, set the scale to a
	 *         negative number.
	 */
	public Number getScaleYProperty() {
		return this.getNumberProperty(SCALE_Y);
	}

	/**
	 * Sets the factor to stretch this display object vertically. For example,
	 * setting scaleY to 0.5 will stretch the display object to half its nominal
	 * height. To vertically flip an object, set the scale to a negative number.
	 * 
	 * @param scaleY
	 *            - the factor to stretch this display object vertically. For
	 *            example, setting scaleY to 0.5 will stretch the display object to
	 *            half its nominal height. To vertically flip an object, set the
	 *            scale to a negative number.
	 */
	public void setScaleYProperty(Number scaleY) {
		this.setNumberProperty(SCALE_Y, scaleY);
	}

	/**
	 * Retrieves a shadow object that defines the shadow to render on this display
	 * object. Set to null to remove a shadow. If null, this property is inherited
	 * from the parent container.
	 * 
	 * @return a shadow object that defines the shadow to render on this display
	 *         object. Set to null to remove a shadow. If null, this property is
	 *         inherited from the parent container.
	 */
	public Shadow getShadowProperty() {
	}

	/**
	 * Sets a shadow object that defines the shadow to render on this display
	 * object. Set to null to remove a shadow. If null, this property is inherited
	 * from the parent container.
	 * 
	 * @param shadow
	 *            - a shadow object that defines the shadow to render on this
	 *            display object. Set to null to remove a shadow. If null, this
	 *            property is inherited from the parent container.
	 */
	public void setShadowProperty(Shadow shadow) {
	}

	/**
	 * Retrieves the factor to skew this display object horizontally.
	 * 
	 * @return the factor to skew this display object horizontally.
	 */
	public Number getSkewXProperty() {
		return this.getNumberProperty(SKEW_X);
	}

	/**
	 * Sets the factor to skew this display object horizontally.
	 * 
	 * @param skewX
	 *            - the factor to skew this display object horizontally.
	 */
	public void setSkewXProperty(Number skewX) {
		this.setNumberProperty(SKEW_X, skewX);
	}

	/**
	 * Retrieves the factor to skew this display object vertically.
	 * 
	 * @return the factor to skew this display object vertically.
	 */
	public Number getSkewYProperty() {
		return this.getNumberProperty(SKEW_Y);
	}

	/**
	 * Sets the factor to skew this display object vertically.
	 * 
	 * @param skewY
	 *            - the factor to skew this display object vertically.
	 */
	public void setSkewYProperty(Number skewY) {
		this.setNumberProperty(SKEW_Y, skewY);
	}

	/**
	 * Determines whether the display object should be drawn to a whole pixel when
	 * snapToPixelEnabled is true. To enable/disable snapping on whole categories of
	 * display objects, set this value on the prototype (Ex.
	 * Text.prototype.snapToPixel = true).
	 * 
	 * @return true / false whether the display object should be drawn to a whole
	 *         pixel when snapToPixelEnabled is true. To enable/disable snapping on
	 *         whole categories of display objects, set this value on the prototype
	 *         (Ex. Text.prototype.snapToPixel = true).
	 */
	public Boolean getSnapToPixelProperty() {
		return this.getBooleanProperty(SNAP_TO_PIXEL);
	}

	/**
	 * Sets whether the display object should be drawn to a whole pixel when
	 * snapToPixelEnabled is true. To enable/disable snapping on whole categories of
	 * display objects, set this value on the prototype (Ex.
	 * Text.prototype.snapToPixel = true).
	 * 
	 * @param snapToPixel
	 *            = true / false whether the display object should be drawn to a
	 *            whole pixel when snapToPixelEnabled is true. To enable/disable
	 *            snapping on whole categories of display objects, set this value on
	 *            the prototype (Ex. Text.prototype.snapToPixel = true).
	 */
	public void setSnapToPixelProperty(Boolean snapToPixel) {
		this.setBooleanProperty(SNAP_TO_PIXEL, snapToPixel);
	}

	/**
	 * Retrieves the Stage instance that this display object will be rendered on, or
	 * null if it has not been added to one.
	 * 
	 * @return the Stage instance that this display object will be rendered on, or
	 *         null if it has not been added to one.
	 */
	public Stage getStageProperty() {
	}

	/**
	 * If false, the tick will not run on this display object (or its children).
	 * This can provide some performance benefits. In addition to preventing the
	 * "tick" event from being dispatched, it will also prevent tick related updates
	 * on some display objects (ex. Sprite & MovieClip frame advancing, and
	 * DOMElement display properties).
	 * 
	 * @return true / false whether or not ticks are enabled.
	 */
	public Boolean getTickEnabledProperty() {
		return this.getBooleanProperty(TICK_ENABLED);
	}

	/**
	 * If false, the tick will not run on this display object (or its children).
	 * This can provide some performance benefits. In addition to preventing the
	 * "tick" event from being dispatched, it will also prevent tick related updates
	 * on some display objects (ex. Sprite & MovieClip frame advancing, and
	 * DOMElement display properties).
	 * 
	 * @param tickEnabled
	 *            - true / false whether or not ticks are enabled.
	 */
	public void setTickEnabledProperty(Boolean tickEnabled) {
		this.setBooleanProperty(TICK_ENABLED, tickEnabled);
	}

	/**
	 * If set, defines the transformation for this display object, overriding all
	 * other transformation properties (x, y, rotation, scale, skew).
	 * 
	 * @return the transform matrix.
	 */
	public Matrix2d getTransformMatrixProperty() {
	}

	/**
	 * If set, defines the transformation for this display object, overriding all
	 * other transformation properties (x, y, rotation, scale, skew).
	 * 
	 * @param transformMatrix
	 *            - a transform matrix.
	 */
	public void setTransformMatrixProperty(Matrix2d transformMatrix) {
	}

	/**
	 * Determines whether this display object should be rendered to the canvas and
	 * included when running the Stage getObjectsUnderPoint method.
	 * 
	 * @return true / false whether this display object should be rendered to the
	 *         canvas and included when running the Stage getObjectsUnderPoint
	 *         method.
	 */
	public Boolean getVisibleProperty() {
		return this.getBooleanProperty(VISIBLE);
	}

	/**
	 * Sets whether this display object should be rendered to the canvas and
	 * included when running the Stage getObjectsUnderPoint method.
	 * 
	 * @param visible
	 *            - true / false whether this display object should be rendered to
	 *            the canvas and included when running the Stage
	 *            getObjectsUnderPoint method.
	 */
	public void setVisibleProperty(Boolean visible) {
		this.setBooleanProperty(VISIBLE, visible);
	}

	/**
	 * Retrieves the x (horizontal) position of the display object, relative to its
	 * parent.
	 * 
	 * @return the x (horizontal) position of the display object, relative to its
	 *         parent.
	 */
	public Number getXProperty() {
		return this.getNumberProperty(X);
	}

	/**
	 * Sets the x (horizontal) position of the display object, relative to its
	 * parent.
	 * 
	 * @param x
	 *            - the x (horizontal) position of the display object, relative to
	 *            its parent.
	 */
	public void setXProperty(Number x) {
		this.setNumberProperty(X, x);
	}

	/**
	 * Retrieves the y (vertical) position of the display object, relative to its
	 * parent.
	 * 
	 * @return the y (vertical) position of the display object, relative to its
	 *         parent.
	 */
	public Number getYProperty() {
		return this.getNumberProperty(Y);
	}

	/**
	 * Sets the y (vertical) position of the display object, relative to its parent.
	 * 
	 * @param y
	 *            - the y (vertical) position of the display object, relative to its
	 *            parent.
	 */
	public void setYProperty(Number y) {
		this.setNumberProperty(Y, y);
	}
}
