class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for(int eachIndex : hours) {
            if(eachIndex >= target) count++;
        }
        return count;
    }
}