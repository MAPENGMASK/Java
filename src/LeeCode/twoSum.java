package LeeCode;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(nums.length);

        int[] result = new int[2];
        for(int i = 0;i < nums.length;i++)
            for(int j = i + 1;j < nums.length;j++){
                if(nums[j] + nums[i] == 9){
                    result[0] = i;
                    result[1] = j;
                }
            }
        System.out.println(result[0]+","+result[1]);
        System.out.println(Integer.MIN_VALUE);
    }

}
