package com.itwill01.method;

public class Student {
	/*
	 * #### 성적처리를 위한 필요한 학생객체를 만들기 위한 클래스
	 */

	

	/*
	 * << 속성(멤버변수) >> 번호 이름 국어 영어 수학 총점 평균 평점 석차 << 기능(멤버메쏘드) >>
	 * 기본데이타입력,총점계산,평균계산,평점계산, 출력
	 */

	//    필드 선언   

	int no;   
	String name;
	int kor;
	int eng;
	int math;
	int plus;
	double avg;
	char grade;
	int rank;

	
	 void BaseData(int no, String name, int kor, int eng, int math) {
		// 학생 기 본 데이타 메쏘드
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		return;
	}

	 



	// 총점 메소드드드
	void plus() {
		this.plus = this.kor + this.eng + this.math;
		return;
	}

	// 평균   메소드드드
	void avg() {
		this.avg = (double) this.plus / 3;
		return;
	}

	// 평점     메소드드드
	void grade() {
		if (this.avg > 90 && this.avg <= 100) {
			this.grade = 'A';
		}

		if (this.avg > 80 && this.avg <= 90) {
			this.grade = 'B';
		}

		if (this.avg > 70 && this.avg <= 80) {
			this.grade = 'C';
		}

		if (this.avg > 60 && this.avg <= 70) {
			this.grade = 'D';
		}

		if (this.avg > 0 && this.avg <= 60) {
			this.grade = 'F';
		}
		return;
	}

	//출력 메소  드드
	void print() {
		System.out.printf("-----------------학생성적출력-------------------\n");
		System.out.printf("학번  이름   국어 영어 수학 총점 평균   평점 석차\n" );			
		System.out.printf("%2d %4s %4d %2d %3d %3d %6.1f %2c %3d\n",this.no,this.name,this.kor,this.eng,this.math,this.plus,this.avg,this.grade,this.rank);	
		
	}
}
	// 멤버메쏘드 선언
	/*
	 * 기본데이타(번호,이름,국어,영어,수학)멤버변수에대입하는메쏘드
	 */

	/*
	 * 총점계산메쏘드
	 */

	/*
	 * 평균계산메쏘드
	 */

	/*
	 * 평점계산메쏘드
	 */

	/*
	 * 출력메쏘드
	 */

