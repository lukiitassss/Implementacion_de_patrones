package clonacion;

public abstract class Animal {
	public String sonido;
	public int cantidadPatas;
	public Boolean vuela;
	public String nombre;
	
	public Animal() {};
	

    public Animal(Animal unAnimal) {
        if (unAnimal != null) {
            this.sonido = unAnimal.sonido;
            this.cantidadPatas = unAnimal.cantidadPatas;
            this.vuela = unAnimal.vuela;
            this.nombre=unAnimal.nombre;
        }
    }
	
    public abstract Animal clone();
	

}
