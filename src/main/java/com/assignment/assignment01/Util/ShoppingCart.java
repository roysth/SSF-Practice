package com.assignment.assignment01.Util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.stereotype.Component;

import com.assignment.assignment01.Model.Contact;

//This class to create the Files, load the files
@Component
public class ShoppingCart {

    public static String cartPath = "C:/Users/Public/data01";
    public static File cartDbFolder = new File (cartPath);


    //Method to save the file 
    public void save (Contact ctc){
        //get the username from the Contact class and determining the type of file (txt)
        String cartName = ctc.getUsername() + ".txt";
        String saveLocation = cartDbFolder.getPath() + File.separator + cartName;
        File saveFile = new File(saveLocation);
        
        try{
            PrintWriter printWriter = new PrintWriter(saveFile);
            BufferedWriter bw = new BufferedWriter(printWriter);
            
            for (String n: ctc.getCartList()) {
                bw.write(n + "\n");
                bw.flush();
                bw.close();
                printWriter.close();
            }
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    /*public Cart load(String username){
        String cartName = username + ".cart";
        Cart cart = new Cart(username);
        for(File cartFile: repository.listFiles())
            if(cartFile.getName().equals(cartName)){
                try{
                    InputStream is = new FileInputStream(cartFile);
                    cart.load(is);
                    is.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        return cart;
    }
    */

    
}
