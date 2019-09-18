package exercise3;

public class hw3 {
	public static void main(String[] args) {
		String str1="bottles of beer",str2="bottle of beer";
		String str3="on the wall",str4="Take one down";
		String str5="Pass it around",str6="No more bottles of beer on the wall";
		for(int i=99;i>0;i--) {
			if(i==2) {
				System.out.println(i+str1+str3+i+str1);
				System.out.println(str4);
				System.out.println(str5);
				System.out.println((i-1)+str2+str3);
				}
			else if(i==1) {
				System.out.println(i+str2+str3+i+str2);
				System.out.println(str4);
				System.out.println(str5);
				System.out.println(str6);
			}
			else {
			System.out.println(i+str1+str3+i+str1);
			System.out.println(str4);
			System.out.println(str5);
			System.out.println((i-1)+str1+str3);
		}
	}
  }
}
