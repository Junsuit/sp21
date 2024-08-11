public class Exercise1a {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            int j = i;
            while (j > 0) {
                System.out.print('*');
                j -= 1;
            }
            System.out.println(" ");
            i += 1;
        }
    }
}