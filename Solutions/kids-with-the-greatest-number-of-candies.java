class kids-with-the-greatest-number-of-candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        List<Boolean> bList = new ArrayList<>();
        for(int i=0; i<candies.length; i++){
            if(candies[i]>=max){
                max = candies[i];
            }
        }

        for(int j=0; j<candies.length; j++){
            candies[j] += extraCandies;
            if(candies[j] >= max){
                bList.add(true);
            }
            else{
                bList.add(false);
            }
        }
        return bList;
    }
}