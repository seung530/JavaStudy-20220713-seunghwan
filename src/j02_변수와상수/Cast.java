package j02_변수와상수;

public class Cast {

	public static void main(String[] args) {

		char a = '가';          // 문자-정수-실수 (upcasting) 의 경우 명시할 필요 없음
		int b = a;              // char의 경우 int로만 변환 가능(ex. double로 불가능)
		double c = b;
		
		System.out.println(a);
		System.out.println(b);  //출력된 65는 유니코드임(아스키아님)
		System.out.println(c);
		
		int d = (int) c;        // 실수-정수-문자 (down casting) 의 경우 명시해야함
		char e = (char) d; 
		
		System.out.println(d);
		System.out.println(e);
		

	}

}
