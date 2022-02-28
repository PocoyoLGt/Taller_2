package Noveno;

import java.util.Scanner;

public class Punto_9 {
    private String Nombre;
    private int opcion;
    private Scanner input;
    private double base, altura,BMa,bm,triangulo, rectangulo, trapecio;

public void Punto_9(){
    this.input = new Scanner(System.in);
    this.Nombre();
    this.Nombre = this.capturarDatoString();
    this.menu();
    this.opcion = this.capturarDatoInt();
    this.Capturar_opcion(opcion);



}

private void Nombre(){

    System.out.println("----¡¡BIENVENIDOS A LA APP DE GEOMETRIA!!-----");
    System.out.println("¿Cual es tu nombre ?");
}
    private String capturarDatoString() {
        return this.input.nextLine();
    }
    private double capturarDatoDouble() {
        return this.input.nextDouble();
    }
    private int capturarDatoInt() {return this.input.nextInt();}

    private void menu(){
    System.out.println("Hola, "+Nombre+" ¿Qure area desea saber?");
        System.out.println("1. Rectangulo");
        System.out.println("2. Triangulo");
        System.out.println("3. Trapecio");
        System.out.println("0. Ninguna ");

    }

    private int Rectangulo(){
        System.out.println("Para conocer el area del Rectangulo");
        System.out.println("Digite su base en cm");
        base = capturarDatoDouble();
        System.out.println("Digite su altura en cm");
        altura = capturarDatoDouble();
        rectangulo = base * altura;
        System.out.println(Nombre+" El area del rectangulo es de: "+rectangulo);


        return 0;
    }
    private int Triangulo(){
        System.out.println("Para conocer el area del Triangulo");
        System.out.println("Digite su base en cm");
        base = capturarDatoDouble();
        System.out.println("Digite su altura en cm");
        altura = capturarDatoDouble();
       triangulo = (base * altura)/2;
        System.out.println(Nombre+" El area del triangulo es de: "+triangulo);


        return 0;
    }
    private int Trapecio(){
        System.out.println("Para conocer el area del Trapecio");
        System.out.println("Digite su base mayor en cm");
        BMa = capturarDatoDouble();
        System.out.println("Digite su base menor en cm");
        bm = capturarDatoDouble();
        System.out.println("Digite su altura en cm");
        altura = capturarDatoDouble();
        trapecio = ((BMa+bm)/2)* altura;
        System.out.println(Nombre+" El area del trapecio es de: "+trapecio);


        return 0;
    }

    private int Capturar_opcion(int opcion){

    switch (opcion){

        case 1:
            Rectangulo();
            return 0;
        case 2:
            Triangulo();
            return 0;
        case 3:
            Trapecio();
            return 0;
        case 0:
            System.out.println("Hasta luego "+Nombre);
            return 0;



    }


        return opcion;
    }



}
