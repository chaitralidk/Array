public class PrintLargestElementArray
{
    public static void main(String[] args)
    {

        //Initialize array
        int [] arr = new int [] {25, 11, 7, 75, 56, 55};

        int max = arr[0];
        //Loop through the array
        for (int i = 0; i < arr.length; i++)
        {
            //Compare elements of array with max
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest element : " + max);
    }
}

