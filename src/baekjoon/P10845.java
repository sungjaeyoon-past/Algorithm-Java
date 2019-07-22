package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P10845 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		LinkedList<Integer> q = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String arg = st.nextToken();
			if (arg.equals("push")) {
				q.add(Integer.parseInt(st.nextToken()));
			} else if (arg.equals("pop")) {
				if (q.isEmpty()) {
					bw.write(-1 + "\n");
				} else {
					bw.write(q.poll() + "\n");
				}
			} else if (arg.equals("size")) {
				bw.write(q.size() + "\n");
			} else if (arg.equals("empty")) {
				if (q.isEmpty()) {
					bw.write(1 + "\n");
				} else {
					bw.write(0 + "\n");
				}
			} else if (arg.equals("front")) {
				if (q.isEmpty()) {
					bw.write(-1 + "\n");
				} else {
					bw.write(q.getFirst() + "\n");
				}
			} else if (arg.equals("back")) {
				if (q.isEmpty()) {
					bw.write(-1 + "\n");
				} else {
					bw.write(q.getLast() + "\n");
				}
			}
		}
		bw.flush();
	}

}
