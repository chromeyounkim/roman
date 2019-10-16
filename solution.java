class Solution {
    public String intToRoman(int num) {
        return calcIntToRoman2(num);
    }
    
    public static String calcIntToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int times = 0;
        String[] romans = new String[] { "I", "IV", "V", "IX", "X", "XL", "L",
                "XC", "C", "CD", "D", "CM", "M" };
        int[] ints = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500,
                900, 1000 };
        for (int i = ints.length - 1; i >= 0; i--) {
            times = num / ints[i];
            num %= ints[i];
            while (times > 0) {
                sb.append(romans[i]);
                times--;
            }
        }
        return sb.toString();
   }
}


Algorithm:
1. Take a decimal number as input.
2. Create a table that looks up each symbol of roman numeral for the integer value it represents.
3. Compare a given number with the values in the order of 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1.
4. Divide the number by its largest value and append its equivalent roman number to result string.
5. Repeat the step 4 until quotient becomes 0.
6. Repeat the step 3 - 5 until all integer values representing the symbol of roman numerals are compared.

Explanation:
Step 1:
 initial number = 1500
 Divide by 1000. Quotient is 1. Remainer is 0. Append 'M' to result string.
  
Step 2:
  Number is 500 because 1500 % 1000 is 500.
  Divide by 900. Quotient is 0. Remainder is 0. So continue.
 
Step 3:
  Number is 500.
  Divide by 500. Quotient is 1. Remainer is 0. Append 'D' to result string.
   
Step 4:
  Run until all integer values representing the symbol of roman numerals are compared. And the algorithm stops.
    
Run time: O(n) as run time is linear to an input value.
Space complexity: O(n) as the amount of space will increase depending on input value.
