import java.util.ArrayList;
public class PascalTriangle {
    public static void main(String[] args) {
        int num = 16;
        int[] nums = new int[1];
        ArrayList<Integer> prevNum = new ArrayList<>();
        num--;
        for (int i = 0; i < num; i++) {
            System.out.print(i > 0? "Line " + (i+2) + ": " : "Line " + (i+1) + ": ");
            if (i == 0) {
                nums[0] = 1;
                System.out.println(1);
            } else {
                prevNum = new ArrayList<>();
                for (int k = 0; k < nums.length; k++) {
                    prevNum.add(nums[k]);
                }
                prevNum.add(1);
                nums = new int[i+1];
                nums[0] = 1;
                if (nums.length != 1) {
                    for (int j = 1; j < nums.length; j++) {
                        if (prevNum.size() != j) {
                            nums[j] = prevNum.get(j-1)+prevNum.get(j);
                        } else {
                            nums[nums.length-1] = 1;
                            break;
                        }
                    }   
                }
            }

            System.out.print(i == 0? "Line 2: " : "");
            for (int l = 0; l < nums.length; l++) {
                System.out.print(nums[l] + " ");
            }
            System.out.print("1\n");
        }
    }
}
