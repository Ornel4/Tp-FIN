
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class EcrirerFichier {
    public static void main(String[] args) {
        File file = new File("Monfichier.txt");

        if (!(file.exists())) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } 
        }else{
            try {
                FileWriter ecrirer = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(ecrirer);

                bw.write("Bonjour");
                bw.newLine();
                bw.write("Voici le texte en ecrire et lire ....");
                bw.newLine();
                bw.write("Ce le tp pour ecrire dans le fichier ");
                bw.newLine();
                bw.write("Avec BufferdWriter et FileWriter");
                bw.newLine();
                bw.write("mais aussi lire avec BufferedReader");
                bw.newLine();
                bw.write("Bonne suite de temps");

                bw.close();
                ecrirer.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
           
        }
    }
}
