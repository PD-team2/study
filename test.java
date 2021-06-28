
public class test {

	public static void main(String[] args) {
		try {
		int [] array = new int[10];
		array[20] = 5;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
//		Collection_Study.main3(args);
//		Collection_Study.main2(args);
//		Collection_Study.main1(args);


	}

}
