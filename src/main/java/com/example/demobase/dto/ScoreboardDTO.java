package com.example.demobase.dto;

import lombok.Data;

@Data
public class ScoreboardDTO {
    private Long idJugador;
    private String nombreJugador;
    private Integer puntajeTotal;
    private Long partidasJugadas;
    private Long partidasGanadas;
    private Long partidasPerdidas;

    public ScoreboardDTO() {
    }

    public ScoreboardDTO(Long idJugador, String nombreJugador, Integer puntajeTotal,
                         Long partidasJugadas, Long partidasGanadas, Long partidasPerdidas) {
        this.idJugador = idJugador;
        this.nombreJugador = nombreJugador;
        this.puntajeTotal = puntajeTotal;
        this.partidasJugadas = partidasJugadas;
        this.partidasGanadas = partidasGanadas;
        this.partidasPerdidas = partidasPerdidas;
    }

    public Long getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(Long idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public Integer getPuntajeTotal() {
        return puntajeTotal;
    }

    public void setPuntajeTotal(Integer puntajeTotal) {
        this.puntajeTotal = puntajeTotal;
    }

    public Long getPartidasJugadas() {
        return partidasJugadas;
    }

    public void setPartidasJugadas(Long partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }

    public Long getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(Long partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public Long getPartidasPerdidas() {
        return partidasPerdidas;
    }

    public void setPartidasPerdidas(Long partidasPerdidas) {
        this.partidasPerdidas = partidasPerdidas;
    }
}
