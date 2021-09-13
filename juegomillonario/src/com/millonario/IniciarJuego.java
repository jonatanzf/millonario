package com.millonario;

import java.util.ArrayList;
import java.util.List;

public class IniciarJuego {
//crea una lista de preguntas
	
    public List<Pregunta> createPreguntas() {
        Pregunta pregunta1 = new Pregunta();
        pregunta1.setPregunta("Cual es el rio mas largo del mundo");
        pregunta1.setNivel(1);
        List<Respuesta> respuestas1 = this.crearRespuestasDeLaPregunta(this.crearRespuesta("A. El amazonas", true),
            this.crearRespuesta("B. El orinoco", false), this.crearRespuesta("C. El ganges", false));
        pregunta1.setRespuestas(respuestas1);
        
        Pregunta pregunta1b = new Pregunta();
        pregunta1b.setPregunta("En que año comenzo la segunda guerra mundial");
        pregunta1b.setNivel(1);
        List<Respuesta> respuestas1b = this.crearRespuestasDeLaPregunta(this.crearRespuesta("A. 1939", true),
            this.crearRespuesta("B. 1942", false), this.crearRespuesta("C. 1940", false));
        pregunta1b.setRespuestas(respuestas1b);
        
        Pregunta pregunta1c = new Pregunta();
        pregunta1c.setPregunta("cual es la capital de colombia");
        pregunta1c.setNivel(1);
        List<Respuesta> respuestas1c = this.crearRespuestasDeLaPregunta(this.crearRespuesta("A. Bogota", true),
            this.crearRespuesta("B. Medellin", false), this.crearRespuesta("C. Cali", false));
        pregunta1b.setRespuestas(respuestas1c);

        Pregunta pregunta2= new Pregunta();
        pregunta2.setPregunta("Cual es pais con mas habitantes del mundo");
        pregunta2.setNivel(2);
        List<Respuesta> respuestas2 = this.crearRespuestasDeLaPregunta(this.crearRespuesta("A. Colombia", false),
            this.crearRespuesta("B. China", true), this.crearRespuesta("C.Rusia", false));
        pregunta2.setRespuestas(respuestas2);
        
        Pregunta pregunta2b= new Pregunta();
        pregunta2b.setPregunta("Quien fue Jesus de Nasaret");
        pregunta2b.setNivel(2);
        List<Respuesta> respuestas2b = this.crearRespuestasDeLaPregunta(this.crearRespuesta("A. presidente", false),
            this.crearRespuesta("B. profeta", true), this.crearRespuesta("C.brujo", false));
        pregunta2b.setRespuestas(respuestas2b);
        
        Pregunta pregunta2c= new Pregunta();
        pregunta2c.setPregunta("Para que se usa un cohete");
        pregunta2c.setNivel(2);
        List<Respuesta> respuestas2c = this.crearRespuestasDeLaPregunta(this.crearRespuesta("A. jugar", false),
            this.crearRespuesta("B. viajar al espacio", true), this.crearRespuesta("C.trabajar", false));
        pregunta2c.setRespuestas(respuestas2c);


        Pregunta pregunta3= new Pregunta();
        pregunta3.setPregunta("En que pais queda transilvania");
        pregunta3.setNivel(3);
        List<Respuesta> respuestas3 = this.crearRespuestasDeLaPregunta(this.crearRespuesta("A. Inglaterra", false),
            this.crearRespuesta("B. China", false), this.crearRespuesta("C. Rumania", true));
        pregunta3.setRespuestas(respuestas3);
        
        Pregunta pregunta3b= new Pregunta();
        pregunta3b.setPregunta("Cual es la mejor universidad del mundo");
        pregunta3b.setNivel(3);
        List<Respuesta> respuestas3b = this.crearRespuestasDeLaPregunta(this.crearRespuesta("A. catolica", false),
            this.crearRespuesta("B.del Valle ", false), this.crearRespuesta("C. Hardvar", true));
        pregunta3b.setRespuestas(respuestas3b);
        
        Pregunta pregunta3c= new Pregunta();
        pregunta3c.setPregunta("Cual es la mejor universidad del mundo");
        pregunta3c.setNivel(3);
        List<Respuesta> respuestas3c = this.crearRespuestasDeLaPregunta(this.crearRespuesta("A. catolica", false),
            this.crearRespuesta("B.del Valle ", false), this.crearRespuesta("C. Hardvar", true));
        pregunta3c.setRespuestas(respuestas3c);

        List<Pregunta> preguntas = new ArrayList<>();
        preguntas.add(pregunta1);
        preguntas.add(pregunta1b);
        preguntas.add(pregunta1c);
        preguntas.add(pregunta2);
        preguntas.add(pregunta2b);
        preguntas.add(pregunta2c);
        preguntas.add(pregunta3);
        preguntas.add(pregunta3b);
        preguntas.add(pregunta3c);
        
        return preguntas;
    }

    private List<Respuesta> crearRespuestasDeLaPregunta(Respuesta opcionA, Respuesta opcionB, Respuesta opcionC) {
        List<Respuesta> respuestas = new ArrayList<>();
        respuestas.add(opcionA);
        respuestas.add(opcionB);
        respuestas.add(opcionC);
        return  respuestas;
    }

    private Respuesta crearRespuesta(String opcion, boolean correcta) {
        Respuesta respuesta = new Respuesta();
        respuesta.setRespuesta(opcion);
        respuesta.setCorrecta(correcta);
        return respuesta;
    }
}
