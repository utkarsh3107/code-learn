package structural.adapter.inheritance;

public class MultiLanguageCodeHandlerImpl extends LanguageAdapter implements MultiLanguageCodeHandler {
	
	@Override
	public void compileCode(Object file, String type) {
		if(type.equals("Java")){
			compileJavaCode(file);
			return;
		}
		System.out.println("MultiLanguage code compiled: " +file );
	}

	@Override
	public void exectueCode(Object file, String type) {
		if(type.equals("Java")){
			executeJavaCode(file);
			return;
		}
		System.out.println("MultiLanguage code compiled: " +file );	
	}

}
