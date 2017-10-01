
public class Cats {
	private int numPaws;
	private String name;
	static int numinstance;

	public void Cats(int numPaws, String name) {

	}

	public int getnumPaws() {
		return this.numPaws;
	}

	public void setnumPaws(int numPaws) {
		System.out.println("Your cat has " + numPaws + " paws.");
		this.numPaws = numPaws;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		System.out.println("His/her name is " + name + " .");
		this.name = name;
	}

	public static void thing() {
		System.out.println("This works!");
	}
}
