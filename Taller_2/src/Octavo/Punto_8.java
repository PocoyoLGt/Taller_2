package Octavo;

import java.util.ArrayList;
import java.util.Scanner;

public class Punto_8 {
    private Scanner input;
    private int op1,op2;
    Usuario_Pasteleria Us1 = new Usuario_Pasteleria("Andrea Romero");
    Usuario_Pasteleria Us2 = new Usuario_Pasteleria("Pascual Buendia");
    Usuario_Pasteleria Us3 = new Usuario_Pasteleria("Javier Rodriguez");
    Usuario_Pasteleria Us4 = new Usuario_Pasteleria("Danna Ferreira");
    Usuario_Pasteleria Us5 = new Usuario_Pasteleria("Isabella Santodomingo");
    Usuario_Pasteleria Us6 = new Usuario_Pasteleria("Zoe Muñoz");
    Usuario_Pasteleria Us7 = new Usuario_Pasteleria("Josue Jimenez");
    Usuario_Pasteleria Us8 = new Usuario_Pasteleria("Tania Diaz");
    Usuario_Pasteleria Us9 = new Usuario_Pasteleria("Nicolas Acosta");
    Usuario_Pasteleria Us10 = new Usuario_Pasteleria("Alejandro Gomez");
    Mis_Pedidos P1= new Mis_Pedidos("Chocolate","Pequeña","Sin Cobertura",24500);
    Mis_Pedidos P2= new Mis_Pedidos("Tres-leches- Chocolate","Mediana-Pequeña","Crema de frutas-Chips de chocolate",63500);
    Mis_Pedidos P3= new Mis_Pedidos("Tradicional","Grande","Crema de frutas",49500);
    Mis_Pedidos P4= new Mis_Pedidos("Chocolate","Grande","Cobertura de chocolate y chips de chocolate",58000);
    Mis_Pedidos P5= new Mis_Pedidos("Tradicional","Pequeña","Sin Cobertura",15000);
    Mis_Pedidos P6= new Mis_Pedidos("Fresa - Mora","Mediana - Pequeña","Crema de frutas,chips - Fondane",65500);
    Mis_Pedidos P7= new Mis_Pedidos("Tres leches","Grande","Cobertura de chocolate",56000);
    Mis_Pedidos P8= new Mis_Pedidos("Tradicional","Mediana","Cobertura y chips de chocolate",38000);
    Mis_Pedidos P9= new Mis_Pedidos("Tres leches","Grande","Sin Cobertura",51000);
    Mis_Pedidos P10= new Mis_Pedidos("Chocolate - Tres leches","Pequeña - Grande","Crema de frutas - chips de chocolate",78500);


    ArrayList<Usuario_Pasteleria> Usuarios = new ArrayList<Usuario_Pasteleria>();
    ArrayList<Mis_Pedidos> Pedidos = new ArrayList<>();
    public void  Punto_8(){
        this.input = new Scanner(System.in);
        ArrayList<Usuario_Pasteleria> Usuarios = new ArrayList<Usuario_Pasteleria>();
        ArrayList<Mis_Pedidos> Pedidos = new ArrayList<>();
        this.Menu_principal();
        this.op1 = this.capturarDatoInt();
        this.Opciones_principales(op1);

    }
    private void Usuarios_pedidos() {
        System.out.println(Usuarios.size());
        Usuarios.add(Us1);
        Usuarios.add(Us2);
        Usuarios.add(Us3);
        Usuarios.add(Us4);
        Usuarios.add(Us5);
        Usuarios.add(Us6);
        Usuarios.add(Us7);
        Usuarios.add(Us8);
        Usuarios.add(Us9);
        Usuarios.add(Us10);
        Pedidos.add(P1);
        Pedidos.add(P2);
        Pedidos.add(P3);
        Pedidos.add(P4);
        Pedidos.add(P5);
        Pedidos.add(P6);
        Pedidos.add(P7);
        Pedidos.add(P8);
        Pedidos.add(P9);
        Pedidos.add(P10);


    }

    private String capturarDatoString(){ return this.input.nextLine();}
    private int capturarDatoInt() {return this.input.nextInt();}

    private void Menu_principal(){
        System.out.println("----------------------");
        System.out.println("Pasteleria Don Carlos");
        System.out.println("1.Ver pedido de cliente");
        System.out.println("2. Ver ganancias del dia");
        System.out.println("3. Consultar tortas disponibles");
        System.out.println("0. Salir");


    }
    private int Opciones_principales(int op1){

        switch (op1){
            case 0:
                System.out.println("Hasta Luego");
                return 0;

            case 1:
                System.out.println(" Selecciones el cliente que desea ver ");
                System.out.println(" 1. "+ Us1);
                System.out.println(" 2. "+Us2);
                System.out.println(" 3. "+ Us3);
                System.out.println(" 4. "+ Us4);
                System.out.println(" 5. "+ Us5);
                System.out.println(" 6. "+ Us6);
                System.out.println(" 7. "+ Us7);
                System.out.println(" 8. "+Us8);
                System.out.println(" 9. "+Us9);
                System.out.println(" 10. "+Us10);
                System.out.println("0. Volver");
                op2 = capturarDatoInt();
                switch (op2){
                    case 0:
                        return op1;
                    case 1:
                        System.out.println(" Pedido de  "+ Us1);
                        System.out.println("Torta de "+P1);
                    case 2:
                        System.out.println(" Pedido de  "+ Us2);
                        System.out.println("Torta de "+P2);
                    case 3:
                        System.out.println(" Pedido de  "+ Us3);
                        System.out.println("Torta de "+P3);
                    case 4:
                        System.out.println(" Pedido de  "+ Us4);
                        System.out.println("Torta de "+P4);
                    case 5:
                        System.out.println(" Pedido de  "+ Us5);
                        System.out.println("Torta de "+P5);
                    case 6:
                        System.out.println(" Pedido de  "+ Us6);
                        System.out.println("Torta de "+P6);
                    case 7:
                        System.out.println(" Pedido de  "+ Us7);
                        System.out.println("Torta de "+P7);
                    case 8:
                        System.out.println(" Pedido de  "+ Us8);
                        System.out.println("Torta de "+P8);
                    case 9:
                        System.out.println(" Pedido de  "+ Us9);
                        System.out.println("Torta de "+P9);
                    case 10:
                        System.out.println(" Pedido de  "+ Us10);
                        System.out.println("Torta de "+P10);

                    default:
                        System.out.println("Opción incorrecta");
                        return op1;
                }
            case 2:
                System.out.println("---Ventas del dia---- ");
                System.out.println("El dia de hoy se vendieron 13 tortas ");
                System.out.println("Y el total de sus ventas fue de $499.500 ");
                return op1;
            case 3:
                System.out.println("---Tortas Disponibles---- ");
                System.out.println("Sabor -----Cantidad Inicio del dia---Vendidas- Cantidad Actual");
                System.out.println("Chocolate --------------10---------------4------------ 6");
                System.out.println("Tres Leches ------------10---------------4-------------6");
                System.out.println("Tradicional -------------8---------------3-------------5");
                System.out.println("Fresa -------------------4---------------1-------------3");
                System.out.println("Mora --------------------4---------------1-------------3");
            default:
                System.out.println("Opción incorrecta");
                return op1;
        }

    }
}
