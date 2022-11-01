package usha.generic;

public class ClassLevel {

    public static<E> void printArray(E[] array){//static method
        for (E x :array){
            System.out.println(x);
        }
    }
    public <E> void printArray1(E[] array){//non-static method
        for (E x :array){
            System.out.println(x);
        }
    }
    public static  <E> E[] printArray2(E[] array){// Return type array
        for (E x :array){
            System.out.println(x);
        }
        return array;
    }
        public static void main(String[] args) {
            Integer[] arrayInt = {1,3,4,5,6,7,8,90};
            Float[] arrayFloat = {1.3f,12.6f, 4.5f, 45.4f, 10.1f, 56.89f};
            String[] arrayString= {"usha", "Sankey", "tsar", "aditya"};
            printArray(arrayInt);
            System.out.println("---------------------------------");
            printArray(arrayFloat);
            System.out.println("----------------------------------");
            printArray(arrayString);
            ClassLevel obj = new ClassLevel();
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
            obj.printArray1(arrayInt);
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
            obj.printArray1(arrayFloat);
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
            obj.printArray1(arrayString);
            printArray2(arrayInt);
        }
    }

