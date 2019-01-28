package Programmers;

public class Count13 {
	static public int solution(int a){
        int result=0;
        for(int i=1;i<=a;i++){
            int num=i;
            System.out.println("----num:"+num);
            while(num>10){
                String sub="";
                sub+=num;
                String re="";
                re+=sub.charAt(sub.length()-2);
                re+=sub.charAt(sub.length()-1);
                System.out.println(re);
                
                if(re.equals("13")){
                	System.out.println("find : ");
                    result++;
                }
                
                num=num/10;
            }
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("result:"+solution(999));
	}

}
