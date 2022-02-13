package structural.adapter.composition;

public class MultiLanguageCodeHandlerImpl implements MultiLanguageCodeHandler {

	private LanguageAdapter adapter;
	
	public MultiLanguageCodeHandlerImpl(){
		adapter = new LanguageAdapter();
	}
	
	@Override
	public void compileCode(Object file, String type) {
		if(type.equals("Java")){
			adapter.compileJavaCode(file);
			return;
		}
		System.out.println("MultiLanguage code compiled: " +file );
	}

	@Override
	public void exectueCode(Object file, String type) {
		if(type.equals("Java")){
			adapter.executeJavaCode(file);
			return;
		}
		System.out.println("MultiLanguage code compiled: " +file );	
	}

}
