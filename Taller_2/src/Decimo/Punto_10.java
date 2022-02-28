package Decimo;

import java.util.Scanner;

public class Punto_10 {
    private String us1,Optitular;
    private String us2;
    private String us3;
    private String us4;
    private String us5;
    private double d1,d2,d3,d4,d5,retirar,depositar;
    private Scanner input;
    private int op1;


    public void Punto_10(){
        this.input = new Scanner(System.in);
        this.us1 = "Laura Gutierrez";
        this.us2 = "Paola Rojas ";
        this.us3 = "Andres Martinez ";
        this.us4 = "Juana Perez ";
        this.us5 = "Jack Jimenez ";
        this.d1= 10500000;
        this.d2= 7500000;
        this.d3= 4350000;
        this.d4= 4780000;
        this.d5= 3600000;
        this.Menu_principal();
        Optitular = capturarDatoString();
        if(Optitular.equals(us1)){



            Menu_titular();
            op1 = capturarDatoInt();
            switch (op1){
                case 0:
                    break;
                case 1:
                    System.out.println("¿Cuanto dinero quiere retirar? ");
                    retirar = capturarDatoDouble();
                    if(retirar <= d1){
                        d1 = d1 - retirar;
                        System.out.println("¡¡Retiro Exitoso!!");
                        System.out.println("Saldo disponible: "+ d1);

                    }else {
                        System.out.println("Su saldo es insuficiente");
                    }
                case 2:
                    System.out.println("¿Cuanto dinero desea ingresar? ");
                    depositar= capturarDatoDouble();
                    d1 = d1 + depositar;
                    System.out.println("¡¡Ingreso Exitoso!!");
                    System.out.println("Saldo disponible: "+ d1);
                case 3:
                    System.out.println("Su saldo actual es de: "+ d1);
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }
        if(Optitular.equals(us2)){
            Menu_titular();
            op1 = capturarDatoInt();
            switch (op1){
                case 0:
                    break;
                case 1:
                    System.out.println("¿Cuanto dinero quiere retirar? ");
                    retirar = capturarDatoDouble();
                    if(retirar <= d2){
                        d2 = d2 - retirar;
                        System.out.println("¡¡Retiro Exitoso!!");
                        System.out.println("Saldo disponible: "+ d2);

                    }else {
                        System.out.println("Su saldo es insuficiente");
                    }
                case 2:
                    System.out.println("¿Cuanto dinero desea ingresar? ");
                    depositar= capturarDatoDouble();
                    d2 = d2 + depositar;
                    System.out.println("¡¡Ingreso Exitoso!!");
                    System.out.println("Saldo disponible: "+ d2);
                case 3:
                    System.out.println("Su saldo actual es de: "+ d2);
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }

        }
        if(Optitular.equals(us3)){
            Menu_titular();
            op1 = capturarDatoInt();
            switch (op1){
                case 0:
                    break;
                case 1:
                    System.out.println("¿Cuanto dinero quiere retirar? ");
                    retirar = capturarDatoDouble();
                    if(retirar <= d3){
                        d3 = d3 - retirar;
                        System.out.println("¡¡Retiro Exitoso!!");
                        System.out.println("Saldo disponible: "+ d3);

                    }else {
                        System.out.println("Su saldo es insuficiente");
                    }
                case 2:
                    System.out.println("¿Cuanto dinero desea ingresar? ");
                    depositar= capturarDatoDouble();
                    d3 = d3 + depositar;
                    System.out.println("¡¡Ingreso Exitoso!!");
                    System.out.println("Saldo disponible: "+ d3);
                case 3:
                    System.out.println("Su saldo actual es de: "+ d3);
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }


        }
        if(Optitular.equals(us4)){
            Menu_titular();
            op1 = capturarDatoInt();
            switch (op1){
                case 0:
                    break;
                case 1:
                    System.out.println("¿Cuanto dinero quiere retirar? ");
                    retirar = capturarDatoDouble();
                    if(retirar <= d4){
                        d4 = d4 - retirar;
                        System.out.println("¡¡Retiro Exitoso!!");
                        System.out.println("Saldo disponible: "+ d4);

                    }else {
                        System.out.println("Su saldo es insuficiente");
                    }
                case 2:
                    System.out.println("¿Cuanto dinero desea ingresar? ");
                    depositar= capturarDatoDouble();
                    d4 = d4 + depositar;
                    System.out.println("¡¡Ingreso Exitoso!!");
                    System.out.println("Saldo disponible: "+ d4);
                case 3:
                    System.out.println("Su saldo actual es de: "+ d4);
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }


        }
        if(Optitular.equals(us5)){
            Menu_titular();
            op1 = capturarDatoInt();
            switch (op1){
                case 0:
                    break;
                case 1:
                    System.out.println("¿Cuanto dinero quiere retirar? ");
                    retirar = capturarDatoDouble();
                    if(retirar <= d5){
                        d5 = d5 - retirar;
                        System.out.println("¡¡Retiro Exitoso!!");
                        System.out.println("Saldo disponible: "+ d5);

                    }else {
                        System.out.println("Su saldo es insuficiente");
                    }
                case 2:
                    System.out.println("¿Cuanto dinero desea ingresar? ");
                    depositar= capturarDatoDouble();
                    d5 = d5 + depositar;
                    System.out.println("¡¡Ingreso Exitoso!!");
                    System.out.println("Saldo disponible: "+ d5);
                case 3:
                    System.out.println("Su saldo actual es de: "+ d5);
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }


        }
        else {
            System.out.println("El titular no se encuentra en nuestro banco");
            System.out.println("Verifique la informacion");
        }


    }





    private void Menu_principal(){
        System.out.println("Bienvenidos a la App de SU BANCO FIEL");
        System.out.println("Escriba el nombre del titular");


    }
    private int capturarDatoInt() {return this.input.nextInt();}
    private String capturarDatoString(){ return this.input.nextLine();}
    private double capturarDatoDouble() {
        return this.input.nextDouble();
    }


    private void Menu_titular() {
        System.out.println(" Selecciones una opcion");
        System.out.println(" 1. Retirar dinero");
        System.out.println(" 2. Depositar dinero");
        System.out.println(" 3. Consultar saldo");
        System.out.println(" 0. Volver");
    }


}
