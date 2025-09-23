class Solution {
public:
    int compareVersion(string version1, string version2) {
        vector<int> v1;
        vector<int> v2;
        string t1;
        string t2;
        stringstream s1(version1);
        stringstream s2(version2);

        while(getline(s1,t1,'.')){
            v1.push_back(stoi(t1));
        }

        while(getline(s2,t2,'.')){
            v2.push_back(stoi(t2));
        }

        int l1=v1.size(),l2=v2.size();
        int i=0,j=0;
        while(i<l1 || j<l2){
            if(i>=l1){
                int b=v2[j];
                if(0>b) return 1;
                else if(b>0) return -1;
                j++;
            }
            else if(j>=l2){
                int a=v1[i];
                if(a>0) return 1;
                else if(0>a) return -1;
                i++;
            }
            else{
                int a=v1[i];
                int b=v2[j];
                if(a>b) return 1;
                else if(b>a) return -1;
                i++;
                j++;
            }
        }
        return 0;
    }
};