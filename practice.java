package com.tech.mission;
//Math.random을 활용하여 1~5까지 입력받아
//1이면 1반소속입니다.출력
//2이면 2반소속입니다.출력
//3이면 3반소속입니다.출력
//4이면 4반소속입니다.출력
//5이면 5반소속입니다.출력
//if문으로 분기
//
//제목 : 0331_if_최승민
//tbasic@daum.net
//오늘 12시까지
public class HightSchoolMissoin {
	public static void main(String[] args) {
		int highschool=(int)(Math.random()*5)+1;
		System.out.println(highschool);
		
		if (highschool==1) {
			System.out.println("1반소속입니다.");
		}else if (highschool==2) {
			System.out.println("2반소속입니다.");
		}else if (highschool==3) {
			System.out.println("3반소속입니다.");
		}else if (highschool==4) {
			System.out.println("4반소속입니다.");
		}else if (highschool==5) {
			System.out.println("5반소속입니다.");
		}else {
			System.out.println();
		}
			
		
		
	}

}