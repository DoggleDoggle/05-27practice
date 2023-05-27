package com.itwill01.method;

public class StudentMemberMethodMain {

	public static void main(String[] args) {

		/*
		 * 학생객체생성(3명)
		 */

		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student();

		/*
		 * 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */

		std1.BaseData(1, "하하하", 99, 88, 77);
		std2.BaseData(2, "흠흠흠", 34, 56, 33);
		std3.BaseData(3, "헐헐헐", 40, 33, 60);

		// 총점//
		std1.plus();
		std2.plus();
		std3.plus();

		// 평 균 //
		std1.avg();
		std2.avg();
		std3.avg();
		
		///등 
		
		std1.grade();
		std2.grade();
		std3.grade();
		
		std1.print();
		std2.print();
		std3.print();
		
		

		/*
		 * 학생총점계산 메쏘드 호출(3명) 학생평균계산 메쏘드 호출(3명) 학생평점계산 메쏘드 호출(3명)
		 */

		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
	}
}
