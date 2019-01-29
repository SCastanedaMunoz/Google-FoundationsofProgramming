public class StringsBrushUp
{
    public static void main(String[] args)
    {
        String message = "Hello, World!";

        message = message.concat(" Lovely day, isn't it?");

        String upperCase = message.toUpperCase();

        String lowerCase = message.toLowerCase();

        System.out.println(message);
        System.out.println(upperCase);
        System.out.println(lowerCase);

        message = message.replace('o', '0');
        message = message.replace('e', '3');
        message = message.replace('l', '1');

        System.out.println(message);

        char[] characters = message.toCharArray();

        for(char c : characters)
        {
            System.out.println(c);
        }
    }
}
