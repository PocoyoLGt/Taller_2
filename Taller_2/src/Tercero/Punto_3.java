package Tercero;

import java.util.Scanner;

public class Punto_3 {
    private String nombre;
    private String apellido;
    private int Edad;
    private Scanner input;

    public void Punto_3(){

        this.input = new Scanner(System.in);
        this.Solicitar_nombre();
        this.nombre = this.capturarDatoString();
        this.Solicitar_apellido();
        this.apellido = this.capturarDatoString();
        this.Solicitar_edad();
        this.Edad = this.capturarDatoInt();
        this.Imprimir();

    }
    private void Solicitar_nombre(){
        System.out.println("¿Cual es tu nombre?");
    }
    private void Solicitar_apellido(){
        System.out.println("¿Cuales son tus apellidos?");
    }

    private void Solicitar_edad(){
        System.out.println("¿Cual es tu edad?");
    }
    private String capturarDatoString(){ return this.input.nextLine();}
    private int capturarDatoInt() {return this.input.nextInt();}

    private void Imprimir(){
        if (Edad >= 18){
            System.out.println(nombre+" "+apellido);
            System.out.println("Usted es mayor de edad, por lo tanto puede entrar a la fiesta");
            System.out.println("_____________________________");
        }else{
            System.out.println(nombre+" "+apellido);
            System.out.println("Usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuelvase a su casa");
            System.out.println("_____________________________");
        }

    }
}
