public class Solution {
    public int[] plusOne(int[] digits) {
    	int flag = 0;
    	int len = digits.length;
    	for (int i = len-1; i >= 0; i--) {
    		int sum = (i == len-1) ? (digits[i]+1+flag) : (digits[i]+flag);
    		digits[i] = sum % 10;
			  flag = sum / 10;
    	}
    	if (flag == 0) return digits;
    	else {
    		int[] res = new int[len+1];
    		for (int i = 0; i < len; i++)
    			res[i+1] = digits[i];
    		res[0] = 1;
    		return res;
    	}
    }
}
