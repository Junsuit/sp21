public class Exercise2 {
    public static int max(int[] m) {
        int max_num=0;
        int len=m.length-1;
        while(len>=0){
            if (m[len]>max_num)
                max_num=m[len];
            len-=1;
        }
        return max_num;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
    }
}