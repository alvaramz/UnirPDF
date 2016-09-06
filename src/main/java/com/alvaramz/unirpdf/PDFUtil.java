package com.alvaramz.unirpdf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.apache.pdfbox.io.MemoryUsageSetting;
import org.apache.pdfbox.multipdf.PDFMergerUtility;

/**
 * Proporciona métodos para el tratamiento de archivos PDF.
 *
 * @author Ing. Adrián Alvarado Ramírez.
 */
public class PDFUtil {

    /**
     * Une los archivos con los nombre en la lista "nombreArchivos", que se
     * encuentran en la rutaBase, en un único archivo con el nombre
     * nombreArchivoSalida, en la rutaSalida.
     *
     * @param rutaBase
     * @param nombresArchivos
     * @param rutaSalida
     * @param nombreArchivoSalida
     */
    public void unirArchivos(String rutaBase, List<String> nombresArchivos, String rutaSalida, String nombreArchivoSalida) {
        // Clase con la funcionalidad para unir.
        PDFMergerUtility pfmu = new PDFMergerUtility();

        for (String nombreArchivo : nombresArchivos) {
            File archivo = new File(String.format("%s%s%s", rutaBase, File.separator, nombreArchivo));

            // Si el archivo existe y puede ser leído, se agrega.
            if (archivo.exists() && archivo.canRead()) {
                try {
                    pfmu.addSource(archivo);
                } catch (FileNotFoundException fnfe) {
                    System.out.printf("Error al intentar cargar el archivo: %s al contenedor de archivos a unir, detalle del error: %s", nombreArchivo, fnfe.toString());
                }
            }
        }
        
        // Se establece el nombre del archivo de salida.
        pfmu.setDestinationFileName(String.format(String.format("%s%s%s", rutaSalida, File.separator, nombreArchivoSalida)));
        
        // Se unen los archivos:
        try{
            pfmu.mergeDocuments(MemoryUsageSetting.setupMainMemoryOnly());
        }catch(IOException ioe){
            System.out.printf("Error al intentar unir el archivo: %s, detalle del error: %s", nombreArchivoSalida, ioe.toString());
        }
    }

}
