/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenterror;

import java.io.Serializable;

/**
 *
 * @author T107
 */
public class Evaluacion implements Serializable{
    
    private String nombre;
    private float   calificacion;

    public Evaluacion() {
    }

    public Evaluacion(String nombre, float calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Evaluacion{" + "nombre=" + nombre + ", calificacion=" + calificacion + '}';
    }
    
}
