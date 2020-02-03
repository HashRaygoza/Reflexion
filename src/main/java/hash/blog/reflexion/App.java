/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash.blog.reflexion;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class App {

    public static void main(String[] args) {
        try {
            ResultadoAnalisis resultado = new ResultadoAnalisis();

            resultado.setCantidad("DOS MILL");
            resultado.setInstrumento("BALANZA GRANATARIA");
            resultado.setResultado("EXITOSO");

            Comunicado comunicado = new Comunicado();
            comunicado.setDepartamento("INVESTIGACION Y DESAROLLO");
            comunicado.setEncabezado("RESULTADOS DE EXPERIMENTO");
            comunicado.setMensaje("EXPERIMENTO REALIZADO");

            String[] camposResultado = {"cantidad", "instrumento", "resultado"};
            String[] camposComunicado = {"encabezado", "departamento", "mensaje"};

            Reflexion reflexion = new Reflexion();

            for (String campo : camposComunicado) {
                System.out.println((String) reflexion.callGetter(comunicado, campo));
            }
            
            System.out.println("--------------------------");
            
            for(String campo: camposResultado) {
                System.out.println((String) reflexion.callGetter(resultado, campo));
            }
            
        } catch (IntrospectionException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
