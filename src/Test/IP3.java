package Test;

import java.util.ArrayList;
import java.util.List;

public class IP3 {
	static public long solution(List<Integer> songs) {
		Integer[] songList = songs.toArray(new Integer[songs.size()]);
		long result = 0;
		for (int i = 0; i < songList.length - 1; i++) {
			for (int j = i + 1; j < songList.length; j++) {
				if ((songList[i] + songList[j]) % 60 == 0)
					result++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		List<Integer> songs = new ArrayList<>();
		songs.add(60);
		songs.add(60);
		songs.add(60);
		System.out.println(solution(songs));
		
	}
}
