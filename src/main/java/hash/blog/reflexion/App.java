package hash.blog.reflexion;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

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

            // ponemos el nombre de los campos y el orden en que los queremos llamar
            String[] camposResultado = {"cantidad", "instrumento", "resultado"};
            String[] camposComunicado = {"encabezado", "departamento", "mensaje"};

            Reflexion reflexion = new Reflexion();

            // Llamamos a los getter del objeto comunicado, se imprimen en el
            // orden en que se pusieoron en el arreglo
            for (String campo : camposComunicado) {
                System.out.println((String) reflexion.callGetter(comunicado, campo));
            }
            
            System.out.println("--------------------------");
            
            for(String campo: camposResultado) {
                System.out.println((String) reflexion.callGetter(resultado, campo));
            }
            
            // Llamamos al método metodo que tiene ambos objetos
            reflexion.callMethod(resultado, "metodo");
            reflexion.callMethod(comunicado, "metodo");
            
        } catch (IntrospectionException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
