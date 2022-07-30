package lab2p2_kevinbanegas;

public class Carros {

    private String marca;
    private String modelo;
    private int date;
    private String fechaIngreso;
    private String estado;
    private String dueño;
    private double costo;
    private int centinelaestado = 0;

    public Carros(String marca, String modelo, int date, String fechaIngreso, String dueño, double costo) {
        this.marca = marca;
        this.modelo = modelo;
        this.date = date;
        this.fechaIngreso = fechaIngreso;
        this.estado = "En espera de entrar a reparación";
        this.dueño = dueño;
        this.costo = costo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getmarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo(String modelo) {
        return modelo;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getDate() {
        return date;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setEstado() {
        setCentinelaEstado();
        if(centinelaestado==0){
            estado="En espera de entrar a reparación";
        }else if(centinelaestado==1){
            estado="En reparación";
        }else if (centinelaestado==2) {
            estado="En espera de pago de reparación";
        }else if (centinelaestado==3) {
            estado="Saldo pagado";
        }else if (centinelaestado==4) {
            estado="En espera de ser entregado";
        }else if (centinelaestado==5) {
            estado="Entregado";
        }
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setCentinelaEstado() {
        centinelaestado++;
    }
    
    public int getCentinelaEstado(){
        return centinelaestado;
    }
    
    public void setDueño(String dueño){
        this.dueño=dueño;
    }
    
    public String getDueño(){
        return dueño;
    }
    
    public void setCosto(double costo){
        this.costo=costo;
    }
    
    public double getCosto(){
        return costo;
    }
    
    public String toString(){
        return "Marca: "+marca+"\nModelo: "+modelo+"\nAño de Farbricación: "+date+"\nFecha Ingreso: "+fechaIngreso+"\nEstado: "+estado+"\nDueño: "+dueño+"\nCosto: "+costo;
    }
}
