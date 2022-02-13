/**
 * 
 */
package structural.adapter.composition;

/**
 * @author utkarsh
 *
 */
public class JavaCodeHandlerImpl implements JavaCodeHandler {

	/*
	 * (non-Javadoc)
	 * 
	 * @see designpatterns.structural.adapter.composition.JavaCodeHandler#
	 * compileJavaCode(java.lang.Object)
	 */
	@Override
	public void compileJavaCode(Object file) {
		System.out.println("Java code compiled: " + file);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see designpatterns.structural.adapter.composition.JavaCodeHandler#
	 * executeJavaCode(java.lang.Object)
	 */
	@Override
	public void executeJavaCode(Object file) {
		System.out.println("Java code executed: " + file);
	}

}
