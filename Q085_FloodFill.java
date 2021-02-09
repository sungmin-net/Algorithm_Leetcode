// https://leetcode.com/problems/flood-fill/

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        boolean[][] isVisited = new boolean[image.length][image[0].length];
        int targetColor = image[sr][sc];
        Stack<Pixel> stack = new Stack<Pixel>();
        stack.push(new Pixel(sr, sc));
        while (!stack.isEmpty()) {
            Pixel p = stack.pop();
            isVisited[p.r][p.c] = true;
            image[p.r][p.c] = newColor;
            // up
            if (p.r - 1 >= 0 && !isVisited[p.r - 1][p.c] && image[p.r-1][p.c] == targetColor) {
                stack.push(new Pixel(p.r-1, p.c));
            }
            // down
            if (p.r + 1 < image.length && !isVisited[p.r + 1][p.c] && image[p.r+1][p.c] == targetColor) {
                stack.push(new Pixel(p.r+1, p.c));
            }
            // left
            if (p.c - 1 >= 0 && !isVisited[p.r][p.c - 1] && image[p.r][p.c - 1] == targetColor) {
                stack.push(new Pixel(p.r, p.c - 1));
            }
            // right
            if (p.c + 1 < image[0].length && !isVisited[p.r][p.c + 1] && image[p.r][p.c + 1] == targetColor) {
                stack.push(new Pixel(p.r, p.c + 1));
            }
        }
        return image;                
    }

    private static class Pixel {
        int r;
        int c;
        public Pixel(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
}