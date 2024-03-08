import java.util.Scanner;
import java.io.*;

class Main{
    public static void main(String[] args) {
        Scanner Menu = new Scanner(System.in);

        try{
            File mioFile = new File("static/data.txt");
            Scanner myReader = new Scanner(mioFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        }catch(FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println("Scegli tra le vare opzioni:[1]Cripta, [2]Decripta, [3]Stampa");
        int scelta = Menu.nextInt();

        if(scelta == 1){
            System.out.println(Cripta.Cesar());
            System.out.println(Cripta.xorAlgo());
        }else if(scelta == 2){
            
        }else if(scelta == 3){
            
        }else{
            System.out.println("Scegli tra 1-2-3, altri numeri non sono validi!");
        }
        myReader.close();
    }
}