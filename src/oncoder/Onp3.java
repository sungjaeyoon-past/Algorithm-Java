package oncoder;

public class Onp3 {
	
	static public double length(int x1,int x2, int y1, int y2) {		
		double num=Math.sqrt(Math.abs((x1-x2)*(x1-x2))+Math.abs((y1-y2)*(y1-y2)));		
		return num;
	}
	
	static public double solution(int[] pointsX, int[] pointsY){
		boolean used[] =new boolean[pointsX.length];
		
		double length[][]=new double[pointsX.length][pointsX.length];
		for(int i=0;i<length.length;i++) {
			for(int j=i+1;j<length.length;j++) {
				double r = length(pointsX[i],pointsX[j],pointsY[i],pointsY[j]);
				length[i][j]=r;
				length[j][i]=r;
			}
		}
		
		for(double a[]:length) {
			for(double b:a) {
				System.out.print(b+"\t");
			}
			System.out.println();
		}
		
		
        return 0.0;
    }

	public static void main(String[] args) {
		int[] pointsX = {0,0,0,0};
		int[] pointsY = {0,1,5,6};
		solution(pointsX, pointsY);
	}

}
