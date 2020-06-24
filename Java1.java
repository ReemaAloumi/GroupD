public class Java1 {
    public static void main(String[] args) {
        int x =4;
        int y =3;
        mystery(x,y);
        System.out.println(mystery(x,y));
     }
     public static int mystery(int n, int a)
 
 {
  if (n == 1) return a;
  return a * mystery(n-1,a);
 
 }
 
 }