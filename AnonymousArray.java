package Prarray;

public class AnonymousArray {
		public static void main(String[] args)
		{
			int[] a=new int[]{10,20,30};
			AnonymousArray.sum(a);
		}
	public	static void sum(int[] no)
		{
			int total=0;
			for(int i:no)
			{
				total=total+i;
			}
			System.out.println("sum is "+total);
		}
}
