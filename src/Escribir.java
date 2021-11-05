import java.io.*;
import java.util.Random;

public class Escribir {
    static Random rnd = new Random();
    public static void main(String[] args){
        String arch = "C:/Users/Leonel/Documents/input.txt";
        int numero;

        try {
            FileWriter fw = new FileWriter(arch);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salArch = new PrintWriter(bw);

            for (int i = 0; i < 100; i++) {
                numero=(rnd.nextInt(100000 - 10000 + 1) + 20);
                salArch.print(numero+"\n");
            }
            salArch.close();
        }catch (FileNotFoundException fnfe){
            System.out.println("El archivo NO EXISTE..");
        }catch (IOException ioe){
            System.out.println("NO SE PUEDEN HACER LECTURAS");
        }
    }
}
