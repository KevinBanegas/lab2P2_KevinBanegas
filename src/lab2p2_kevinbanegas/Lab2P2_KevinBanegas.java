package lab2p2_kevinbanegas;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_KevinBanegas {

    static Scanner lea = new Scanner(System.in);

    public static void main(String[] args) {
        try{
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
                System.out.println("2) Clientes");
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
                            System.out.println("4) Listar Clientes");
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
                                    System.out.println("Ingrese el indice del cliente:");
                                    int cli = lea.nextInt();
                                    lea = new Scanner(System.in);
                                    if (cli < listaCli.size()) {
                                        boolean centi = true;
                                        while (centi == true) {
                                            System.out.println("-----Modificar-----");
                                            System.out.println("1) Nombre");
                                            System.out.println("2) Edad");
                                            System.out.println("3) Identidad");
                                            System.out.println("4) Salir");
                                            System.out.println("-------------------");
                                            int modificar = lea.nextInt();
                                            lea = new Scanner(System.in);
                                            switch (modificar) {
                                                case 1: {
                                                    System.out.println("--------------------");
                                                    System.out.println("Ingrese Nombre: ");
                                                    String nombre = lea.nextLine();
                                                    lea = new Scanner(System.in);
                                                    System.out.println("--------------------");
                                                }
                                                break;
                                                case 2: {
                                                    System.out.println("--------------------");
                                                    System.out.println("Ingrese Edad: ");
                                                    int edad = lea.nextInt();
                                                    lea = new Scanner(System.in);
                                                    System.out.println("--------------------");
                                                }
                                                break;
                                                case 3: {

                                                    System.out.println("--------------------");
                                                    System.out.println("Ingrese Identidad: ");
                                                    String identidad = lea.next();
                                                    lea = new Scanner(System.in);
                                                    ((Carros)(listaCar.get(cli))).setDueño(identidad);
                                                    System.out.println("--------------------");
                                                }
                                                break;
                                                case 4: {

                                                }
                                                break;
                                                default: {
                                                    System.out.println("Ingreso un dato invalido");
                                                }
                                            }
                                        }
                                    }
                                    break;

                                }

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
                            System.out.println("-------Carros-------");
                            System.out.println("1) Crear");
                            System.out.println("2) Modificar");
                            System.out.println("3) Listar Carros");
                            System.out.println("4) Salir");
                            System.out.println("-------------------");
                            System.out.println("Ingrese una opcion:");
                            int opcionCli = lea.nextInt();
                            lea = new Scanner(System.in);
                            switch (opcionCli) {
                                case 1: {
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
                                    System.out.println("Ingrese el indice del dueño: ");
                                    int indice = lea.nextInt();
                                    lea = new Scanner(System.in);
                                    if (indice < listaCli.size()) {
                                        String dueño = ((Clientes) (listaCli.get(indice))).getIdentidad();
                                        System.out.println("Ingrese Costo: ");
                                        double costo = lea.nextDouble();
                                        ((Clientes) listaCli.get(indice)).setSueldopagar(costo);
                                        lea = new Scanner(System.in);
                                        System.out.println("--------------------");

                                        listaCar.add(new Carros(marca, modelo, año, ingreso, dueño, costo));
                                    } else {
                                        System.out.println("El cliente no existe");
                                    }

                                }
                                break;
                                case 2: {
                                    for (Object object : listaCar) {
                                        System.out.println("Indice: " + listaCar.indexOf(object) + "\n" + object);
                                        System.out.println();
                                    }
                                    System.out.println("Ingrese el indice del carro que desea modificar: ");
                                    int indice = lea.nextInt();
                                    lea = new Scanner(System.in);
                                    if (indice < listaCar.size()) {
                                        ((Carros) (listaCar.get(indice))).setEstado();
                                    }
                                    if ("Saldo pagado".equals(((Carros) (listaCar.get(indice))).getEstado())) {
                                        String dueño = ((Carros)(listaCar.get(indice))).getDueño();
                                        for (Object object : listaCli) {
                                            if(dueño.equals(((Clientes)(object)).getIdentidad())){
                                                ((Clientes)(object)).setSueldopagar(-1*((Carros)(listaCar.get(indice))).getCosto());
                                            }
                                        }
                                        System.out.println("Ingrese el metodo de pago: [1-Banco, 2-Taller]");
                                        int pago = lea.nextInt();
                                        lea = new Scanner(System.in);

                                        if (pago == 1) {
                                            ((Carros) (listaCar.get(indice))).setEstado();
                                        } else if (pago == 2) {
                                            ((Carros) (listaCar.get(indice))).setEstado();
                                            ((Carros) (listaCar.get(indice))).setEstado();
                                        } else {
                                            System.out.println("Ingreso un dato invalido");
                                        }
                                    }
                                }

                                break;

                                case 3: {
                                    for (Object object : listaCar) {
                                        System.out.println("Indice: " + listaCar.indexOf(object) + "\n" + object);
                                        System.out.println();
                                    }
                                }
                                break;
                                case 4: {
                                    centinelaCar = false;
                                }
                                break;
                                default: {
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
        }else{
            System.out.println("No puede ingresar al sistema.");
        }
        }catch(Exception e){
            System.out.println("Ingreso valores invalidos");
        }
    }

}
