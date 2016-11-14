package facebook;

import java.util.ArrayList;
import java.util.List;

public class addSum {
	public static void main(String[] args) {
	    System.out.println(combination(4));
	}
	public static List<List<Integer>> combination(int n) {
	    List<List<Integer>> res = new ArrayList<>();
	    for(int i =0; i < 26; i++)
	    {
	    	char temp = (char) ('a' + i);
	    	System.out.println(temp);
	    }
	    combination(res, new ArrayList<>(), n, 1);
	    return res;
	}
	private static void combination(List<List<Integer>> res, List<Integer> cur, int n, int start) {
	    if (n == 0) {
	        res.add(new ArrayList<>(cur));
	    } else {
	        for (int i = start; i <= n; ++i) {
	            cur.add(i);
	            combination(res, cur, n - i, i);
	            cur.remove(cur.size() - 1);
	        }
	    }
	}

}
