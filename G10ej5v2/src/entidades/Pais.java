/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class Pais implements Comparable<Pais>{
    private String nombre;
    private String idioma;
    private Double poblacion;
    private Double superficie;

    public Pais(String nombre, String idioma, Double poblacion, Double superficie) {
        this.nombre = nombre;
        this.idioma = idioma;
        this.poblacion = poblacion;
        this.superficie = superficie;
    }

    public Pais() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Double getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(Double poblacion) {
        this.poblacion = poblacion;
    }

    public Double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Double superficie) {
        this.superficie = superficie;
    }

    @Override
    public int compareTo(Pais t) {
        return this.nombre.compareTo(t.getNombre());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.nombre);
        hash = 61 * hash + Objects.hashCode(this.idioma);
        hash = 61 * hash + Objects.hashCode(this.poblacion);
        hash = 61 * hash + Objects.hashCode(this.superficie);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.idioma, other.idioma)) {
            return false;
        }
        if (!Objects.equals(this.poblacion, other.poblacion)) {
            return false;
        }
        if (!Objects.equals(this.superficie, other.superficie)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "nombre= " + nombre + ", idioma= " + idioma + ", poblacion= " + poblacion + " Millon Hab., superficie= " + superficie+" mil Kms2.";
    }
    
    
    
}
