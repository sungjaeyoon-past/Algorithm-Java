package Programmers;

public class FailRate {
	static public int[] solution(int N, int[] stages) {
		int answer[] = new int[N];
		int reach[] = new int[N];
		int fail[] = new int[N];
		double failRate[] = new double[N];

		for (int stage : stages) {
			stage--;
			if (stage == N) {
				for (int i = 0; i < N; i++) {
					reach[i]++;
				}
			} else {
				for (int i = 0; i <= stage; i++) {
					reach[i]++;
				}
				fail[stage]++;
			}
		}
		for(int i=0;i<N;i++) {
			failRate[i]=(double)fail[i]/(double)reach[i];
		}
		for(int j=0;j<answer.length;j++) {			
			double max=-1;
			int maxIndex=-1;
			for(int i=0;i<failRate.length;i++) {
				if(max<failRate[i]) {
					maxIndex=i;
					max=failRate[i];
				}
			}
			failRate[maxIndex]=-1;
			answer[j]=maxIndex+1;
		}
		
		
		for (double a : failRate) {
			System.out.print(a + " ");
		}
		System.out.println();
		for (int a : answer) {
			System.out.print(a + " ");
		}
				return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 1, 2, 6, 2, 4, 3, 3 };
		solution(5, arr);
	}

}
