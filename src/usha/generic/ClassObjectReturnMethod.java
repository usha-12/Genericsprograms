package usha.generic;

public class methodClass {
    int y =10;
    int x =20;
    public int getY() {
        return y;
    }
    public int getX() {
        return x;
    }
    public methodClass print(){//factory method
        return new methodClass();// this - object reference -return this
    }
    public Object print1(){
        return this;

    }
    public static void main(String[] args) {
        System.out.println("hello");
        methodClass obj = new methodClass();
        obj.print();
        System.out.println( obj.getX());
        System.out.println( obj.getY());
        obj.print1();
        obj.hashCode();
    }
}
