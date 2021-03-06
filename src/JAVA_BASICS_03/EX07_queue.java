package JAVA_BASICS_03;

import java.util.Scanner;

public class EX07_queue {
	//https://machine-geon.tistory.com/70?category=871208
	private static Scanner sc;
	public static int[] result;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		// stack
		int stack[] = new int[100]; // 배열
		int top = 0; // 스택의 층
		int bottom = 0;

		// 명령의 수
		int N = sc.nextInt();

		// 명령
		String cmd;

		sc.nextLine(); // 개행문자 제거
		for (int i = 0; i < N; ++i) {
			cmd = sc.nextLine(); // 명령 입력

			// insert
			if ('i' == (cmd.toCharArray()[0])) {
				/*
				 * 명령과 공백을 제외한 2번부터 값 입력 문자형으로 받은 문자를 Integer.parseInt 활용 10진수 'int'형으로 변환
				 */
				stack[top++] = Integer.parseInt(cmd.substring(2));

				// out
			} else if ("o".equals(cmd)) {
				if (stack[bottom] == 0) // bottom의 값이 0이라면 empty 출력
					System.out.println("empty");
				else
					System.out.println(stack[bottom++]); //bottom 값 증가

				// count
			} else if ("c".equals(cmd)) {
				System.out.println(top - bottom); // top-bottom의 사이즈 = 층의 갯수
			}
		}
	}
}

