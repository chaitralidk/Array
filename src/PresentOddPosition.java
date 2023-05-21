public class PresentOddPosition
{
    public static void main(String[] args)
    {

        int [] arr = new int [] {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Elements odd position ");

        for (int i = 0; i < arr.length; i = i+2)
        {
            System.out.println(arr[i]);
        }
    }
}

