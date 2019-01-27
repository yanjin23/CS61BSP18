public class Ex3{
    /** Returns the maximum value from m using a for loop. */
    public static int forMax(int[] m){
		int largerNum = m[0];
		for (int i = 1; i < m.length; i += 1){
			if (largerNum < m[i]){
					largerNum = m[i];
			}
		}
        return largerNum;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};   
		System.out.println(forMax(numbers));
    }
}