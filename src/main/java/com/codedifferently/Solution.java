package com.codedifferently;

import java.util.Map;

public class Solution {
    /**
     * You will be given an integer called number and an array called possibleFamilyMembers
     * your jobs is to find the number's family members. A family member is any value that's with in
     * 1 of any other number in the family.
     *
     * So for example if the number = 4, and the possibleFamilyMembers is [1,4,3,5]
     * The actualFamilyMembers would be [3,4,5]
     * 3 is 1 away from 4
     * 4 is equal to 4
     * 4 is 1 away from 5
     * while
     * 1 is not included because the closest releation to 1 is 3 and that's 2 away.
     * @param number
     * @param possibleFamilyMembers
     * @return
     */
    public Integer[] numberFamily(Integer number, Integer[] possibleFamilyMembers){
        // Make variables nearNumber and aheadNumber
        // Set conditions to see if Integer number has numbers close to them by using >= or <=
        // Use a for loop to go through the possibleFamilyMembers from left to right
            // If nearNumber and aheadNumber values that are closer to number
                // grab the values and group them in the new list
        // return the list of possible family members

        int nearNumber = 0;
        int aheadNumber = 0;

        for (int i = number; i < possibleFamilyMembers.length-1; i++){
            int currentNum = possibleFamilyMembers[number];
            if (currentNum >= i-1){
                number = nearNumber;
            }
            if (currentNum <= i+1){
                number = aheadNumber;
            }
        }
        return null;
    }
}
