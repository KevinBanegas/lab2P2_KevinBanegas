package lab2p2_kevinbanegas;

public class Administrador {
    private String usuario;
    private String contra;
    public Administrador(){
        usuario = "admin";
        contra = "admin1234";
    }
    
    public String getUsuario(){
        return usuario;
    }
    public void setUsuario(String usuario){
        this.usuario=usuario;
    }
    public String getContra(){
        return contra;
    }
    public void setContra(String contra){
        this.contra=contra;
    }
    public String toString(){
        return "Usuario: "+usuario+"\nContra: "+contra;
    }
}
