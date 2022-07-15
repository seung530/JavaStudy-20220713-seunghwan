package j03_연산자;

// 연산은 결과가 있다

/* 논리연산
 * 
 * AND 연산(&&) : 곱
 * true && true => true
 * true && false => false
 * false && false => false
 * 
 * 
 * OR 연산(||) : 합
 *  
 * 
 * NOT 연산(!) : 부정
 * 
 * 
*/
public class Operation1 {

	public static void main(String[] args) {
		boolean result = 10 != 5;
		boolean result2 = 10 == 10;
				
		System.out.println("" + result + result2);  // boolean 끼리는 연산 불가        
		
		

	}

}
