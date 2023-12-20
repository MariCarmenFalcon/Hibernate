package hibernate;

/**
 * Este clase crea una nueva instancia de la clase Usuario, inicia una transacción para guardar 
 * ese usuario en la base de datos a través de Hibernate y maneja posibles excepciones durante 
 * el proceso.
 * SessionFactory es una interfaz en Hibernate que proporciona una fábrica de sesiones. En el 
 * contexto de Hibernate, una "sesión" se refiere a una conexión con la base de datos y se 
 * utiliza para realizar operaciones de lectura y escritura en la base de datos. La SessionFactory 
 * se encarga de crear y gestionar estas sesiones.
 */

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserController {
	
	public String testUsuario() {
        return "OK";
    }

    public String createUsuario(int i, String string, String string2, LocalDate myObj) {
    	
    	// Se crea una instancia de SessionFactory usando la configuración en hibernate.cfg.xml
        // y se agrega la clase Usuario como una clase anotada.
        
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(
        		Usuario.class).buildSessionFactory();          
        
        
        try (Session session = sessionFactory.openSession()) {
        	
        	// Se crea una instancia de la clase Usuario con los parámetros proporcionados.        	
            Usuario user1 = new Usuario(0, string, string2, myObj);
            
            // Se inicia una transacción de la sesión.
            session.beginTransaction();
            
            // Se guarda el usuario en la base de datos.
            session.save(user1);
            
            // Se confirma la transacción.
            session.getTransaction().commit();
            
            // Se cierra la sesión y la SessionFactory.
            sessionFactory.close();
            
            // Se devuelve "OK" si todo se ha realizado correctamente.
            return "OK";
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Se devuelve "Error" en caso de que haya ocurrido una excepción.
        return "Error";
    }

}
