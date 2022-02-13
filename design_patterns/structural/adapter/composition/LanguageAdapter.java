/**
 * 
 */
package structural.adapter.composition;

/**
 * @author utkarsh
 *
 */
public class LanguageAdapter implements JavaCodeHandler{

	private JavaCodeHandler handler;
	
	public LanguageAdapter(){
		handler = new JavaCodeHandlerImpl();
	}

	@Override
	public void compileJavaCode(Object file) {
		handler.compileJavaCode(file);
		
	}

	@Override
	public void executeJavaCode(Object file) {
		handler.executeJavaCode(file);
		
	}

}
