public class PrintSmallestElementArray
{
    public static void main(String[] args)
    {

        //Initialize array
        int [] arr = new int [] {25, 11, 7, 75, 56,5};

        int min = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] <min)
                min = arr[i];
        }
        System.out.println("Smallest element : " + min);
    }
}