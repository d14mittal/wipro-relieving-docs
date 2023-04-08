public class Test{
    int sal;

    void add(){
        sal=sal+100;
        System.out.println(sal);
    }
    public static void main(String[] args) {
        Test obj=new Test();
        obj.add();
        obj.add();
        System.out.println(obj.sal);
    }
}