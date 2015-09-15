package Aufgabe2;

public class Loop{
	
	public static void main(String[] args){
		
		Loop L1 = new Loop();
		
		L1.runFor1();	
		//Loop.runFor2();
		//Loop.runWhile1();
		Loop.runDo1();
	}
	
	public void runFor1(){
		
		System.out.println("For1:");
		int i;
		for(i=1;i<=10;){
		
			System.out.println(i);
			i++;
		}
	}

	public static void runFor2(){
		System.out.println("For2:");
		for(int i = 20; i>=11;--i){
			
			System.out.println(i);
		}
	}
	
	public static void runWhile1(){
		System.out.println("While1:");
		
		int i = 20;
		while(i>=11){			
			System.out.println(i);
			--i;
		}
	}
	
	public static void runDo1(){
		
		System.out.println("Do1:");
		
		int i = 0;
		do{
			if(i%2==0 || i==0)
				System.out.println(i);
			i++;
		}while(i<=20);
	}
}