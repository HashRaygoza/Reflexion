/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash.blog.reflexion;

import java.beans.IntrospectionException;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @author david
 */
public class Reflexion {

    public void callSetter(Object objeto, String nombreCampo, Object valor) throws IntrospectionException, 
            IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        PropertyDescriptor descriptor;

        descriptor = new PropertyDescriptor(nombreCampo, objeto.getClass());
        descriptor.getWriteMethod().invoke(objeto, valor);
    }

    public Object callGetter(Object objeto, String nombreCampo) throws IntrospectionException, 
            IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        PropertyDescriptor descriptor;

        descriptor = new PropertyDescriptor(nombreCampo, objeto.getClass());
        return descriptor.getReadMethod().invoke(objeto);
    }

    public void callMethod(Object objeto, String nombreMetodo) throws NoSuchMethodException, 
            IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method metodo = objeto.getClass().getMethod(nombreMetodo);

        metodo.invoke(objeto);
    }

}
