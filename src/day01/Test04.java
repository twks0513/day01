package day01;

import java.util.Scanner;

/*
[�ڷ���(type)]
�̸�	ũ��	     ����

(������)
byte  	1byte	-128 ~ 127
short  	2byte	-32768 ~ 32767
int	4byte	-2,147,483,648 ~ 2,147,483,647 

(�Ǽ���)
float	4byte	��3.4 * 10^-37 ~ ��3.4 * 10^-38
double	8byte	��1.7 * 10^-307 ~ ��1.7 * 10^-308

(������)
char 	1byte	-128 ~ 127

(��Ÿ)
void	���� ���� �ʴ� Ư���� ������ �� 
*/
public class Test04 {

	public static void main(String[] args) {
		int age = 25; // int : ����(��,���) ǥ��
		double weight = 55.0; // �Ǽ� ǥ��
		double height = 160.0;
		
		System.out.println("���� ���̴�"+age+"��");
		System.out.println("���� Ű��"+weight+"cm");
		System.out.println("���� �����Դ�"+height+"kg");
		
		// char :  ���� �Ѱ��� ǥ���� �� ���
		// ���� �� ���� '' ���� ����ǥ�� ǥ���ؾ��Ѵ�
		char ch = 'A'; 
		
		System.out.println("���� �� : "+ch);		
		
		ch = 'B';
		
		System.out.println("���� �� : "+ch);
		
		System.out.println("���� : "+(ch+32));
		System.out.println("���� : "+(char)(ch+32));
		System.out.println("���� : "+(double)(ch+32));
		
		System.out.println(1.111);
		System.out.println((int)12.111);
		
		String str = "ȫ�浿";
		System.out.println(str + "�� �ȳ��ϼ���");
		str = "�谳��";
		System.out.println("�̸� ���� : " + str);
				
	}

}
