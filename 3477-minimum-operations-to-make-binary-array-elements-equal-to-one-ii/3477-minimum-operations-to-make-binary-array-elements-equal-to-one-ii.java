class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int i = 0;
        
        while (i < n) {
              if (nums[i] == 0 && ans%2==0) {
                 
                 if (i + 1 < n && nums[i + 1] == 0 && ans%2==0) {
                    ans = ans + 1;
                    i++;
                }
                
                  else if(i+1<n) {
                    ans = ans + 1;
                }
                   else{
                        ans++;
                        return ans;
                      }
            } 
            if (nums[i] == 1 && ans%2==1) {
                 
                 if (i + 1 < n && nums[i + 1] == 1 && ans%2==1) {
                    ans = ans + 1;
                    i++;
                }
                
                  else if(i+1<n) {
                    ans = ans + 1;
                }
                   else{
                        ans++;
                        return ans;
                      }
            } 
            else if (nums[i] == 0 && ans%2==1)
                i++;
            else if(nums[i]==1 && ans%2==0) {
                i++;
            }
            
        }
        
        return ans;
    }
}
