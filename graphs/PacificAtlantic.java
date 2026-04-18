import java.util.*;

public class PacificAtlantic {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length, n = heights[0].length;
        boolean[][] pac = new boolean[m][n], atl = new boolean[m][n];
        for (int i = 0; i < m; i++) { dfs(heights, pac, i, 0, m, n); dfs(heights, atl, i, n-1, m, n); }
        for (int j = 0; j < n; j++) { dfs(heights, pac, 0, j, m, n); dfs(heights, atl, m-1, j, m, n); }
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (pac[i][j] && atl[i][j]) res.add(Arrays.asList(i, j));
        return res;
    }

    private void dfs(int[][] h, boolean[][] visited, int r, int c, int m, int n) {
        visited[r][c] = true;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        for (int[] d : dirs) {
            int nr = r+d[0], nc = c+d[1];
            if (nr>=0 && nr<m && nc>=0 && nc<n && !visited[nr][nc] && h[nr][nc] >= h[r][c])
                dfs(h, visited, nr, nc, m, n);
        }
    }
}
