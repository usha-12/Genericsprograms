package usha.generic;

public class Test1<T, U> {
    T x;
    U y;

    public Test1(T x, U y) {
        this.x = x;
        this.y = y;
    }
    public void print(){
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        Test1<Integer,String> obj = new Test1<>(100,"hello");
        obj.print();
        Test1<String,Float> obj1 = new Test1<>("hello1",3.9f);
        obj1.print();
    }
}
