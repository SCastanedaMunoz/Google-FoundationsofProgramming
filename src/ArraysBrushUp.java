public class ArraysBrushUp
{
    public static void main(String[] args)
    {
        int[] ages = { 10, 12, 11, 10};
        boolean[] student = new boolean[4];

        student[0] = true;
        student[1] = false;
        student[2] = true;
        student[3] = false;

        for (int i = 0; i < ages.length; i++)
        {
            System.out.println(ages[i]);
        }
    }
}
