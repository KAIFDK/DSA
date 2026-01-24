class Solution {
    public int majorityElement(int[] nums) {
        //KAIFDK
        HashMap<Integer,Integer> hash = new HashMap();

        int maj = 0;
        int res = 0;

        for(int n : nums){
            hash.put(n,1 + hash.getOrDefault(n,0));
            if(hash.get(n) > maj){
                res = n;
                maj = hash.get(n);
            }
        }
        return res;
    }
}