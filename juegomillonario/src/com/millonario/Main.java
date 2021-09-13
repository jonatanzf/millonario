package com.millonario;

import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Juego juego = new Juego();
        IniciarJuego iniciarJuego = new IniciarJuego();
        juego.setPreguntas(iniciarJuego.createPreguntas());

        /**
         * Declaro el ingreso por consola.
         */
        InputStream stream = System.in;
        Scanner scanner = new Scanner(stream);

        System.out.printf("Bienvenido al juego: " + juego.getName() + "\n");
        System.out.printf("Ingrese su nombre:\n");
        String input = scanner.next();
        /**
         * Creo el jugador
         */
        Jugador jugador = new Jugador();
        jugador.setNivel(1);
        jugador.setName(input);
        jugador.setPuntaje(0);
        System.out.printf("Hola " + jugador.getName() + "\n");
        /**
         * Extraer la cantidad de niveles segun la lista de preguntas.
         */
        Integer niveles = juego.getPreguntas().size();
        Integer iteracciones = 0;

        System.out.printf("Instrucciones:\n"
            + "Este juego es de opcion multiple con unica respuesta, para seleccionar una respuesta escriba\n "
            + "1 Si A, 2 si es B y 3 si es C de la opcion correspondiente\n\n");
        while (iteracciones < niveles) {
            /**
             * Extrae la pregunta por nivel de jugador.
             */
            Pregunta pregunta = juego.getPreguntas().get(jugador.getNivel() - 1);
            System.out.printf("Pregunta :\n"+"" + pregunta.getPregunta() + "\n");

            /**
             * Recorrer la lista de respuestas de una pregunta y pintar
             */
            for (int i = 0; i < pregunta.getRespuestas().size(); i++) {
                System.out.printf("" + pregunta.getRespuestas().get(i).getRespuesta() + "\n");
            }
            System.out.printf("La respuesta es: ");
            String opcion = scanner.next();
            /**
             * Convertir respuesta a entero
             */
            Integer respuesta = Integer.valueOf(opcion);
            if (respuesta <= 3 && respuesta >= 0 && pregunta.getRespuestas().get(respuesta - 1).isCorrecta()) {
                iteracciones++;
                if (iteracciones >= niveles) {
                    System.out.printf("**** Felicitaciones has superado el juego ***");
                } else {
                    System.out.printf("La respuesta es correcta, avanzas de nivel\n");
                    jugador.setNivel(pregunta.getNivel() + 1);
                    jugador.setPuntaje(jugador.getPuntaje()+10);
                    System.out.printf("Su nivel ahora es: " + jugador.getNivel() + "\n");

                }

            } else {
                System.out.printf("La respuesta es incorrecta, perdiste, fin de juego \n");
                break;
            }

        }
        System.out.printf("Su puntaje es: " + jugador.getPuntaje() + "\n");
        /**
         * finaliza la ejecucion.
         */
        scanner.close();
    }


}
