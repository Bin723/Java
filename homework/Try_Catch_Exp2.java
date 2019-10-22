package exercise7;

public class Try_Catch_Exp2 {
	public static void main(String[] args) {
		int a=5,b=0,c[]= {1,2,3,4,5};
		try {
			System.out.println("Before throw");
			if(b==0) throw(new ArithmeticException());
		    int m=a/b;
		    if(a>4) throw(new ArrayIndexOutOfBoundsException());
			int n=a/b;
		    System.out.println(a/b);
	}catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("处理数组下标越异常的catch语句块捕捉了异常！");
		System.out.println("捕获的异常为："+e);
	}catch (ArithmeticException e1) {
		System.out.println("被除数为0");
		System.out.println("捕捉的异常为："+e1);
	}
	finally {
		System.out.println("程序运行完毕~！");
	}
	}
}