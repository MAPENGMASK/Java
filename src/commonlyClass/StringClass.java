package commonlyClass;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class StringClass {
    public static void main(String[] args) {
        //构造函数
        String str1 = new String();
        System.out.println("".equals(str1));

        String str2 = new String("123456789");
        System.out.println(str2);

        System.out.println("---------------------------------------");
        byte[] bytes = new byte[]{24, 65, 103, 26, 104, 81, 28, 72, 83};
        String str3 = new String(bytes);
        System.out.println(str3);
        String str4 = new String(bytes,Charset.forName("GBK"));
        System.out.println(str4);

        try {
            str4 = new String(bytes,"GBK");
            System.out.println(str4);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        System.out.println("5:" + new String(bytes,0,6));

        //常用判断
        char[] chars = new char[]{'a', 'b', 'c', 'd'};
        System.out.println(new String(chars));
        System.out.println(new String(chars,0,2));

        //常用判断方法
        String string1 = new String("aBcD");
        String string2 = new String("ABcD");

        System.out.println(string1.equals(string2));
        System.out.println(string1.equalsIgnoreCase(string2));

        System.out.println(string1.contains("a"));

        System.out.println(string1.startsWith("a"));
        System.out.println(string2.endsWith("d"));

        String string3 = null;
        String string4 = "";
        System.out.println(string4.isEmpty());
        if (string3 != null && string3.isEmpty())
            System.out.println(true);


        System.out.println("---------------------------------------");
        //常用获取方法
        String complicated = "asdFGHJ123";
        System.out.println(complicated.length());
        System.out.println(complicated.charAt(3));
        System.out.println(complicated.indexOf("F"));
        System.out.println(complicated.indexOf("f"));
        System.out.println(complicated.indexOf("F",4));
        System.out.println(complicated.indexOf('G',3));
        System.out.println(complicated.indexOf('a'));
        //从右向左 final appear
        System.out.println(complicated.lastIndexOf('a'));
        System.out.println(complicated.lastIndexOf("F"));
        System.out.println(complicated.lastIndexOf("f",4));

        System.out.println(complicated.substring(5));
        System.out.println(complicated.substring(3,5));

        System.out.println("---------------------------");
        //转换方法
        /**
         * String replace(char old,char new):返回一个新的字符串，它是通过用 newChar 替换此字符串
         * String replace(String old,String new):使用指定的字面值替换序列替换此字符串所有匹配字
         * String trim() :返回字符串的副本，忽略前导空白和尾部空白。
         * int compareTo(String str) :按字典顺序比较两个字符串。
         * int compareToIgnoreCase(String str):按字典顺序比较两个字符串，不考虑大小写。
         * String[] split(String regex):根据给定正则表达式的匹配拆分此字符串。
         * String[] split(String regex,int limit):根据匹配给定的正则表达式来拆分此字符串。
         * @author sxj
         */


        String string = "    abcdefghigk";

        System.out.println(string.replace('a','A'));
        System.out.println(string.replace("bc","BC"));

        System.out.println(string.trim());

        String stringa = "abc";
        String stringb = "aBc";

        System.out.println(stringa.compareTo(stringb));
        System.out.println(stringa.compareToIgnoreCase(stringb));

        String strings = "http://www.baidu.com/mac/windows/linux";
        String[] temp = strings.split("//");
        String[] result = temp[1].split("/");
        System.out.println(temp[0]);
        for (String t:result)
            System.out.println(t);

        System.out.println("------------------");
        String[] result1 = temp[1].split("/",-1);
        for (String a:result1)
            System.out.println(a);

        System.out.println(string1.concat(string2));



    }
}
