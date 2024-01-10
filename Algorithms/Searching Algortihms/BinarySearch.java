public class BinarySearch{
	public static void main(String[] args)
	{
		int[] arr = {1,2,4,6,8};
		int target = 8;
		int ans = binarysearch(arr,target);
		System.out.println("Index :"+ans);
	}
	public static int binarysearch(int[] arr, int target)
	{
		int start=0;
		int end= arr.length-1;
		while(start<=end)
		{
			int mid= start+(end-start)/2;
			if(arr[mid] > target)
			{
				end = mid-1;
			}
			else if(target > arr[mid])
			{
				start = mid+1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}
}