package lab2p2_kevinbanegas;
import java.util.Scanner;
public class Lab2P2_KevinBanegas {
    static Scanner lea =  new Scanner(System.in);
    public static void main(String[] args) {
        boolean centinela = true;
        String ingresar = "admin";
        String ingresar1 = "admin1234";
        System.out.println("--------Iniciar Sesion--------");
        System.out.println("Ingrese usuario:");
        String usuario = lea.next();
        lea =  new Scanner(System.in);
        System.out.println("Ingrese contrasena:");
        String contra = lea.next();
        if(ingresar.equals(usuario) && ingresar1.equals(contra)){
            while (centinela == true){
                System.out.println("1) Empleados");
                System.out.println("2) Cientes");
                System.out.println("3) Carros");
                System.out.println("4) Salir");
                int opcion = lea.nextInt();
                switch(opcion){
                    case 1:{
                        
                    }
                    break;
                    case 2:{
                        
                    }
                    break;
                    case 3:{
                        
                    }
                    break;
                    case 4:{
                        
                    }
                    break;
                    default:{
                        
                    }
                }
            }
        }
    }
    
}
