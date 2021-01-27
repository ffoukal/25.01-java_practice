package TT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MiFactory {

    public static Object getInstance(String objName){
        try {
            Class sorterClass = Class.forName(objName);
            return sorterClass.getDeclaredConstructor().newInstance();
        }  catch (ClassNotFoundException e){
            e.printStackTrace();
            throw new RuntimeException("No se encontró la clase solicitada: " + objName);
        } catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException("Error al crear la clase: " + objName);
        }
    }
}
