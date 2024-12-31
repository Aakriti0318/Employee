
import java.util.Scanner;
class GenericMax<T extends Comparable<T>> {
    private T[] elements;

    public GenericMax(T... elements) {
        this.elements = elements;
    }
    public T findMaximum() {
        return findMaximum(elements);
    }

    public T findMaximum(T... elements) {
        T max = elements[0];
        for (T value : elements) {
            if (value.compareTo(max) > 0) {
                max = value;
            }
        }
        printMax(max);
        return max;
    }
    public void printMax(T max) {
        System.out.println("Max Value From Print Function: " + max);
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter strings separated by space ");
        try{
            String line = sc.nextLine();
            String[] strings = line.split(" ");
            GenericMax<String> stringMax = new GenericMax<>(strings);
            System.out.println("Max String: " + stringMax.findMaximum());
        }
        catch (Exception e){
            System.out.println("Enter Some Strings");
        }
        // Integers
        System.out.println("\nEnter integers separated by space:");
        try {
            String line = sc.nextLine();
            String[] intStrings = line.split(" ");
            Integer[] integers = new Integer[intStrings.length];
            for (int i = 0; i < intStrings.length; i++) {
                integers[i] = Integer.parseInt(intStrings[i]);
            }
            GenericMax<Integer> intMax = new GenericMax<>(integers);
            System.out.println("Max Integer: " + intMax.findMaximum());
        }
        catch (Exception e){
            System.out.println("Error handling Please Enter Some Integers");
        }

        // Floats
        System.out.println("\nEnter floats separated by space:");
        try {
            String line = sc.nextLine();
            String[] floatStrings = line.split(" ");
            Float[] floats = new Float[floatStrings.length];
            for (int i = 0; i < floatStrings.length; i++) {
                floats[i] = Float.parseFloat(floatStrings[i]);
            }
            GenericMax<Float> floatMax = new GenericMax<>(floats);
            System.out.println("Max Float: " + floatMax.findMaximum());
        }
        catch (Exception e){
            System.out.println("Error Handling Please Enter Float Numbers");
        }
        sc.close();



 /*
        Scanner var1 = new Scanner(System.in);
        MaxValue var2 = new MaxValue();
        System.out.print("Enter 3 strings: ");
        String var3 = var1.next();
        String var4 = var1.next();
        String var5 = var1.next();
        PrintStream var10000 = System.out;
        Comparable var10001 = var2.findMax(var3, var4, var5);
        var10000.println("Max String: " + (String)var10001);
        System.out.print("Enter 3 integers: ");
        int var6 = var1.nextInt();
        int var7 = var1.nextInt();
        int var8 = var1.nextInt();
        var10000 = System.out;
        var10001 = var2.findMax(var6, var7, var8);
        var10000.println("Max Integer: " + String.valueOf(var10001));
        System.out.print("Enter 3 floats: ");
        float var9 = var1.nextFloat();
        float var10 = var1.nextFloat();
        float var11 = var1.nextFloat();
        var10000 = System.out;
        var10001 = var2.findMax(var9, var10, var11);
        var10000.println("Max Float: " + String.valueOf(var10001));
        var1.close();*/
    }
}