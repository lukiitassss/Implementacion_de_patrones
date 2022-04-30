package flyweight;

public abstract class Notebook {
	@Override
	public String toString() {
		return "Notebook [marca: " + marca + ", modelo: " + modelo + ", color: " + color + "]";
	}



	public String marca;
	public String modelo;
	public String color;
	
public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	  public Notebook(String marca, String modelo, String color)
	    {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.color = color;
	    }
	
	

	    public void  mostrarCaracteristicas(String datosExtra)
	    {
	        System.out.println("Marca: " + marca +"\n"+"Modelo: " +modelo +"\n"+ "Color: " + color+ "\n" + datosExtra );
	    }
	

}
