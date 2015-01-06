/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author tyler
 */
public class CopyBytes {
    
    public static void main(String args[]) throws IOException{
        FileInputStream in = null;
        FileOutputStream out = null;
        
        try{
            in = new FileInputStream("xandu.txt");
            out = new FileOutputStream("outagain.txt");
            int c;
            
            while((c = in.read()) != -1){
                out.write(c);
            }
        }
        catch(Exception e){
            
        }
        finally{
            if (in !=null){
                in.close();
            }
            if(out != null){
                out.close();
            }
        }
    }
    
}
