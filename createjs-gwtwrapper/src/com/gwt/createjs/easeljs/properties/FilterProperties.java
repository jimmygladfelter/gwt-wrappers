package com.gwt.createjs.easeljs.properties;

import com.app.gwt.client.lib.js.BaseJso;
import com.gwt.createjs.easeljs.propertynames.FilterPropertyNames;

/**
 * Represents the CreateJS properties of the Filter class.
 * 
 * @author James C. Gladfelter
 */
public class FilterProperties extends BaseJso implements FilterPropertyNames {

	protected FilterProperties() {
	}

	/**
	 * Pre-processed template shader code. It will be parsed before being fed in
	 * into the shader compiler. This should be based upon
	 * StageGL.SHADER_FRAGMENT_BODY_REGULAR
	 * 
	 * @return pre-processed template shader code. It will be parsed before being
	 *         fed in into the shader compiler. This should be based upon
	 *         StageGL.SHADER_FRAGMENT_BODY_REGULAR
	 */
	public String getFragShaderProperty() {
		return this.getStringProperty(FRAG_SHADER);
	}

	/**
	 * Retrieves a flag stating that this filter uses a context draw mode and cannot
	 * be batched into imageData processing.
	 * 
	 * @return a flag stating that this filter uses a context draw mode and cannot
	 *         be batched into imageData processing.
	 */
	public Boolean getUsesContextProperty() {
		return this.getBooleanProperty(USES_CONTEXT);
	}

	/**
	 * Sets a flag stating that this filter uses a context draw mode and cannot be
	 * batched into imageData processing.
	 * 
	 * @param usesContext
	 *            - a flag stating that this filter uses a context draw mode and
	 *            cannot be batched into imageData processing.
	 */
	public void setUsesContextProperty(Boolean usesContext) {
		this.setBooleanProperty(USES_CONTEXT, usesContext);
	}

	/**
	 * Pre-processed template shader code. It will be parsed before being fed in
	 * into the shader compiler. This should be based upon
	 * StageGL.SHADER_VERTEX_BODY_REGULAR
	 * 
	 * @return pre-processed template shader code. It will be parsed before being
	 *         fed in into the shader compiler. This should be based upon
	 *         StageGL.SHADER_VERTEX_BODY_REGULAR
	 */
	public String getVtxShaderProperty() {
		return this.getStringProperty(VTX_SHADER);
	}
}
