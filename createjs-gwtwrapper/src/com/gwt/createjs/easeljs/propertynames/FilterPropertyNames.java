package com.gwt.createjs.easeljs.propertynames;

/**
 * Represents the CreateJS property names of the Filter class.
 * 
 * @author James C. Gladfelter
 */
public interface FilterPropertyNames {

	/**
	 * Pre-processed template shader code. It will be parsed before being fed in
	 * into the shader compiler. This should be based upon
	 * StageGL.SHADER_FRAGMENT_BODY_REGULAR
	 */
	public static final String FRAG_SHADER = "FRAG_SHADER";

	/**
	 * A flag stating that this filter uses a context draw mode and cannot be
	 * batched into imageData processing.
	 */
	public static final String USES_CONTEXT = "usesContext";

	/**
	 * Pre-processed template shader code. It will be parsed before being fed in
	 * into the shader compiler. This should be based upon
	 * StageGL.SHADER_VERTEX_BODY_REGULAR
	 */
	public static final String VTX_SHADER = "VTX_SHADER";
}
