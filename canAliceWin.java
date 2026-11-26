class Solution {
    public boolean canAliceWin(int n) {
        int[] stones = {19, 15, 11, 7, 3};
        for(int s : stones){
            if(n >= s){
                n -= s;
            }else{
                return n >= (s/2 + 1);
            }
        } 
        return true;
    }
}