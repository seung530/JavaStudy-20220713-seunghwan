package j03_연산자;

// Ctrl + space -> 자동완성

public class Operation2 {

	public static void main(String[] args) {
		
		int num = 50;
		
		System.out.println(++num);  // 선증가
		System.out.println(num);
		System.out.println(num++);  // 후증가 : 다음 명령에서 증가 적용
		System.out.println(num);    // -> 현재 행의 ++num 과 같은 효과
		
		System.out.println(--num);  
		System.out.println(num);
		System.out.println(num--);  
		System.out.println(num);    
		

	}

}
