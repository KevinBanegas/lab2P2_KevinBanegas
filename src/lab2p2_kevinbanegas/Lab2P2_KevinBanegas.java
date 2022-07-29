package lab2p2_kevinbanegas;
import java.util.Scanner;
public class Lab2P2_KevinBanegas {
    static Scanner lea =  new Scanner(System.in);
    public static void main(String[] args) {
        String ingresar = "admin";
        String ingresar1 = "admin1234";
        System.out.println("--------Iniciar Sesion--------");
        System.out.println("Ingrese usuario:");
        String usuario = lea.next();
        lea =  new Scanner(System.in);
        System.out.println("Ingrese contrasena:");
        String contra = lea.next();
        if(ingresar.equals(usuario) && ingresar1.equals(contra)){
            while (opcion != 4){
                System.out.println("");
            }
        }
    }
    
}
