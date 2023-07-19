int calculateMinPatforms(int at[], int dt[], int n) {
    // Write your code here.
    sort(at, at+n);
    sort(dt, dt+n);

    int currPlatformsUsed = 1, maxPlatformsUsed = 1;

    int i = 1, j = 0; // i points to next arrival, j points to departure

    while(i<n && j<n){
        if(at[i] <= dt[j]){
            currPlatformsUsed++;
            i++;

            maxPlatformsUsed = max(maxPlatformsUsed,currPlatformsUsed);
        }else{
            currPlatformsUsed--;
            j++;
        }
    }

    return maxPlatformsUsed;
}
