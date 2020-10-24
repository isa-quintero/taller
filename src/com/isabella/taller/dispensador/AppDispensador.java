package com.isabella.taller.dispensador;

import com.isabella.taller.dispensador.Maquina;
import com.isabella.taller.dispensador.Producto;
import com.isabella.taller.tour.Corredor;

import java.util.ArrayList;
import java.util.List;

public class AppDispensador {
    public static void main(String[] args) {
        Producto p1= new Producto("doritos","A1",(byte) 8, (byte) 8);
        Producto p2= new Producto("papas","A2",(byte) 8, (byte) 8);
        Producto p3= new Producto("chitos","A3",(byte) 8,(byte) 8);
        Producto p4= new Producto("chicles","A4",(byte) 8,(byte) 8);
        Producto p5= new Producto("chocolatina","B1",(byte) 8,(byte) 8);
        Producto p6= new Producto("arequipe","B2",(byte) 8, (byte) 8);
        Producto p7= new Producto("boiquesos","B3",(byte) 8, (byte) 8);
        Producto p8= new Producto("chessetris","B4",(byte) 8, (byte) 8);
        Producto p9= new Producto("detodito","C1",(byte) 8,(byte) 8);
        Producto p10= new Producto("galletas","C2",(byte) 8, (byte) 8);

        Maquina maquinaDispensadora = new Maquina();
        maquinaDispensadora.getProductos().add(p1);
        maquinaDispensadora.getProductos().add(p2);
        maquinaDispensadora.getProductos().add(p3);
        maquinaDispensadora.getProductos().add(p4);
        maquinaDispensadora.getProductos().add(p5);
        maquinaDispensadora.getProductos().add(p6);
        maquinaDispensadora.getProductos().add(p7);
        maquinaDispensadora.getProductos().add(p8);
        maquinaDispensadora.getProductos().add(p9);
        maquinaDispensadora.getProductos().add(p10);



    }
}
