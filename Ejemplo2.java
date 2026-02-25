import java.util.Scanner;

// Clase carro
class Carro {
	public String matricula;
	public String marca;
	public int anio;

	public Carro() {
		this.matricula = "";
		this.marca = "";
		this.anio = 0;
	}
}

// Clase principal
public class Ejemplo2 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			Carro carro = new Carro();
			
			System.out.println("--------------- ENTRADA DE DATOS ---------------");
			System.out.println("Ingrese la placa del vehiculo:");
			carro.matricula = scan.nextLine().trim();
			System.out.println("Ingrese la marca del vehiculo:");
			carro.marca = scan.nextLine().trim();
			System.out.println("Ingrese el anio del vehiculo:");
			carro.anio = scan.nextInt();

			System.out.println("--------------- SALIDA DE DATOS ----------------");
			
			System.out.println("Matricula: " + carro.matricula);
			System.out.println("Marca: " + carro.marca);
			System.out.println("Anio: " + carro.anio);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}