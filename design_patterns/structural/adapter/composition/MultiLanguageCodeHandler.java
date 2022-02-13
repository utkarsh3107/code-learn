/**
 * 
 */
package structural.adapter.composition;

/**
 * @author utkarsh
 *
 */
public interface MultiLanguageCodeHandler {

	public void compileCode(Object file, String type);
	
	public void exectueCode(Object file, String type);
}
