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

    public void callSetter(Object obj, String fieldName, Object value) throws IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        PropertyDescriptor pd;

        pd = new PropertyDescriptor(fieldName, obj.getClass());
        pd.getWriteMethod().invoke(obj, value);

    }

    public Object callGetter(Object obj, String fieldName) throws IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        PropertyDescriptor pd;

        pd = new PropertyDescriptor(fieldName, obj.getClass());
        return pd.getReadMethod().invoke(obj);
    }
    
    public void callMethod(Object obj, String metodo) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
        MethodDescriptor md;
        Method m = obj.getClass().getMethod(metodo);
        
        m.invoke(obj);        
    }

}
