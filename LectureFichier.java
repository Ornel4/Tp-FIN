import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class LectureFichier {
    public static void main(String[] args) {
        File file = new File("Monfichier.txt");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
               System.out.println(e.getMessage());
            }
        }else{
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
                String line = bufferedReader.readLine();

                while (line != null) {
                    System.out.println(line);
                    line = bufferedReader.readLine();
                }

                bufferedReader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } 
    }
}
