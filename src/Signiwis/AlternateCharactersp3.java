package Signiwis;

public class AlternateCharactersp3 {

	public static void main(String[] args) {
	String input="MADARA UCHIHA";
	String result="";
	for(int i=0;i<input.length();i+=2) {
		char ch=input.charAt(i);
		result=result+ch;
		
	}
	System.out.println(result);
	}

}
