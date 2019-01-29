import java.util.Arrays;
import java.util.Scanner;

public class MaxSpan
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers would you like to input?");

        int num = sc.nextInt();

        int[] array = new int[num];

        System.out.println("Enter your " + num + " desired numbers");

        for (int i = 0; i < array.length; i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.println("You provided the following numbers " + Arrays.toString(array));

        System.out.println("This is your numbers maxSpan = " + maxSpan(array));
    }

    public static int maxSpan(int[] nums)
    {
        int max = 0;

        for (int i = 0; i < nums.length; i++)
        {
            int j = nums.length - 1;

            while (nums[i] != nums[j])
                j--;

            int span = j - i + 1;

            max = Math.max(max, span);
        }

        return max;
    }
}
