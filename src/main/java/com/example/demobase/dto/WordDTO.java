package com.example.demobase.dto;

import lombok.Data;

@Data
public class WordDTO {
    private Long id;
    private String palabra;
    private Boolean utilizada;

    public WordDTO() {
    }

    public WordDTO(Long id, String palabra, Boolean utilizada) {
        this.id = id;
        this.palabra = palabra;
        this.utilizada = utilizada;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public Boolean getUtilizada() {
        return utilizada;
    }

    public void setUtilizada(Boolean utilizada) {
        this.utilizada = utilizada;
    }
}
