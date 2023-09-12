class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        //for loop
        //take middle char
        //if + 44-43 = 1 and if - 44-45 = -1
        for(String o : operations) x += (44 - o.charAt(1));
        return x;
    }
}