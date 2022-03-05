package Cuarto;

import java.util.Scanner;

public class Punto_4 {
    private String Usuario;
    private int Opcion;
    private static boolean alquilar;
    private int Pelicula, Pelicula_Alquilar, Pelicula_Consultar;
    private int Pelicula_consultar;
    private String Comentario;
    private Scanner input;


    public void Punto_4(){


            this.input = new Scanner(System.in);
            this.Saludo();
            this.Usuario = this.capturarDatoString();
            this.Menu_principal();
            this.Opcion = this.capturarDatoInt();
            this.Opciones_principales(Opcion);






    }

    private void Saludo(){
        System.out.println("Bienvenidos a la Video Tinda PIX-VIDEO");
        System.out.println("Sede Porvenir");
        System.out.println("¡¡Hola!!,¿Como te llamas?");

    }
    private String capturarDatoString(){ return this.input.nextLine();}
    private int capturarDatoInt() {return this.input.nextInt();}
    private boolean capturarDatoBoolean(){return this.input.nextBoolean();}
    private void Menu_principal(){

        System.out.println(Usuario+" ¿Que accion desea realizar?");
        System.out.println("1. Alquilar Pelicula");
        System.out.println("2. Consultar Pelicula");
        System.out.println("3. Anotacion sobre pelicula");
        System.out.println("0. Salir de la video tienda");
    }
    private int Opciones_principales(int Opcion){
        switch(Opcion) {
            case 0:
                System.out.println("Hasta Luego "+ Usuario);
                return 0;
            case 1:
                Menu_Alquilar ();
                return 0;
            case 2:
                Menu_Consultar ();
                return 0;
            case 3:
                Menu_Anotacion ();
                return 0;
            default:
                System.out.println("Opción incorrecta");

                return 0;


    }


}

    private void Menu_Anotacion() {
        System.out.println("Cuentanos que te ha parecido la pelicula o si ha ocurrido alguna anomalia");
        System.out.println("con alguna de las peliculas ");
        Peliculas_Video_Tienda();
        this.input = new Scanner(System.in);
        Comentario = capturarDatoString();
        System.out.println("Tu anomalia o comentario fue recibido con exito");
        return ;
    }

