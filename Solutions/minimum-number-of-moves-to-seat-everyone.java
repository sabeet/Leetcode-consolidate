//https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/
//2037. Minimum Number of Moves to Seat Everyone
class minimum-number-of-moves-to-seat-everyone {
public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        //by sorting them out, you get students always choosing the lowest seat moved. both arrays map to each other lowest to greatest
        //thus the difference is minimal. That difference is the number of moves
        int count = 0;

        for(int i=0; i<seats.length; i++){
            count += Math.abs(seats[i] - students[i]);
        }

        return count;
    }
}