import java.math.BigDecimal;

/**
 * Project name(项目名称)：大数字运算
 * Package(包名): PACKAGE_NAME
 * Class(类名): test2
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/16
 * Time(创建时间)： 21:34
 * Version(版本): 1.0
 * Description(描述)： BigDecimal 类
 * BigInteger 和 BigDecimal 都能实现大数字的运算，不同的是 BigDecimal 加入了小数的概念。
 * 一般的 float 和 double 类型数据只能用来做科学计算或工程计算，但由于在商业计算中要求数字精度比较高，所以要用到 BigDecimal 类。
 * BigDecimal 类支持任何精度的浮点数，可以用来精确计算货币值。
 * BigDecimal 常用的构造方法如下。
 * BigDecimal(double val)：实例化时将双精度型转换为 BigDecimal 类型。
 * BigDecimal(String val)：实例化时将字符串形式转换为 BigDecimal 类型。
 * BigDecimal 类的方法可以用来做超大浮点数的运算，像加、减、乘和除等。在所有运算中，除法运算是最复杂的，
 * 因为在除不尽的情况下，末位小数的处理方式是需要考虑的。
 * 下面列出了 BigDecimal 类用于实现加、减、乘和除运算的方法。
 * BigDecimal add(BigDecimal augend)    // 加法操作
 * BigDecimal subtract(BigDecimal subtrahend)    // 减法操作
 * BigDecimal multiply(BigDecimal multiplieand)    // 乘法操作
 * BigDecimal divide(BigDecimal divisor,int scale,int roundingMode )    // 除法操作
 * 其中，divide() 方法的 3 个参数分别表示除数、商的小数点后的位数和近似值处理模式。
 * 表 2 列出了 roundingMode 参数支持的处理模式。
 * 表2 roundingMode参数支持的处理模式
 * 模式名称	说明
 * BigDecimal.ROUND_UP	商的最后一位如果大于 0，则向前进位，正负数都如此
 * BigDecimal.ROUND_DOWN	商的最后一位无论是什么数字都省略
 * BigDecimal.ROUND_CEILING	商如果是正数，按照 ROUND_UP 模式处理；如果是负数，按照 ROUND_DOWN
 * 模式处理
 * BigDecimal.ROUND_FLOOR	与 ROUND_CELING 模式相反，商如果是正数，按照 ROUND_DOWN 模式处理；
 * 如果是负数，按照 ROUND_UP 模式处理
 * BigDecimal.ROUND_HALF_ DOWN	对商进行五舍六入操作。如果商最后一位小于等于 5，则做舍弃操作，否则对最后
 * 一位进行进位操作
 * BigDecimal.ROUND_HALF_UP	对商进行四舍五入操作。如果商最后一位小于 5，则做舍弃操作，否则对最后一位
 * 进行进位操作
 * BigDecimal.ROUND_HALF_EVEN	如果商的倒数第二位是奇数，则按照 ROUND_HALF_UP 处理；如果是偶数，则按
 * 照 ROUND_HALF_DOWN 处理
 */

public class test2
{
    public static void main(String... args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        BigDecimal b = new BigDecimal("12345678.25456578895");
        BigDecimal c = new BigDecimal("58768.654545556665");
        System.out.println("bigdecimal1：" + b);
        System.out.println("bigdecimal2：" + c);
        System.out.println("加法：" + b.add(c));
        System.out.println("减法：" + b.subtract(c));
        System.out.println("乘法：" + b.multiply(c));
        System.out.println("除法(保留 2 位小数)：" + b.divide(c, 2, BigDecimal.ROUND_CEILING));
        System.out.println("除法(保留 5 位小数)：" + b.divide(c, 5, BigDecimal.ROUND_CEILING));
        System.out.println("对商进行五舍六入操作。如果商最后一位小于等于 5，则做舍弃操作，否则对最后一位进行进位操作:");
        System.out.println("保留 5 位小数:" + b.divide(c, 5, BigDecimal.ROUND_HALF_DOWN));
        System.out.println("保留 3 位小数:" + b.divide(c, 3, BigDecimal.ROUND_HALF_DOWN));
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
