package A_Study;

public class Array {
	public static void main(String[] args) {
		
		/*
		 * int[] array = new int[50]; for (int i = 0; i < array.length; i++) { array[i]
		 * = 2 * i + 1; System.out.println(array[i]); } System.out.println(array);
		 * 
		 * int a = 1; for (int i = 1; i < 100; i++){ a =
		 * ++a;//++��ǰ���������ڱ��ݣ������100��++�ں��ȱ��ݣ��������������1��ÿ�θ�ֵ���Ǳ��ݵ�ֵ }
		 * System.out.println(a);
		 */
		int[] a = {1,2};
        int[] b = {3,4};
        int[] c = a;
        a = b;
        b = c;
        for (int v : a){
            System.out.println(v);
        }
        for (int v : b){
            System.out.println(v);
        }
	}
}
