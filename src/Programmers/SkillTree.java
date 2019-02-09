package Programmers;

public class SkillTree {
	static public int solution(String skill, String[] skill_trees) {
		int answer = 0;
		String[][] skillArr = new String[2][skill.length()];
		for (int i = 0; i < skill.length(); i++) {
			skillArr[0][i] = skill.substring(i, i + 1);
			skillArr[1][i] = "0";
		}

		for (int j = 0; j < skill_trees.length; j++) {
			boolean check = true;
			for (int i = 0; i < skill.length(); i++) {// 0으로 초기화.
				skillArr[1][i] = "0";
			}
			String[] tree = new String[skill_trees[j].length()];// 스킬트리 배열 삽입.
			for (int i = 0; i < skill_trees[j].length(); i++) {
				tree[i] = skill_trees[j].substring(i, i + 1);
			}

			for (int i = 0; i < tree.length; i++) {
				for (int k = 0; k < skillArr.length; k++) {
					if (tree[i].equals(skillArr[0][k])) {
						System.out.println(tree[i]+"와"+skillArr[0][k]);
						for(int t=0;j<k;j++) {
							if(skillArr[1][t].equals("0")) {
								check=false;
								break;
							}
						}
						//맞으면k를 1로함
						if(check) {
							skillArr[1][k]="1";
						}
						//아니면 false 하브레이
					}
				}
			}
		
			if (check) {
				answer++;
			}

			for (String b : tree) {
				System.out.print(b + " ");
			}
			System.out.println();
//
//			// 출력.
//			for (String[] a : skillArr) {
//				for (String b : a) {
//					System.out.print(b + " ");
//				}
//				System.out.println();
//			}

		}

		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String skill = "CBD";
		String[] skill_trees = { "BACDE", "CBADF", "AECB", "BDA", "ABCDE", "CBD" };
		System.out.println(solution(skill, skill_trees));
	}

}
