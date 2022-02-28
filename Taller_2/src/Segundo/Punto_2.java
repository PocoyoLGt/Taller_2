package Segundo;

import java.util.Scanner;

public class Punto_2 {
    private int Edad;
    private Scanner input;

    public void Punto_2(){

        this.input = new Scanner(System.in);
        this.Solicitar_edad();
        this.Edad = this.capturarDatoInt();
        this.Imprimir();

    }
    private void Solicitar_edad(){
        System.out.println("¿Cual es tu edad?");
    }

    private int capturarDatoInt() {return this.input.nextInt();}

    private void Imprimir(){
        if (Edad >= 18){
            System.out.println("Usted es mayor de edad");
            System.out.println("_____________________________");
        }else{
            System.out.println("Usted es un niño");
            System.out.println("_____________________________");
        }

    }
}
