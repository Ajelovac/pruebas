import java.util.*;

//Definicion de la clase
	public class TestAnimal {
		//Definicion del metodo principal
		public static void main(String[] args) {

			//Declaracion del objeto animal
			Animal animal1 = new Animal();

			//Declaracion del objeto teclado de la clase Scanner
			Scanner teclado = new Scanner(System.in);

			//Pedir el nombre del animal
			System.out.print("Teclee el nombre del animal");

			//Leer y asignar nombre al objeto animal1
			animal1.setNombre(teclado.nextLine());

			//Pedir la edad del animal 
			System.out.print ("Teclee la edad del animal");
			int edad = teclado.nextInt();

			//Asignar edad al objeto animal1
			animal1.setEdad(edad);

			//Informar de los datos del animal1
			animal1.nace();
			System.out.println("Me llamo " + animal1.getNombre() +" y tengo " + animal1.getEdad() + " años");
			
		}
	}