package assignments;

public class Occurrence {

	public static void main(String[] args) {
		String str = "This is my new java learning session and i am enjoying it!";
		char ch[] = str.toCharArray();
		int k=0;
		while (k<str.length()) {
			if (ch[k]=='i'){
				System.out.println(k);
			}
			k++;
		}
		System.out.println("--------------------------");
		int strLen = str.length();
		System.out.println("Length of string = "+strLen);
		int j = 0;
		while(j < strLen) {
			if(str.charAt(j) == 'i') {
				System.out.println(j);
			}
			j++;
		}
	}
}
