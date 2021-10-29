//https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
//961. N-Repeated Element in Size 2N Array
class n-repeated-element-in-size-2n-array {
    public int repeatedNTimes(int[] nums) {

            int n = (nums.length/2);

            //collect array elemnt distinctly and frequency to hashmap
            HashMap<Integer, Integer> hm = new HashMap<>();
            for(int i=0; i<nums.length;i++){
                if(hm.containsKey(nums[i])){
                    hm.put(nums[i], hm.get(nums[i]) + 1);
                }
                else{
                    hm.put(nums[i], 1);
                }
            }

            for (Map.Entry<Integer, Integer> pair : hm.entrySet()) {
                if(pair.getValue() == n){
                    return pair.getKey();
                }
            }

            return 0;

            }
    }
//note: look into sets to do this more efficiently