public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        numbers[0] = 35;
        numbers[1] = 69;
        numbers[2] = 1;
        numbers[3] = 10;
        numbers[4] = -50;
        numbers[5] = 320;
        numbers[6] = 63;
        numbers[7] = 58;
        numbers[8] = 26;
        numbers[9] = 13;

        System.out.println("Before bubble and selection sort: ");
        printArrayElements(numbers);

        bubbleSort(numbers);

        System.out.println("\n\nAfter bubble sort: ");
        printArrayElements(numbers);

        System.out.println("\n\nAfter selection sort: ");
        selectionSort(numbers);
        printArrayElements(numbers);
    }

    private static void bubbleSort(int[] arr)
    {
        for(int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for(int i = 0; i<lastSortedIndex; i++)
            {
                if(arr[i] < arr[i +1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i +1];
                    arr[i +1] =temp;
                }
            }
        }
    }

    private static void selectionSort(int[] arr)
    {
        for(int lastSortedIndex = arr.length -1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int largestIndex = 0;

            for(int i = 1; i <= lastSortedIndex; i++)
            {
                if (arr[i] < arr[largestIndex])
                {
                    largestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temp;
        }
    }

    private static void printArrayElements(int[] arr)
    {
        for (int j :arr)
        {
            System.out.print(j + " ");
        }
    }
}