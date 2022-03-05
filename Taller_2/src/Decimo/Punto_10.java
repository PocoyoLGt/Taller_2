package Decimo;

import java.util.Scanner;

public class Punto_10 {
    private String Optitular;

    private long retirar,depositar;
    private Scanner input;
    private int op1;


    public void Punto_10(){
        this.input = new Scanner(System.in);


        Titular[] t= new Titular[5];
       t[0] = new Titular(1,"Laura Gutierrez",10500000);
        t[1] = new Titular(2,"Paola Rojas",7500000);
        t[2] = new Titular(3,"Andres Martinez",7500000);
        t[3] = new Titular(4,"Juana Perez",4500000);
        t[4] = new Titular(5,"Jack Jimenez",3600000);
        this.Menu_principal();
        Optitular = capturarDatoString();
        for(int i = 0; i<t.length; i++ ){

            if (t[i].getTitular().equals(Optitular)){

                Menu_titular();
                op1 = capturarDatoInt();
                switch (op1){
                    case 0:
                        break;
                    case 1:
                        System.out.println("¿Cuanto dinero quiere retirar? ");
                        retirar = capturarDatoLong();
                        if(retirar <= t[i].getSaldo()){
                            t[i].setSaldo(t[i].getSaldo()- retirar) ;
                            System.out.println("¡¡Retiro Exitoso!!");
                            System.out.println("Saldo disponible: "+ t[i].getSaldo());

                        }else {
                            System.out.println("Su saldo es insuficiente");
                        }
                        break;
                    case 2:
                        System.out.println("¿Cuanto dinero desea ingresar? ");
                        depositar= capturarDatoLong();
                        t[i].setSaldo(t[i].getSaldo()+ depositar) ;
                        System.out.println("¡¡Ingreso Exitoso!!");
                        System.out.println("Saldo disponible: "+ t[i].getSaldo());
                        break;
                    case 3:
                        System.out.println("Su saldo actual es de: "+ t[i].getSaldo());
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                        break;
                }

            }else if(i == t.length-1) {
                System.out.println("El titular no se encuentra en nuestro banco");
                System.out.println("Verifique la informacion");
            }
        }





    }





    private void Menu_principal(){
        System.out.println("Bienvenidos a la App de SU BANCO FIEL");
        System.out.println("Escriba el nombre del titular");


    }
    private int capturarDatoInt() {return this.input.nextInt();}
    private String capturarDatoString(){ return this.input.nextLine();}
    private long capturarDatoLong() {
        return this.input.nextLong();
    }


    private void Menu_titular() {
        System.out.println(" Selecciones una opcion");
        System.out.println(" 1. Retirar dinero");
        System.out.println(" 2. Depositar dinero");
        System.out.println(" 3. Consultar saldo");
        System.out.println(" 0. Volver");
    }


}
