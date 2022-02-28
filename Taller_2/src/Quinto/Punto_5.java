package Quinto;

import javax.swing.*;
import java.util.Scanner;

public class Punto_5 {
    private String Usuario;
    private int Opcion,Id_producto;
    private boolean devolucion, comprar;
    private Scanner input;


    public void Punto_5(){

        this.input = new Scanner(System.in);
        this.Saludo();
        this.Usuario = this.capturarDatoString();
        this.Menu_principal();
        this.Id_producto = this.capturarDatoInt();
        this.Capturar_Id(Id_producto);





    }
    private int Capturar_Id(int Id_producto){
        switch (Id_producto){
            case 0:
                System.out.println("Hasta Luego "+ Usuario);
                return 0;
            case 1:
                System.out.println("Pax Noche");
                Menu_producto();
                Opcion = capturarDatoInt();
                switch (Opcion){
                    case 0:
                        System.out.println("Hasta Luego "+ Usuario);
                        return 0;
                    case 1:
                        System.out.println("Estimad@ "+Usuario+" El valor de su compra es $1.600");
                        System.out.println("Desea llevarlo digite true o false");
                        comprar = capturarDatoBoolean();
                        Capturar_Compra(comprar);
                        return 0;
                    case 2:
                        System.out.println(" El Pax Noche es un producto para el resfriado");
                        System.out.println(" contiene acetaminofén 500 mg. Fenilefrina HCl 10 mg,");
                        System.out.println(" Clorfeniramina maleato 2 mg.");
                        System.out.println(" INDICACIONES: Medicación sintomática del resfriado común.");
                        System.out.println(" Lo puedes encontrar en sabor Limon y naranja");
                        System.out.println(" Su precio es de $1.600");

                    case 3:
                        Devolucion();
                        return 0;
                    default:
                        System.out.println("Opción incorrecta");
                        return 0;

                }
            case 2:
                System.out.println("Noraver Garganta 12 tabletas Naranja - Miel");
                Menu_producto();
                Opcion = capturarDatoInt();
                switch (Opcion){
                    case 0:
                        System.out.println("Hasta Luego "+ Usuario);
                        return 0;
                    case 1:
                        System.out.println("Estimad@ "+Usuario+" El valor de su compra es $16.600");
                        System.out.println("Desea llevarlo digite true o false");
                        comprar = capturarDatoBoolean();
                        Capturar_Compra(comprar);
                        return 0;
                    case 2:
                        System.out.println(" Noraver-P Garganta 10Mg+1.4Mg");
                        System.out.println(" 12 Tabletas Masticable Naranja-Miel");
                        System.out.println(" Antiséptico bucofaríngeo que");
                        System.out.println(" elimina bacterias que causan la infección");
                        System.out.println(" Alivia el dolor de garganta.");
                        System.out.println(" Su precio es de $16.600");

                    case 3:
                        Devolucion();
                        return 0;
                    default:
                        System.out.println("Opción incorrecta");
                        return 0;

                }
            case 3:
                System.out.println("Metronidazol");
                Menu_producto();
                Opcion = capturarDatoInt();
                switch (Opcion){
                    case 0:
                        System.out.println("Hasta Luego "+ Usuario);
                        return 0;
                    case 1:
                        System.out.println("Estimad@ "+Usuario+" El valor de su compra es $1.500");
                        System.out.println("Desea llevarlo digite true o false");
                        comprar = capturarDatoBoolean();
                        Capturar_Compra(comprar);
                        return 0;
                    case 2:
                        System.out.println(" Metronidazol");
                        System.out.println(" El metronidazol es un antiparasitario");
                        System.out.println(" del grupo de los nitroimidazoles");
                        System.out.println(" Inhibe la síntesis de los ácidos nucleicos");
                        System.out.println(" infecciones provocadas por protozoarios y bacterias anaeróbicas");
                        System.out.println(" Su precio es de $1.500");

                    case 3:
                        Devolucion();
                        return 0;
                    default:
                        System.out.println("Opción incorrecta");
                        return 0;

                }
            case 4:
                System.out.println("Pediasure");
                Menu_producto();
                Opcion = capturarDatoInt();
                switch (Opcion){
                    case 0:
                        System.out.println("Hasta Luego "+ Usuario);
                        return 0;
                    case 1:
                        System.out.println("Estimad@ "+Usuario+" El valor de su compra es $72.500");
                        System.out.println("Desea llevarlo digite true o false");
                        comprar = capturarDatoBoolean();
                        Capturar_Compra(comprar);
                        return 0;
                    case 2:
                        System.out.println(" Pediasure Polvo Tarro X 900Gr Vainilla, Fresa o Chocolate");
                        System.out.println(" es un complemento nutricional infantil que apoya el");
                        System.out.println(" óptimo crecimiento y desarrollo en niños entre 2 y 13 años.");
                        System.out.println(" se recomienda disolver en 190 ml de agua o leche y tomarlo una vez al dia,");
                        System.out.println(" ayuda a recuperar el apetito de tu niño");
                        System.out.println(" Su precio es de $72.500");

                    case 3:
                        Devolucion();
                        return 0;
                    default:
                        System.out.println("Opción incorrecta");
                        return 0;

                }
            case 5:
                System.out.println("Crema #4");
                Menu_producto();
                Opcion = capturarDatoInt();
                switch (Opcion){
                    case 0:
                        System.out.println("Hasta Luego "+ Usuario);
                        return 0;
                    case 1:
                        System.out.println("Estimad@ "+Usuario+" El valor de su compra es $20.500");
                        System.out.println("Desea llevarlo digite true o false");
                        comprar = capturarDatoBoolean();
                        Capturar_Compra(comprar);
                        return 0;
                    case 2:
                        System.out.println(" CREMA N 4 ANTIPAÑALITIS MEDICADA TUBO X 60 GRS ");
                        System.out.println(" Para la prevención de la dermatitis del pañal.");
                        System.out.println(" Con PH neutro y fórmula enriquecida con 40% de Óxido de Zinc,");
                        System.out.println(" Alantoina, Vitamina E y Aceite Vegetal.");
                        System.out.println(" Libre de antibióticos.");
                        System.out.println(" Su precio es de $20.500");

                    case 3:
                        Devolucion();
                        return 0;
                    default:
                        System.out.println("Opción incorrecta");
                        return 0;

                }
            case 6:
                System.out.println("Aspirina");
                Menu_producto();
                Opcion = capturarDatoInt();
                switch (Opcion){
                    case 0:
                        System.out.println("Hasta Luego "+ Usuario);
                        return 0;
                    case 1:
                        System.out.println("Estimad@ "+Usuario+" El valor de su compra es $2.000");
                        System.out.println("Desea llevarlo digite true o false");
                        comprar = capturarDatoBoolean();
                        Capturar_Compra(comprar);
                        return 0;
                    case 2:
                        System.out.println(" Es ácido acetilsalicílico, un fármaco de la familia de los salicilatos.");
                        System.out.println(" Se utiliza como medicamento para tratar el dolor, la fiebre y la inflamación");
                        System.out.println(" debido a su efecto inhibitorio, no selectivo, de la ciclooxigenasa.");
                        System.out.println(" Este medicamento se administra por vía oral");
                        System.out.println(" Para Adultos y mayores de 16 años, consumir cada 4 o 6 horas");
                        System.out.println(" Su precio en unidad, tableta de 500mg es de $2.000");

                    case 3:
                        Devolucion();
                        return 0;
                    default:
                        System.out.println("Opción incorrecta");
                        return 0;

                }
            case 7:
                System.out.println("Omega 3");
                Menu_producto();
                Opcion = capturarDatoInt();
                switch (Opcion){
                    case 0:
                        System.out.println("Hasta Luego "+ Usuario);
                        return 0;
                    case 1:
                        System.out.println("Estimad@ "+Usuario+" El valor de su compra es  $32.000");
                        System.out.println("Desea llevarlo digite true o false");
                        comprar = capturarDatoBoolean();
                        Capturar_Compra(comprar);
                        return 0;
                    case 2:
                        System.out.println(" Omega-3 1200mg 60 Softgels");
                        System.out.println(" Este producto es un suplemento dietario.");
                        System.out.println(" No es un medicamento y no suple una alimentación equilibrada.");
                        System.out.println(" son un tipo de grasa poliinsaturada. Necesitamos estas grasas");
                        System.out.println(" para fortalecer las neuronas y para otras funciones importantes.");
                        System.out.println(" Su precio es de $32.000, el recipiente contiene 60 capsulas");

                    case 3:
                        Devolucion();
                        return 0;
                    default:
                        System.out.println("Opción incorrecta");
                        return 0;

                }
            case 8:
                System.out.println("Dolex Rápida Acción");
                Menu_producto();
                Opcion = capturarDatoInt();
                switch (Opcion){
                    case 0:
                        System.out.println("Hasta Luego "+ Usuario);
                        return 0;
                    case 1:
                        System.out.println("Estimad@ "+Usuario+" El valor de su compra es $21.500");
                        System.out.println("Desea llevarlo digite true o false");
                        comprar = capturarDatoBoolean();
                        Capturar_Compra(comprar);
                        return 0;
                    case 2:
                        System.out.println(" Dolex Rápida Acción");
                        System.out.println(" 500Mg Tabletas Frasco X24Tab Gsk Acetaminofén");
                        System.out.println(" Adultos (incluyendo tercera edad) y niños de 12 años en adelante:");
                        System.out.println(" 1 tableta de acetaminofén cada 4-6 horas, según sea requerido");
                        System.out.println(" Niños menores de 12 años: no se recomienda.");
                        System.out.println(" Su precio es de $ 21.500");

                    case 3:
                        Devolucion();
                        return 0;
                    default:
                        System.out.println("Opción incorrecta");
                        return 0;

                }
            case 9:
                System.out.println("Gel Cicatricure Cicatrices y Estrías 60 G");
                Menu_producto();
                Opcion = capturarDatoInt();
                switch (Opcion){
                    case 0:
                        System.out.println("Hasta Luego "+ Usuario);
                        return 0;
                    case 1:
                        System.out.println("Estimad@ "+Usuario+" El valor de su compra es $44.000");
                        System.out.println("Desea llevarlo digite true o false");
                        comprar = capturarDatoBoolean();
                        Capturar_Compra(comprar);
                        return 0;
                    case 2:
                        System.out.println(" Gel Cicatricure Cicatrices y Estrías 60 G");
                        System.out.println(" Gel para la piel que desvanece paultatinamente las cicatrices");
                        System.out.println(" y  desaparece notablemente arrugas y líneas de expresión.");
                        System.out.println(" Fórmula mejorada con Q-Acetyl 10");
                        System.out.println(" Aplicar diariamente, sobre cicatrices y estrías");
                        System.out.println("Su precio es de $ 44.000 ");

                    case 3:
                        Devolucion();
                        return 0;
                    default:
                        System.out.println("Opción incorrecta");
                        return 0;

                }
            case 10:
                System.out.println("ELECTROLIT SUERO");
                Menu_producto();
                Opcion = capturarDatoInt();
                switch (Opcion){
                    case 0:
                        System.out.println("Hasta Luego "+ Usuario);
                        return 0;
                    case 1:
                        System.out.println("Estimad@ "+Usuario+" El valor de su compra es $6.800");
                        System.out.println("Desea llevarlo digite true o false");
                        comprar = capturarDatoBoolean();
                        Capturar_Compra(comprar);
                        return 0;
                    case 2:
                        System.out.println(" ELECTROLIT SUERO");
                        System.out.println(" Es una solución rehidratante oral, para la prevencion y");
                        System.out.println(" el tratamiento del desequilibrio hidroelectrolitico ocasionado");
                        System.out.println(" por el exceso de calor, ejercicio físico intenso,");
                        System.out.println(" insolación, vómito y diarrea leve a moderada.");
                        System.out.println(" Sabores disponibles: fresa-kiwi, uva, coco, manzana, limon, naranja");
                        System.out.println(" Su precio es de $ 6.800");

                    case 3:
                        Devolucion();
                        return 0;
                    default:
                        System.out.println("Opción incorrecta");
                        return 0;

                }
            default:
                System.out.println("Opción incorrecta");

                return 0;


        }


    }

