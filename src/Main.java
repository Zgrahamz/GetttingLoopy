
public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 31; i++) {
            System.out.println(i);
        }

        for(int i = 30; i >= 0; i--) {
            System.out.println(i);
        }

        for(int i = 0; i < 19; i += 3) {
            System.out.println(i);
        }

        for(int i = 10; i >= 0; i -= 2) {
            System.out.println(i);
        }

        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 5; i >= 0; --i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        DieRollar.dieRoll();

    }
}