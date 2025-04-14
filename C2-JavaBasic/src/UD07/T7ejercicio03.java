package UD07;

import java.util.HashMap;
import java.util.Map;

public class T7ejercicio03 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// Crear un HashMap con diferentes dimensiones
        Map<String, Object> HashMapComplejo = new HashMap<>();

        // Agregar valores simples
        HashMapComplejo.put("nombre", "Juan");
        HashMapComplejo.put("edad", 30);

        // Agregar un HashMap anidado
        Map<String, Object> direccion = new HashMap<>();
        direccion.put("calle", "Calle Principal");
        direccion.put("ciudad", "Ciudad Capital");
        direccion.put("codigoPostal", "12345");

        // Agregar el HashMap anidado al HashMap principal
        HashMapComplejo.put("direccion", direccion);

        // Agregar un HashMap dentro de otro HashMap anidado
        Map<String, Object> contacto = new HashMap<>();
        contacto.put("telefono", 123456789);
        contacto.put("email", "juan@example.com");

        // Agregar el HashMap interno al HashMap principal
        ((Map<String, Object>) HashMapComplejo.get("direccion"))
        .put("contacto", contacto);

        // Imprimir el HashMap complejo
        System.out.println(HashMapComplejo);
        
     // Obtener el HashMap de dirección
        Map<String, Object> direccionVar = 
        		(Map<String, Object>) HashMapComplejo.get("direccion");

        // Obtener el HashMap de contacto dentro del HashMap de dirección
        Map<String, Object> persona = (Map<String, Object>) direccionVar
        		.get("contacto");

        // Obtener el valor del correo electrónico desde el HashMap de contacto
        String email = (String) persona.get("email");
        int telf = (int) persona.get("telefono");

        // Imprimir el correo electrónico
        System.out.println("Correo electrónico: " + email);
        System.out.println("Y el teléfono es: " + telf);

	}

	}


