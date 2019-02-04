package oncoder;

public class BitMask {
	static public String solution(String[] masks){
		int length=masks[0].length();
		boolean []number0=new boolean[length];
		boolean []number1=new boolean[length];
		
		for(String a:masks) {
			String []b=a.split("");
			for(String c:b) {
				System.out.print(c+" ");
			}
			System.out.println();
			for(int i=0;i<length;i++) {
				if(b[i].equals("0")) {
					number0[i]=true;
				}else if(b[i].equals("1")) {
					number1[i]=true;
				}
			}
		}
		boolean newBoolean[]=new boolean[length];
		for(int i=0;i<length;i++) {
			newBoolean[i]=number0[i]&&number1[i];
		}
		for(boolean a:number0) {
			System.out.print(a+" ");
		}
		System.out.println();
		for(boolean a:number1) {
			System.out.print(a+" ");
		}
		System.out.println();
		for(boolean a:newBoolean) {
			System.out.print(a+" ");
		}
		System.out.println();
		
        return "YES";
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []masks= {"010","011","000"};
		solution(masks);
	}

}
