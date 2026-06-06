class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        if(nums.empty()) return 0;
        sort(nums.begin(),nums.end());
        int curr=nums[0];
        int res=1,streak=0,i=0;
        while(i<nums.size()){
            if(nums[i]!=curr){
                curr=nums[i];
                streak=0;
            }
            while(i<nums.size() && nums[i]==curr){
                i++;
            }
            curr++;
            streak++;
            res=max(res,streak);
        }
        return res;
    }
};
