import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Hello("Bobby");
        System.out.println(GoodBy("Sammy"));

        System.out.println(Palindrom("abcdcba"));
        System.out.println(Palindrom("abcddcba"));
        System.out.println(Palindrom("abcdeba"));

        try{
            throw new Exception("Error!");
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        finally {

        }

    }

    static void Hello(String name){
        System.out.println("Hello " + name);
    }

    static String GoodBy(String name){
        return "Good by " + name;
    }

    static boolean Palindrom(String str){
        return Palindrom(str, 0);
    }
    static boolean Palindrom(String str, int index){
        if(index > str.length() - index - 1){
            return true;
        }
        if(str.charAt(index) == str.charAt(str.length() - 1 - index))
            return Palindrom(str, index + 1);
        else return false;
    }
}

