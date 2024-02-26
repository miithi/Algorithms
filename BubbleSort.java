package Algorithms;
import java.util.Random;

public class BubbleSort {
    public static void bubbleSorting(int[] array)
    {
        for(int i = 0; i < array.length-1; i++)
        {
            for(int j = 0; j < array.length - i - 1; j++)
            {
                if(array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

    }

    public static void main (String[] args)
    {
        Random random = new Random(); //randomizer created 
        int[] arr = new int[10]; // new blank array created

        //initializing the array
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = random.nextInt(100); //all numbers are between 0 and 100
        }

        //printing out the original array
        System.out.println("Originial Array:");
        for(int num: arr)
        {
            System.out.print(num + " ");
        }

        //Sorting the random array with the bubble sort algo
        bubbleSorting(arr);

        System.out.println("\nSorted Array:");
        for(int num: arr)
        {
            System.out.print(num + " ");
        }

    }
    
}