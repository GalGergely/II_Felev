import auto.*;
import java.io.*;

class Main{
    public static void main(String[] args) {
        File input = new File("input.txt");
        try{
            BufferedReader buff = new BufferedReader(new FileReader(input));
            String line;
            int x = 0;
            while ((line = buff.readLine()) != null){
                x++;
            }
            //System.out.println(x);
            buff.close();
            BufferedReader buffNew = new BufferedReader(new FileReader(input));
            Auto[] autok = new Auto[x];
            int i=0;
            while ((line = buffNew.readLine()) != null){
                System.out.println(line);
                autok[i] = new Auto();
            }
            buffNew.close();
        }
        catch (FileNotFoundException exc){
            System.out.println("Unable to open file: " + exc.getMessage());
        }
        catch (IOException exc){
            System.out.println("IOException thrown");
        }
        
    }

}
