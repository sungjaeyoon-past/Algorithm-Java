package basic;

public class CountingCells {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countCell(0,0));
	}
	private static int N=8;
	private static int BACKGROUND_COLOR=0;
	private static int IMAGE_COLOR=1;
	private static int ALREADY_COUNTED=2;
	
	private static int[][] grid= {
			{1,0,0,0,0,0,0,1},
			{0,1,1,0,0,1,0,0},
			{1,1,0,0,1,0,1,0},
			{0,0,0,0,0,1,0,0},
			{0,1,0,1,0,1,0,0},
			{0,1,0,1,0,1,0,0},
			{1,0,0,0,1,0,0,1},
			{0,1,1,0,0,1,1,1}
	};
	static public void printgrid() {
		for(int []a:grid) {
			for(int b:a) {
				System.out.print(b);
			}
			System.out.println();
		}
	}
	
	public static int countCell(int x, int y) {
		if(x<0||y<0||x>=N||y>=N) { // ��ΰ� �ƴ� ���̶�� 0�� ����
			return 0;
		}else if(grid[x][y]!=IMAGE_COLOR){ //�̹����� �ƴϰų� �̹� �湮�ߴٸ� 0 ������
			return 0;
		}else { 
			grid[x][y]=ALREADY_COUNTED; //�̹� �湮�� ������ ����� 
			return 1+countCell(x-1, y)+countCell(x-1,y-1)+countCell(x,y-1)+countCell(x+1,y-1)
					+countCell(x+1,y)+countCell(x+1,y+1)+countCell(x,y+1)+countCell(x-1, y+1);
			//count�� 1 �صΰ� ���� ��Ŀ��
		}
	}
}
