package oncoder;

public class nnnn1 {
	
	
	static public String toCapCase(String phrase) {
		// TODO put your code below this comment
		if(phrase==null) {
			return null;
		}
        if(phrase.isEmpty()){
          return null;
        }
        
        String []arr=phrase.split(" ");
        String upperString="";

        for(int i=0;i<arr.length;i++){
          String up=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1);
          upperString+=up;
          upperString+=" ";
        }
      upperString=upperString.substring(0,upperString.length()-1);
      
		return upperString;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(toCapCase(null));
		System.out.println(toCapCase(""));
		System.out.println(toCapCase("most trees are blue"));
	}

}
