//�ֺ� �濡 � �����Ұ� �����ϴ� �� ��Ʈ �ֱ�
package toy_Project;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class HazardInRooms {

	public static void main(String[] args) {
		int[] rooms = { 0, 1, 2, 3 }; // ���� ��� ���� = �� ��ȣ ����

		String BAT = "Bat";
		String PIT = "Pit";
		String WUMPUS = "Wumpus";
		String NOTHING = "Nothing";

		String[] hazards = { NOTHING, BAT, PIT, WUMPUS };

		// HashMap : Map�������̽��� �� ����, Key�� Value(��)���� �����͸� �����ϴ� ����
		// Map : Key�� Value�� �ϳ��� ������ ��� �����ϴ� List����
		// key���� �ߺ��� ���� �ʰ�, value���� �ߺ� ���
		HashMap<String, String> hazardMessages = new HashMap<>();

		hazardMessages.put(WUMPUS, "\"��𼱰� ������ ������ ����.\"");
		hazardMessages.put(BAT, "\"��𼱰� �ν����Ÿ��� �Ҹ��� ����.\"");
		hazardMessages.put(PIT, "\"�ٶ��� �δ� �Ҹ��� �鸮�� �� ����.\"");
		hazardMessages.put(NOTHING, "\"�� �濡�� �ƹ��͵� ���� �� ����.\"");

		int[][] links = { { 1, 2, 3 }, { 2, 3, 0 }, { 3, 0, 1 }, { 0, 1, 2 } };

		int currentRoom = 0;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("���� " + currentRoom + "�� �濡 �ֽ��ϴ�.");

			// ���� ��� ������ ���� ��� �����´�.
			int[] nextRooms = links[currentRoom];

			for (int nextRoom : nextRooms) {
				// �� �濡 ��ġ�� ������ ������
				String hazard = hazards[nextRoom];
				// �����ҿ� �ش��ϴ� �޼��� -> ���
				String message = hazardMessages.get(hazard);
				System.out.println(message);
			}

			System.out.println("���� ��ȣ �߿��� �̵��� �� ��ȣ�� �Է����ּ���.");
			System.out.println(Arrays.toString(nextRooms));

			int roomNumber = sc.nextInt();

			currentRoom = roomNumber;
		}

	}

}
