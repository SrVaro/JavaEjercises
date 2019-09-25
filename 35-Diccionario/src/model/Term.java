package model;

public class Term {

	private String name;
	private String definition;
	
	public Term(String name, String definition) {
		super();
		this.name = name;
		this.definition = definition;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDefinition() {
		return definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}
	
	public static void 	lettersAndWords(Term[] terms) {
		
		int letters = 0;
		int words = 0;
		
		for(int i = 0; i < terms.length; i++) {
			System.out.println("Termino " + i);
			
			letters = terms[i].getName().length();		
			words = terms[i].getDefinition().split(" ").length;
			
			System.out.println("La palabra tiene " + letters + " letras");
			System.out.println("La definicion tiene " + words + " palabras");
		}
		
		
	
	}
	
	
	
	

}
