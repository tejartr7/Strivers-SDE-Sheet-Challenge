public class Solution
{

    public static boolean valid(int i,int j,int m,int n)
    {
        return i>=0 && i<m && j>=0 && j<n;
    }
    public static void dfs(int i,int j,int p,int q,int image[][],boolean vis[][])
    {
        int m=image.length,n=image[0].length;
        if(!valid(i,j,m,n) || vis[i][j]) return ;
        if(image[i][j]==p)
        {
            image[i][j]=q;
            vis[i][j]=true;
            dfs(i+1,j,p,q,image,vis);
            dfs(i-1,j,p,q,image,vis);
            dfs(i,j+1,p,q,image,vis);
            dfs(i,j-1,p,q,image,vis);
        }
    }
    public static int[][] floodFill(int[][] image, int x, int y, int newColor)
    {
        // Write your code here
        int i,j,m=image.length,n=image[0].length;
        boolean vis[][]=new boolean[m][n];
        dfs(x,y,image[x][y],newColor,image,vis);
        return image;
    }
}

