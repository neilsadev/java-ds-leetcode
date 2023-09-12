class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int len = operations.length;
        int output = 0;
        for (int i = 0; i<len; i++) {
            if (operations[i].contains("++")){
                output++;
            } else {
                output--;
            }
        }
        return output;
    }
}