    private void Menu_Consultar() {
        System.out.println("¿Que pelicula desea Consultar?");
        Peliculas_Video_Tienda();
        Pelicula_Consultar = capturarDatoInt();
        switch (Pelicula_Consultar){
            case 0:
                System.out.println("Hasta luego "+Usuario);
                return;
            case 1:
                System.out.println(" TITULO ORIGINAL: Avatar ");
                System.out.println(" DIRECTOR: James Cameron");
                System.out.println(" AÑO DE ESTRENO: 2009 ");
                System.out.println(" SIPNOSIS: Jake Sully es un antiguo marine que esta lisiado");
                System.out.println(" y tiene la mision de viajar a Pandora, un planeta del que los");
                System.out.println(" humanos extraen un mineral, que puede acabar con la crisis");
                System.out.println(" energetica del planeta tierra. Pero el aire de este planeta es");
                System.out.println(" muy toxico, por eso crean el programa Avatar, para poder entrar al planeta.");
                System.out.println(" Dato curioso: Esta es la pelicula mas taquillera de la historia");
                System.out.println(" VALOR DEL ALQUILER: $5.000");
                System.out.println(" Estado: Disponible");


            case 2:
                System.out.println(" TITULO ORIGINAL: Pulp Fiction ");
                System.out.println(" DIRECTOR: Quentin Tarantino");
                System.out.println(" AÑO DE ESTRENO: 1994");
                System.out.println(" SIPNOSIS: La vida de un boxeador, dos sicarios, la esposa de un");
                System.out.println(" gánster y dos bandidos se entrelaza en una historia");
                System.out.println(" VALOR DEL ALQUILER:$5.000");
                System.out.println(" ");
                return;

            case 3:

                System.out.println(" TITULO ORIGINAL: The Shawshank Redemption");
                System.out.println(" DIRECTOR: Frank Darabont");
                System.out.println(" AÑO DE ESTRENO:  1994");
                System.out.println(" SIPNOSIS: Andy Dufresne termina en la cárcel por un crimen");
                System.out.println(" que no cometió, pero encuentra una luz de esperanza");
                System.out.println(" en Red, otro prisionero.");
                System.out.println(" VALOR DEL ALQUILER:$5.000");
                System.out.println(" Estado: Disponible");
                return;
            case 4:
                System.out.println(" TITULO ORIGINAL: Django Unchained");
                System.out.println(" DIRECTOR: Quentin Tarantino");
                System.out.println(" AÑO DE ESTRENO: 2013");
                System.out.println(" SIPNOSIS: Un antiguo esclavo une sus fuerzas con un cazador de recompensas");
                System.out.println(" alemán que lo libera y ayuda a cazar a los criminales más buscados del Sur,");
                System.out.println(" todo ello con la esperanza de encontrar");
                System.out.println(" a su esposa perdida hace mucho tiempo.");
                System.out.println(" VALOR DEL ALQUILER:$5.000");
                System.out.println(" Estado: Disponible");
                return;
            case 5:
                System.out.println(" TITULO ORIGINAL: A Clockwork Orange");
                System.out.println(" DIRECTOR: Stanley Kubrick");
                System.out.println(" AÑO DE ESTRENO: 1972");
                System.out.println(" SIPNOSIS: Alex es un joven muy agresivo que tiene dos pasiones:");
                System.out.println(" la violencia desaforada y Beethoven. Es el jefe de la banda");
                System.out.println(" de los drugos, que dan rienda suelta a sus instintos");
                System.out.println(" más salvajes aterrorizando a la población.");
                System.out.println(" VALOR DEL ALQUILER:$5.000");
                System.out.println(" Estado: No Disponible");
                return;
            case 6:
                System.out.println(" TITULO ORIGINAL: Inception");
                System.out.println(" DIRECTOR:Christopher Nolan");
                System.out.println(" AÑO DE ESTRENO: 2010");
                System.out.println(" SIPNOSIS: Dom Cobb es un ladrón con una extraña habilidad");
                System.out.println(" para entrar a los sueños de la gente y robarle los secretos");
                System.out.println(" de sus subconscientes. Su habilidad lo ha convertido");
                System.out.println(" en un atractivo en el mundo del espionaje corporativo,");
                System.out.println(" pero ha tenido un gran costo en la gente que ama.");
                System.out.println(" VALOR DEL ALQUILER:$5.000");
                System.out.println(" Estado: Disponible");
                return;
            case 7:
                System.out.println(" TITULO ORIGINAL:Avengers - Endgame  ");
                System.out.println(" DIRECTOR: Anthony y Joe Russo");
                System.out.println(" AÑO DE ESTRENO: 2019 ");
                System.out.println(" SIPNOSIS: Después de los eventos devastadores de Avengers:");
                System.out.println(" Infinity War,el universo está en ruinas debido a las");
                System.out.println(" acciones de Thanos, Con la ayuda de los aliados que quedaron,");
                System.out.println(" los Vengadores deberán reunirse una vez más para intentar detenerlo ");
                System.out.println(" y restaurar el orden en el universo de una vez por todas");
                System.out.println(" VALOR DEL ALQUILER:$5.000");
                System.out.println(" Estado: No Disponible");
                return;
            case 8:
                System.out.println(" TITULO ORIGINAL: Seven");
                System.out.println(" DIRECTOR: David Fincher ");
                System.out.println(" AÑO DE ESTRENO:1995");
                System.out.println(" SIPNOSIS: El veterano teniente Somerset está a punto de jubilarse ");
                System.out.println(" y ser reemplazado por el impulsivo detective David Mills.");
                System.out.println(" Ambos tendrán que colaborar en la resolución de unos asesinatos");
                System.out.println(" cometidos por un psicópata que se basa en los siete pecados capitales.");
                System.out.println(" VALOR DEL ALQUILER:$5.000");
                System.out.println(" Estado: Disponible");
                return;

            default:
                System.out.println("Opcion incorrecta");
                return;



        }
    }

