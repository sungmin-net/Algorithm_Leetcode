// https://leetcode.com/problems/positions-of-large-groups/

class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        ArrayList<LargeGroup> groups = new ArrayList<LargeGroup>();
        char prev = S.charAt(0);
        int run = 1;
        for (int i = 1 ; i < S.length() ; i++) {
            char cur = S.charAt(i);
            if (prev == cur) {
                run++;
                continue;
            } else {
                if (run >= 3) {
                    groups.add(new LargeGroup(prev, i - run, i - 1));
                }
                run = 1;
                prev = cur;
            }
        }
        if (run >= 3) { // consider last run
            groups.add(new LargeGroup(prev, S.length() - run, S.length() - 1));
        }

        for (LargeGroup g : groups) {
            ArrayList<Integer> e = new ArrayList<Integer>();
            e.add(g.start);
            e.add(g.end);
            ret.add(e);
        }

        return ret;

    }

    public static class LargeGroup {
        char c;
        int start;
        int end;
        public LargeGroup(char c, int start, int end) {
            this.c = c;
            this.start = start;
            this.end = end;
        }
    }
}