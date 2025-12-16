package com.example.demobase.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GameResponseDTO {
    private String palabraOculta;
    private List<Character> letrasIntentadas;
    private Integer intentosRestantes;
    private Boolean palabraCompleta;
    private Integer puntajeAcumulado;

    public String getPalabraOculta() {
        return palabraOculta;
    }

    public void setPalabraOculta(String palabraOculta) {
        this.palabraOculta = palabraOculta;
    }

    public List<Character> getLetrasIntentadas() {
        return letrasIntentadas;
    }

    public void setLetrasIntentadas(List<Character> letrasIntentadas) {
        this.letrasIntentadas = letrasIntentadas;
    }

    public Integer getIntentosRestantes() {
        return intentosRestantes;
    }

    public void setIntentosRestantes(Integer intentosRestantes) {
        this.intentosRestantes = intentosRestantes;
    }

    public Boolean getPalabraCompleta() {
        return palabraCompleta;
    }

    public void setPalabraCompleta(Boolean palabraCompleta) {
        this.palabraCompleta = palabraCompleta;
    }

    public Integer getPuntajeAcumulado() {
        return puntajeAcumulado;
    }

    public void setPuntajeAcumulado(Integer puntajeAcumulado) {
        this.puntajeAcumulado = puntajeAcumulado;
    }
}
