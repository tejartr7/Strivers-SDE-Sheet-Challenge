#include <bits/stdc++.h> 

bool comp(pair<int,int>&a,pair<int,int>&b)
{
     return ((double) a.second / a.first) > ((double) b.second / b.first);
}
double maximumValue (vector<pair<int, int>>& items, int n, int w)
{
    double ans=0;
    sort(items.begin(),items.end(),comp);
    for (int i=0;i<n;i++)
    {
        if (items[i].first<=w)
        {
            ans+=items[i].second;
            w-=items[i].first;
        }
        else {
            double temp= (double)(w/(double)items[i].first)*(double)(items[i].second);
            ans+=temp;
            break;
        }
    }
    return ans;
}
