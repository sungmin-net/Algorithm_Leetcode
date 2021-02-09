// https://leetcode.com/problems/number-of-recent-calls/

class RecentCounter {

    ArrayList<Integer> calls = null;
    public RecentCounter() {
        calls = new ArrayList<Integer>();
    }

    public int ping(int t) {
        if (t != 0) {
            calls.add(t);
        }

        int ret = 0;
        for (int i = 0 ; i < calls.size() ; i++) {
            if (t - 3000 <= calls.get(i)) {
                ret++;
            }
        }

        while (calls.size() > 0 && calls.get(0) < t - 3000) {
            calls.remove(0);
        }

        return ret;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */