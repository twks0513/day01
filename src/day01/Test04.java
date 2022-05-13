package day01;

import java.util.Scanner;

/*
[자료형(type)]
이름	크기	     범위

(정수형)
byte  	1byte	-128 ~ 127
short  	2byte	-32768 ~ 32767
int	4byte	-2,147,483,648 ~ 2,147,483,647 

(실수형)
float	4byte	±3.4 * 10^-37 ~ ±3.4 * 10^-38
double	8byte	±1.7 * 10^-307 ~ ±1.7 * 10^-308

(문자형)
char 	1byte	-128 ~ 127

(기타)
void	값을 갖지 않는 특수한 데이터 형 
*/
public class Test04 {

	public static void main(String[] args) {
		int age = 25; // int : 정수(음,양수) 표현
		double weight = 55.0; // 실수 표현
		double height = 160.0;
		
		System.out.println("나의 나이는"+age+"살");
		System.out.println("나의 키는"+weight+"cm");
		System.out.println("나의 몸무게는"+height+"kg");
		
		// char :  문자 한개를 표현할 때 사용
		// 문자 한 개는 '' 작은 따옴표로 표현해야한다
		char ch = 'A'; 
		
		System.out.println("변경 전 : "+ch);		
		
		ch = 'B';
		
		System.out.println("변경 후 : "+ch);
		
		System.out.println("연산 : "+(ch+32));
		System.out.println("연산 : "+(char)(ch+32));
		System.out.println("연산 : "+(double)(ch+32));
		
		System.out.println(1.111);
		System.out.println((int)12.111);
		
		String str = "홍길동";
		System.out.println(str + "님 안녕하세요");
		str = "김개똥";
		System.out.println("이름 변경 : " + str);
				
	}

}
