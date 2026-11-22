class Solution {
    public int addDigits(int num) {
        while(num > 9){
            int n = 0;
            while(num > 0){
                int d = num%10;
                n += d;
                num /= 10;
            }
            num = n;
        }
        return num;
    }
}

/* 
class Solution {
    public int addDigits(int num) {
        if (num == 0)
            return 0;
        if (num % 9 == 0)
            return 9;
        return num % 9;
    }
}
*/