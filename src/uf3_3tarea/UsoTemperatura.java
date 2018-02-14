package uf3_3tarea;

public class UsoTemperatura {

	public static void main(String[] args) {
		Temperatura temp1 = new Temperatura();
		temp1.setValorTemp(81.4);
		temp1.setMedida('f');
		
		Temperatura temp2 = new Temperatura();
		temp2.setValorTemp(40.2);
		temp2.setMedida('C');
		
		double t1C = temp1.farenheintToCelsius();
		double t2F = temp2.celsiusToFarenheit();
		
		System.out.println("La temperatura 1 son " + temp1.getvalorTemp() + "grados Farenheit");
		System.out.println("Y " + t1C + " grados Celsius");
		
		System.out.println("La temperatura 2 son " + temp2.getvalorTemp() + "grados Celsius");
		System.out.println("Y " + t2F + " grados Farenheit");

	}

}
