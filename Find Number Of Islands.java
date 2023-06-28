public class Solution 
{
    static int cnt=0;
    public static boolean valid(int i,int j,int m,int n)
    {
        return i>=0 && i<m && j>=0 && j<n;
    }
    public static void dfs(int i,int j,boolean vis[][],int mat[][])
    {
        int m=mat.length,n=mat[0].length;
        if(!valid(i,j,m,n) || vis[i][j]) return ;
        if(mat[i][j]==1)
        {
            vis[i][j]=true;
            for(int r=-1;r<=1;r++)
            {
                for(int c=-1;c<=1;c++)
                {
                    dfs(i+r,j+c,vis,mat);
                }
            }
        }
    }
    public static int getTotalIslands(int[][] mat) 
	{
        //Your code goes here
        cnt=0;
        int i,j,m=mat.length,n=mat[0].length;
        boolean vis[][]=new boolean[m][n];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(!vis[i][j] && mat[i][j]==1)
                {
                    cnt++;
                    dfs(i,j,vis,mat);
                }
            }
        }
        return cnt;
    }
}
