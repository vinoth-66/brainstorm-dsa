class Solution {
public:
    bool canPartitionGrid(vector<vector<int>>& grid) {
        int r=grid.size();
        int c=grid[0].size();
        vector<long long>rpre(r);
        vector<long long> cpre(c);
        long long tot=0;
        rpre[0]=0;
        for(int i=0;i<r;i++){
            long long s=0;
            for(int j=0;j<c;j++){
                s+=grid[i][j];
            }
            tot+=s;
            if(i==0) rpre[i]=s;
            else rpre[i]=rpre[i-1]+s;
        }
        for(int j=0;j<c;j++){
            long long s=0;
            for(int i=0;i<r;i++){
                s+=grid[i][j];
            }
            if(j==0) cpre[j]=s;
            else cpre[j]=cpre[j-1]+s;
        }
        for(int i=0;i<r;i++){
            if(rpre[i]==tot-rpre[i]) return true;
        }
        for(int j=0;j<c;j++){
            if(cpre[j]==tot-cpre[j]) return true;
        }
        return false;
    }
};