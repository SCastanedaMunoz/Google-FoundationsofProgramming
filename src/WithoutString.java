import java.util.Scanner;

public class WithoutString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please provide a base set of characters");

        String base = sc.nextLine();

        System.out.println("Please provide a remove set of characters");

        String remove = sc.nextLine();

        System.out.println("This is your result: \n" +  withoutString(base, remove));
    }

    public static String withoutString(String base, String remove)
    {
        char[] arr = new char[base.length()];
        int count = 0;
        int i = 0;

        while(i <= base.length() - remove.length())
        {
            if(base.substring(i, i + remove.length()).toLowerCase().equals(remove.toLowerCase()))
            {
                i += remove.length();
            }

            else
            {
                arr[count] = base.charAt(i);
                count++;
                i++;
            }
        }

        while (i < base.length())
        {
            arr[count] = base.charAt(i);
            count++;
            i++;
        }

        return  new String(arr, 0, count);
    }
}
