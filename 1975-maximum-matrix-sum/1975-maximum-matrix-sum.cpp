class Solution {
public:
    long long maxMatrixSum(vector<vector<int>>& matrix) {
        int m=INT_MAX,c=0,f=0;
        long long s=0;
        for(int i=0;i<matrix.size();i++){
            for(int j=0;j<matrix[0].size();j++){
                if(matrix[i][j]<0){
                    c++;
                    s+=abs(matrix[i][j]);
                }
                else if(matrix[i][j]==0) f=1;
                else s+=matrix[i][j];
                m=min(m,abs(matrix[i][j]));
            }
        }
        if(c==0 || c%2==0 || f==1) return s;
        return s-m-m;
    }
};