package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Point17143{
	public int x;
	public int y;
	public int number;
	public Point17143(int x, int y,int number) {
		this.x = x;
		this.y = y;
		this.number=number;
	}
}

class Shark17143{
	public int speed;
	public int direction;
	public int size;
	public int number;
	public Shark17143() {
		speed=0;
		direction=0;
		size=0;
		number=0;
	}
	public Shark17143(int speed, int direction, int size,int number) {
		this.speed = speed;
		this.direction = direction;
		this.size = size;
		this.number=number;
	}	
}

public class P17143 {
	static Shark17143 [][]graph;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int x=Integer.parseInt(st.nextToken());
		int y=Integer.parseInt(st.nextToken());
		int N=Integer.parseInt(st.nextToken());
		
		boolean [][]exist=new boolean[x+1][y+1];
		graph= new Shark17143[x+1][y+1];
		for(int i=0;i<x+1;i++) {
			for(int j=0;j<y+1;j++) {
				graph[i][j]=new Shark17143();
			}
		}
		LinkedList<Point17143> sharkList = new LinkedList<>();
		for(int i=1;i<=N;i++) {
			st = new StringTokenizer(br.readLine());
			int nx=Integer.parseInt(st.nextToken());
			int ny=Integer.parseInt(st.nextToken());
			int nSpeed=Integer.parseInt(st.nextToken());
			int nDirection=Integer.parseInt(st.nextToken());
			int nSize=Integer.parseInt(st.nextToken());
			
			graph[nx][ny]=new Shark17143(nSpeed, nDirection, nSize,i);
			sharkList.add(new Point17143(nx,ny,i));
			exist[nx][ny]=true;
		}
		int result=0;
		int person=0;
		
		while(person<y) {
			if(person==2)break;//test
			person++;
			//catch shark
//			for(int i=1;i<x+1;i++) {
//				if(exist[i][person]) {
//					result+=graph[i][person].size;
//					int number = graph[i][person].number;
//					Iterator<Point17143> it = sharkList.iterator();
//					while(it.hasNext()) {
//						if(it.next().number==number) it.remove();
//						break;
//					}
//					graph[i][person]=null;
//					break;
//				}
//			}			
			//move shark
			for(Point17143 p:sharkList) {
				int sx=p.x;
				int sy=p.y;
				int sn=p.number;
				Shark17143 tempS=graph[sx][sy];
				
				int tempDirection=tempS.direction;
				int tempSpeed = tempS.speed;
				int tempSize=tempS.size;
				graph[sx][sy]=null;
				
				//change false 
				exist[sx][sy]=false;
				
				int nx=0;
				int ny=0;
				
				//sx->nx sy->ny			
				if(tempDirection==1) {
					tempSpeed=tempSpeed%((x-1)*2);//제자리로 돌아오는 경우 없
					nx = sx-tempSpeed;
					if(nx<1) {
						nx=Math.abs(nx)+2;
						tempDirection=2;
					}
					if(nx>x) {
						nx=x-(nx-x);
						tempDirection=1;
					}			
				}else if(tempDirection==2) {
					tempSpeed=tempSpeed%((x-1)*2);
					nx=sx+tempSpeed;
					if(nx>x) {
						nx=x-(nx-x);
						tempDirection=1;
					}
					if(nx<1) {
						nx=1-nx;
						tempDirection=2;
					}				
				}else if(tempDirection==3) {
					tempSpeed=tempSpeed%((y-1)*2);
					ny=sy+tempSpeed;
					if(ny>y) {
						ny=y-(ny-y);
						tempDirection=4;
					}
					if(ny<1) {
						ny=1-ny;
						tempDirection=3;
					}					
				}else if(tempDirection==4) {
					tempSpeed=tempSpeed%((y-1)*2);
					ny = sy-tempSpeed;
					if(ny<1) {
						ny=Math.abs(ny)+2;
						tempDirection=3;
					}
					if(ny>y) {
						ny=y-(ny-y);
						tempDirection=4;
					}
				}
				System.out.println("sn:"+sn+" ,nx:"+nx+" , ny:"+ny);
				//if exist ?  compare  big=exist small=null
				
				//move graph if big else no
				
				//move list if big else remove
				
				//exist true if big else no
				
				
			}
		}
			
		for(boolean []a:exist) {
			for(boolean b:a) {
				System.out.print(b+"\t");
			}
			System.out.println();
		}
	}

}
