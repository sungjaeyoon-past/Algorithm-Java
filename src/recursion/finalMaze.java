package recursion;

import javax.swing.JTable.PrintMode;

public class finalMaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findMazePath(0, 0));
		printMaze();

	}
	private static int N=8;
	private static int[][] maze = {
			{0,0,0,0,0,0,0,1},
			{0,1,1,0,1,1,0,1},
			{0,0,0,1,0,0,0,1},
			{0,1,0,0,1,1,0,0},
			{0,1,1,1,0,0,1,1},
			{0,1,0,0,0,1,0,1},
			{0,0,0,1,0,0,0,1},
			{0,1,1,1,0,1,0,0}
	};
	static public void printMaze() {
		for(int []a:maze) {
			for(int b:a) {
				System.out.print(b);
			}
			System.out.println();
		}
	}
	private static final int PATHWAY_COLOR=0;
	private static final int WALL_COLOR=1;
	private static final int BLOCKED_COLOR=2;
	private static final int PATH_COLOR=3;
	public static boolean findMazePath(int x, int y) {
		if(x<0||y<0||x>=N||y>=N) {// 배열의 경로가 아니면 리턴
			return false;
		}else if(maze[x][y]!=PATHWAY_COLOR) {// 벽이나 방문했다면 false 리턴
			return false;
		}else if(x==N-1 && y==N-1) {//출구인 경우 리턴
			maze[x][y]=PATH_COLOR;
			return true;
		}else{
			maze[x][y]=PATH_COLOR;
			System.out.println("x:"+x+", y:"+y);
			if(findMazePath(x-1, y)||findMazePath(x, y+1)||findMazePath(x+1, y)||findMazePath(x, y-1)) {// 각각의 셀에대하여 리커션 실행
				return true;
			}
			maze[x][y]=BLOCKED_COLOR;
			return false;
		}
	}
}
