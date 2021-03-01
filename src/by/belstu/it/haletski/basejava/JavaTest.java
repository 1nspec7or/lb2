package by.belstu.it.haletski.basejava;
import java.util.Arrays;
import java.util.Objects;
import static java.lang.Math.*;

/**
 * Class where I learning java core
 * @author Anton
 * @version 1.0
 * */
public class JavaTest {
    /**
     * Declaration of static variable
     * */
    static int sint;
    /**
     * Declaration of final variable
     * @value 0
     * */
    final int fint = 0;
    public final int pfint = 0;
    public static final int psfint = 0;
    /**
     * Program entry point
     * @param args - array of launch parameters
     * */
    public static void main(String[] args) {
        char c = 'a';
        int i = 1000;
        short s = 100;
        byte b = 10;
        long l = 10000;
        boolean bo = true;
        double d = 10.10;
        String str = "";


        str += i;
        System.out.println(str);
        str += c;
        System.out.println(str);
        str += d;
        System.out.println(str);
        b += i;
        System.out.println(b);
        i = (int)(d + l);
        System.out.println(i);
        l = i + 2147483647;
        System.out.println(l);
        bo = bo&&bo; //true
        bo = bo^bo; //false
        //bo = bo + bo;  Operator '+' cannot be applied to 'boolean'
        long sizeMax = 0x7ff_ffff_ffffL;
        long maxLong = 9223372036854775807L;
        char ch1 = 'a';
        char ch2 = '\u0061';
        char ch3 = 97;
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println(ch1+ch2+ch3);
        System.out.println(3.45 % 2.4);
        System.out.println(1.0/0.0);
        System.out.println(0.0/0.0);
        System.out.println(Math.log(-345));
        System.out.println(Float.intBitsToFloat(0x7F800000));
        System.out.println(Float.intBitsToFloat(0xFF800000));
        int dec = 27;
        int oct = 033;
        int hex = 0x1b;
        int bin = 0b11011;
        System.out.println(dec);
        System.out.println(oct);
        System.out.println(hex);
        System.out.println(bin);

        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.round(Math.PI));
        System.out.println(Math.round(Math.E));
        System.out.println(Math.min(Math.PI, Math.E));
        double rand = Math.random(); //[0,1)
        System.out.println(rand);

        Boolean BOOL;
        Integer I = i;
        Character CH = c;
        Byte B;
        Short SH;
        Long L = l;
        Double D = d;

        I &= 1;
        L = l >>> 2;
        SH = ~(short)20;
        D *= 2.1;

        System.out.println(Long.MIN_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

        I = 10;
        i = I*2;
        B = 10;
        b = (byte)(B+5);

        System.out.println(Integer.parseInt("10"));
        System.out.println(Integer.toHexString(i));
        System.out.println(Integer.compare((int)(random() + 3), (int)(random() + 4)));
        System.out.println(Integer.toString(i));
        System.out.println(Integer.bitCount(10));
        System.out.println(Float.isNaN(0.0f/0.0f));

        String s34 = "2345";
        int s34i = new Integer(s34); //конструктор
        s34i = Integer.valueOf(s34); //valueOf
        s34i = Integer.parseInt(s34); //parseInt

        byte[] byteArray = s34.getBytes();
        System.out.println(Arrays.toString(byteArray));
        String byteStr = new String(byteArray);
        System.out.println(byteStr);

        System.out.println(s34 == byteStr);
        System.out.println(s34.equals(byteStr));

        String str1 = "Hello!", str2 = "Hello!";
        System.out.println(str1 == str2); // сравнение ссылок
        System.out.println(str1.equals(str2)); // проверяет значений
        System.out.println(str1.compareTo(str2)); //unicode сравнение

        str2 = null;
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        //System.out.println(str1.compareTo(str2)); Cannot read field "value" because "anotherString" is null

        str1 = "Random string in Java language";
        String[] words = str1.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println(str1.contains("J"));
        System.out.println(str1.hashCode());
        System.out.println(str1.indexOf('J'));
        System.out.println(str1.length());
        System.out.println(str1.replace(' ','A'));

        char[][] c1;
        char[] c2[];
        char c3[][];
        c1 = new char[3][];
        System.out.println(c1.length);
        /*System.out.println("c1[0].length -- " + c1[0].length);*/ //Cannot read the array length because "c1[0]" is null
        c2 = new char[][] {
                {'q','w','e'},
                {'r','t','y'},
                {}
        };
        c3 = new char[][]  {
                {'a','b','c'},
                {'d','e','f'},
                {}
        };
        boolean comRez = c2 == c3;
        System.out.println(comRez);
        c2 = c3;
        comRez = c2 == c3;
        System.out.println(comRez);

        for (char[] chc : c2) {
            for (char chc2 : chc) {
                System.out.print(chc2 + " ");
            }
            System.out.println();
        }
        //System.out.println(c2[3][0]); Array index is out of bounds

        class WrapperString
        {
            private String str;

            public WrapperString(String str) {
                this.str = str;
            }
            public WrapperString() {
                this.str = "Default Wrapper String";
            }

            public String getStr() {
                return str;
            }

            public void setStr(String str) {
                this.str = str;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                WrapperString that = (WrapperString) o;
                return Objects.equals(str, that.str);
            }

            @Override
            public int hashCode() {
                return Objects.hash(str);
            }

            @Override
            public String toString() {
                return "WrapperString{" +
                        "str='" + str + '\'' +
                        '}';
            }
            public void replace (char oldchar, char newchar)
            {
                setStr(str.replace(oldchar, newchar));
            }
        }

        WrapperString ws = new WrapperString("Wrapper String");
        ws.replace('S','s');
        System.out.println(ws.toString());

        WrapperString ws2 = new WrapperString()
        {
            @Override
            public void replace(char oldchar, char newchar)
            {
                super.replace(oldchar, ' ');
            }

            public void delete(char newchar)
            {
                String tmp = getStr();
                String result = tmp.substring(0, tmp.indexOf(newchar)) + tmp.substring(tmp.indexOf(newchar)+1);
                setStr(result);
            }
        };
    }
}
