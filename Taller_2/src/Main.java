import Cuarto.Punto_4;
import Decimo.Punto_10;
import Noveno.Punto_9;
import Octavo.Punto_8;
import Primer_punto.Punto_1;
import Quinto.Punto_5;
import Segundo.Punto_2;
import Septimo.Punto_7;
import Sexto.Punto_6;
import Tercero.Punto_3;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static boolean bandera = true;
    private static int opcion;

    public static void main(String[] args) throws IOException, InterruptedException {

        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        do {

            menu();
            opcion = capturarOpcion();
            bandera = evaluarOpcion(opcion);
        } while(bandera);


    }

    private static void menu() {
        System.out.println("Escoja el taller que desea ver");
        System.out.println("1. Punto #1");
        System.out.println("2. Punto #2");
        System.out.println("3. Punto #3");
        System.out.println("4. Punto #4");
        System.out.println("5. Punto #5");
        System.out.println("6. Punto #6");
        System.out.println("7. Punto #7");
        System.out.println("8. Punto #8");
        System.out.println("9. Punto #9");
        System.out.println("10. Punto #10");
        System.out.println("0. Salir del taller");
    }
    private static int capturarOpcion() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    private static boolean evaluarOpcion(int opcion) throws IOException {
        switch(opcion) {
            case 0:
                return false;
            case 1:
                Punto_1 p1 = new Punto_1();
                p1.Punto_1();
                return true;
            case 2:
                Punto_2 p2 = new Punto_2();
                p2.Punto_2();
                return true;
            case 3:
                Punto_3 p3 = new Punto_3();
                p3.Punto_3();
                return true;
            case 4:
                Punto_4 p4 = new Punto_4();
                p4.Punto_4();
                return true;
            case 5:
                Punto_5 p5 = new Punto_5();
                p5.Punto_5();
                return true;
            case 6:
                Punto_6 p6 = new Punto_6();
                p6.Punto_6();
                return true;
            case 7:
                Punto_7 p7 = new Punto_7();
                p7.Punto_7();
                return true;
            case 8:
                Punto_8 p8 = new Punto_8();
                p8.Punto_8();
                return true;
            case 9:
                Punto_9 p9 = new Punto_9();
                p9.Punto_9();
                return true;
            case 10:
                Punto_10 p10 = new Punto_10();
                p10.Punto_10();
                return true;



            default:
                System.out.println("Opción incorrecta");
                System.in.read();
                return true;
        }


    }


}
