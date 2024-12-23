/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algorithm;

import java.util.HashMap;

/**
 *
 * @author Admin
 */
public class Algorithm {

    /**
     * @param args the command line arguments
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int search = target - nums[i];
            if (maps.containsKey(search)) {
                return new int[]{maps.get(search), i};
            }
            maps.put(nums[i], i); 
        }
        return null; 
    }

    public static void main(String[] args) {

        Algorithm algorithm = new Algorithm();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = algorithm.twoSum(nums, target);

        // Print the result
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }

}
