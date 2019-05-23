class cort {
    /*Funktion for sortering*/
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Flyttar de olika elementen 0..i-1], som är storre an. till toppen  av deras nuvarande position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }


    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Metod
    public static void main(String args[])
    {
        int arr[] = { 69, 37, 13, 00,86,54 };

        cort ob = new cort();
        ob.sort(arr);

        printArray(arr);
    }
}