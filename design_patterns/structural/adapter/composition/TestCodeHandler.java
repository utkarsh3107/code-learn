/**
 * 
 */
package structural.adapter.composition;

/**
 * @author utkarsh
 *
 */
public class TestCodeHandler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MultiLanguageCodeHandler handler = new MultiLanguageCodeHandlerImpl();
		handler.compileCode("File 1", "Java");
		handler.exectueCode("File 1", "Java");
		handler.compileCode("File 1", "C");
		handler.exectueCode("File 1", "C");
	}

}
