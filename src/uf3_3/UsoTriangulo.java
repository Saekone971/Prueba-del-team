package uf3_3;

import java.util.Scanner;

public class UsoTriangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("APLICACIÓN PARA COMPARAR DOS TRIÁNGULOS");
		System.out.println("Introduce el valor del lado 1 del primer triangulo: ");
		double l1 = Double.parseDouble(sc.nextLine());
		System.out.println("Introduce el valor del lado 2 del primer triangulo: ");
		double l2 = Double.parseDouble(sc.nextLine());
		System.out.println("Introduce el valor del lado 3 del primer triangulo: ");
		double l3 = Double.parseDouble(sc.nextLine());
		
		
		
		
		Triangulo objT1 = new Triangulo();
		objT1.setLado1(l1);
		objT1.setLado2(l2);
		objT1.setLado3(l3);
		objT1.setPerimetro();
		
		System.out.println("APLICACIÓN PARA COMPARAR DOS TRIÁNGULOS");
		System.out.println("Introduce el valor del lado 1 del primer triangulo: ");
		l1 = Double.parseDouble(sc.nextLine());
		System.out.println("Introduce el valor del lado 2 del primer triangulo: ");
		l2 = Double.parseDouble(sc.nextLine());
		System.out.println("Introduce el valor del lado 3 del primer triangulo: ");
		l3 = Double.parseDouble(sc.nextLine());
		
		
		Triangulo objT2 = new Triangulo();
		objT2.setLado1(l1);
		objT2.setLado2(l3);
		objT2.setLado3(l3);
		objT2.setPerimetro();
		
		String comparacion = (objT1.getPerimetro() > objT2.getPerimetro())?
				"El triangulo 1 tiene mayor perimetro" :
				"El triangulo 2 tiene mayor perimetro";
		System.out.println("el perimetro del triangulo 1 es " + objT1.getPerimetro());
		System.out.println("el perimetro del triangulo 2 es " + objT2.getPerimetro());
		System.out.println(comparacion);
		sc.close();
	}

}
