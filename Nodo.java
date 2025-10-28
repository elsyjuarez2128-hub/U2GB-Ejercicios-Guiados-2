/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cola;

/**
 *
 * @author elsyj
 */
public class Nodo<T> {
    private T dato;
    private Nodo siguente;
    
    public Nodo(T data){
    dato = data;
    siguente = null;
    
}

    public T getDato() {
        return dato;
    }

    public Nodo getSiguente() {
        return siguente;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public void setSiguente(Nodo siguente) {
        this.siguente = siguente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nodo{");
        sb.append("dato=").append(dato);
        sb.append(", siguente=").append(siguente);
        sb.append('}');
        return sb.toString();
    }
}
