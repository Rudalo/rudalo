package modelo;

import java.util.HashMap;

public class Directorio {
	
	HashMap<Integer, String> dir = new HashMap<>();

	public String guardar(String nombre, String telefono) {
		
		if(nombre.isEmpty() || telefono.isEmpty()) {
			return "Ingrese todos los campos";
		}
		int intTelefono = Integer.parseInt(telefono);
		if(dir.get(intTelefono) == null) {
			dir.put(intTelefono, nombre);
			return "Guardado exitosamente";
		} 
		return "Esta persona ya se encuentra guardada";
	}
	
	public String mostrar(String telefono) {
		int intTelefono = Integer.parseInt(telefono);
		String nombreResultado = null;
	
		nombreResultado = dir.get(intTelefono);
		return nombreResultado;
	}
	
}
