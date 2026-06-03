import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        s1.push(15);
        s1.push(22);
        s1.push(9);

        s2.push(15);
        s2.push(22);
        s2.push(9);

        boolean ditemukan_beda = false;

        if (s1.size() != s2.size()) {
            ditemukan_beda = true;
        } else {
            while (s1.isEmpty() == false) {
                int data1 = s1.pop();
                int data2 = s2.pop();

                if (data1 != data2) {
                    ditemukan_beda = true;
                    break;
                }
            }
        }

        if (ditemukan_beda == false) {
            System.out.println("Hasil: Kedua stack memiliki nilai yang SAMA.");
        } else {
            System.out.println("Hasil: Kedua stack memiliki nilai yang BERBEDA.");
        }
    }
}