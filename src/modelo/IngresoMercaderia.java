/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author ArtemSupa
 */
public class IngresoMercaderia {
    
    private String ingrFecha;
    private int ingrTotal;
    private String ingrEstado;
    private int ingrDescuento;
    private int id;
   

    public IngresoMercaderia() {
    }

    public IngresoMercaderia(String ingrFecha, int ingrTotal, String ingrEstado, int ingrDescuento, int id) {
        this.ingrFecha = ingrFecha;
        this.ingrTotal = ingrTotal;
        this.ingrEstado = ingrEstado;
        this.ingrDescuento = ingrDescuento;
        this.id = id;
    }

    public String getIngrFecha() {
        return ingrFecha;
    }

    public void setIngrFecha(String ingrFecha) {
        this.ingrFecha = ingrFecha;
    }

    public int getIngrTotal() {
        return ingrTotal;
    }

    public void setIngrTotal(int ingrTotal) {
        this.ingrTotal = ingrTotal;
    }

    public String getIngrEstado() {
        return ingrEstado;
    }

    public void setIngrEstado(String ingrEstado) {
        this.ingrEstado = ingrEstado;
    }

    public int getIngrDescuento() {
        return ingrDescuento;
    }

    public void setIngrDescuento(int ingrDescuento) {
        this.ingrDescuento = ingrDescuento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    
    
}
