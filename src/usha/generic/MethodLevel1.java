package usha.generic;

public class MethodLevel1 {
    static <T,U> void displayMethod(T argument1,U argument2){
        System.out.println(argument1);
        System.out.println(argument2);
    }

    public static void main(String[] args) {
        displayMethod(100,200);
        displayMethod("hello",76687798);
        displayMethod(287.0f,"hello1");
        displayMethod(true,1237678);
    }
}
