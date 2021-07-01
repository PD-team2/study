import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Remember {

	public static void main(String[] args) {
		/**
		 * - Collection : ArrayList
	     * 1. String type의 배열을 2개 만드세요. (배열의 요소는 각각 5개씩으로 집어넣고, 안의 값은 자유롭게 쓰세요.)
	     * 2. ArrayList를 하나 만들어서 1에서 만든 배열 2개를 Arraylist에 추가해주세요.
	     * 3. ArrayList에 담겨져있는 값를 알려주는 출력 메소드 하나, Arraylist의 값을 출력해주는 메소드 하나 만들어주세요.
	     * 4. 해당 클래스 파일 실행 시, Arraylist에 담겨져 있는 요소의 갯수와 요소의 값이 출력되면 성공!
		 * @param args
		 */
		String[] arrS1 = {"김*리", "조*현", "황*아", "최*원", "김*현"};
		String[] arrS2= {"팀장", "스타벅스", "대한항공", "유튜브", "NC"};
	
		for(int index = 0; index < arrS1.length; index++) {
			System.out.print("arrS1 : " + arrS1[index] + " ");
		}
		System.out.println();
		for(int index = 0; index < arrS2.length; index++) {
			System.out.print("arrS2 : " + arrS2[index] + " ");
		}
		
		ArrayList<String> list = new ArrayList<String>();
		list.addAll(Arrays.asList(arrS1));
		list.addAll(Arrays.asList(arrS2));
		
		System.out.println("\nlist 사이즈 : " + list.size());
		
		for(String printList : list) {
			System.out.println(printList);
		}
	
		
		/**
		 * - Collection : Map
		 * 1. Key의 Type은 String, value의 타입은 integer인 hashmap 생성
		 * 2. 1에서 만든 hashmap에 값을 5개 이상 추가해주세요.
		 * 3. hashmap 의 요소들을 출력하는 메소드를 작성해주세요
		 * 4. 해당 클래스 파일 실행 시, hashmap에 담겨져 있는 요소들이 출력 되면 성공!
		 * @param args
		 */
		Map<String,Integer> map = new HashMap<>();
		map.put("다나카", 33);
		map.put("라마카", 35);
		map.put("하나카", 31);
		map.put("바나카", 30);
		map.put("자나카", 37);
		
		
		// 전체 출력
		System.out.println(map);
		// 특정 키값에 대한 벨류값 출력
		System.out.println("다나카의 value : " + map.get("다나카"));
		// 모든 키값
		System.out.println(map.keySet());
		// 모든 벨류값
		System.out.println(map.values());
		
		for(Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("key : " + entry.getKey() + " ,value : " + entry.getValue());
		}
		
		for(String printKey : map.keySet()) {
			System.out.println(printKey);
		}
		
		for(Integer printValue : map.values()) {
			System.out.println(printValue);
		}
		
		
		/**
		 * 1. int type의 2차원 배열을 생성해주세요. 요소는 5개 이상 넣어주세요.
		 * 2. 해당 배열을 출력하는 메소드를 만들어주세요.
		 * 3. 해당 클래스 파일 실행 시 2차원 배열에 담겨져 있는 요소들이 출력되면 성공!
		 * @param args
		 */
		int [][] arr = new int[5][5];
		int num = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				arr[i][j] = num++;
				System.out.println("index [" + i + "," + j + "] : " + arr[i][j]);
			}
		}
		
		
	}

	
	
}
