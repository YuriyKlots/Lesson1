/**
 * Домашня робота по першій лекції
 */
public class HomeWork {


    public static void drawSq(){
        System.out.println("\u250C\u2500\u2500\u2510");
        System.out.println("\u2502  \u2502");
        System.out.println("\u2514\u2500\u2500\u2518");
    }
    public static void drawTr(){
        System.out.println("");
        System.out.println(" /\\");
        System.out.println("/  \\");
        System.out.println("\u2500\u2500\u2500\u2500");
    }
    public static void draw6(){
        System.out.println("");
        System.out.println("  \u2500\u2500\u2500\u2500");
        System.out.println("/      \\");
        System.out.println("\\      /");
        System.out.println("  \u2500\u2500\u2500\u2500");
    }
    public static void draw8(){
        System.out.println("");
        System.out.println("   \u2500\u2500\u2500\u2500");
        System.out.println(" /      \\");
        System.out.println("\u2502        \u2502");
        System.out.println(" \\      /");
        System.out.println("   \u2500\u2500\u2500\u2500");
    }
    public static void firstSecond(){
        /**
         * first task
         */
        byte vbyte;
        short vshort = 200;
        int vint = 200+200;
        long vlong = 125L;
        float vfloat = 2f;
        double vdouble = 15E+125;
        boolean vboolean = true;
        char vchar = 'f';
        /**
         * end first task
         */


        /**
         * second task
         */
        vbyte = Byte.MAX_VALUE;
        System.out.println("Byte max value = " + vbyte);
        System.out.println("Short min value = " + Short.MIN_VALUE);
        System.out.println("Min int -> " + Integer.MIN_VALUE+ "; Max int -> "+ Integer.MAX_VALUE);
        System.out.println("vboolean = " + vboolean);
        System.out.printf ("Min long %d \nMax long %d\n",Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("Min float exp ->%12.5e Max float dec -> %15.0f",Float.MIN_VALUE,Float.MAX_VALUE);
        /**
         * end second task
         */
    }

    /**
     * стартовий меотд
     * @param args
     */
    public static void main(String[] args) {

        drawSq();
        drawTr();
        draw6();
        draw8();
        System.out.println();
        firstSecond();

        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        Math.random();
    }
}
