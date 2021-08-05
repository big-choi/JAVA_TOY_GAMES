//���۽� ��� ���� : �ؽ�Ʈ ����� ���� ��庥ó ����.
//�÷��̾ ���� ���۽��� ����ϱ� ���� ���۽��� ��� ������ ���� ������ ����.
//���� �ȿ��� 20������ ���� �����ϸ� �� �濡�� ����, �����̿� ���� �����ҵ��� �ֽ��ϴ�.
//�÷��̾�� 5���� ȭ���� ������ �����ҵ��� ���� �����ִ� ���۽��� ����ؾ� �մϴ�!
package toy_Project;

import java.util.Arrays;
import java.util.Scanner;

public class RoomsInCave {

	public static void main(String[] args) {
		int[] rooms = { 0, 1, 2, 3 }; // 4���� ���� ����

		// �� �濡�� �̵��� �� �ִ� �� ���
		int[][] links = { { 1, 2, 3 }, { 2, 3, 0 }, { 3, 0, 1 }, { 0, 1, 2 } };

		int currentRoom = 0;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("����" + currentRoom + "�� �濡 �ֽ��ϴ�."); // 0�� ��
			System.out.println("���� ��ȣ �߿��� �̵��� �� ��ȣ�� �Է����ּ���");

			// �迭 ���� ����ϱ�
			// links�� 0��° ��={1,2,3}
			System.out.println(Arrays.toString(links[currentRoom]));

			int roomNumber = sc.nextInt();

			// ���� �Է¹ް� �� ��ȣ�� ���� ���ȣ�� ����
			currentRoom = roomNumber;

		}

	}

}
