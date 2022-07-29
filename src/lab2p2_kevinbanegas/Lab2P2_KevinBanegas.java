package lab2p2_kevinbanegas;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_KevinBanegas {

    static Scanner lea = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Object> listaEmp = new ArrayList();
        ArrayList<Object> listaCli = new ArrayList();
        ArrayList<Object> listaCar = new ArrayList();
        boolean centinela = true;
        String ingresar = "admin";
        String ingresar1 = "admin1234";
        System.out.println("--------Iniciar Sesion--------");
        System.out.println("Ingrese usuario:");
        String usuario = lea.next();
        lea = new Scanner(System.in);
        System.out.println("Ingrese contrasena:");
        String contra = lea.next();
        if (ingresar.equals(usuario) && ingresar1.equals(contra)) {
            while (centinela == true) {
                System.out.println("------MENU------");
                System.out.println("1) Empleados");
                System.out.println("2) Cientes");
                System.out.println("3) Carros");
                System.out.println("4) Salir");
                System.out.println("----------------");
                System.out.println("Ingrese una opcion: ");
                int opcion = lea.nextInt();
                lea = new Scanner(System.in);
                switch (opcion) {
                    case 1: { //Empleados
                        boolean centinelaEmp = true;
                        while (centinelaEmp == true) {
                            System.out.println("-----EMPLEADOS-----");
                            System.out.println("1) Crear");
                            System.out.println("2) Modificar");
                            System.out.println("3) Eliminar");
                            System.out.println("4) Listar Empleado");
                            System.out.println("5) Salir");
                            System.out.println("-------------------");
                            System.out.println("Ingrese una opcion:");
                            int opcionEmp = lea.nextInt();
                            lea = new Scanner(System.in);
                            switch (opcionEmp) {
                                case 1: {
                                    System.out.println("--------------------");
                                    System.out.println("Ingrese Nombre:");
                                    String nombre = lea.nextLine();
                                    lea = new Scanner(System.in);
                                    System.out.println("Ingrese Edad:");
                                    int edad = lea.nextInt();
                                    lea = new Scanner(System.in);
                                    System.out.println("Ingrese Sueldo:");
                                    double sueldo = lea.nextDouble();
                                    lea = new Scanner(System.in);
                                    System.out.println("Ingrese RRHH:");
                                    String RRHH = lea.next();
                                    lea = new Scanner(System.in);
                                    System.out.println("--------------------");
                                    listaEmp.add(new Empleados(nombre, edad, sueldo, RRHH));
                                }
                                break;
                                case 2: {
                                    for (Object object : listaEmp) {
                                        System.out.println("Indice: " + listaEmp.indexOf(object) + "\n" + object);
                                        System.out.println();
                                    }

                                    System.out.println("Ingrese el indice del empleado:");
                                    int emp = lea.nextInt();
                                    if (emp < listaEmp.size()) {
                                        System.out.println("Ingrese 1 si el empleado trabaja, 2 si el empleado no trabaja");
                                        int trab = lea.nextInt();
                                        lea = new Scanner(System.in);
                                        ((Empleados) (listaEmp.get(emp))).setTrabajando(trab);
                                    }
                                }
                                break;
                                case 3: {
                                    for (Object object : listaEmp) {
                                        System.out.println("Indice: " + listaEmp.indexOf(object) + "\n" + object);
                                        System.out.println();
                                    }
                                    System.out.println("Ingrese el indice del empleado: ");
                                    int emp = lea.nextInt();
                                    if (emp < listaEmp.size()) {
                                        listaEmp.remove(emp);
                                    }
                                }
                                break;
                                case 4: {
                                    for (Object object : listaEmp) {
                                        System.out.println("Indice: " + listaEmp.indexOf(object) + "\n" + object);
                                        System.out.println();
                                    }
                                }
                                break;
                                case 5: {
                                    centinelaEmp = false;
                                }
                                break;
                                default: {
                                    System.out.println("Ingreso un dato invalido");
                                }
                            }
                        }
                    }
                    break;
                    case 2: { //Clientes
                        boolean centinelaCli = true;
                        while (centinelaCli == true) {
                            System.out.println("-----Clientes-----");
                            System.out.println("1) Crear");
                            System.out.println("2) Modificar");
                            System.out.println("3) Eliminar");
                            System.out.println("4) Listar Empleado");
                            System.out.println("5) Salir");
                            System.out.println("-------------------");
                            System.out.println("Ingrese una opcion:");
                            int opcionCli = lea.nextInt();
                            lea = new Scanner(System.in);
                            switch (opcionCli) {
                                case 1: {
                                    System.out.println("--------------------");
                                    System.out.println("Ingrese Nombre: ");
                                    String nombre = lea.nextLine();
                                    lea = new Scanner(System.in);
                                    System.out.println("Ingrese Edad: ");
                                    int edad = lea.nextInt();
                                    lea = new Scanner(System.in);
                                    System.out.println("Ingrese Identidad: ");
                                    String identidad = lea.next();
                                    lea = new Scanner(System.in);
                                    System.out.println("--------------------");

                                    listaCli.add(new Clientes(nombre, edad, identidad));
                                }
                                break;
                                case 2: {
                                    for (Object object : listaCli) {
                                        System.out.println("Indice: " + listaCli.indexOf(object) + "\n" + object);
                                        System.out.println();
                                    }
                                }
                                break;
                                case 3: {
                                    for (Object object : listaCli) {
                                        System.out.println("Indice: " + listaCli.indexOf(object) + "\n" + object);
                                        System.out.println();
                                    }
                                    System.out.println("Ingrese el indice del cliente: ");
                                    int cli = lea.nextInt();
                                    if (cli < listaCli.size()) {
                                        listaEmp.remove(cli);
                                    }
                                }
                                break;
                                case 4: {
                                    for (Object object : listaCli) {
                                        System.out.println("Indice: " + listaCli.indexOf(object) + "\n" + object);
                                        System.out.println();
                                    }
                                }
                                break;
                                case 5: {
                                    centinelaCli = false;
                                }
                                break;
                                default: {
                                    System.out.println("Ingreso un dato invalido");
                                }
                            }
                        }
                    }
                    break;
                    case 3: { //Carros
                        boolean centinelaCar = true;
                        while (centinelaCar == true) {
                            System.out.println("-----Clientes-----");
                            System.out.println("1) Crear");
                            System.out.println("2) Modificar");
                            System.out.println("3) Listar Empleado");
                            System.out.println("4) Salir");
                            System.out.println("-------------------");
                            System.out.println("Ingrese una opcion:");
                            int opcionCli = lea.nextInt();
                            lea = new Scanner(System.in);
                            switch (opcionCli) {
                                case 1:{
                                    System.out.println("--------------------");
                                    System.out.println("Ingrese Marca: ");
                                    String marca = lea.next();
                                    lea = new Scanner(System.in);
                                    System.out.println("Ingrese Modelo: ");
                                    String modelo = lea.next();
                                    lea = new Scanner(System.in);
                                    System.out.println("Ingrese Año de Fabricación: ");
                                    int año = lea.nextInt();
                                    lea = new Scanner(System.in);
                                    System.out.println("Ingrese Fecha de Ingreso: ");
                                    String ingreso = lea.next();
                                    lea = new Scanner(System.in);
                                    System.out.println("Ingrese Dueño: ");
                                    String dueño = lea.next();
                                    lea = new Scanner(System.in);
                                    System.out.println("Ingrese Costo: ");
                                    double costo = lea.nextInt();
                                    lea = new Scanner(System.in);
                                    System.out.println("--------------------");
                                    boolean haydueño= false;
                                    for (Object object : listaCli) {
                                        haydueño = dueño.equals(((Clientes)(object)).getIdentidad());
                                    }
                                    if (haydueño) {
                                        listaCar.add(new Carros(marca,modelo,año,ingreso,dueño,costo));
                                        
                                    }else{
                                        System.out.println("No existe el dueño del carro en los clientes del sistema.");
                                    }
                                }
                                break;
                                case 2:{
                                    
                                }
                                break;
                                case 3:{
                                    
                                }
                                break;
                                case 4:{
                                    centinelaCar=false;
                                }
                                break;
                                default:{
                                    System.out.println("Ingreso un dato invalido");
                                }
                            }
                        }
                    }
                    break;
                    case 4: {
                        centinela = false;
                    }
                    break;
                    default: {
                        System.out.println("Ingreso un dato invalido");
                    }
                }
            }
        }
    }

}
