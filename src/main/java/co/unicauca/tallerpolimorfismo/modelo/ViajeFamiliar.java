package co.unicauca.tallerpolimorfismo.modelo;

import java.util.Date;

/**
 *
 * @author Jhonfer Ruiz
 */
public class ViajeFamiliar extends Viaje{
    /**
     * Cantidad de integrantes de la familia
     */
    private int familia;
    //Constructor getters and setters

    public ViajeFamiliar(String origen, String destino, int costo, Date fechaSalida, Date fechaEntrada,int familia) {
        super(origen, destino, costo, fechaSalida, fechaEntrada);
        this.familia = familia;
    }

    public int getFamilia() {
        return familia;
    }

    public void setFamilia(int familia) {
        this.familia = familia;
    }
    
    @Override
    public String descripcion() {
        return "Viaje para disfrutar con toda tu familia";
    }

    @Override
    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje familiar"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
