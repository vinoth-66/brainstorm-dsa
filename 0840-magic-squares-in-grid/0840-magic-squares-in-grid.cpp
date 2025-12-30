class Solution {
public:
    int numMagicSquaresInside(vector<vector<int>>& grid) {
        int ans = 0;
    int r = grid.size();
    int c = grid[0].size();

    for (int i = 0; i < r - 2; i++) {
        unordered_set<int> set;

        for (int j = 0; j < c - 2; j++) {

            if (grid[i][j] < 1 || grid[i][j] > 9 ||
                grid[i][j+1] < 1 || grid[i][j+1] > 9 ||
                grid[i][j+2] < 1 || grid[i][j+2] > 9 ||
                grid[i+1][j] < 1 || grid[i+1][j] > 9 ||
                grid[i+1][j+1] < 1 || grid[i+1][j+1] > 9 ||
                grid[i+1][j+2] < 1 || grid[i+1][j+2] > 9 ||
                grid[i+2][j] < 1 || grid[i+2][j] > 9 ||
                grid[i+2][j+1] < 1 || grid[i+2][j+1] > 9 ||
                grid[i+2][j+2] < 1 || grid[i+2][j+2] > 9)
                continue;

            set.insert(grid[i][j]);   set.insert(grid[i][j+1]);   set.insert(grid[i][j+2]);
            set.insert(grid[i+1][j]); set.insert(grid[i+1][j+1]); set.insert(grid[i+1][j+2]);
            set.insert(grid[i+2][j]); set.insert(grid[i+2][j+1]); set.insert(grid[i+2][j+2]);

            if (set.size() < 9) continue;

            int r1 = grid[i][j]   + grid[i][j+1]   + grid[i][j+2];
            int r2 = grid[i+1][j] + grid[i+1][j+1] + grid[i+1][j+2];
            int r3 = grid[i+2][j] + grid[i+2][j+1] + grid[i+2][j+2];

            int c1 = grid[i][j]   + grid[i+1][j]   + grid[i+2][j];
            int c2 = grid[i][j+1] + grid[i+1][j+1] + grid[i+2][j+1];
            int c3 = grid[i][j+2] + grid[i+1][j+2] + grid[i+2][j+2];

            int d1 = grid[i][j]   + grid[i+1][j+1] + grid[i+2][j+2];
            int d2 = grid[i][j+2] + grid[i+1][j+1] + grid[i+2][j];

            if (r1 == r2 && r1 == r3 &&
                r1 == c1 && r1 == c2 && r1 == c3 &&
                r1 == d1 && r1 == d2)
                ans++;

            set.clear();
        }
    }
    return ans;
    }
};