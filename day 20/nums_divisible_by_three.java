import java.util.ArrayList;

public class nums_divisible_by_three {
    public static int Minimumops(int nums[]){
        ArrayList<Integer> ops = new ArrayList<>(nums.length);

        for(int i = 0; i < nums.length; i++){
            int remainder = nums[i] % 3;
            if (remainder == 1) {
                nums[i] -= 1;
            } else if (remainder == 2) {
                nums[i] += 1;
            }
            ops.add(nums[i]);
        }

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != ops.get(i)) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int nums[] = {3, 6, 9};
        int modifycount = Minimumops(nums);
        System.out.println(modifycount);
    }
}
