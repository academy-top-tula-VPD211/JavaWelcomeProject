import java.util.Random;
import java.util.Scanner;

public class Examples {
    public static void Welcome() {
        System.out.println("Hello world");

        int n;
        n = 10;

        int m = 20;

        final int speedMax = 250;

        System.out.println(n);

        var x = 25.6;
    }

    public static void Operations(){
        boolean flag = true; // true, false

        byte bt; // -128..127
        short sht; // -32768..32767
        int i; // -2147483648..2147483647
        long lg = 646534453L;

        double x;
        float y;

        char ch;

        i = 0xfa23;
        i = 0b1101011;
        i = 076765;

        y = 6554.6565F;

        String str = "Hello world";
        char symvol = 'A';

        String multiline = """
                Зима
                    Осень
                        Лето
           Весна
                """;
        System.out.print(multiline);

        x = 123.5;

        System.out.printf("x = %e, i = %x\n", x, i);
        /*
        %d - integer, long
        %f - double, float
        %x - hex number
        %e - exponential float number
        %c - char
        %s - string
         */

        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");

        int number = 0;
        if(in.hasNextInt())
            number = in.nextInt();

        System.out.println("number = " + number);

        /*
        &, |, ^, ~, <<, >>

        &, &&
        |, ||
         */

        int a = 10;
        int b = 20;

        if(a > 0 | ++b > 0)
            System.out.println(b);

        b = 20;

        if(a > 0 || ++b > 0)
            System.out.println(b);

        int z = 5;
        int result = ++z + ++z;
        System.out.println(result);

        result = (z > 0) ? 100 : 200;

        int g = 10;
        byte h = (byte)g;

        String[] names = new String[]{ "Bobby", "Sammy", "Poppy" };
        for(String name : names)
            System.out.println(name);
    }

    public static void Arrays(){
        int size = 10;

        int array[] = new int[]{ 1, 2, 3, 4 }; //new int[size];
        int[] array2 = new int[size / 2];

        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();

        int rows = 4;
        int columns = 6;
        int[][] matrix = new int[rows][columns];

        int[][] zmatrix = new int[3][];
        zmatrix[0] = new int[4];
        zmatrix[1] = new int[6];
        zmatrix[2] = new int[2];

        Random random = new Random();
        for(int i = 0; i < zmatrix.length; i++)
            for(int j = 0; j < zmatrix[i].length; j++)
                zmatrix[i][j] = Math.abs(random.nextInt()) % 100;

        for(int i = 0; i < zmatrix.length; i++)
        {
            for(int j = 0; j < zmatrix[i].length; j++)
                System.out.print(zmatrix[i][j] + "\t");
            System.out.println();
        }
        System.out.println();

        for(int[] zline : zmatrix)
        {
            for(int item : zline)
                System.out.print(item + "\t");
            System.out.println();
        }
        System.out.println();
    }

}
