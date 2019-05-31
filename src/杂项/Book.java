package 杂项;//杂项

//彭友聪
//2019/2/10
//15:52
//untitled
//email:2923616405@qq.com

import java.util.*;
import java.lang.String;
public class Book {

    public static void main(String[] args) {
        Book book = new Book();
        int x = 30;
        int y = 40;
        System.out.println("运算结果：" + book.add(x,y));
        System.out.println("实参x的值：" + x);
        int a;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        System.out.println(a);
        Scanner sc = new Scanner(System.in);
        String b;
        b = sc.nextLine();
        System.out.println("b="+b);
    }
    private int add(int x,int y)
    {
        x = x+y;
        return x;
    }
}
