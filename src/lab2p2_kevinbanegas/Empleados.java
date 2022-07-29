package lab2p2_kevinbanegas;

public class Empleados {

    private String nombre;
    private int edad;
    private double sueldo;
    private String RRHH;
    private String trabajando;

    public Empleados() {

    }

    public Empleados(String nombre, int edad, double sueldo, String RRHH) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        this.RRHH = RRHH;
        this.trabajando = "No esta Trabajando";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setRRHH(String RRHH) {
        this.RRHH = RRHH;
    }

    public String getRRHH() {
        return RRHH;
    }

    public void setTrabajando(int trabajando) {
        if (trabajando == 1 || trabajando == 2) {
            if (trabajando == 1) {
                this.trabajando = "Esta Trabajando";
            } else {
                this.trabajando = "No esta Trabajando";
            }
        }
    }

    public String getTrabajando() {
        return trabajando;
    }

    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nSueldo: " + sueldo + "\nRRHH: " + RRHH + "\n" + trabajando;
    }

}
