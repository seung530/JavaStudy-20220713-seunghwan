package j04_문자열;

public class String1 {

	public static void main(String[] args) {
		
		String address = "부산시 동래구 사직동";
	
		// index : 문자열에서 해당 문자열의 값을 찾아 위치를 알려줌
		int index1 = address.indexOf("동");
		int index2 = address.lastIndexOf("동");
		
		System.out.println(index1);
		System.out.println(index2);
		
		
		// substring : 해당 문자열에서 번위를 지정하여 문자열을 잘라줌
		// ~부터 ~전까지의 범위
		String subAddress1 = address.substring(index1, index2 + 1);
		String subAddress2 = address.substring(index1);  
		
		System.out.println(subAddress1);
		System.out.println(subAddress2);

		
		// replace : 해당 문자열을 찾아서 다른 문자열로 바꿔주는 기능
		String replaceAddress = address.replace(' ', '-');
		System.out.println(replaceAddress);
		
		replaceAddress = address.replaceAll(" ", "-");
	    System.out.println(replaceAddress);
	    
	    
	    String phoneNumbers = "010/9988/1916, 010/1234/5678";
	    String rePhone = phoneNumbers.replaceAll("010", "011");
	    System.out.println(rePhone);
	    
	    rePhone = rePhone.replaceAll("/", "-");	    
	    System.out.println(rePhone);
	    
	    rePhone = rePhone.replaceAll(", ", "/");
	    System.out.println(rePhone);
	    
	    
	    String rePhone2 = phoneNumbers.replaceAll("010", "011")
	    		.replaceAll("/", "-")
	    		.replaceAll(", ", "/");
	    System.out.println(rePhone2);
	    
	    
	    
	}

}
