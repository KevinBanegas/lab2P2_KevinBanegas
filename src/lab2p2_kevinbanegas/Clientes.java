package lab2p2_kevinbanegas;

public class Clientes {

    private String nombre;
    private int edad;
    private String identidad;
    private double sueldopagar;

    public Clientes(String nombre, int edad, String identidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.identidad = identidad;
        this.sueldopagar = 0;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setSueldopagar(double sueldopagar) {
        this.sueldopagar = sueldopagar;
    }

    public double getSueldoPagar() {
        return sueldopagar;
    }

    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nIdentidad" + identidad + "\nSueldo a Pagar: " + sueldopagar;
    }
}
