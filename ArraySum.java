class ArraySum{
	public static void main(String[] args){
		int[] num={12,2,3,45,67,8,91};
		int sum=0;
		for(int number:num){
			sum+=number;
		}
		int arrlen=num.length;
		double average=(sum/arrlen);
		System.out.println("Sum of array=" + sum);
		System.out.println("Average of array=" + average);
	}
}
