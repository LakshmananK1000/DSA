class LinearSearch{
	public static void main(String[] args)
	{
		int[] arr = {2,7,4,8,5,3,10};
		int target=10;
		int ans = linear(arr,target);
		System.out.println("Index :"+ans);
	}
	static int linear(int[] arr, int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				return i;
			}
			else
			{
				continue;
			}
		}
		return -1;
	}
}
