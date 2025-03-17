import java.util.*;
class ArrayDividePairs {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }
        
        for (int count : counter.values()) {
            if (count % 2 != 0) {
                return false;
            }
        }        
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        ArrayDividePairs solution = new ArrayDividePairs();
        boolean result = solution.divideArray(nums);
        
        System.out.println("Can the array be divided into pairs? " + result);
        
        sc.close();
    }
}