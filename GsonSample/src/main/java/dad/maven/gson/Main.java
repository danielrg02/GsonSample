package dad.maven.gson;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// introducimos datos

		System.out.println("Introduce el nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("Introduce los apellidos: ");
		String apellidos = sc.nextLine();
		
		System.out.println("Introduce la edad: ");
		int edad = sc.nextInt();
		
		Person p = new Person(nombre, apellidos, edad);

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		
		// Mostrar JSON
		System.out.println(json);
		
		sc.close();
	}

}
