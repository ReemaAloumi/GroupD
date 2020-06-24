public class Java1 {
    public static void main(final String[] args) {
        final int x = 4;
        final int y = 3;
        mystery(x, y);
        System.out.println(mystery(x, y));
    }

    public static int mystery(final int n, final int a)
 
 {
  if (n == 1) return a;
  return a * mystery(n-1,a);
 
 }
 
 }