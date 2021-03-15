package ex03_File;

import java.io.File;

public class Ex01_File {

	public static void main(String[] args) {
		
		// File 클래스
		// 파일 생성, 삭제, 경로 확인, 존재 확인, 이름 확인 등 
		
		// 1. 선언만 한다. (생성은 예외 처리가 필요하다.)
		File file = null;
		
		// 2. 생성을 한다. (try - catch)
		try {
			
			// file = new File("myFile.txt"); // 프로젝트 폴더에 생성(디폴트)
			// file = new File("D:\\spring0914\\javastudy\\workspace\\16_io\\myFile2.txt");	// 경로 변경,	File 클래스에서는 \\를 File.separator 필드로 만들어 놓음
			file = new File("D:" + File.separator + "spring0914" + File.separator + "javastudy" + File.separator + "workspace" + File.separator + "16_io" + File.separator + "myFile3.txt");
			
			file.createNewFile();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// File 클래스의 메소드
		System.out.println("파일명 : " + file.getName());
		System.out.println("디렉토리 : " + file.getParent());
		System.out.println("경로 : " + file.getPath());
		System.out.println("존재유무 : " + file.exists()); // true or false 
		
		// 삭제
		if (file.exists()) {
			file.delete();
		}
		
		
	}

}
