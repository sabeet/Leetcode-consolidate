//https://leetcode.com/problems/flipping-an-image/
//832. Flipping an Image
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        for(int i=0; i<image.length; i++){
            image[i] = flipTheBits(reverseIntArray(image[i]));
        }
        return image;
    }

    public int[] reverseIntArray(int[] arr){
        int temp;
        int start = 0;
        int end = arr.length - 1;

        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return arr;
    }

    public int[] flipTheBits(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                arr[i] = 9;
            }
            else if(arr[i] == 1){
                arr[i] = 8;
            }
        }

        for(int j=0; j<arr.length; j++){
            if(arr[j] == 9){
                arr[j] = 1;
            }
            else if(arr[j] == 8){
                arr[j] = 0;
            }
        }
        return arr;
    }
}