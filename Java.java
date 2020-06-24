public class Java {
    public static void main(String[] args) {
        int x =5;
        mystery(x);
        System.out.println(mystery(x));
    }
    public static int mystery (int b)
{
   if (b == 0) return 0;
   else if (b%2 == 1) return mystery (b - 1) +3;
   else return mystery (b - 1) + 2;
}

}
    