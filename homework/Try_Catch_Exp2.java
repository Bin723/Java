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
		System.out.println("���������±�Խ�쳣��catch���鲶׽���쳣��");
		System.out.println("������쳣Ϊ��"+e);
	}catch (ArithmeticException e1) {
		System.out.println("������Ϊ0");
		System.out.println("��׽���쳣Ϊ��"+e1);
	}
	finally {
		System.out.println("�����������~��");
	}
	}
}