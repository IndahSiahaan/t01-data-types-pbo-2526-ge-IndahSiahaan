import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String soalType = sc.next();
        
        switch(soalType) {
            case "Soal1":
                soal1(sc);
                break;
            case "Soal2":
                soal2(sc);
                break;
            case "Soal3":
                soal3(sc);
                break;
            case "Soal4":
                soal4(sc);
                break;
            case "Soal5":
                soal5(sc);
                break;
        }
        
        sc.close();
    }
    
    // Soal 1 - Integer Overflow Detection
    static void soal1(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (b > 0 && a > Integer.MAX_VALUE - b) {
            System.out.println("OVERFLOW");
        } else if (b < 0 && a < Integer.MIN_VALUE - b) {
            System.out.println("OVERFLOW");
        } else {
            System.out.println(a + b);
        }
    }
    
    // Soal 2 - Float vs Double Precision Trap
    static void soal2(Scanner sc) {
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        
        float hasilFloat = (float)x + (float)y;
        double hasilDouble = x + y;
        
        double selisih = Math.abs(hasilFloat - hasilDouble);
        
        System.out.printf("%.6f%n", selisih);
    }
    
    // Soal 3 - Primitive vs Wrapper Comparison
    static void soal3(Scanner sc) {
        int N = sc.nextInt();
        
        Integer a = N;
        Integer b = a;
        
        a = a + 1;
        
        System.out.println("==: " + (a == b));
        System.out.println("equals: " + a.equals(b));
    }
    
    // Soal 4 - String Immutability & Reference
    static void soal4(Scanner sc) {
        String S = sc.next();
        
        String a = S;
        String b = new String(S);
        
        a = a + "X";
        
        System.out.println("==: " + (a == b));
        System.out.println("equals: " + a.equals(b));
    }
    
    // Soal 5 - Parsing & Type Safety
    static void soal5(Scanner sc) {
        int integer = sc.nextInt();
        double doubleVal = sc.nextDouble();
        boolean boolVal = sc.hasNext() && sc.next().equals("true");
        
        double hasil = integer * doubleVal;
        
        if (!boolVal) {
            hasil = hasil * -1;
        }
        
        System.out.printf("%.2f%n", hasil);
    }
}

