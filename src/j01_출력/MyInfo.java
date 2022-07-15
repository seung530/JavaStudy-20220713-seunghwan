package j01_출력;

public class MyInfo {

	public static void main(String[] args) {
		char name1 = '이';  //char : 한글자만 가능
		char name2 = '승';
		char name3 = '환';
		
		int age = 36;
		
		String address = "부산시 부산진구";
		String name = "이승환";
		
		System.out.print("이름: ");
		System.out.println("" + name1 + name2 + name3);
		System.out.print("나이: ");
		System.out.println(age);
		System.out.print("주소: ");
		System.out.println("부산시 부산진구");
		System.out.println();
		
		System.out.print("이름: ");
		System.out.println(name);        //String으로 선언했기 때문에 문자열로 포함 X
		System.out.print("나이: ");
		System.out.println(age);
		System.out.print("주소: ");
		System.out.println(address);     //String으로 선언했기 때문에 문자열로 포함 X
		System.out.println();
		
		System.out.print("이름: ");
		System.out.println("이승환");
		System.out.print("나이: ");
		System.out.println(age);
		System.out.print("주소: ");
		System.out.println("부산시 부산진구");
		System.out.println();
		
		
		}

}
