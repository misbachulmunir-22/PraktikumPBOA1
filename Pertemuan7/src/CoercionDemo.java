public class CoercionDemo {
    public static void main(String[] args) {
        int nilaiInt = 65;
        char nilaiChar = (char) nilaiInt;
        double nilaiDouble = (double) nilaiInt;

        System.out.println("Integer : " + nilaiInt);
        System.out.println("Char : " + nilaiChar);
        System.out.println("Double : " + nilaiDouble);

        // b. mengembalikan real ke integer
        int nilaiIntLagi = (int) nilaiDouble;
        System.out.println("Int dari double : " + nilaiIntLagi);
        
        // c.
        String X = "12345";
        String Y = "5678";
        String S = X + Y;
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);
        
        System.out.println("S (konkatenasi) : " + S);
        System.out.println("Z (penjumlaha) : " + Z);
        
        // d.
        String P = "12.34"; 
        String Q = "56.78"; 
        String R = P + Q; 
        Double D = Double.parseDouble(P) + Double.parseDouble(Q);
        
        System.out.println("R (konkatenasi) : " + R);
        System.out.println("D (penjumlaha) : " + D);
        
        // e. konversi nilai S ke Integer A
        Integer A = Integer.parseInt(S);
        System.out.println("A : " + A);

        // f. konversi nilai A ke String T
        String T = A.toString();
        System.out.println("T : " + T);
    }
}
