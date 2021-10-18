class remove-element {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){ //if i is not equal to val
                nums[count] = nums[i]; //then let current value
                count++; //and iterate
            }
            //because this happens whenever the cursor is not equal to val
            //we increment count, counting all the numbers that aren't val
        }
        return count; //thus, being able to return count
    }
}