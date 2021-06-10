package vcom.method.learn.copy;

public class Method {
   public static void main(String[] args) {
	   int x=10;
	   System.out.println(x);
	   sum(1,1);
	   sub(2,1);
	   
   }
   public static int changeValue(int x) {
	   x=x;
	   System.out.println(x);
	   return x;
   }
   public static int sum(int x, int y) {
	   int sum=x+y;
	   System.out.println("The sum is :"+sum);
	   
	   return sum;
   }
   public static int sub(int x, int y) {
	   int sub=x-y;
	   System.out.println("The sub is :"+sub);
	   return sub;
   }
   
   
}
