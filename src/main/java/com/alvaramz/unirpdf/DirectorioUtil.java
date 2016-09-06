package com.alvaramz.unirpdf;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Proporciona métodos utilitarios para directorios.
 *
 * @author Ing. Adrián Alvarado Ramírez.
 */
public class DirectorioUtil {

    /**
     * Obtiene la lista de archivos en una ruta especificada.
     *
     * @param ruta
     * @return
     */
    public List<String> obtenerListaArchivos(String ruta) {
        File directorio = new File(ruta);
        ArrayList<String> listaArchivos = null;

        if (directorio.exists() && directorio.isDirectory()) {
            listaArchivos = new ArrayList<>();
            File[] archivosRuta = directorio.listFiles();
            for (File archivo : archivosRuta) {
                if (!archivo.isDirectory()) {
                    listaArchivos.add(archivo.getName());
                }
            }

            listaArchivos.sort(new Comparador());
        }

        return listaArchivos;
    }

    /**
     * Implementa la interface Comparator<T> para hacer el ordenamiento de una lista.
     */
    private class Comparador implements Comparator<String> {

        @Override
        public int compare(String string1, String string2) {
            return string1.compareToIgnoreCase(string2);
        }
    }

}
