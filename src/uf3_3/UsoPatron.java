package uf3_3;

public class UsoPatron {

	public static void main(String[] args) {
		// definimos una variable de tipo clase Patron
		
		Patron objPatron = new Patron();
		objPatron.setAtrEntero(15);
		objPatron.setAtrString("Hi");
		objPatron.setAtrBoolean(true);
		
		//creamos otro objeto de tipo Patron
		Patron objPatron2 = new Patron();
		objPatron2.setAtrEntero(55);
		objPatron2.setAtrString("Bye");
		objPatron2.setAtrBoolean(false);
		
		System.out.println("Mi primer objeto tiene los siguientes valores");
		System.out.println("atrEntero: " + objPatron.getAtrEntero());
		System.out.println("atrString: " + objPatron.getAtrString());
		System.out.println("AtrBoolean: " + objPatron.isAtrBoolean());
		
		System.out.println("Mi primer objeto tiene los siguientes valores");
		System.out.println("atrEntero: " + objPatron2.getAtrEntero());
		System.out.println("atrString: " + objPatron2.getAtrString());
		System.out.println("AtrBoolean: " + objPatron2.isAtrBoolean());
		
				
	}

}
