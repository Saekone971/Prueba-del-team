package uf3_3tarea;

public class UsoCoche {

	public static void main(String[] args) {
		CochesitoLoco objcoche = new CochesitoLoco();
		objcoche.acelera();
		objcoche.acelera();
		objcoche.acelera();
		System.out.println("El coche ha acelerado a " + objcoche.getVelocidad() + " km/h");
		objcoche.frena();
		objcoche.frena();
		System.out.println("El coche a frenado hasta " + objcoche.getVelocidad() + " km/h");
		objcoche.para();
		System.out.println("La velocidad del coche parado es " + objcoche.getVelocidad() + " km/h");
		

	}

}
