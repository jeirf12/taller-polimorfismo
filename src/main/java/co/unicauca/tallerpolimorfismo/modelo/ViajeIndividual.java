package co.unicauca.tallerpolimorfismo.modelo;

import java.util.Date;

/**
 *
 * @author Jhonfer Ruiz
 */
public class ViajeIndividual extends Viaje {
    
    // Constructor
    public ViajeIndividual(String origen, String destino, int costo, Date fechaSalida, Date fechaEntrada) {
        super(origen, destino, costo, fechaSalida, fechaEntrada);
    }

    @Override
    public String descripcion() {
        return "Disfruta tu viaje individual";
    }
}
