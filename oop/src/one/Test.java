package one;
// 类与对象
public class Test {
    public static void main(String[] args) {
        Beauty beauty = new Beauty();

        beauty.name = "高圆圆";
        beauty.age = 18;
        beauty.height = 1.65;
        beauty.wight = 100.0;
        beauty.change();
        System.out.println("姓名:" + beauty.name + ", 年龄:" + beauty.age + ", 身高:" + beauty.height + ", 体重:" + beauty.wight);

        Beauty beauty2 = new Beauty();

        beauty2.name = "江疏影";
        beauty2.age = 20;
        beauty2.height = 1.72;
        beauty2.wight = 98.0;
        beauty2.change();
        System.out.println("姓名:" + beauty2.name + ", 年龄:" + beauty2.age + ", 身高:" + beauty2.height + ", 体重:" + beauty2.wight);
    }
}
