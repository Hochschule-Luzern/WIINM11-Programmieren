public class Main3{
 public static void main (String[] args) {
 	 int a=1,b=2,c=3;

 	 if(a>b | a<(b/2) | (a+c)>b){
 	 	 System.out.println("Genf");
	 }
	 
	 boolean x=true, y= false;
	 
	 if(a>b | 0<(a-c) && x!=y ){
 	 	 System.out.println("Bern");
	 }
	 
	 if(a/2%2==1 || (b-c)%2==0 && a!=b && b!=c){
 	 	 System.out.println("Lugano");
	 }
	 
	 
	 
 }
}
