
// Question Link :- https://leetcode.com/problems/total-distance-traveled/

class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
         int totalDistance = 0;
        int mileage = 10;
        
        while (mainTank > 0) {
            int fuelToConsume;

            if (mainTank >= 5) {
                fuelToConsume = 5;
            } else {
                fuelToConsume = mainTank;
            }

            totalDistance += fuelToConsume * mileage;
            mainTank -= fuelToConsume;

            if (fuelToConsume == 5 && additionalTank > 0) {
                mainTank += 1;
                additionalTank -= 1;
            }
        }
        
        return totalDistance;
    }
}