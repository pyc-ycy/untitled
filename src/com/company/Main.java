package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) { //throws ParseException   {
        //获取当前时间到毫秒值
        Date d = new Date();
        String message = String.format("%tc", d);
        System.out.println(message);

        String str = String.format("%5d", 123);//让字符串输出的最大长度为5，不足长度在前端补空格
        System.out.println("输出长度为伍的字符串|"+str+"|");
        String str1 = String.format("%-5d", 123);
        System.out.println("左对齐|"+str1+"|");
        String str2 = String.format("%#o", 33);//在八进制前加一个0
        System.out.println("33八进制的结果："+str2);
        String str3 = String.format("%#x", 33);
        System.out.println("33十六进制的结果是："+str3);
        String str4 =String.format("%+d", 1);//显示数字正负号
        System.out.println("我是正数："+str4);
        String str5 =String.format("%+d", -1);
        System.out.println("我是负数："+str5);
        String str6 = String.format("% d", 1);//在正数前面补一个空格
        System.out.println("我是正数，前面有空格："+str6);
        String str7 = String.format("% d", -1);//在负数前面补一个负号
        System.out.println("我是负数，前面有负号："+str7);
        String str8 = String.format("%05d", 12);//让字符串输出最大长度为5，不足在前面补0
        System.out.println("前面不够的数用0补充："+str8);
        String str9 =String.format("%,d", 123456789);//用逗号分隔数字
        System.out.println("用逗号分隔："+str9);
        String str10 = String.format("%(d", 10);//正数无影响
        System.out.println("我是正数，我没有括号："+str10);
        String str11 = String.format("%(d", -10);//负数有影响
        System.out.println("我是负数，我前面右括号："+str11);
        String str12 =String.format("%,d",12345);
        System.out.println(str12+".00￥");
        StringBuffer sbf = new StringBuffer("门前大桥下，");//创建StringBuffer对象
        sbf.append("游过一群鸭，");
        StringBuffer tmp = new StringBuffer("快来数一数，");
        sbf.append(tmp);
        int x = 24678;//追加整形变量
        sbf.append(x);
        System.out.println(sbf.toString());//输出
        System.out.println(sbf.indexOf("鸭"));
        sbf.setCharAt(10,'鱼');
        sbf.insert(10, "大鲨");
        System.out.println(sbf);
        System.out.println(sbf.length());
        sbf = sbf.delete(19, 25);
        System.out.println(sbf);
        StringBuffer oldsaying = new StringBuffer("春眠不觉晓，处处闻啼鸟。夜来风雨声，花落知多少。");
        System.out.println(oldsaying);
        System.out.println(oldsaying.length());
        oldsaying = oldsaying.delete(5, 24);
        System.out.println(oldsaying);



       /* String a = String.format("%tQ", d);
        System.out.println(a);
        System.out.println("当前时间为:" + d);
        //创建日期格式化对象(把日期转成字符串)
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH时mm分s秒");
        String str = sdf.format(d);
        System.out.println(str);

        //解析(将字符串转换为日期都对象)
        String str1 = "2021-12-12";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdf2.parse(str1);
        System.out.println(d1);


        /*String str2 = String.format("c", 'X');//输出字符
        System.out.println("子母X大写："+str2);
        String str3 = String.format("%d", 1251+3950);
        System.out.println("1251+3950的结果是："+str3);
        String str4 = String.format("%.2f", Math.PI);
        System.out.println("pi取两位小数点："+str4);
        String str5 = String.format("%b", 2<3);
        System.out.println("2<3的结果："+str5);
        String str6 = String.format("%h", 3510);//输出哈希散列码，等同Integer.toHexString（3510）；
        System.out.println("3510的hashCode值："+str6);
        String str7 = String.format("%o", 33);
        System.out.println("33的8进制结果是："+str7);
        String str8 = String.format("%x", 33);
        System.out.println("33的16进制结果是："+str8);
        String str9 = String.format("%e", 120000.1);
        System.out.println("120000.1用科学计数法表示："+str9);
        String str10 = String.format("%a", 40.0);
        System.out.println("40.0的16进制浮点值："+str10);
        System.out.println(String.format("天才是由%d%%的灵感，%d%%的汗水。",1,99));


		// TODO Auto-generated method stub
		/*Date date = new Date();
		String s = String.format("%te", date);
		System.out.println(s);
		Time time = new Time(1, 40, 30);
		String t = String.format("%te",time);
		System.out.println(t);*/

    }
}
