package ex04_quiz;

import java.io.File;
import java.util.Scanner;

// 문제
// C:/test 폴더를 대상으로 작업하시오.
// 삭제할 파일명을 입력 받아서 해당 파일을 삭제하시오.

public class Quiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("삭제할 파일을 입력하세요 >> ");
		String str = sc.nextLine();

		boolean isExist = false;

		File dir = new File("C:" + File.separator + "test");

		if (dir.exists()) { // C:\\test 디렉토리가 있으면
			if (dir.isDirectory()) { // C:\\test 디렉토리가 맞다면 (참고 : 파일은 isFile())
				File[] files = dir.listFiles(); // 디렉토리내의 모든 File을 배열에 저장해 둔다.
				for (int i = 0; i < files.length; i++) {
					if (str.equals(files[i].getName())) {
						System.out.println(files[i].getName() + " 파일이 삭제되었습니다.");
						files[i].delete();
						isExist = true;
						break;
					}
				}

			}

			if (!isExist) { // 찾는 파일이 없으면,
				System.out.println(str + "파일이 없습니다.");

			}
		}

		sc.close();

	}

}
