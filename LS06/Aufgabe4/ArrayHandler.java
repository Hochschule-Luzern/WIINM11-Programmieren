import java.util.Random;

public class ArrayHandler{
	
	public void showDoubleArray(double[] lngArr){
	
		for(int i=0;i<lngArr.length;i++){
		
			System.out.println(i+": "+lngArr[i]);
		}
	}
	
	public void showIntArray(int[] lngArr){
	
		for(int i=0;i<lngArr.length;i++){
		
			System.out.println(i+": "+lngArr[i]);
		}
	}
	
	public int[] getRandomIntArray(int length, int min, int max){
		
		int[] intArr = new int[length];
		
		Random rand = new Random();
		
		for(int i=0;i<intArr.length;i++){
			
			intArr[i] = rand.nextInt((max - min) + 1) + min;	
		}	
		
		return intArr;
	}	
	
	public int[] getOddNumbers(int[] intArr){
		
		int[] returnArr = new int[intArr.length];
		int ireturn = 0;
		
		for(int i=0;i<intArr.length;i++){
			
			if(intArr[i]%2==1){
				returnArr[i] = intArr[i];
				ireturn++;
			}
		}	
		
		return returnArr;
	}	
	
	public void contains(int[] intArr, int contains){
	
		for(int i=0;i<intArr.length;i++){
			
			if(intArr[i]==contains){
			
				System.out.println("Array contains: "+contains+" at position: "+i);
			}
		}
	}
	
	public int max(int[] intArr){
		
		int max = intArr[0];
		
		for(int i=0;i<intArr.length;i++){
			
			if(intArr[i]>max){
			
				max=intArr[i];
			}
		}
		
		return max;
	}
	
	public int[] removeElement(int[] intArr, int remove){
		
		int counter = 1;
		int[] tempArr = new int[intArr.length];
		
		for(int i=0;i<intArr.length;i++){
			
			if(intArr[i]!=remove){
			
				tempArr[counter]=intArr[i];
				counter++;
			}
		}
		
		int[] newArr = new int[counter];
		
		
		for(int i=0;i<counter;i++){
			
			newArr[i]=tempArr[i];
		}
		
		return newArr;
	}
}