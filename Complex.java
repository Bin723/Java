package exercise5;
import java.util.Scanner;
public class Complex {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("�������һ������ʵ�����鲿");
	double real1=input.nextDouble();
	double image1=input.nextDouble();
	System.out.println("������ڶ�������ʵ�����鲿");
	double real2=input.nextDouble();
	double image2=input.nextDouble();
	add complex=new add(real1,real2,image1,image2);
	System.out.println(complex.add1()+"+"+complex.add2()+"i");
	}
}