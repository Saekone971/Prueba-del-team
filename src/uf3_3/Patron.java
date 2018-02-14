package uf3_3;

public class Patron {
	private int atrEntero;
	private String atrString;
	private boolean atrBoolean;
	
	public int getAtrEntero() {
		return this.atrEntero;
		
	}
	public void setAtrEntero(int atrE) {
		this.atrEntero = atrE;
	}
	
	public String getAtrString() {
		return atrString;
	}
	
	public void setAtrString(String atrString) {
		this.atrString = atrString;
		
	}
	 public boolean isAtrBoolean() {
		 return atrBoolean;
	 }
	 
	 public void setAtrBoolean(boolean atrBoolean) {
		 this.atrBoolean = atrBoolean;
		 
	 }
	 
	 public String toString() {
		 String sPatron = "atrString" + this.atrString;
		/*"atrEntero" + this.atrEntero
		 + "atrString: " + this.atrString
		 + "atrBoolean: " + this.atrBoolean;*/
		 
		 return sPatron;
		 
	}
	 
	 //Creamos un método para mostar los datos del objeto por  consola 
	 public void mostrarDatos() {
		System.out.println("Mi primer objeto tiene los siguientes valores");
		System.out.println("atrEntero: " + this.getAtrEntero());
		System.out.println("atrString: " + this.getAtrString());
		System.out.println("AtrBoolean: " + this.isAtrBoolean());
	 }
}
