class Solution {
    public int[] evenOddBit(int n) {
        String s = Integer.toBinaryString(n);
        int l = s.length();
        int e=0,o=0;
        for(int i=0;i<l;i++){
            if(s.charAt(i) == '1'){
                int b = l-1-i;
                if(b%2 == 0)
                    e++;
                else
                    o++;     
            }
        }
        return new int[]{e,o};
    }
}

class Solution {
    public int[] evenOddBit(int n) {
        return new int[]{Integer.bitCount(n & 0b0101010101),
                         Integer.bitCount(n & 0b1010101010)};
    }
}