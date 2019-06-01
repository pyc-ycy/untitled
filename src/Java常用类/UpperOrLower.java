package Java常用类;//Java常用类

//彭友聪
//2019/6/1
//17:15
//untitled
//email:2923616405@qq.com
public class UpperOrLower {
    public static void main(String[] args) {
        Character mychar1 = new Character('A');  //声明Character对象
        Character mychar2 = new Character('a'); //声明Character对象
        if(Character.isUpperCase(mychar1)){  //判断是否为大写字母
            System.out.println(mychar1+"是大写字母");
            System.out.println("转换小写字母的结果："+Character.toLowerCase(mychar1));  //转为小写字母
        }
        if(Character.isLowerCase(mychar2)){ //判断是否为小写
            System.out.println(mychar2+"是小写字母");
            System.out.println("转换为大写字母的结果是："+Character.toUpperCase(mychar2));
        }
    }
}
