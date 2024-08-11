public class Exercise1b {
    public static void drawTriangle(int n){
        int i = 1;
        while (i <= n) {
            int j = i;
            while (j > 0) {
                System.out.print('*');
                j -= 1;
            }
            System.out.println(" ");
            i += 1;
        }
    }
    public static void main(String[] args) {
        drawTriangle(10);
    }
}
