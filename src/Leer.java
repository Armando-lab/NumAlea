import java.io.*;
import java.util.Scanner;

public class Leer {
    static int[] matrix = new int[100];
    public static void main(String[] args){
        Quicksort quick = new Quicksort();
        MergeSort merge = new MergeSort();
        Bubblesort bubble = new Bubblesort();
        HeapSort heap = new HeapSort();
        RadixSort radix = new RadixSort();
        Scanner entrada = new Scanner(System.in);
        int opc = 0;
        char resp=' ';
        String respuesta="";

      try{
          File archivo = new File("C:/Users/Leonel/Documents/input.txt");
          FileReader fr = new FileReader (archivo);
          BufferedReader br = new BufferedReader(fr);

          for(int i = 0; i < 100; i++){
              matrix[i]=Integer.parseInt(br.readLine());

          }
          fr.close();
          System.out.println("Datos del Archivo");
          for (int i = 0; i < 100; i++)
              System.out.println(matrix[i]);

      }
      catch (Exception e){
          System.out.println("NO SE ENCONTRO");
      }


      do {
          System.out.println("Que metodo desea usar: ");
          System.out.println("1.- Quicksort\n"+ "2.- Mergesort\n"+ "3.- Heapsort\n"+ "4.- Radixsort\n"+ "5.- Bubblesort\n");
          opc = entrada.nextInt();
          switch (opc){
              case 1: quick.main(matrix);
                  break;
              case 2: merge.main(matrix);
                  break;
              case 3: heap.main(matrix);
                  break;
              case 4: radix.main(matrix);
                  break;
              case 5: bubble.main(matrix);
                  break;
          }
          System.out.println("Desea salir? (S=Fin)");
          respuesta=entrada.next();
          resp=respuesta.toUpperCase().charAt(0);


      }while (resp!='S');

    }

    }

