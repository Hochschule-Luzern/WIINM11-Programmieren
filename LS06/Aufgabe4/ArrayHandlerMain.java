public class ArrayHandlerMain{

	public static void main(String[] args){
		
		ArrayHandler AH = new ArrayHandler();
		double[] lngArr = new double[64];
		
		for(int i=0; i<64;i++){
			lngArr[i] = i+1;	
		}
		
		AH.showDoubleArray(lngArr);
		AH.showIntArray(AH.getRandomIntArray(5,20,100));
		AH.showIntArray(AH.getOddNumbers(AH.getRandomIntArray(5,20,100)));
		
		int[] contains = {1,8,3,4,5,2,4};
		AH.contains(contains, 4);
		System.out.println("Groesster Wert: "+AH.max(contains));
		AH.showIntArray(AH.removeElement(contains, 8));
	}
}