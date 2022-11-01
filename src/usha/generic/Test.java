package usha.generic;

public class Test <T>{// class level generic
    T x;

    public Test(T x) {
        this.x = x;
    }

    public T displayValue(){
        return this.x;

    }
    public static void main(String[] args) {
        Test<Integer> obj1 = new Test(100);
        System.out.println(obj1.displayValue());
        Test<String> obj2 = new Test<>("usha");
        System.out.println(obj2.displayValue());

    }
}
