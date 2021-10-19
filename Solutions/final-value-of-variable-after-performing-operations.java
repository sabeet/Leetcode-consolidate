class final-value-of-variable-after-performing-operations {
    public int finalValueAfterOperations(String[] operations) {
        int output = 0;
        String decPre = "--X";
        String decPost = "X--";
        String incPre = "++X";
        String incPost = "X++";
        for(int i=0; i<operations.length; i++){
            if(decPre.equals(operations[i]) || decPost.equals(operations[i])){ output--; }
            else if(incPre.equals(operations[i]) || incPost.equals(operations[i])){ output++; }
        }

        return output;
    }
}