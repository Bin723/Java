package exercise2;

public class hw2 {
	public static void main(String[] args) {
		int blood=1,hurt=1;
		for(int i=0;i<5;i++)
		{
			blood=blood+hurt;
			blood=blood/2;
		}
		System.out.println(blood);
	}
}
