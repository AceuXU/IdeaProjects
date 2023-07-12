import java.util.*;


public class collectiondsintf {

        public static void main(String[] args) {
            Collection<Integer> nums = new TreeSet<Integer>();
            nums.add(72);
            nums.add(124);
            nums.add(182);
            nums.add(212);

            Iterator<Integer> values = nums.iterator();







            for (int n : nums) {

                System.out.println(nums);
            }
        }
    }


