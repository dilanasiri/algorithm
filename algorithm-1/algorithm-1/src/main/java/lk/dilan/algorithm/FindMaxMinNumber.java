package lk.dilan.algorithm;

public class FindMaxMinNumber {
    public static void main(String[] args) {
        int[] nums={-5,10,29,65,56,-58,8,59,-25,99,-258};
        int max=nums[0];
        int min=nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max<nums[i]){
                max=nums[i];
            } else if (min>nums[i]) {
                min=nums[i];
            }

        }
        System.out.println("Max number is "+max+ " And Min number is "+min);

    }
}
