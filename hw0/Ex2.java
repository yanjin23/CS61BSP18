public class Ex2{
	/** Returns the maximum value from m. */
	public static int max(int[] m){
		int i = 1;
		int largerNum = m[0];
		while(i < m.length){
			if (m[i] > largerNum){
					largerNum = m[i];
			}
			i = i + 1;
		}
		return largerNum;
	}
	public static void main(String[] args){
		int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
		System.out.println(max(numbers));
	}
}