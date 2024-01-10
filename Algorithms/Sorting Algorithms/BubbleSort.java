import java.util.Arrays;
public class BubbleSort{
	public static void main(String[] args)
	{
		int[] arr = {8,2,5,3,6,4,1};
		bubble(arr);
	}
	static void bubble(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length;j++)
			{
				if(arr[j]<arr[j-1])
				{
					int temp = arr[j-1];
					arr[j-1]= arr[j];
					arr[j]= temp;
				}
			}
		}
		System.out.println("Array After Sorted :"+Arrays.toString(arr));
	}
}