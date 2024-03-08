import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cripta {

    static protected String Cesar (){
        StringBuilder output = new StringBuilder(data.lenght());
        for(char singleChar: data.toCharArray()){
            int shiftedChar = (int) (singleChar + shift) % 256;
            output.append((char)shiftedChar);
        }
        return output.toString();
    }

    static public String xorAlgo(){
        StringBuilder result = new StringBuilder();
        for(int i=0;i<data.lenght();i++){
            char inputChar = data.charAt(i);
            char keyChar = key.charAt(i % key.lenght());
            char encryptedChar = (char)(inputChar ^ keyChar);
            result append(encryptedChar);
        }
        return result.toString();
    }
    
}
