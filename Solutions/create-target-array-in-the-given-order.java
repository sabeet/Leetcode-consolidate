//https://leetcode.com/problems/create-target-array-in-the-given-order/
//1389. Create Target Array in the Given Order
class create-target-array-in-the-given-order {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        int i = 0, k = 0;
        while (i < index.length) {
            for (k = target.length - 1; k > index[i]; k--)
                target[k] = target[k - 1];
            target[index[i]] = nums[i];
            i++;
        }
        return target;
    }

}

//this is not my solution
//need to understand this later