import java.util.Arrays;
class ArrayCopy{
	public static void main(String[] args){
		int[] a={12,3,4,5,61,2};
		int[] c=new int[5];
		int[] b=new int[a.length];
		System.arraycopy(a,0,b,0,a.length);
		System.out.println("b="+Arrays.toString(b));
		System.arraycopy(a,2,c,1,2);
		System.out.println("c="+Arrays.toString(c));
	}
}
