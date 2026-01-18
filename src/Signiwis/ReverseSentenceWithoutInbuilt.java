package Signiwis;
//imp
public class ReverseSentenceWithoutInbuilt {
    public static void main(String[] args) {

        String input = "Java Concept of The Day";
        String word = "";
        for(int i=input.length()-1;i>=0;i--) {
        	char ch=input.charAt(i);
        	if(word !=" ") {
        		word=ch+word;
        	}else {
        		
        		System.out.println(word);
        		word="";
        	}
        }
        System.out.println(word);

    }
}

