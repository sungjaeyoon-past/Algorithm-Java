package SamsungSW;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point implements Comparable<Point> {
	public int x;
	public int y;
	public int even;

	public int getEven() {
		return even;
	}

	public void setEven(int even) {
		this.even = even;
	}

	public int getOdd() {
		return odd;
	}

	public void setOdd(int odd) {
		this.odd = odd;
	}

	public int odd;

	Point(int x, int y, int even, int odd) {
		this.x = x;
		this.y = y;
		this.even = even;
		this.odd = odd;
	}

	@Override
	public int compareTo(Point o) {
		if (this.odd < o.odd) {
			return 1;
		} else if (this.odd > o.odd) {
			return -1;
		} else if (this.odd == o.odd) {
			if (this.even >= o.even) {
				return -1;
			} else if (this.even < o.even) {
				return 1;
			}
		}
		return 0;
	}

}

public class Elice4 {

	static int[][] graph;
	static Point[][] DP;
	static final int[] dx = { 1, -1, 0, 0 };
	static final int[] dy = { 0, 0, 1, -1 };

	public static void bfs() {

		int len = graph.length;
		LinkedList<Integer> qx = new LinkedList<>();
		LinkedList<Integer> qy = new LinkedList<>();
		qx.add(0);
		qy.add(0);
		if (graph[0][0] == 0) {
			DP[0][0].setEven(1);
			DP[0][0].setOdd(0);
		} else {
			DP[0][0].setEven(0);
			DP[0][0].setOdd(1);
		}
//		for(Point []a:DP) {
//			for(Point b:a) {
//				System.out.print(b.getOdd()+","+b.getEven()+"   ");
//			}
//			System.out.println();
//		}
//		System.out.println();
		while (!qx.isEmpty()) {
			int x = qx.poll();
			int y = qy.poll();
			int odd = DP[x][y].getOdd();
			int even = DP[x][y].getEven();

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (nx < 0 || nx >= len || ny < 0 || ny >= len) {
					continue;
				} else {
					if (DP[x][y].compareTo(DP[nx][ny]) == 1) {
						if (graph[nx][ny] == 0) {
							DP[nx][ny].setEven(even + 1);
							DP[nx][ny].setOdd(odd);
						} else {
							DP[nx][ny].setEven(even);
							DP[nx][ny].setOdd(odd + 1);
						}
						qx.add(nx);
						qy.add(ny);
					}
				}
//				for(Point []a:DP) {
//					for(Point b:a) {
//						System.out.print(b.getOdd()+","+b.getEven()+"   ");
//					}
//					System.out.println();
//				}
//				System.out.println();
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int TEST_CASE = Integer.parseInt(st.nextToken());
		for (int k = 1; k <= TEST_CASE; k++) {
			//if(k==1) continue;
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			graph = new int[N][N];
			DP = new Point[N][N];

			for (int i = 0; i < N; i++) {
				//String[] input = br.readLine().split(" ");
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					int num = Integer.parseInt(st.nextToken());
					if (num % 2 == 0) {
						graph[i][j] = 0;
					} else {
						graph[i][j] = 1;
					}
					if(i==0 && j==0) {
						if(graph[i][j]==0) {
							DP[i][j] = new Point(i, j, 1, 0);
						}else {
							DP[i][j] = new Point(i, j, 0, 1);							
						}
					}else if(i==0 && j!=0) {
						if(graph[i][j]==0) {
							DP[i][j] = new Point(i, j, DP[i][j-1].getEven()+1, DP[i][j-1].getOdd());
						}else {					
							DP[i][j] = new Point(i, j, DP[i][j-1].getEven(), DP[i][j-1].getOdd()+1);
						}
					}else if(i!=0 && j==0) {
						if(graph[i][j]==0) {
							DP[i][j] = new Point(i, j, DP[i-1][j].getEven()+1, DP[i-1][j].getOdd());
						}else {			
							DP[i][j] = new Point(i, j, DP[i-1][j].getEven(), DP[i-1][j].getOdd()+1);
						}
					}else {
						//왼쪽or 위쪽 작은걸 가져와서 내껄 더
						if(DP[i-1][j].compareTo(DP[i][j-1])==1) {							
							if(graph[i-1][j]==0) {
								DP[i][j] = new Point(i, j, DP[i-1][j].getEven()+1, DP[i-1][j].getOdd());
							}else {			
								DP[i][j] = new Point(i, j, DP[i-1][j].getEven(), DP[i-1][j].getOdd()+1);
							}
						}else {
							if(graph[i][j-1]==0) {
								DP[i][j] = new Point(i, j, DP[i][j-1].getEven()+1, DP[i][j-1].getOdd());
							}else {			
								DP[i][j] = new Point(i, j, DP[i][j-1].getEven(), DP[i][j-1].getOdd()+1);
							}							
						}
					}
					
					DP[i][j] = new Point(i, j, N * N, N * N);
				}
			}
			bfs();
			bw.write(String.format("#%d %d %d\n",k,DP[N-1][N-1].getOdd(),DP[N-1][N-1].getEven()));

		}
		bw.flush();
	}

}
