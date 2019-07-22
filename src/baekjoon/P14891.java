package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P14891 {

	static public void rotateClock(LinkedList<Integer> l) {
		int num = l.getLast();
		l.removeLast();
		l.add(0, num);
	}

	static public void rotateClockReverse(LinkedList<Integer> l) {
		int num = l.getFirst();
		l.removeFirst();
		l.add(7, num);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		LinkedList<Integer> l[] = new LinkedList[5];

		for (int i = 1; i < 5; i++) {
			l[i] = new LinkedList<Integer>();
		}

		for (int i = 1; i < 5; i++) {
			String[] in = br.readLine().split("");
			for (int j = 0; j < 8; j++) {
				l[i].add(Integer.parseInt(in[j]));
			}
		}

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int rotNum = Integer.parseInt(st.nextToken());
			int rotD = Integer.parseInt(st.nextToken());

			if (rotNum == 1) {
				if (l[1].get(2) != l[2].get(6)) {
					if (l[2].get(2) != l[3].get(6)) {
						if (l[3].get(2) != l[4].get(6)) {
							if (rotD != 1) {
								rotateClock(l[4]);
							} else {
								rotateClockReverse(l[4]);
							}
						}
						if (rotD == 1) {
							rotateClock(l[3]);
						} else {
							rotateClockReverse(l[3]);
						}
					}
					if (rotD != 1) {
						rotateClock(l[2]);
					} else {
						rotateClockReverse(l[2]);
					}
				}
				if (rotD == 1) {
					rotateClock(l[1]);
				} else {
					rotateClockReverse(l[1]);
				}
			} else if (rotNum == 2) {

				if (l[1].get(2) != l[2].get(6)) {
					if (rotD != 1) {
						rotateClock(l[1]);
					} else {
						rotateClockReverse(l[1]);
					}
				}

				if (l[2].get(2) != l[3].get(6)) {
					if (l[3].get(2) != l[4].get(6)) {
						if (rotD == 1) {
							rotateClock(l[4]);
						} else {
							rotateClockReverse(l[4]);
						}
					}

					if (rotD != 1) {
						rotateClock(l[3]);
					} else {
						rotateClockReverse(l[3]);
					}
				}

				if (rotD == 1) {
					rotateClock(l[2]);
				} else {
					rotateClockReverse(l[2]);
				}

			} else if (rotNum == 3) {
				if (l[3].get(2) != l[4].get(6)) {
					if (rotD != 1) {
						rotateClock(l[4]);
					} else {
						rotateClockReverse(l[4]);
					}
				}
				if (l[2].get(2) != l[3].get(6)) {
					if (l[1].get(2) != l[2].get(6)) {
						if (rotD == 1) {
							rotateClock(l[1]);
						} else {
							rotateClockReverse(l[1]);
						}
					}
					if (rotD != 1) {
						rotateClock(l[2]);
					} else {
						rotateClockReverse(l[2]);
					}
				}

				if (rotD == 1) {
					rotateClock(l[3]);
				} else {
					rotateClockReverse(l[3]);
				}

			} else if (rotNum == 4) {
				if (l[3].get(2) != l[4].get(6)) {
					if (l[2].get(2) != l[3].get(6)) {
						if (l[1].get(2) != l[2].get(6)) {
							if (rotD != 1) {
								rotateClock(l[1]);
							} else {
								rotateClockReverse(l[1]);
							}
						}

						if (rotD == 1) {
							rotateClock(l[2]);
						} else {
							rotateClockReverse(l[2]);
						}
					}

					if (rotD != 1) {
						rotateClock(l[3]);
					} else {
						rotateClockReverse(l[3]);
					}
				}

				if (rotD == 1) {
					rotateClock(l[4]);
				} else {
					rotateClockReverse(l[4]);
				}
			}

		}

		int result = 0;

		if (l[1].get(0) == 1) {
			result += 1;
		}
		if (l[2].get(0) == 1) {
			result += 2;
		}
		if (l[3].get(0) == 1) {
			result += 4;
		}
		if (l[4].get(0) == 1) {
			result += 8;
		}
		System.out.println(result);
	}
}
