package co.unicauca.tallerpolimorfismo.modelo;

import java.util.Date;

/**
 *
 * @author Jhonfer Ruiz
 */
public class ViajeTodoIncluido extends Viaje {
    
    /**
     * Constructor parametrizado
     * @param origen
     * @param destino
     * @param costo
     * @param fechaSalida
     * @param fechaEntrada 
     */
    public ViajeTodoIncluido(String origen, String destino, int costo, Date fechaSalida, Date fechaEntrada) {
        super(origen, destino, costo, fechaSalida, fechaEntrada);
    }
    /**
     * 
     * @return 
     */
    @Override
    public String descripcion() {
        return "Disfruta tu viaje todo incluido";
    }
}
