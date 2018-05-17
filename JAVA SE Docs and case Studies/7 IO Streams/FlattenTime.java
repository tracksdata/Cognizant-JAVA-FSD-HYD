/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.msat;

/**
 *
 * @author OH87005
 */
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FlattenTime {

    public static void main(String[] args) {
        String filename = "c:\\MyFolder\\time.ser";
        
        if (args.length > 0) {
            filename = args[0];
        }
        PersistentTime time = new PersistentTime();
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(filename);
            out = new ObjectOutputStream(fos);
            out.writeObject(time);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
