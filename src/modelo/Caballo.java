/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author CAMILO
 */
public class Caballo {

    private int codigo, corX, corY, velocidad, avanzar;
    private long tiempo;
    private String nombre;

    public Caballo(int codigo, int corX, int corY, int velocidad, int avanzar, long tiempo, String nombre) {
        this.codigo = codigo;
        this.corX = corX;
        this.corY = corY;
        this.velocidad = velocidad;
        this.avanzar = avanzar;
        this.tiempo = tiempo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCorX() {
        return corX;
    }

    public void setCorX(int corX) {
        this.corX = corX;
    }

    public int getCorY() {
        return corY;
    }

    public void setCorY(int corY) {
        this.corY = corY;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getAvanzar() {
        return avanzar;
    }

    public void setAvanzar(int avanzar) {
        this.avanzar = avanzar;
    }

    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
