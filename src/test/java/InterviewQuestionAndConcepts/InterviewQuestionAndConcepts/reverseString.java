package InterviewQuestionAndConcepts.InterviewQuestionAndConcepts;

public class reverseString {

	public static void main(String[] args) {
		String str = "Sudha";
		//withString Builder
		System.out.println("using String builder "+new StringBuilder(str).reverse());
		
		//withput StringBuilder
		char[] charAr = str.toCharArray();
		char[] charAr2 =  new char[charAr.length];
		int index =charAr.length-1;
		int i =0;
		
		while(index>=0) {
			charAr2[i]=charAr[index];
			index--;
			i++;
		}
		String rev = new String(charAr2);
		System.out.println("Without stringBuilder "+rev);
	}

}
