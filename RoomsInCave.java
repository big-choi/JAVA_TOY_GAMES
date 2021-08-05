//움퍼스 사냥 게임 : 텍스트 기반의 고전 어드벤처 게임.
//플레이어가 몬스터 움퍼스를 사냥하기 위해 움퍼스가 사는 동굴에 들어가는 것으로 시작.
//동굴 안에는 20여개의 방이 존재하며 각 방에는 박쥐, 구덩이와 같은 위험요소들이 있습니다.
//플레이어는 5발의 화살을 가지고 위험요소들을 피해 잠들어있는 움퍼스를 사냥해야 합니다!
package toy_Project;

import java.util.Arrays;
import java.util.Scanner;

public class RoomsInCave {

	public static void main(String[] args) {
		int[] rooms = { 0, 1, 2, 3 }; // 4개의 방을 설정

		// 각 방에서 이동할 수 있는 방 목록
		int[][] links = { { 1, 2, 3 }, { 2, 3, 0 }, { 3, 0, 1 }, { 0, 1, 2 } };

		int currentRoom = 0;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("지금" + currentRoom + "번 방에 있습니다."); // 0번 방
			System.out.println("다음 번호 중에서 이동할 방 번호를 입력해주세요");

			// 배열 내용 출력하기
			// links의 0번째 값={1,2,3}
			System.out.println(Arrays.toString(links[currentRoom]));

			int roomNumber = sc.nextInt();

			// 숫자 입력받고 그 번호를 현재 방번호로 변경
			currentRoom = roomNumber;

		}

	}

}
