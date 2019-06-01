# Java 常用类

------

## 一、包装类

- Java 是一种面向对象的于洋，但在 Java 中不能定义基本数据类型的对象，为了能将基本数据类型视为对象进行处理，Java 提出了包装类的概念，将常用基本数据类型封装在这些包装类中。

- Java 中的包装类及其对应的基本数据类型

  | 包装类    | 对应基本数据类型 | 包装类  | 对应基本数据类型 |
  | --------- | ---------------- | ------- | ---------------- |
  | Byte      | byte             | Short   | short            |
  | Integer   | int              | Long    | long             |
  | Float     | float            | Double  | double           |
  | Character | char             | Boolean | boolean          |

### 1、Integer 类

- 对应 int 型数据，并且提供了多个方法，实现 int 类型和 String 之间的相互转换。

#### 1.1、构造方法

- Integer 类有以下两种构造方法。

- 1）Integer(int number)

- 2）Integer(String str)

```java
//方法一是讲一个 int 型变量作为参数来构造对象
  //方法二使用 String 型变量(必须为124这些数字字符）作为参数来
  public class test{
    public static main(){
        Integer number1 = new Integer(7);
        Integer number2 = new Integer("45");
        System.out.println(number1+" "+number2);
    }
  }
```

#### 1.2、常用方法

| 方法                              | 返回值  | 功能描述                                                     |
| --------------------------------- | ------- | ------------------------------------------------------------ |
| valueOf(String str)               | Integer | 返回指定的 String 值的 Integer 对象                          |
| parseInt(String str)              | int     | 返回包含在由 str 指定的字符串中的数字的等价整数值            |
| toString()                        | String  | 返回一个表示该 Integer 值的 String 对象（可以指定进制基数）  |
| toBinnaryString(int i)            | String  | 以二进制无符号整数形式返回一个整数参数的字符串表示形式       |
| toHexString(int i)                | String  | 以八进制无符号整数形式返回一个整数参数的字符串表示形式       |
| toOctalString(int i)              | String  | 以十六进制无符号整数形式返回一个整数参数的字符串表示形式     |
| equals(Object IntegerObj)         | boolean | 比较此对象与指定对象是否相等                                 |
| intValue()                        | int     | 以 int 型返回此 Integer 对象                                 |
| shortValue()                      | short   | i以 short 型返回此 Integer 对象                              |
| byteValue()\                      | byte    | 以 byte 型返回此 Integer 对象                                |
| compareTo(Integeranother Integer) | int     | 在数字上比较两个 Integer 对象。如果这两个值相等，返回0；如果调用对象的数值小于 anotherInteger 的数值，则返回负值；否则返回正值。 |

例子：

```java
public class Demo {
    public static void main(String[] args)
    {
        int num = Integer.parseInt("456");  //将字符串转为int 型
        Integer iNum = Integer.valueOf("456");  //通过构造函数创建一个Integer 对象
        System.out.println("int 数据与 Integer 对象进行比较："+iNum.equals(num));
        String str2 = Integer.toBinaryString(num); //获取数字的二进制表示
        String str3 = Integer.toOctalString(num); //获取数字的八进制表示
        String str4 = Integer.toHexString(num); //获取数字的十六进制表示
        String str5 = Integer.toString(num,15); //获取数字的十五进制表示
        System.out.println("456的二进制表示："+str2);
        System.out.println("456的八进制表示："+str3);
        System.out.println("456的十六进制表示："+str4);
        System.out.println("456的十五进制表示："+str5);
    }
}
```

#### 1.3、常量

- Integer 类提供了以下四个常量

  1）MAX_VALUE：表示 int 类型可取的最大值，即(2e31)-1

  2）MIN_VALUE：表示 int 类型可取的最小值，即（-2e31)

  3)SIZE：用来以二进制补码形式表示 int 值的位数。

  4）TYPE：表示基本类型 int 的 Class 实例。 

- 示例：

  ```java
  public class GetCon {
      public static void main(String[] args) {
          int maxint = Integer.MAX_VALUE;   //获取 Integer 类型的常量值
          int minint = Integer.MIN_VALUE;
          int intsize = Integer.SIZE;
          System.out.println("int 类型可取的最大值："+maxint);
          System.out.println("int 类型可取的最小值为："+minint);
          System.out.println("int 类型的二进制位数为："+intsize);
      }
  }
  ```

### 2、Double 类和 Float 类
- Doble 类是对基本数据类 double 的封装，Float 类是对基本数类型 float 的封装。
- 两者的构造和使用是相似的，所以这里只记 Double 的使用。
- Double 类在对象中包装一个基本类型为 double 的值，每个 Double 类的对象都包含一个 double类型的字段。
#### 2.1构造方法
- Double 类提供了两种构造方法：
- 1）Double（double value）
- 2）Double（String str）
- 一个以 double 类型变量作为参数创建 Double 对象；一个以 String 型变量作为参数创建 Double 对象。
- 示例：
```java
public class GetCon {
    public static void main(String[] args) {
        Double num1 = new Double(3.14869);
        Double num2 = new Double("5.69015");
        Float num3 = new Float(7.54);
        Float num4 = new Float("8.147");
        System.out.println("num1:"+num1+'\n'+"num2:"+num2+'\n'+"num3:"+num3+'\n'+"num4:"+num4);
    }
}
//运行结果：
/*
num1:3.14869
num2:5.69015
num3:7.54
num4:8.147
 */
```
#### 2.2、常用方法

