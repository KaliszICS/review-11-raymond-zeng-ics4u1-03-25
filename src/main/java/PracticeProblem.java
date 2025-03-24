public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int[] createIntArray(){
		int[] list = new int[5];
		for (int i = 0; i < 5; i++)
		{
			list[i] = i + 1;
		}
		return list;
	}
	public static String[] createArray(String word1, String word2, String word3, String word4){
		String[] array = new String[4];
		array [0] = word1;
		array [1] = word2;
		array [2] = word3;
		array [3] = word4;
		return array;
	}
	public static int findValue(int num, int[] array){
		for (int i = 0;i < array.length;i++){
			if (array[i] == num){
				return i;
			}
		}
		return -1;
	}
	public static int findThirdValue(String word, String[] array){
		int x = 0;
		for (int i = 0;i < array.length;i++){
			if (word.equals(array[i])){
				x += 1;}
				if (x == 3){
					return i;
				}
			}
			return -1;
	}
}

