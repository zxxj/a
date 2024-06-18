package two;

public class Beauty {
    String name;
    int age;

    // 在new对象时,会默认提供一个空参构造器
    public Beauty() {
        System.out.println("空参构造器执行!");
    }

    // 如果自己手动写了有参构造器,那么默认提供的空参构造器就会消失
    public Beauty(String name1, int age1) {
        name = name1;
        age = age1;
        System.out.println("有参构造器执行!");
    }
}
