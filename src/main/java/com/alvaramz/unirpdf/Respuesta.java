
package com.alvaramz.unirpdf;

/**
 *
 * @author Ing. Adrián Alvarado Ramírez
 */
public class Respuesta {
    
    private boolean resultado;
    
    private String mensaje;

    /**
     * @return the resultado
     */
    public boolean isResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
}
