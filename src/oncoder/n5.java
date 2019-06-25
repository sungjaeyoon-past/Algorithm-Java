package oncoder;

public class n5 {
	public static int highOrderBitmask(int wordSize) {
		String binary=Integer.toBinaryString(wordSize);
		//System.out.println(binary);
		
		String answer=binary.substring(0,4);
		for(int i=0;i<binary.length()-4;i++) {
			answer+="0";
		}
		System.out.println(answer);
		int result=Integer.parseInt(answer, 2);
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(highOrderBitmask(220));
	}

}
