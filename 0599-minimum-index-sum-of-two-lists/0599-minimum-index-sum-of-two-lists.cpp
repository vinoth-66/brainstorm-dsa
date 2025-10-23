class Solution {
public:
    vector<string> findRestaurant(vector<string>& list1, vector<string>& list2) {
        unordered_map<string,int> map;
        for(int i=0;i<list2.size();i++){
            map[list2[i]]=i;
        }
        int min=INT_MAX;
        vector<string> list;
        for(int i=0;i<list1.size();i++){
            if (map.find(list1[i])!=map.end()) {
                int j = map[list1[i]];
                int sum = i + j;
                if (sum < min) {
                    min = sum;
                    list.clear();
                    list.push_back(list1[i]);
                } else if (sum == min) {
                    list.push_back(list1[i]);
                }
            }
        }
        vector<string> ans(list.size());
        for(int i=0;i<list.size();i++){
            ans[i]=list[i];
        }
        return ans;
    }
};