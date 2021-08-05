//주변 방에 어떤 위험요소가 존재하는 지 힌트 주기
package toy_Project;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class HazardInRooms {

	public static void main(String[] args) {
		int[] rooms = { 0, 1, 2, 3 }; // 위험 요소 개수 = 방 번호 개수

		String BAT = "Bat";
		String PIT = "Pit";
		String WUMPUS = "Wumpus";
		String NOTHING = "Nothing";

		String[] hazards = { NOTHING, BAT, PIT, WUMPUS };

		// HashMap : Map인터페이스의 한 종류, Key와 Value(값)으로 데이터를 저장하는 형태
		// Map : Key와 Value를 하나의 쌍으로 묶어서 저장하는 List형태
		// key값은 중복이 되지 않고, value값은 중복 허용
		HashMap<String, String> hazardMessages = new HashMap<>();

		hazardMessages.put(WUMPUS, "\"어디선가 끔찍한 냄새가 난다.\"");
		hazardMessages.put(BAT, "\"어디선가 부스럭거리는 소리가 난다.\"");
		hazardMessages.put(PIT, "\"바람이 부는 소리가 들리는 것 같다.\"");
		hazardMessages.put(NOTHING, "\"저 방에는 아무것도 없는 것 같다.\"");

		int[][] links = { { 1, 2, 3 }, { 2, 3, 0 }, { 3, 0, 1 }, { 0, 1, 2 } };

		int currentRoom = 0;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("지금 " + currentRoom + "번 방에 있습니다.");

			// 현재 방과 인접한 방의 목록 가져온다.
			int[] nextRooms = links[currentRoom];

			for (int nextRoom : nextRooms) {
				// 각 방에 위치한 위험요소 가져옴
				String hazard = hazards[nextRoom];
				// 위험요소에 해당하는 메세지 -> 출력
				String message = hazardMessages.get(hazard);
				System.out.println(message);
			}

			System.out.println("다음 번호 중에서 이동할 방 번호를 입력해주세요.");
			System.out.println(Arrays.toString(nextRooms));

			int roomNumber = sc.nextInt();

			currentRoom = roomNumber;
		}

	}

}
