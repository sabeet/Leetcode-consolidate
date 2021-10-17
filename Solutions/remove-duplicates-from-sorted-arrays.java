class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        int count = 0; //the walker
        for(int i = 1; i < nums.length; i++){ //the walker a step ahead
            if(nums[i] != nums[count]){// if walker a step ahead is not the same as walker
                count++;
                nums[count] = nums[i]; // then walker's value is now the value of the walker one step ahead
            }
        }

        return count + 1; //walker's value is off by one so add one
    }
}