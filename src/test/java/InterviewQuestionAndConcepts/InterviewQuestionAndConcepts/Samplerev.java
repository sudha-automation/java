package InterviewQuestionAndConcepts.InterviewQuestionAndConcepts;

public class Samplerev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Vaishu";
		//rev using STrin Builder
		System.out.println(new StringBuilder(str).reverse().toString());
	//withput stringBuilder
		
		char []Ar = str.toCharArray();
		System.out.println(Ar);
		char[] RevAr = new char[Ar.length];
		System.out.println(RevAr);
		int lengthOfArr = Ar.length;
		int RevV = 0;
		String rev = "";
		for (int i =lengthOfArr-1;i>=0;i-- ) {
			//RevAr[RevV] = Ar[i];
			//RevV++;
			System.out.println(Ar[i]);
			rev = rev+Ar[i];
			
		}
		System.out.println(rev);
		
		 
	}

}
