
public class extraxtNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1abc2x30yz67";
		
		String s1=s.replaceAll("[^0-9]", ""); 	
		
		System.out.println(s1);
	}

}
