class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        List<Map.Entry<Integer, Integer> > li = new ArrayList<Map.Entry<Integer, Integer> >(map.entrySet());
        Collections.sort(li, new Comparator<Map.Entry<Integer, Integer> >() {
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                    if(o1.getValue() == o2.getValue())
                        return o2.getKey() - o1.getKey();
                    else
                        return o2.getValue() - o1.getValue();
                }
            });
        for(int i = 0; i < k; i++) {
            ans[i] = li.get(i).getKey();
        }
        return ans;
    }
}