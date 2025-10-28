/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cola;

/**
 *
 * @author elsyj
 */

public class Cola<T> {
    private Nodo<T> cabeza;
    private Nodo<T> cola;
    private int tamano;

    public Cola() {
        this.cabeza = null;
        this.cola = null;
        this.tamano = 0;
    }
    public boolean colaVacia(){
    return cabeza == null;
    }


    public int getTamano() {
        return tamano;
    }

    public Nodo<T> getCabeza() {
        return cabeza;
    }

    public Nodo<T> getCola() {
        return cola;
    }

    public void setCabeza(Nodo<T> cabeza) {
        this.cabeza = cabeza;
    }

    public void setCola(Nodo<T> cola) {
        this.cola = cola;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
}
