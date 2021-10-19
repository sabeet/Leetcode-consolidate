class concatenation-of-array {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];

        for(int i=0; i<nums.length*2; i++){
            if(i < nums.length){
                ans[i] = nums[i];
            }
            else if(i > nums.length - 1 && i<nums.length*2){
                ans[i] = nums[i - nums.length];
            }
        }
        return ans;
    }
}