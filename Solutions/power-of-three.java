class power-of-three {
    public boolean isPowerOfThree(int n) {
        if(n < 1){ //if n is less than 1, return false because 3/3 = 1 and anything less than that would not work
            return false;
        }

        while(n%3 == 0){ //while n is divisible by 3
            n /= 3;      //divide n by 3
        }

        if(n == 1){ //when n is 1, return true
            return true;
        }
        //otherwise, return false
        return false;
    }
}