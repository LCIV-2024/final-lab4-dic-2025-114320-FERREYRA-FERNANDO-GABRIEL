package com.example.demobase.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GameRequestDTO {
    private Long idJugador;
    private String palabra;
    private List<Character> letrasIntentadas;
    private Integer intentosRestantes;

    public Long getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(Long idJugador) {
        this.idJugador = idJugador;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
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
}
