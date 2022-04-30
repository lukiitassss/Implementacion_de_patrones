package coleccion;

public class Cliente {
	public String nombre;
	public String apellido;
	public String direccion;

public Cliente (String nombre, String apellido, String direccion) {
	this.nombre=nombre;
	this.apellido=apellido;
	this.direccion=direccion;
};	
	
public String mostrarDatos () {
	return "Nombre: "+this.nombre+"\n"+"Apellido: "+this.apellido+"\n"+"direccion: "+this.direccion+"\n";
};

	
}
