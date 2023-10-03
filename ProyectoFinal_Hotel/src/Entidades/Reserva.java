
package Entidades;

import java.time.LocalDate;


public class Reserva {
    
    private int idReserva;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int dias;
    private double precioTotal;
    private Huesped huesped;
    private Habitacion habitacion;
    private boolean estado;

    public Reserva() {
    }

    public Reserva(LocalDate fechaInicio, LocalDate fechaFin, int dias, double precioTotal, Huesped huesped, Habitacion habitacion, boolean estado) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.dias = dias;
        this.precioTotal = precioTotal;
        this.huesped = huesped;
        this.habitacion = habitacion;
        this.estado = estado;
    }

    public Reserva(int idReserva, LocalDate fechaInicio, LocalDate fechaFin, int dias, double precioTotal, Huesped huesped, Habitacion habitacion, boolean estado) {
        this.idReserva = idReserva;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.dias = dias;
        this.precioTotal = precioTotal;
        this.huesped = huesped;
        this.habitacion = habitacion;
        this.estado = estado;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "idReserva=" + idReserva + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", dias=" + dias + ", precioTotal=" + precioTotal + ", huesped=" + huesped + ", habitacion=" + habitacion + ", estado=" + estado;
    }

    
    
}