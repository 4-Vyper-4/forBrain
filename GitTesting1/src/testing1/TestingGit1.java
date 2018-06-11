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
		System.out.println("Thats my way of learning SIR");
	}
}