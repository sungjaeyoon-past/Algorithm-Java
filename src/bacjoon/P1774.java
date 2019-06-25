package bacjoon;

import java.util.ArrayList;
import java.util.Scanner;

class Point {
	private int X;
	private int Y;

	public Point(int x, int y) {
		X = x;
		Y = y;
	}
	
	public double getLength(Point o) {
		return Math.round(Math.sqrt(Math.pow((this.X - o.X), 2) + Math.pow((this.Y - o.Y), 2))*100)/100;
	}
}

public class P1774 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String []input=sc.nextLine().split(" ");
		int point_num=Integer.parseInt(input[0]);
		int line_num=Integer.parseInt(input[1]);
		
		Point []list=new Point[point_num];
		for(int i=0;i<point_num;i++) {
			String []input2=sc.nextLine().split(" ");
			list[i]=new Point(Integer.parseInt(input2[0]),Integer.parseInt(input2[1]));
		}
		
		ArrayList<Integer> []ar=new ArrayList[point_num+1];
		
		
		double [][]length=new double[point_num][point_num];
		for(int i=0;i<point_num;i++) {
			for(int j=0;j<point_num;j++) {
				if(i==j) {
					length[i][j]=10000000000.0;
				}else {
					length[i][j]=list[i].getLength(list[j]);
				}
			}
		}
		
		
		for(double []a:length) {
			for(double b:a) {
				System.out.print(b+"      ");
			}
			System.out.println();
		}
		
	}

}
