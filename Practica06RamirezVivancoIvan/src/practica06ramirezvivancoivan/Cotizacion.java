/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica06ramirezvivancoivan;

/**
 *
 * @author Usuario
 */
public class Cotizacion {
    private int dias;
    private String destino;
    private String habitacion;
    private String pago;
    private double subtotal;
    private double iva;
    private double total;
    private double mensualidad;

    public Cotizacion() {
        this.dias = 0;
        this.destino = "";
        this.habitacion = "";
        this.pago = "";
        this.subtotal = 0.0;
        this.iva = 0.0;
        this.total = 0.0;
        this.mensualidad = 0.0;
    }

    public int getDias() {
        return dias;
    }

    public String getDestino() {
        return destino;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public String getPago() {
        return pago;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getIva() {
        return iva;
    }

    public double getTotal() {
        return total;
    }

    public double getMensualidad() {
        return mensualidad;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setMensualidad(double mensualidad) {
        this.mensualidad = mensualidad;
    }
    
    
    
}
