import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
public class FileHandler {
    File file = new File(" output.txt");
    PrintStream ps = null;
    void write(String msg) {

        try {

            ps = new PrintStream(file);

            ps.println(msg);
            ps.close();


        } catch (IOException e) {

            System.out.println("Message:" + e.getMessage());

        }
    }

    void read(){

        Scanner fileScanner= null;
        try {
            fileScanner = new Scanner(new File("src/ text.txt"));
            while (fileScanner.hasNextLine()){
                String s = fileScanner.nextLine();
                System.out.println(s);
            }
            fileScanner.close();

        } catch (Exception e){
            e.printStackTrace();
        }

    }

void run(){
        write("hej hej");
        read();
}

    public static void main(String[] args) {
        new FileHandler().run();
    }
}
