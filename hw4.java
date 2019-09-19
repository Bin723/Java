package exercise4;
import java.util.Random;
public class hw4 {
	public static void main(String[] args) {
		String str1[]={"992 ","520 ","1314 "};
		String str2[]={"teacher ","doctor ","student "};
		String str3[]= {"Sun Li","Zhao Qiang","Wang Mazi"};
		Random ra=new Random();
		int i=ra.nextInt(2)+0;
		int j=ra.nextInt(2)+0;
		int k=ra.nextInt(2)+0;
		System.out.println(str1[i]+str2[j]+str3[k]);
	}
}
