package com.millonario;

import java.util.List;

public class Juego {

    private String name = "Preguntas millonarias";
    private List<Pregunta> preguntas;

    public String getName() {
        return name;
    }

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }
}
