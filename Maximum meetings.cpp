int maximumMeetings(vector<int> &start, vector<int> &end)

{

    // Write your code here.

    int n=start.size();

    vector<pair<int,int>> meetings;

    for(int i=0;i<n;i++){

        meetings.push_back({end[i],start[i]});

    }

 

    sort(meetings.begin(),meetings.end());

 

    int maxmeetings=1;

    int prevEnd=meetings[0].first;

    for(int i=1;i<n;i++){

        if(prevEnd<meetings[i].second){

            maxmeetings++;

            prevEnd=meetings[i].first;

        }

    }

 

    return maxmeetings;

}

