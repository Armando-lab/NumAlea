    public class Bubblesort {
        void bubbleSort(int arr[])
        {
            int n = arr.length;
            for (int i = 0; i < n-1; i++)
                for (int j = 0; j < n-i-1; j++)
                    if (arr[j] > arr[j+1])
                    {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
        }

        void printArray(int arr[])
        {
            int n = arr.length;
            for (int i=0; i<n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }

        public static void main(int[] a)
        {
            long inicio = System.nanoTime();
            Bubblesort ob = new Bubblesort();

            ob.bubbleSort(a);
            long fin = System.nanoTime();
            double tiempo = (double) ((fin-inicio));
            System.out.println("Por Bubblesort: ");
            ob.printArray(a);
            System.out.println("Tardo "+tiempo);

        }
    }

