class Solution {
    public int[] sol3(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            if(map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
                return new int[] {map.get(target - nums[i]), i};
            }
            else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
    public int[] sol2(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            map.put(nums[i], i);
        }
        for(int i = 0; i < n; i++) {
            if(map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
                return new int[] {map.get(target - nums[i]), i};
            }
        }
        return null;
    }
    public int[] sol1(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
    public int[] twoSum(int[] nums, int target) {
        return sol2(nums, target);
    }
}