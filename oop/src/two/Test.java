package two;

public class Test {
    public static void main(String[] args) {

        // 测试空参构造器
        Beauty beauty = new Beauty();
        beauty.name = "xin";
        beauty.age = 18;
        System.out.println(beauty.name + "," + beauty.age);

        // 测试有参构造器
        Beauty beauty2 = new Beauty("xinxin", 18);
        System.out.println(beauty2.name + "," + beauty2.age);
    }
}
