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
			boolean check = false;
			for (int i = 0; i < skill.length(); i++) {// 0으로 초기화.
				skillArr[1][i] = "0";
			}
			String[] tree = new String[skill_trees[j].length()];// 스킬트리 배열 삽입.
			for (int i = 0; i < skill_trees[j].length(); i++) {
				tree[i] = skill_trees[j].substring(i, i + 1);
			}

			for (int i = 0; i < tree.length; i++) { // 돌면서 판
				for (int k = 0; k < skill.length(); k++) {
					if (tree[i].equals(skillArr[0][k])) {// 돌면서 판
						for (int g = 0; g < k; g++) {
							if (skillArr[1][g] != "1") {
								check = false;
								break;
							}
							check=true;
						}
						if(check) {							
							skillArr[1][k] = "1";
						}
					}
					// 아니면 그냥 넘어감.
				}
			}
			if (check) {
				answer++;
			}

//			// 출력.
//			for (String b : tree) {
//				System.out.print(b + " ");
//			}
//			System.out.println();

			// 출력.
			for (String[] a : skillArr) {
				for (String b : a) {
					System.out.print(b + " ");
				}
				System.out.println();
			}

		}

		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String skill = "CBD";
		String[] skill_trees = { "BACDE", "CBADF", "AECB", "BDA","ABCDE","CBD" };
		System.out.println(solution(skill, skill_trees));
	}

}
