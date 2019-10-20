package exercise6;

import java.util.Scanner;

public class Tri {

	public static void main(String[] args) {
		try {
			System.out.println("请输入第一条边长：");
			Scanner input=new Scanner(System.in);
			float n1=input.nextFloat();
			System.out.println("请输入第二条边长：");
			Scanner input2=new Scanner(System.in);
			float n2=input2.nextFloat();
			System.out.println("请输入第三条边长：");
			Scanner input3=new Scanner(System.in);
			float n3=input3.nextFloat();
			if((n1<(n2+n3))&&(n2<(n1+n3))&&(n3<(n1+n2))) {
				float girth=n1+n2+n3;
				float c=girth/2;
				double area;
				area=Math.sqrt(c*(c-n1)*(c-n2)*(c-n3));
				System.out.println("该三角形的周长为："+girth);
				System.out.println("该三角形的面积为："+area);
			}
			else {int m=1/0;}
		}catch(Exception e) {
			System.out.println("该边长构不成三角形");
		}
		return;
	}
 }
