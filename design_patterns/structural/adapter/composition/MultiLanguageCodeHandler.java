/**
 * 
 */
package design_patterns.structural.adapter.composition;

/**
 * @author utkarsh
 *
 */
public interface MultiLanguageCodeHandler {

	public void compileCode(Object file, String type);
	
	public void exectueCode(Object file, String type);
}
