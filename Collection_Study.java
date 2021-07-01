import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Collection_Study {
	/**
	 * 아래 내용을 class에 넣으시고, 왜 에러가 나는지, 그리고 예외처리를 만들어보세요
	 * @param args
	 */
	public static void main(String[] args) {
		try {
		int [] array = new int[10];
		array[20] = 5;
		} catch(ArrayIndexOutOfBoundsException e)  {
			System.out.println(e);
		}
}	
	
	/**
	 * 1. int type의 2차원 배열을 생성해주세요. 요소는 5개 이상 넣어주세요.
	 * 2. 해당 배열을 출력하는 메소드를 만들어주세요.
	 * 3. 해당 클래스 파일 실행 시 2차원 배열에 담겨져 있는 요소들이 출력되면 성공!
	 * @param args
	 */
	public static void main3(String[] args) {
		// 1.
		int[][] arr = new int[][] {
			{1,2,3},
			{4,5,6},
			{7,8,9},
			{10,11,12}
		};
		
		// 2.
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("arr[" + i + "][" + j + "] : " + arr[i][j]);
			}
		}
	}
	
	/**
	 * - Collection : Map
	 * 1. Key의 Type은 String, value의 타입은 integer인 hashmap 생성
	 * 2. 1에서 만든 hashmap에 값을 5개 이상 추가해주세요.
	 * 3. hashmap 의 요소들을 출력하는 메소드를 작성해주세요
	 * 4. 해당 클래스 파일 실행 시, hashmap에 담겨져 있는 요소들이 출력 되면 성공!
	 * @param args
	 */
	public static void main2(String[] args) {
		// 1.
		Map<String,Integer> map = new HashMap<>();
		
		// 2.
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		map.put("e", 5);
		
		// 3.
		System.out.println("key() : "+ map.keySet());
		System.out.println("value() : "+ map.values());
		
		// 4. 
		Set<String> maps = map.keySet();
		for(String printmap : maps) {
			System.out.println("key : " + printmap);
		}
		Collection<Integer> value = map.values();
		for(Integer printValue : value) {
			System.out.println("value : " + printValue);
		}
		
	}
	
	
	/**
	 * - Collection : ArrayList
     * 1. String type의 배열을 2개 만드세요. (배열의 요소는 각각 5개씩으로 집어넣고, 안의 값은 자유롭게 쓰세요.)
     * 2. ArrayList를 하나 만들어서 1에서 만든 배열 2개를 Arraylist에 추가해주세요.
     * 3. ArrayList에 담겨져있는 값를 알려주는 출력 메소드 하나, Arraylist의 값을 출력해주는 메소드 하나 만들어주세요.
     * 4. 해당 클래스 파일 실행 시, Arraylist에 담겨져 있는 요소의 갯수와 요소의 값이 출력되면 성공!
	 * @param args
	 */
	public static void main1(String[] args) {
		// 1.
		String[] memberList = {"a","b","c","d","e"};
		String[] memberNo = {"1","2","3","4","5"};

		for(int index = 0; index < memberList.length; index++) {
			System.out.print(memberList[index]);
		}
		System.out.println();
		
		for(int index = 0; index < memberNo.length; index++) {
			System.out.print(memberNo[index]);
		}
		System.out.println();
		// 2.
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(memberList));
		list.addAll(Arrays.asList(memberNo));
	
		//3.
		System.out.println("list 갯수 : " + list.size());
		
		//4.
		
		for(String lists : list) {
			System.out.println(lists);
			
		}
	
	}
	

}
