/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ArtemSupa
 */
public class VentaMercaderia {
    private int id;
    private String ingrFecha;
    private int ingrTotal;
    private String ingrEstado;
    private int ingrDescuento;
     private int ingrsubtotal;

    public VentaMercaderia() {
    }

    public VentaMercaderia(int id, String ingrFecha, int ingrTotal, String ingrEstado, int ingrDescuento, int ingrsubtotal) {
        this.id = id;
        this.ingrFecha = ingrFecha;
        this.ingrTotal = ingrTotal;
        this.ingrEstado = ingrEstado;
        this.ingrDescuento = ingrDescuento;
        this.ingrsubtotal = ingrsubtotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getIngrsubtotal() {
        return ingrsubtotal;
    }

    public void setIngrsubtotal(int ingrsubtotal) {
        this.ingrsubtotal = ingrsubtotal;
    }

    
   
}