    private void Devolucion() {
        System.out.println("Desea devolver este producto, digite true o false");
        devolucion = capturarDatoBoolean();
        if (devolucion = true){
            System.out.println("Este producto ha sido devuelto");
        }else {
            System.out.println("Este producto NO ha sido devuelto");
        }
    }

    private void Capturar_Compra(boolean comprar) {

        if (comprar== true){
            System.out.println(Usuario+" Su compra ha sido exitosa");

        }else {
            System.out.println("Compra no realizada");
        }
    }


    private void Menu_producto() {
        System.out.println(Usuario+" ¿Que accion desea realizar?");
        System.out.println("1. Comprar");
        System.out.println("2. Consultar ");
        System.out.println("3. Devolver ");
        System.out.println("0. Salir ");
    }

    private void Menu_principal(){

        System.out.println(Usuario+" Estos son los productos que tenemos disponibles");
        System.out.println("1.  Pax noche");
        System.out.println("2. Noraver ");
        System.out.println("3. Metronidazol ");
        System.out.println("4. Pediasure ");
        System.out.println("5. Crema #4 ");
        System.out.println("6. Aspirina ");
        System.out.println("7. Omega 3 ");
        System.out.println("8. Dolex ");
        System.out.println("9. Cicatrecure ");
        System.out.println("10. Electrolit ");
        System.out.println(" 0. Salir");

    }
    private void Saludo(){
        System.out.println("Bienvenidos a nuestra Dogueria Mi Salud");
        System.out.println("Sede Suba");
        System.out.println("¡¡Hola!!,¿Como te llamas?");

    }
    private String capturarDatoString(){ return this.input.nextLine();}
    private int capturarDatoInt() {return this.input.nextInt();}
    private boolean capturarDatoBoolean(){return this.input.nextBoolean();}




}
