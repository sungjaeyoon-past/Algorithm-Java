package Programmers;

public class IntegerTriangle {
	static public int solution(int[][] triangle) {
        int answer = 0;
        int row,col;
        for(row=1;row<triangle.length;row++){
            for(col=0;col<triangle[row].length;col++){
                triangle[row][col]=findMax(triangle,row,col);
            }
        }
        for(int i=0;i<triangle[row-1].length;i++){
            if(triangle[row-1][i]>answer){
                answer=triangle[row-1][i];
            }
        }
        return answer;
    }
    static int findMax(int[][] arr,int row,int col){
        if(col==0){
            return arr[row][col]+arr[row-1][0];
        }else if(col==(arr[row].length-1)){
            return arr[row][col]+arr[row-1][arr[row-1].length-1];
        }else{
            if(arr[row-1][col-1]>=arr[row-1][col]){
                return arr[row][col]+arr[row-1][col-1];
            }else{
                return arr[row][col]+arr[row-1][col];
            }
        }      
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
