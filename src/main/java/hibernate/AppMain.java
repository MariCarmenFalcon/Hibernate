package hibernate;

import java.time.LocalDate;
import java.util.Random;

public class AppMain {

	public static void main(String[] args) {	
		
		
		String usuario1 = new UserController().testUsuario();
		System.out.println(usuario1);
		
		//Create a date object
		LocalDate myObj = LocalDate.now();
		//Display the current date
		System.out.println(myObj);
		
		//Insertar Registros manualmente
		String usuario2 = new UserController().createUsuario(1, "Maria", "Sanchez", myObj);
		System.out.println(usuario2);		
		
		String usuario3 = new UserController().createUsuario(1, "Manolo", "Rasero", myObj);
		System.out.println(usuario3);
		
		//consulta para reiniciar el Auto-Increment a 1
		//ALTER TABLE nombre_tabla AUTO_INCREMENT = 1;
		
		/*// Insertar 10 registros con Nombre1, Apellido1
        for (int i = 1; i <= 10; i++) {
            String usuario = new UserController().createUsuario(i, "Nombre" + i, "Apellido" + i, myObj);
            System.out.println(usuario);
        }*/
		
		
		/*// Insertar 10 registros con nombres y apellidos reales 
		//Creo y llenar los arrays de nombres y apellidos
        String[] nombres = {"María", "Juan", "Ana", "Luis", "Elena", "Carlos", "Laura", "Pedro", "Carmen", "Javier"};
        String[] apellidos = {"Sánchez", "Gómez", "Pérez", "Fernández", "Rodríguez", "Martínez", "López", "García", "Díaz", "Ruiz"};
       
        Random random = new Random();
		
		for (int i = 1; i <= 10; i++) {
			String nombre = nombres[random.nextInt(nombres.length)];
			String apellido = apellidos[random.nextInt(apellidos.length)];

			String usuario = new UserController().createUsuario(i, nombre, apellido, myObj);
			System.out.println(usuario);
		}*/

	}

}
