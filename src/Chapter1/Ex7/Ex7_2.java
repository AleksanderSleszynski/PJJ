package Chapter1.Ex7;

/**
 * Created by julian on 10.12.14.
 */
public class Ex7_2 {
    public static void main(String[] args) {
        System.out.println("Wybrane metody obiektów klasy Integer\n");
/* tworzenie obiektów */
        Integer a = new Integer(1024);
        Integer b = new Integer("02000");
        Integer c = Integer.decode("02000");
        Integer d = Integer.decode("0x2000");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
/* porównania obiektów */
        System.out.println("Sprawdz czy a jest równe b? "+a.equals(b));
        System.out.println("Sprawdz czy a jest równe c? "+a.equals(c));
        System.out.println("Porównaj a z c? "+a.compareTo(c)); // 0 jesli rowne
        System.out.println("Porównaj c z d? "+c.compareTo(d)); //jesli mniejsze -1
        System.out.println("Porównaj d z c? "+d.compareTo(c)); // jeśli wieksze 1
/* zmiana wartoĞci obiektu */
        a = Integer.valueOf(1000);
        b = Integer.valueOf("1000");
        c = Integer.valueOf("1000", 2);
        d = Integer.valueOf("1000", 16);
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
    }
}