- Double 类的常用方法如下：

| 方法                  | 返回值  | 功能描述                                                     |
| :-------------------- | :-----: | :----------------------------------------------------------- |
| valueOf(String s)     | Double  | 返回保存用参数字符串 str 表示的 double 值的 Double 对象      |
| parseDouble(String s) | double  | 返回一个心得 double 值，该值被初始化为用指定的 String 表示的值，与 valueOf 相似。 |
| doubleValue()         | double  | 以 double 形式返回此 Double 对象                             |
| isNaN()               | boolean | 如果此 double 值是非数字（NaN）值，返回 True；否则返回 False |
| intValue()            |   int   | 以 int 形式返回 double 值                                    |
| byteValue()           |  byte   | 以 byte 形式返回 Double 对象值（通过强制转换）               |
| longValue()           |  long   | 以 long 形式返回此 double 的值（通过强制转换为 long 类型）   |
| compareTo(Double d)   |   int   | 对两个 Double 对象进行数值比较，如果相等则返回0，如果调用对象的值比 d 小，则返回负值，否则返回正值。 |
| equals(Object obj)    | boolean | 将此对象与指定对象进行比较                                   |
| toString()            | String  | 返回此 Double 对象的字符串表示形式                           |
| toHexString(double d) | String  | 返回 Double 参数的十六进制字符串表现形式                     |

- 例子：

```java
public class useDouble {
    public static void main(String[] args) {
        Double dNum = Double.valueOf("3.14159");  //通过构造函数创建一个 Double 对象
        System.out.println("3.14159 是否为非数值："+Double.isNaN(dNum.doubleValue())); //判断是否为非数值
        System.out.println("3.14159 的int值为"+dNum.intValue()); //转换为 int 类型数据
        System.out.println("值为3.14 与 4.51的比较结果："+dNum.equals(4.51));
        System.out.println("3.14159 的十六进制表示为："+Double.toHexString(dNum)); //转为十六进制
    }
}
```
#### 2.3、常量

- Double 类提供了以下常量：

  1）MAX_EXPONENT：返回 int 值，表示标准化 double 变量可能具有的最大指数。

  2）MIN_EXPONENT：返回 int 值，表示标准化 double 变量可能具有的最小指数。

  3）NEGATIVE_INFINITY：返回 double 值，表示保存 double 类型的负无穷大值的常量。

  4）POSITIVE_INFINITY：返回 double 值，表示保存 double 类型的正无穷大值的常量。

### 3、Boolean 类

#### 3.1、构造方法

- Boolean 类型的对象同样有两种构造方法：Boolean(boolean  value) 和 Boolean(String s)

#### 3.2、常用方法

- Boolean 类常用方法如下

  | 方法                   | 返回值  | 功能描述                                                     |
  | ---------------------- | ------- | ------------------------------------------------------------ |
  | booleanValue()         | boolean | 将 Boolean 对象的值以对应的 boolean 值返回                   |
  | equals(Object obj)     | boolean | 判断调用该方法的对象与 obj 是否相等，当且仅当参数不是 null，而且与调用该方法的对象一样都表示同一个boolean 值的 Boolean 对象时，才返回 Ture |
  | parseBoolean(String s) | boolean | 将字符串参数解析为 boolean 值                                |
  | toString()             | String  | 返回表示该 boolean 值的 String 对象                          |
  | valueOf(String s)      | boolean | 返回一个用指定字符串表示值的 boolean 值。                    |

- 示例：

  ```java
  public class GetBoolean {
      public static void main(String[] args) {
          Boolean b1 = new Boolean(true);  //创建Boolean 对象
          Boolean b2 = new Boolean("ok"); //创建 Boolean 对象
          System.out.println("b1:"+b1.booleanValue());
          System.out.println("b2:"+b2.booleanValue());
      }
  }
  ```

#### 3.3、常量

- Boolean 提供了以下三个常量

  1）TRUE：对应基值 true 的 Boolean 对象

  2）FALSE：对应基值 false 的 Boolean 对象

  3）TYPE：基本类型 boolean 的 Class 对象。

### 4、Character 类

#### 4.1、构造方法

- Character 类的构造方法只有一种：Character(char value)

#### 4.2、常用方法

- Character 类的常用方法如下表：

  | 方法                                  | 返回值  | 功能描述                                               |
  | ------------------------------------- | ------- | ------------------------------------------------------ |
  | compareTo(Character anotherCharacter) | int     | 根据数字比较两个 Character 对象，若两个对象相等则返回0 |
  | equals(Object obj)                    | Boolean | 将调用该方法的对象与指定对象进行比较                   |
  | toUpperCase(char ch)                  | char    | 将字符参数转换为大写                                   |
  | toLowerCase(char ch)                  | char    | 将字符参数转换为小写                                   |
  | toString()                            | String  | 返回一个表示指定 char 值的 String 对象                 |
  | charValue()                           | char    | 返回此 Character 对象的值                              |
  | isUpperCase(char ch)                  | boolean | 判断指定字符是否是大写字符                             |
  | isLowerCase(char ch)                  | boolean | 判断指定字符是否是小写字符                             |
  | isLetter(char ch)                     | boolean | 判断指定字符是否为字母                                 |
  | isDigit(char ch)                      | boolean | 判断指定字符是否为数字                                 |

  ```java
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
  ```

  