package Lab9;
	import java.util.*;

	public class Exercise1 {

		public static void main(String[] args) {
			Map<Integer,String> map = new HashMap<Integer,String>();
			System.out.println("Enter Number of Elements:-");
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			
			for(int i = 0; i<n;i++)
			{
				System.out.println("Enter id of "+i+" Element");
				int id = scan.nextInt();
				System.out.println("Enter name of "+i+" Element");
				String data = scan.next();
				map.put(id, data);
			}
			
			List<String> sortedList = getValues(map);
			System.out.println("The values in hashmap in sorted order");
			for(String temp : sortedList) {
				System.out.println(temp);
			}
			
			scan.close();
		}

		private static List<String> getValues(Map<Integer, String> map) {
			Collection<String> c = map.values();
			List<String> list = new ArrayList<String>(c);
			Collections.sort(list);
			return list;
		
		}
}
