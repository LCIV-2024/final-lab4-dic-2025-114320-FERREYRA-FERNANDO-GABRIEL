package com.example.demobase.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "words")
@Data
public class Word {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, unique = true)
    private String palabra;
    
    @Column(nullable = false)
    private Boolean utilizada = false;

    public Word() {
    }

    public Word(Long id, String palabra, Boolean utilizada) {
        this.id = id;
        this.palabra = palabra;
        this.utilizada = utilizada;
    }

    // Getter explicito para evitar problemas si Lombok no se procesa
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
