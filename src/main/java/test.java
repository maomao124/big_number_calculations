import java.math.BigInteger;

/**
 * Project name(项目名称)：大数字运算
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/16
 * Time(创建时间)： 21:03
 * Version(版本): 1.0
 * Description(描述)： 在 Java 中提供了用于大数字运算的类，即 java.math.BigInteger 类和 java.math.BigDecimal 类。
 * 这两个类用于高精度计算，其中 BigInteger 类是针对整型大数字的处理类，而 BigDecimal 类是针对大小数的处理类。
 * BigInteger 类
 * 如果要存储比 Integer 更大的数字，Integer 数据类型就无能为力了。因此，Java 中提供 BigInteger 类来处理更大的数字。
 * BigInteger 类型的数字范围较 Integer 类型的数字范围要大得多。BigInteger 支持任意精度的整数，
 * 也就是说在运算中 BigInteger 类型可以准确地表示任何大小的整数值。
 * 除了基本的加、减、乘、除操作之外，BigInteger 类还封装了很多操作，像求绝对值、相反数、最大公约数以及判断是否为质数等。
 * 要使用 BigInteger 类，首先要创建一个 BigInteger 对象。BigInteger 类提供了很多种构造方法，
 * 其中最直接的一种是参数以字符串形式代表要处理的数字。这个方法语法格式如下：
 * BigInteger(String val)
 * 这里的 val 是数字十进制的字符串。例如，要将数字 5 转换为 BigInteger 对象，语句如下：
 * BigInteger bi = new BigInteger("5")
 * 注意：这里数字 5 的双引号是必需的，因为 BigInteger 类构造方法要求参数是字符串类型。
 * 创建 BigInteger 对象之后，便可以调用 BigInteger 类提供的方法进行各种数学运算操作，表 1 列出了 BigInteger 类的常用运算方法。
 * 表1 BigInteger类的常用运算方法
 * 方法名称	说明
 * add(BigInteger val)	做加法运算
 * subtract(BigInteger val)	做减法运算
 * multiply(BigInteger val)	做乘法运算
 * divide(BigInteger val)	做除法运算
 * remainder(BigInteger val)	做取余数运算
 * divideAndRemainder(BigInteger val)	做除法运算，返回数组的第一个值为商，第二个值为余数
 * pow(int exponent)	做参数的 exponent 次方运算
 * negate()	取相反数
 * shiftLeft(int n)	将数字左移 n 位，如果 n 为负数，则做右移操作
 * shiftRight(int n)	将数字右移 n 位，如果 n 为负数，则做左移操作
 * and(BigInteger val)	做与运算
 * or(BigInteger val)	做或运算
 * compareTo(BigInteger val)	做数字的比较运算
 * equals(Object obj)	当参数 obj 是 Biglnteger 类型的数字并且数值相等时返回 true, 其他返回 false
 * min(BigInteger val)	返回较小的数值
 * max(BigInteger val)	返回较大的数值
 */

public class test
{
    public static void main(String... args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        BigInteger b = new BigInteger("123456781239789456");
        BigInteger c = new BigInteger("3654895456");
        System.out.println("大数字1：" + b);
        System.out.println("大数字2：" + c);
        System.out.println("加法操作结果：" + b.add(c));
        System.out.println("减法操作结果：" + b.subtract(c));
        System.out.println("乘法：" + b.multiply(c));
        System.out.println("除法：" + b.divide(c));
        System.out.println("取余：" + b.remainder(c));
        System.out.println("做除法运算，返回数组的第一个值为商，第二个值为余数:");
        BigInteger[] s = b.divideAndRemainder(c);
        for (BigInteger s1 : s)
        {
            System.out.println(s1);
        }
        System.out.println("做参数的 6 次方运算:" + b.pow(6));
        System.out.println("取相反数:" + b.negate());
        System.out.println("将数字左移 n 位，如果 n 为负数，则做右移操作(n为3):" + b.shiftLeft(3));
        System.out.println("将数字右移 n 位，如果 n 为负数，则做左移操作(n为3):" + b.shiftRight(3));
        System.out.println("做与运算:" + b.and(c));
        System.out.println("做或运算:" + b.or(c));
        System.out.println("做数字的比较运算:" + b.compareTo(c));
        System.out.println("做数字的比较运算:" + b.compareTo(new BigInteger("11111111111111111111111111111111111")));
        System.out.println("做数字的比较运算:" + b.compareTo(new BigInteger("123456781239789456")));
        System.out.println("比较（当参数 obj 是 Biglnteger 类型的数字并且数值相等时返回 true, 其他返回 false）：");
        System.out.println(b.equals(c));
        System.out.println("比较（参数相同）：");
        System.out.println(b.equals(new BigInteger("123456781239789456")));
        System.out.println("返回较小的数值:" + b.min(c));
        System.out.println("返回较大的数值:" + b.max(c));
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        Runtime r = Runtime.getRuntime();
        float memory;
        memory = r.totalMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("JVM总内存：%.3fMB\n", memory);
        memory = r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf(" 空闲内存：%.3fMB\n", memory);
        memory = r.totalMemory() - r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("已使用的内存：%.4fMB\n", memory);
        //------------------------------------------------------
    }
}
