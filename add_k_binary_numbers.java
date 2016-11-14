package facebook;

import java.util.LinkedList;
import java.util.Queue;

public class add_k_binary_numbers {
	
	public static String addBinary(String[] strs)
	{
		if(strs.length==0||strs==null) return "";
		StringBuilder sb = new StringBuilder();
		Queue<String> q = new LinkedList<>();
		for(String str: strs)
		{
			if(str.length()>0)
			{
				q.add(str);
			}
		}
		int sum =0;
		while(!q.isEmpty())
		{
			int size = q.size();
			
			for(int i =0; i < size;i++)
			{
				String temp = q.poll();
				char c = temp.charAt(temp.length()-1);
				if(temp.length()>1)
				{
					q.add(temp.substring(0, temp.length()-1));
				}
				sum+=(c-'0');	
			}
			sb.append(sum%2);
			sum=sum/2;
		}
		while(sum!=0)
		{
			sb.append(sum%2);
			sum=sum/2;
		}
		return sb.reverse().toString();
	}
	
	public static void main(String[] args)
	{
		String[] test1 = {"11110",
						 "11000",
				         "11001"};
		System.out.println(addBinary(test1));
		String[] test2 = {"1111",
						  "1000",
						"111111"};
		
		System.out.println(addBinary(test2));
		String[] test3 = {"11111100111",
							"1",
							"100111001",
							"111",
							"1"};
		System.out.println(addBinary(test3));
	}
}
