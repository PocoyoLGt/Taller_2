package Sexto;

import java.util.ArrayList;
import java.util.Scanner;

public class Punto_6 {
    private int op1,op2,op3,op4,op5;
    private Scanner input;
    Auto a1 = new Auto("Juan Gomez","FLV-23E","1:00 PM","5:00 PM", 100000);
    Auto a2 = new Auto("Tomas Rodriguez", "JKN-98A","2:30 PM","7:00PM",140000);
    Auto a3 = new Auto("Miguel Buenaventura", "NLM-33D","4:00 PM","9:00PM",345000);
    Auto a4 = new Auto("Mariana Ortiz", "MMA-28D","1:15 PM","4:00 PM",45000);
    Auto a5 = new Auto("Hector Molina", "EAD-45E","4:20 PM","10:00PM",170000);
    ArrayList<Auto> Autos = new ArrayList<Auto>();
    public void Punto_6(){
        ArrayList<Auto> Autos = new ArrayList<Auto>();
        this.input = new Scanner(System.in);
        this.menu_principal();






    }
   private void Contenido_Autos(){
       System.out.println(Autos.size());
       Autos.add(a1);
       Autos.add(a2);
       Autos.add(a3);
       Autos.add(a4);
       Autos.add(a5);
       System.out.println(Autos);

   }
   private void menu_principal(){
       System.out.println(" Taller de Motocicletas El Maquinista");
       System.out.println("Que opcion desea ver");
       System.out.println(" 1. Registro de ingreso cliente");
       System.out.println(" 2. Registro de salida cliente");
       System.out.println("3. Lista de servicios y precios");
       System.out.println(" 0. Salir");
       this.op1 = this.capturarDatoInt();
       this.Opciones_menu(op1);
   }
    private String capturarDatoString(){ return this.input.nextLine();}
    private int capturarDatoInt() {return this.input.nextInt();}

    private void Opciones_menu(int op1){
        switch (op1){
            case 0:
                System.out.println("Hasta Luego ");
                break;
            case 1:
                Menu_Ingreso();
                break;
            case 2:
                Menu_Salida();
                break;
            case 3:
                Lista_precios();
                break;
            default:

                System.out.println("Opción incorrecta");

                break;



        }



    }

    private void Lista_precios() {
        System.out.println(" - - - - - - - - - - - - - - - - - - - - ");
        System.out.println(" Servicio ----------------------------------Costo");
        System.out.println(" Cambio de aceite      ---------           $55.000 ");
        System.out.println(" Revision Cadena       ---------           $20.000");
        System.out.println(" Probar frenos         ---------           $45.000");
        System.out.println(" Regular Anticongelante   -------          $45.000");
        System.out.println(" Revisión y Reparación de Clutch           $65.000");
        System.out.println(" Revision Estado de Bateria  ----          $22.000");
        System.out.println(" Limpiar filtros de aire    -----          $40.000");
        System.out.println(" Nivel de suspension   ---------           $80.000");
    }

    private void Menu_Salida() {
        System.out.println(" Registro de salida");


        System.out.println(" 1. Observaciones por parte del mecanico");
        System.out.println(" 2. Cuenta de pago cliente");
        System.out.println(" 3. Informacion final del servicio cliente");
        System.out.println(" 0. Volver al menu principal");
        op4 = capturarDatoInt();
        Capturar_opcion_salida(op4);
    }

