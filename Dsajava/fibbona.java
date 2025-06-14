package Dsajava;

public class fibbona {
    public static void main(String[] args) {
        int m1=1;
        int m2=2; int count=10; int m3;
        System.out.print(m1 + " " + m2 );
        for (int i = 2; i < count; i++) {
            m3 = m1 + m2;
            System.out.print(" " + m3);
            m1 = m2;
            m2 = m3;
        }
    }
}
