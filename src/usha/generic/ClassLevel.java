package usha.generic;

public class ClassLevel <T,A>{
    T instVar1;
    A instVar2;
    public void print(T arg1, A arg2){
        System.out.println(arg1);
        System.out.println(arg2);
    }
    public static void main(String[] args) {
        ClassLevel<Integer,Float> obj = new ClassLevel();
        obj.instVar1 = 20;
        obj.instVar2 = 10.9f;
        System.out.println("------------------------------------");
        System.out.println(obj.instVar1);
        System.out.println(obj.instVar2);
        obj.print(100,30.8f);
        ClassLevel<Float,Integer> obj1 = new ClassLevel();
        obj1.instVar1 = 10.30f;
        obj1.instVar2 = 200;
        System.out.println("--------------------------------------");
        System.out.println(obj1.instVar1);
        System.out.println(obj1.instVar2);
        ClassLevel<String, Integer> obj2 = new ClassLevel();
        obj2.instVar1 = "usha";
        obj2.instVar2 = 300;
        System.out.println("----------------------------------------");
        System.out.println(obj2.instVar1);
        System.out.println(obj2.instVar2);
    }
}
