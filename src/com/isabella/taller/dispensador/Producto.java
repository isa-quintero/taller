package com.isabella.taller.dispensador;

public class Producto {
    private String marca;
    private String posicion;
    private byte cantidadActual;
    private byte capacidadMaxima;

    public Producto(String marca, String posicion, byte cantidadActual, byte capacidadMaxima) {
        this.marca = marca;
        this.posicion = posicion;
        this.cantidadActual = cantidadActual;
        this.capacidadMaxima = capacidadMaxima;
    }

    public Producto() {
        this.marca = marca;
        this.posicion = posicion;
        this.cantidadActual = cantidadActual;
    }

    public String getMarca() {
        return marca;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public byte getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(byte cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public byte getCapacidadMaxima() {
        return capacidadMaxima;
    }

}