    private void Capturar_opcion_salida(int op4) {
        switch (op4){
            case 0:
                return;
            case 1:
                System.out.println("OBSERVACIONES GENERALES EN CADA CASO");
                System.out.println(" Juan Gomez : Se le cambio el aceite y se le hizo su respectiva revision de frenos");
                System.out.println(" se reviso la moto y no se encontraron mas problemas");
                System.out.println(" Tomas Rodriguez: Ademas de los filtros se le regulo el anticongelante y se le cambio el aceite");
                System.out.println(" Miguel Buenaventura :En Los neumaticos se encontro desgaste asi que hubo un cambio en lo dos");
                System.out.println(" En el cambio del aceite se encontraron sucios los filtros");
                System.out.println(" Mariana Ortiz:Se hizo la regulacion de anticongelante y no se encontraron mas problemas");
                System.out.println(" Hector Molina:A la moto se le cambio la cadena, hicimos pruebas y encontramos");
                System.out.println(" Se hizo prueba en los frenos y se al encotrar que se le daño una");
                System.out.println(" parte se decidio remplazar una pieza");
                return;
            case 2:
                System.out.println(" Cuentas de pago clientes");
                System.out.println(" 1. Juan Gomez: 100000");
                System.out.println(" 2.Tomas Rodriguez: 140000 ");
                System.out.println(" 3.Miguel Buenaventura: 345000");
                System.out.println(" 4.Mariana Ortiz: 45000");
                System.out.println(" 5.Hector Molina: 170000");
                return;
            case 3:
                System.out.println(" Informacion final del servicio cliente");
                System.out.println(" 1. Juan Gomez");
                System.out.println(" 2.Tomas Rodriguez");
                System.out.println(" 3.Miguel Buenaventura");
                System.out.println(" 4.Mariana Ortiz");
                System.out.println(" 5.Hector Molina");
                System.out.println("0. Volver");
                op5 = capturarDatoInt();
                Capturar_opc_final(op5);
                return;
            default:

                System.out.println("Opción incorrecta");
                return;




        }
    }

    private void Capturar_opc_final(int op5) {
        switch (op5){

            case 0:
                return;

            case 1:
                System.out.println(a1.toString());
                System.out.println("Observaciones del mecanico: Se le cambio el aceite y se le hizo su respectiva revision de frenos");
                System.out.println(" se reviso la moto y no se encontraron mas problemas");
            case 2:
                System.out.println(a2.toString());
                System.out.println("Observaciones del mecanico: Ademas de los filtros se le regulo el anticongelante y se le cambio el aceite");
                System.out.println(" y se le cambio el aceite");
            case 3:
                System.out.println(a3.toString());
                System.out.println("Observaciones del mecanico:  En Los neumaticos se encontro desgaste asi que hubo un");
                System.out.println(" cambio en lo dos,En el cambio del aceite se encontraron sucios los filtros");
                System.out.println(" por la compra de los nuevos neumaticos a la cuenta se le agrego 250.000");
            case 4:
                System.out.println(a4.toString());
                System.out.println("Observaciones del mecanico: Se hizo la regulacion de anticongelante y no se encontraron mas problemas");
            case 5:
                System.out.println(a5.toString());
                System.out.println("Observaciones del mecanico: Se hizo prueba en los frenos y se al encotrar que se le daño una");
                System.out.println(" parte se decidio remplazar una pieza, por estas piezas se le agrego a la cuenta 125.000 ");


        }
    }

    private void Menu_Ingreso() {
        System.out.println(" Registro de ingreso");


        System.out.println(" 1. Informacion general del cliente");
        System.out.println(" 2. Observaciones del cliente");
        System.out.println(" 0. Volver al menu principal");
        op2 = capturarDatoInt();
        switch (op2){
            case 0:
            menu_principal();
                break;
            case 1:
                System.out.println(" ¿Sobre que usuario quiere ver la informacion general?");
                System.out.println(" 1. Juan Gomez");
                System.out.println(" 2.Tomas Rodriguez");
                System.out.println(" 3.Miguel Buenaventura");
                System.out.println(" 4.Mariana Ortiz");
                System.out.println(" 5.Hector Molina");
                System.out.println(" 6.Ver informacion general");

                op3 = capturarDatoInt();
                switch (op3){
                    case 1:
                        System.out.println(a1.toString());
                        break;

                    case 2:
                        System.out.println(a2.toString());
                        break;
                    case 3:
                        System.out.println(a3.toString());
                        break;
                    case 4:
                        System.out.println(a3.toString());
                        break;
                    case 5:
                        System.out.println(a4.toString());
                        break;
                    case 6:
                        Contenido_Autos();
                       break;
                }
                break;

            case 2:
                System.out.println(" Observaciones de los clientes");
                System.out.println(" 1. Juan Gomez: Necesito un cambio de aceite y revision de frenos");
                System.out.println(" 2.Tomas Rodriguez: A la moto le fallan los filtros de aire");
                System.out.println(" 3.Miguel Buenaventura: Los neumaticos estan desgastados y necesita nuevo aceite");
                System.out.println(" 4.Mariana Ortiz: La moto necesita regulacion de anticongelante");
                System.out.println(" 5.Hector Molina:  Estos ultimos dias la cadena ha estado fallando");
                break;

            default:
                System.out.println("Opción incorrecta");

                break;


        }

    }
}
