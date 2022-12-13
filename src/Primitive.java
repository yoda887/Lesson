public class Primitive {

    public static void main (String[] arg) {

         /************
         * VARIABLES *
         *************/

        // объявление переменных

        // буквы, цифры, "_"
        //   первый символ - не цифра
        //   не . , ! ? " "
        //   не ключевое слово java

        int rr, gg;
        int ww = 23, tt = 232;

        // CONSTANT
        final int CONST = 33; //final - ключевое слово, ВЕРХНИЙ РЕГИСТР, значение присваивается один раз

         /*******************
         *  PRIMITIVE TYPES *
         * ******************/

        //примитивные типы
        // целочисленные
        byte b      = 127;         // 1 байт - от -127 до 127, по умолчанию 0
        short sh    = 32767;       // 2 байт - от -32 768 до 32 767, по умолчанию 0
        int f       = 2147483467;  // * 4 байт - от - 2,147,483,648 до 2,147,483,647, по умолчанию 0 - (по умолчанию)
        long l      = 444L;        // 8 байт - от -9,223,372,036,854,775,808 до 9,223,372,036,854,775,807, по умолчанию 0

        // с плавающей точкой
        float fl = 45.45f, fl2 = .256f;      // 4 байт - от -3.4E+38 до 3.4E+38 (стандарт IEEE 754), по умолчанию 0.0
        double db = 33.33, db2 = 55.36d;      // * 8 байт - от -1.7E+308 до 1.7E+308 (стандарт IEEE 754), по умолчанию 0.0 (по умолчанию)

        // символьные
        char ch = 'r';          // 2 байт - от 0 до 65,535, по умолчанию '\u0000'
        ch = 65500;             // UNICODE
        ch = '\u0066';          // 16 ричная UNICODE
        ch = '\141';            // Буква 'a' в восьмеричной форме
        ch = '\'';
        ch= '\n';

        // логические
        boolean bool = true;    // — байт, 1 бит, true или false, по умолчанию false

        //var
        var vv = "Text"; // тип переменной выводится из значения, поэтому обязательно должна инициализироваться
        var v2 = 3333;

        //int литералы
        int intF;
        intF = 0x1a;                   // 16-ричная система - "0x"
        intF = 0b011;                  // 2-ичная система - "0b"
        intF = 010;                    // 8-ичная система - "0"
        intF = 123_789_798;            // разделение разрядов
        intF = (int) 0.3e2; intF = (int) 26.3e+2; double fll =  26.3e-2;    // научная запись

        // String
        String text = """               
                Text text text text
                text text text text
                text text text text
                """;                    //многострочный текст при заключении в тройные кавычки

        System.out.println(text);



        // ПРИВЕДЕНИЕ ТИПОВ

        /*

            byte -> short -> int -> long

        */



        // unboxing

        int intR = 3;
        long ll = intR;         // byte -> short -> int -> long [больший по байтам может присваиват меньший тип]
        int intT = (int) ll;    // в обратную сторону надо опоределять тип в скобках




        // Numerical to String
        int d = 858;
        String s = ""+d;            // "" + variable
        s= String.valueOf(d);       // [String].valueOf()
        s = Integer.toString(d);    // .toString()

        //String to Numerical
        String ggg = "7.81231";
        float g = Float.valueOf(ggg);    //[Integer, Double, Float].valueOf()
        g = Float.parseFloat(ggg);       //[Integer, Float].parse[Int, Float]

        //char to int:
        char chr = '9';
        int i = chr - '0';

    }



}