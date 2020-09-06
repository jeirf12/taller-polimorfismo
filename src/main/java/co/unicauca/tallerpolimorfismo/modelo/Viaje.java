package co.unicauca.tallerpolimorfismo.modelo;

import java.util.Date;

/**
 *
 * @author Jhonfer Ruiz
 */
public abstract class Viaje {
    protected String origen;
    protected String destino;
    protected int costo;
    protected Date fechaSalida;
    protected Date fechaEntrada;
    
    /**
     * Constructor por defecto
     */
    public Viaje() {
        this.origen = "";
        this.destino = "";
        this.costo=0;
        this.fechaSalida = null;
        this.fechaEntrada = null;
    }
    
    
    /**
     * Constructor con parametros
     * @param origen
     * @param destino
     * @param costo
     * @param fechaSalida
     * @param fechaEntrada 
     */
    public Viaje(String origen, String destino, int costo, Date fechaSalida, Date fechaEntrada) {
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
        this.fechaSalida = fechaSalida;
        this.fechaEntrada = fechaEntrada;
    }
    
    //Getters and Setters
    
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }
    public abstract String descripcion();
    
    public String cualquierMetodo() {
        return "Cualquier método implementado en la clase base";
    }
    public String cualquierMetodo2() {
        return "Cualquier método2 implementado en la clase base";
    }
}
