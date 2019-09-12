package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P2980 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());

		LinkedList<Integer> l = new LinkedList<>();
		LinkedList<Integer> r = new LinkedList<>();
		LinkedList<Integer> g = new LinkedList<>();
		LinkedList<Integer> rg = new LinkedList<>();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int D = Integer.parseInt(st.nextToken());
			int R = Integer.parseInt(st.nextToken());
			int G = Integer.parseInt(st.nextToken());

			l.add(D);
			r.add(R);
			g.add(G);
			rg.add(R + G);

		}

		int cur = 0;// 현재 위치
		int time = 0;// 걸린 시간

		while (cur < L) {
			if (l.isEmpty()) {
				int front = L - cur;
				cur += front;
				time += front;
			} else {
				int cl = l.poll();// 여기까지 전진
				int cr = r.poll();
				int cg = g.poll();
				int crg = rg.poll();

				int front = cl - cur;
				cur += front;
				time += front;

				crg = time % crg; // < - 0~cr cr+1~ cg
				if (crg <= cr) {// 빨간불이니 기다
					time += (cr - crg);
				}
			}
		}
		System.out.println(time);
	}

}
