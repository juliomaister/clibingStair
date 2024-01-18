package clibingStair;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		int value = 2;
		System.out.println(climbStairs(value) == 2);
		value = 14;
		System.out.println(climbStairs(value));
		System.out.println(climbStairs(value) == 610);
		

	}
    public static int climbStairs(int n) {
        int count = 1;
        int previus = 1; 
        int temp;
        for(int i = n - 1; i > 0; i--) {
        	temp = count;
        	count = count + previus;
        	previus = temp;
        }
        return count;
    }

}
