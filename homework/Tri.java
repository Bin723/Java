package exercise6;

import java.util.Scanner;

public class Tri {

	public static void main(String[] args) {
		try {
			System.out.println("�������һ���߳���");
			Scanner input=new Scanner(System.in);
			float n1=input.nextFloat();
			System.out.println("������ڶ����߳���");
			Scanner input2=new Scanner(System.in);
			float n2=input2.nextFloat();
			System.out.println("������������߳���");
			Scanner input3=new Scanner(System.in);
			float n3=input3.nextFloat();
			if((n1<(n2+n3))&&(n2<(n1+n3))&&(n3<(n1+n2))) {
				float girth=n1+n2+n3;
				float c=girth/2;
				double area;
				area=Math.sqrt(c*(c-n1)*(c-n2)*(c-n3));
				System.out.println("�������ε��ܳ�Ϊ��"+girth);
				System.out.println("�������ε����Ϊ��"+area);
			}
			else {int m=1/0;}
		}catch(Exception e) {
			System.out.println("�ñ߳�������������");
		}
		return;
	}
 }
