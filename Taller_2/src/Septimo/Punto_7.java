package Septimo;

import java.util.Scanner;

public class Punto_7 {

    private String Nombre_completo;
    private int edad;
    private double estatura;
    private double peso;
    private double IMC;
    private Scanner input;

    public void Punto_7(){

        this.input = new Scanner(System.in);
        this.Solicitar_Nombre();
        this.Nombre_completo = this.capturarDatoString();
        this.Solicitar_edad();
        this.edad = this.capturarDatoInt();


        this.IMC(IMC,peso,estatura);
        this.peso = this.capturarDatoDouble();
        this.estatura= this.capturarDatoDouble();
        this.IMC = this.capturarDatoDouble();

    }

    private void Solicitar_Nombre(){
        System.out.println("SECRETARIA DE SALUD MUNICIPAL");
        System.out.println("------¡¡BIENVENIDOS!!-------");
        System.out.println("¿Cual es tu nombre completo?");
    }
    private void Solicitar_edad(){
        System.out.println("¿Cual es tu edad?");
    }

    private String capturarDatoString() {
        return this.input.nextLine();
    }

    private int capturarDatoInt() {
        return this.input.nextInt();
    }

    private double capturarDatoDouble() {
        return this.input.nextDouble();
    }

    private double IMC(double IMC,double estatura,double peso){
        System.out.println("Para conocer su Indice de Masa Corporal digite los siguientes datos:");
        System.out.println("Digite su peso en kilogramos:");
        peso = capturarDatoDouble();
        System.out.println("Digite su estatura en metros:");
        estatura = capturarDatoDouble();
        System.out.println("____________________________________________");
        IMC = (peso/Math.pow(estatura,2));
        if (IMC<=18.5){

            System.out.println("Su Indice de Masa Corporal es: "+IMC);
            System.out.println("IMC: Bajo de peso");
            System.out.println("Consulta a tu medico o nutricionista");
            System.out.println("Para buscar las causas de tu bajo peso");


        }
        if (IMC > 18.5 & IMC<= 24.9){

            System.out.println("Su Indice de Masa Corporal es: "+IMC);
            System.out.println("IMC: Normal");
            System.out.println("¡¡Muy bien!! Sigue con tu alimentacion habitual");
            System.out.println("____________________________________________");


        }
        if (IMC >= 25 & IMC<= 29.9){

            System.out.println("Su Indice de Masa Corporal es: "+IMC);
            System.out.println("IMC: Sobrepeso");
            System.out.println("Evite ganar mas peso, trata de equilibrar tu dieta");
            System.out.println("Para llegar a tu peso normal");
            System.out.println("____________________________________________");

        }
        if (IMC >= 30){

            System.out.println("Su Indice de Masa Corporal es: "+IMC);
            System.out.println("IMC: Obesidad");
            System.out.println("Consulta a tu medico o nutricionista");
            System.out.println("La obesidad puede llegar a causar problemas de salud");
            System.out.println("____________________________________________");

        }
        System.out.println("Espero esta informacion sea util para tu vida");
        System.out.println("Hasta Pronto "+Nombre_completo);

        return 0;
    }
}



