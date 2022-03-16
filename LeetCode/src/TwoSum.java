import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

        TwoSum leetCode = new TwoSum();
        int[] nums = new int[]{2, 7, 11, 15};

        System.out.println(leetCode.twoSum(nums, 9));

    }


    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
        for(int i = 0; i < numbers.length; i++){
            Integer requiredNum = (Integer)(target - numbers[i]);
            if(indexMap.containsKey(requiredNum)){
                int toReturn[] = {indexMap.get(requiredNum), i};
                return toReturn;
            }

            indexMap.put(numbers[i], i);
        }
        return null;
    }

}
