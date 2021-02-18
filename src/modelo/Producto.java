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
public class Producto {
    private String CodigoProd;
    private String NombreProd;
    private int ValorCompraProd;
    private int ValorVentaProd;
    private int StockProd;
    private int IdCategoriaProd;
    private byte[] ImagenProd;
    private String EstadoProd;
    private String NombreCategoria;
    private String RutaImg;

    

    public Producto() {
    }

    public Producto(String CodigoProd, String NombreProd, int ValorCompraProd, int ValorVentaProd, int StockProd, int IdCategoriaProd, byte[] ImagenProd, String EstadoProd, String NombreCategoria, String RutaImg) {
        this.CodigoProd = CodigoProd;
        this.NombreProd = NombreProd;
        this.ValorCompraProd = ValorCompraProd;
        this.ValorVentaProd = ValorVentaProd;
        this.StockProd = StockProd;
        this.IdCategoriaProd = IdCategoriaProd;
        this.ImagenProd = ImagenProd;
        this.EstadoProd = EstadoProd;
        this.NombreCategoria = NombreCategoria;
        this.RutaImg = RutaImg;
    }

   
    
public String getNombreCategoria() {
        return NombreCategoria;
    }

    public void setNombreCategoria(String NombreCategoria) {
        this.NombreCategoria = NombreCategoria;
    }
    
    public String getCodigoProd() {
        return CodigoProd;
    }

    public void setCodigoProd(String CodigoProd) {
        this.CodigoProd = CodigoProd;
    }

    public String getNombreProd() {
        return NombreProd;
    }

    public void setNombreProd(String NombreProd) {
        this.NombreProd = NombreProd;
    }

    public int getValorCompraProd() {
        return ValorCompraProd;
    }

    public void setValorCompraProd(int ValorCompraProd) {
        this.ValorCompraProd = ValorCompraProd;
    }

    public int getValorVentaProd() {
        return ValorVentaProd;
    }

    public void setValorVentaProd(int ValorVentaProd) {
        this.ValorVentaProd = ValorVentaProd;
    }

    public int getStockProd() {
        return StockProd;
    }

    public void setStockProd(int StockProd) {
        this.StockProd = StockProd;
    }

    public int getIdCategoriaProd() {
        return IdCategoriaProd;
    }

    public void setIdCategoriaProd(int IdCategoriaProd) {
        this.IdCategoriaProd = IdCategoriaProd;
    }

    public byte[] getImagenProd() {
        return ImagenProd;
    }

    public void setImagenProd(byte[] ImagenProd) {
        this.ImagenProd = ImagenProd;
    }

    public String getEstadoProd() {
        return EstadoProd;
    }

    public void setEstadoProd(String EstadoProd) {
        this.EstadoProd = EstadoProd;
    }

    public String getRutaImg() {
        return RutaImg;
    }

    public void setRutaImg(String RutaImg) {
        this.RutaImg = RutaImg;
    }
   
    
    
}
