public class Main1{
 public static void main (String[] args) {
 int x = 10, y = 20, z = 30;
 showValue("y: ", y++);
 showValue("z: ", --z);
 int p = x-- + y-- + --z;
 showValue("p: ", p);
 x = 10;
 y = 133;
 showValue(x + "%" + y + " = ", x%y);
 showValue(y + "%" + x + " = ", y%x);
  int a = 3, b = 8, c = 12, res = 4;
 res += a*b;
 showValue("res: ", res);
 res = ++a - x % a++ * b % ++a - c++ * b--;
 showValue("res: ", res);
 showValue("a: ", a);
 showValue("b: ", b);
  showValue("c: ", c);
 }
 private static void showValue(String message, int value){
 System.out.println(message + "\t" + value);
 }
}