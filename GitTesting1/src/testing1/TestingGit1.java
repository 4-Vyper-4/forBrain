package testing1;

public class TestingGit1 {

	public String toString() {
		return "Java is awesome";
	}
	
	 public static String reverse(String s) {
	      if (s.length()>0)
	      return s.substring(s.length()-1)+reverse(s.substring(0, s.length()-1));
	      return "";
	    }
	 
	 public static int reverseInt(int i) {
	        if (i/10>=1) {
	          return Integer.parseInt(""+i%10+reverseInt(i/10));
	        }
	        return i%10;
	      }

	public static void main(String[] args) {

		TestingGit1 t = new TestingGit1();

		System.out.println(t.toString());

		System.out.println("working");
		System.out.println((String) null);
		System.out.println((Object) null);

		System.out.println("hey");

		System.out.println(t.toString());

		System.out.println("working");
		System.out.println((String) null);

		System.out.println("working");
		System.out.println("Am - Big - You - Us");
		System.out.println("stop with the writing, start with the practice");
		System.out.println(t.reverse("Jonny stop cd cd cd all the time in Git"));
// your wrong, you can learn to walk without writing it down, stop giving yourself a handicap		
//		System.out.println("Thats my way of learning SIR");
		System.out.println("Thank you brothers");
		System.out.println(t.reverseInt(56738363));
	}
}