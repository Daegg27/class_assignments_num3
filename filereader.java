import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;

public class filereader {


    static public void main(String[] args){


        try {
            FileWriter fw = new FileWriter("Class.txt");
            PrintWriter pw = new PrintWriter(fw);

            pw.println("Assignment done: No");
            pw.println("Will it get done: Yes");
            pw.println("'on time?': Potentially");

            pw.close();

        }   catch (IOException e){
            System.out.println(e);
        }    

        try { 
            FileReader fr = new FileReader("Class.txt");
            BufferedReader br = new BufferedReader(fr);

            String str;

            while ((str = br.readLine()) != null) {
                System.out.println(str + "\n");
            }

            br.close();
        } catch (IOException e){
            System.out.println("The error is: " + e);
        }


    }
    
}
