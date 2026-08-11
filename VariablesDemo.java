public class VariablesDemo{
    int instanceVar=10;
    static String staticVar="i am static";
    public void showVariables()
    {
        int localVar=5;
        System.out.println("instance Variable:"+instanceVar);
        System.out.println("local Variable:"+localVar);
    }
    public static void main(String[] args)
    {
        VariablesDemo obj1 = new VariablesDemo();
        obj1.showVariables();
        System.out.println("accessing static Variable via class:" + VariablesDemo.staticVar);
    }
}