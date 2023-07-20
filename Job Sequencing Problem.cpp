#include <bits/stdc++.h> 

static bool cmp(const vector<int>& a, const vector<int>& b){
    return a[1] > b[1];
}


int jobScheduling(vector<vector<int>> &jobs)
{
    // Write your code here
    sort(jobs.begin(), jobs.end(), cmp);
    int cntProfit = 0;

    //find the max deadline
    int maxDead = -1, n = jobs.size();
    for(int i=0; i<n; i++){
        maxDead = max(maxDead, jobs[i][0]);
    }
    int ans = 0;
    vector<int> slot(maxDead+1, -1);
    for(int i=0; i<n; i++){
        for(int j=jobs[i][0]; j>0; j--){
            if(slot[j] == -1){
                slot[j] = i;
                cntProfit += jobs[i][1];
                break;
            }
        }
    }
    return cntProfit;

}
