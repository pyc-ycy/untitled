package Java常用类;//Java常用类

//彭友聪
//2019/5/31
//19:59
//untitled
//email:2923616405@qq.com
public class useDouble {
    public static void main(String[] args) {
        Double dNum = Double.valueOf("3.14159");  //通过构造函数创建一个 Double 对象
        System.out.println("3.14159 是否为非数值："+Double.isNaN(dNum.doubleValue())); //判断是否为非数值
        System.out.println("3.14159 的int值为"+dNum.intValue()); //转换为 int 类型数据
        System.out.println("值为3.14 与 4.51的比较结果："+dNum.equals(4.51));
        System.out.println("3.14159 的十六进制表示为："+Double.toHexString(dNum)); //转为十六进制
    }
}