    private void Menu_Alquilar() {
        System.out.println("¿Que pelicula desea Alquilar?");
        Peliculas_Video_Tienda();
        Pelicula_Alquilar = capturarDatoInt();
        switch (Pelicula_Alquilar){
            case 0:
                System.out.println("Hasta luego "+Usuario);
            case 1:
                System.out.println("¿Deseas alquilar Avatar?");
                System.out.println("El costo del alquiler es de 5.000");
                System.out.println("Escriba true si desea alquilarla, en caso contrario, false");
                alquilar = capturarDatoBoolean();
                if (alquilar = true){
                    System.out.println("La pelicula ha sido alquilada, tienes un plazo de 7 dias para regresarla");

                }else {
                    System.out.println("La pelicula NO fue alquilada");
                }
                return;

            case 2:
                System.out.println("¿Deseas alquilar Pulp Fiction?");
                System.out.println("El costo del alquiler es de 5.000");
                System.out.println("Escriba true si desea alquilarla, en caso contrario, false");
                alquilar = capturarDatoBoolean();
                if (alquilar = true){
                    System.out.println("La pelicula ha NO ESTA DISPONIBLE por el momento");

                }else {
                    System.out.println("La pelicula NO fue alquilada");
                }
                return;
            case 3:
                System.out.println("¿Deseas alquilar Sueño de Fuga");
                System.out.println("El costo del alquiler es de 5.000");
                System.out.println("Escriba true si desea alquilarla, en caso contrario, false");
                alquilar = capturarDatoBoolean();
                if (alquilar = true){
                    System.out.println("La pelicula ha sido alquilada, tienes un plazo de 7 dias para regresarla");

                }else {
                    System.out.println("La pelicula NO fue alquilada");
                }
                return;

            case 4:
                System.out.println("¿Deseas alquilar Django Unchained?");
                System.out.println("El costo del alquiler es de 5.000");
                System.out.println("Escriba true si desea alquilarla, en caso contrario, false");
                alquilar = capturarDatoBoolean();
                if (alquilar = true){
                    System.out.println("La pelicula ha sido alquilada, tienes un plazo de 7 dias para regresarla");

                }else {
                    System.out.println("La pelicula NO fue alquilada");
                }
                return;

            case 5:
                System.out.println("¿Deseas alquilar La naranja mecanica?");
                System.out.println("El costo del alquiler es de 5.000");
                System.out.println("Escriba true si desea alquilarla, en caso contrario, false");
                alquilar = capturarDatoBoolean();
                if (alquilar = true){
                    System.out.println("La pelicula ha NO ESTA DISPONIBLE por el momento");

                }else {
                    System.out.println("La pelicula NO fue alquilada");
                }
                return;
            case 6:
                System.out.println("¿Deseas alquilar Inception?");
                System.out.println("El costo del alquiler es de 5.000");
                System.out.println("Escriba true si desea alquilarla, en caso contrario, false");
                alquilar = capturarDatoBoolean();
                if (alquilar = true){
                    System.out.println("La pelicula ha sido alquilada, tienes un plazo de 7 dias para regresarla");

                }else {
                    System.out.println("La pelicula NO fue alquilada");
                }
                return;
            case 7:
                System.out.println("¿Deseas alquilar Avengers: End Game?");
                System.out.println("El costo del alquiler es de 5.000");
                System.out.println("Escriba true si desea alquilarla, en caso contrario, false");
                alquilar = capturarDatoBoolean();
                if (alquilar = true){
                    System.out.println("La pelicula ha NO ESTA DISPONIBLE por el momento");

                }else {
                    System.out.println("La pelicula NO fue alquilada");
                }
                return;
            case 8:
                System.out.println("¿Deseas alquilar Se7en?");
                System.out.println("El costo del alquiler es de 5.000");
                System.out.println("Escriba true si desea alquilarla, en caso contrario, false");
                alquilar = capturarDatoBoolean();
                if (alquilar = true){
                    System.out.println("La pelicula ha sido alquilada, tienes un plazo de 7 dias para regresarla");

                }else {
                    System.out.println("La pelicula NO fue alquilada");
                }
                return;
            default:
                System.out.println("Opcion incorrecta");
                return;



        }


    }

    private void Peliculas_Video_Tienda() {
        System.out.println("1. Avatar");
        System.out.println("2. Pulp Fiction");
        System.out.println("3. Sueño de Fuga");
        System.out.println("4. Django Unchained");
        System.out.println("5. La naranja mecanica");
        System.out.println("6. Inception");
        System.out.println("7. Avengers: End Game");
        System.out.println("8. Se7en");
        System.out.println("0. Salir de la video tienda");
    }
    }


