    public class HeapSort {
        public void sort(int arr[])
        {
            int n = arr.length;


            for (int i = n / 2 - 1; i >= 0; i--)
                heap(arr, n, i);

            for (int i = n - 1; i > 0; i--) {

                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;

                heap(arr, i, 0);
            }
        }


        void heap(int arr[], int n, int i)
        {
            int lar = i;
            int l = 2 * i + 1;
            int r = 2 * i + 2;

            if (l < n && arr[l] > arr[lar])
                lar = l;

            if (r < n && arr[r] > arr[lar])
                lar = r;

            if (lar != i) {
                int swap = arr[i];
                arr[i] = arr[lar];
                arr[lar] = swap;

                heap(arr, n, lar);
            }
        }

        static void printArray(int arr[])
        {
            int n = arr.length;
            for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }

        public static void main(int[] a)
        {
            long inicio = System.nanoTime();

            int n = a.length;

            HeapSort ob = new HeapSort();
            ob.sort(a);
            long fin = System.nanoTime();
            double tiempo = (double) ((fin-inicio));
            System.out.println("Por Heapsort: ");
            printArray(a);
            System.out.println("Tardo "+tiempo);

        }
    }

