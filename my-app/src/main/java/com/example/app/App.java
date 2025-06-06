package com.example.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    


    // Set<List<Integer>> array = new HashSet<>();  
    //     int i=0,j=1,k=2;

    //         while(i<j)
    //         {

    //             while(k<nums.length-1){

    //                 if(nums[i]+nums[j]+nums[k]==0)
    //                 {
    //                     array.add(List.of(nums[i],nums[j],nums[k]));   
    //                     j++;
    //                 }
    //                 k++;
    //             }
            
    //             while(j<nums.length-2){
    //                 if(nums[i]+nums[j]+nums[k-1]==0){
    //                     array.add(List.of(nums[i],nums[j],nums[k-1]));
    //                     i++;   
    //                 }
    //                 j++;
    //             }
    //             if(nums[i]+nums[j-1]+nums[k-1]==0){
    //             array.add(List.of(nums[i],nums[j-1],nums[k-1]));

    //             }


    //             i++;
    //         }
    // return new ArrayList<>(array);
    // }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum > 0) {
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                }
            }
        }
        return res;
    }


    public static void main( String[] args )
    {
        
    }
}
