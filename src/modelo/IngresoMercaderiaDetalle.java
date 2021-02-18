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
public class IngresoMercaderiaDetalle {
    private int idDetalleVenta;
    private int detaCantidad;
    private int detaPrecio;
    private String prodCodigo;
    private int idVenta;
    

    public IngresoMercaderiaDetalle() {
    }

    public IngresoMercaderiaDetalle(int idDetalleVenta, int detaCantidad, int detaPrecio, String prodCodigo, int idVenta) {
        this.idDetalleVenta = idDetalleVenta;
        this.detaCantidad = detaCantidad;
        this.detaPrecio = detaPrecio;
        this.prodCodigo = prodCodigo;
        this.idVenta = idVenta;
    }

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public int getDetaCantidad() {
        return detaCantidad;
    }

    public void setDetaCantidad(int detaCantidad) {
        this.detaCantidad = detaCantidad;
    }

    public int getDetaPrecio() {
        return detaPrecio;
    }

    public void setDetaPrecio(int detaPrecio) {
        this.detaPrecio = detaPrecio;
    }

    public String getProdCodigo() {
        return prodCodigo;
    }

    public void setProdCodigo(String prodCodigo) {
        this.prodCodigo = prodCodigo;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

}
