package usha.generic;

public class Generic1 { // method level
    public static <T,V> void m1(T arg1, V arg2){
        System.out.println("m1 method");
        System.out.println(arg1);
        System.out.println(arg2);
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("print method level Generic......");
        Integer x = 100;
        Integer y = 200;
        m1(x,y);


    }
}
