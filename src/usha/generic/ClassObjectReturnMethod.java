package usha.generic;

public class ClassObjectReturnMethod {
    int y =10;
    int x =20;
    public int getY() {
        return y;
    }
    public int getX() {
        return x;
    }
    public ClassObjectReturnMethod print(){//factory method
        return new ClassObjectReturnMethod();// this - object reference -return this
    }
    public Object print1(){
        return this;

    }
    public static void main(String[] args) {
        System.out.println("hello");
        ClassObjectReturnMethod obj = new ClassObjectReturnMethod();
        obj.print();
        System.out.println( obj.getX());
        System.out.println( obj.getY());
        obj.print1();
        obj.hashCode();
    }
}
