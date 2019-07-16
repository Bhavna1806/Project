package Lab9;

	import java.util.*;

	public class Exercise3 {
		public static Map<Integer, Integer> getSquares(int array[]) 
		{
			Map <Integer,Integer> map = new HashMap<Integer,Integer>();
			int len = array.length;
				for(int i = 0 ; i < len; i++ )
				{
					map.put(array[i], array[i]*array[i]);
				}
			return map;
		}
		public static void main(String[] args) {
			System.out.println("Enter the number of elements:");
			Scanner scan = new Scanner(System.in);
			int length = scan.nextInt();
			int inputArray[] = new int[length];
			System.out.println("The characters are:-");
			for(int i = 0; i<length ; i++)
			{
				inputArray[i] = scan.nextInt();
			}
			Map<Integer, Integer> newmap=getSquares(inputArray);
			System.out.println("the map is\n"+newmap);
			scan.close();
		}
		
	}
