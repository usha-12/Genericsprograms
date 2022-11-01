package usha.generic;

public class ArraysAccess {
    public static void printArrayInt(int[] array){
        for (int x :array){
            System.out.println(x);
        }
    }
    public static void printArrayFloat(float[] array){
        for (float x :array){
            System.out.println(x);
        }
    }
    public static void printArrayString(String[] array){
        for (String x :array){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        int[] arrInt = {23,34,56,7,88,4};
        float[] arrFloat = {1.3f,12.6f, 4.5f, 45.4f, 10.1f, 56.89f };
        String[] arrString = {"usha", "Sankey", "tsar", "aditya"};
        printArrayInt(arrInt);
        System.out.println("------------------------------------------------------------------------");
        printArrayFloat(arrFloat);
        System.out.println("-------------------------------------------------------------------------");
        printArrayString(arrString);
    }
}
