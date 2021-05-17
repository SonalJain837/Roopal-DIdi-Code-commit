
public class Reverse_String_program {

	public static void main(String[] args) {
		// Reverse a string program.
		
		String s="Roopal";
		//char ns=null;
		
		/*System.out.println(s.length());
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
        */
		
		StringBuffer sb=new StringBuffer(s);     // if u didn't give s in argument then use below line
		//sb.append(s);
		sb.reverse();
		
		System.out.println("reverse = " + sb.toString());
	}

}
