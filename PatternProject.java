import java.util.Scanner;
public class PatternProject    {
   public static void main(String[] args) {
        showPatternMenu(); 
    }
    static void showPatternMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;
          while (true) {
            System.out.println("\nChoose a Pattern:");
            System.out.println("1. Diamond Pattern");
            System.out.println("2. Butterfly Pattern");
            System.out.println("3. Pascal's Triangle Pattern");
            System.out.println("4. Numeric Diamond Pattern");
            System.out.println("5. M Pattern");
            System.out.println("6. H Pattern");
            System.out.println("7. N Pattern");
            System.out.println("8. Hollow Diamond Pattern");
            System.out.println("9. Hollow Pattern");
            System.out.println("10.Floyd's Triangle Pattern");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    pattern1();
                    break;
                case 2:
                    pattern2();
                    break;
                case 3:
                    pattern3();
                    break;
                case 4:
                    pattern4();
                    break;
                case 5:
                    pattern5();
                    break;
                case 6:
                    pattern6();
                    break;
                case 7:
                    pattern7();
                    break;
                case 8:
                    pattern8();
                    break;
                case 9:
                    pattern9();
                    break;
                case 10:
                    pattern10();
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 10.");
            }

            System.out.print("\nDo you want to continue? (Press 1 for Yes, any other number to exit): ");
            int repeat = sc.nextInt();

            if (repeat != 1) {
                System.out.println("\nThank you! Program ended.");
                break;
            }
        }
    }

    static void pattern1() {
    System.out.println("\nPattern 1:");
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int s = i; s < n; s++) System.out.print(" ");
            for (int j = 1; j <= (2*i - 1); j++) System.out.print("*");
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int s = n; s > i; s--) System.out.print(" ");
            for (int j = 1; j <= (2*i - 1); j++) System.out.print("*");
            System.out.println();
        }
    }
    static void pattern2() {
        System.out.println("\nPattern 2:");
        int n = 5;

        // Upper Half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            for (int j = 1; j <= 2*(n - i); j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }

        // Lower Half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            for (int j = 1; j <= 2*(n - i); j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }


    static void pattern3() {
        System.out.println("\nPattern 3:");
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            int number = 1;
            System.out.printf("%" + (rows - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    static void pattern4() {
        System.out.println("\nPattern 4:");
        int n = 5;

        // Upper half
        for (int i = n; i >= 1; i--) {
            // Spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            // Numbers
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }

        // Lower half
        for (int i = 2; i <= n; i++) {
            // Spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            // Numbers
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }


    static void pattern5() {
        System.out.println("\nPattern 5:");
        int n = 7; // Height of M (must be odd number >= 3)

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // First and last columns
                if (j == 0 || j == n - 1) {
                    System.out.print("*");
                }
                // Left diagonal
                else if (i == j && i <= n / 2) {
                    System.out.print("*");
                }
                // Right diagonal
                else if (i + j == n - 1 && i <= n / 2) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    static void pattern6() {
        System.out.println("\nPattern 6:");
        int height = 7;
        int width = 5; // Adjust spacing between two vertical bars

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Print * at the start and end (vertical lines)
                if (j == 0 || j == width - 1 || i == height / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    
       static void pattern7() {
        System.out.println("\nPattern 7:");
        int height = 7;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j == 0 || j == height - 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    static void pattern8() {
        System.out.println("\nPattern 8:");
        int n = 5;

        // Top half
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // Bottom half
        for (int i = n - 1; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }


    static void pattern9() {
        System.out.println("\nPattern 9:");
        int rows = 5, cols = 7;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void pattern10() {
        System.out.println("\nPattern 10:");
        int count = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}