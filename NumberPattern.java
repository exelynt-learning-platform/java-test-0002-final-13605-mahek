public class NumberPattern {
    public static void main(String[] args) {
        int rows = 5;  // Change this value to print more/fewer rows

        for (int i = 1; i <= rows; i++) {
            
            // Print increasing part: 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            
            // Print decreasing part: (i-1) down to 1
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            
            // Move to next line after each row
            System.out.println();
        }
    }
}