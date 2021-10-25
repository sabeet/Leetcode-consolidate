//https://leetcode.com/problems/decompress-run-length-encoded-list/
//1313. Decompress Run-Length Encoded List
class decompress-run-length-encoded-list {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();

        for(int j=0; j<nums.length;j+=2){
            int val  = nums[j+1];
            for(int k=0; k<nums[j]; k++){
                al.add(val);
            }
        }

        int[] ans = new int[al.size()];

        for(int i=0; i<al.size();i++){
            ans[i] = al.get(i);
        }

        return ans;
    }
}