
public class main {

	public static void main(String[] args) {
				CList<String> s = new CList<String>();
				
				s.insert("pear"); s.insert("cherry");
				s.insert("orange"); s.insert("apple");
							s.pritn();
							System.out.print(": s의 길이 = "+s.size()+"\n");
							
							s.delete();
							s.pritn();
							System.out.print(" : s의 길이 = "+s.size()); System.out.println();
							

	}

}
