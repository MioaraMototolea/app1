/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import beans.Punct;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mioara
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Class<?> punctClass = Class.forName("beans.Punct");
           Constructor constrPunct = punctClass.getDeclaredConstructor();
           constrPunct.setAccessible(true);
         Punct punct =(Punct) constrPunct.newInstance();
         System.out.println(punct);
         
         Field fx= punctClass.getDeclaredField("x");
         fx.setAccessible(true);
         fx.setInt(punct, 10);
         
         Method m= punctClass.getDeclaredMethod("afisareXY", null);
         m.setAccessible(true);
         m.invoke(punct, null);
         
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
