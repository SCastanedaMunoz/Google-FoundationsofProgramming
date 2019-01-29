import java.util.Scanner;

public class StringSplosion
{
    public static void main(String[] args)
    {
       System.out.println("Please input a String to Splode");

        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        System.out.println(Splode(input));
    }

    public static String Splode(String str)
    {
        int size = (str.length() * (str.length() + 1)) / 2;

        char[] result = new char[size];

        int index = 0;

        for(int i = 0; i < str.length(); i++)
        {
            for(int j = 0; j <= i; j++)
            {
                result[index] = str.charAt(j);
                index++;
            }
        }

        return new String(result);
    }
}
