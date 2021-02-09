// https://leetcode.com/problems/minimum-index-sum-of-two-lists/

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<CommonMenu> commonList = new ArrayList<CommonMenu>();
        for (int i = 0 ; i < list1.length ; i++) {
            for (int j = 0 ; j < list2.length ; j++) {
                if (list1[i].equals(list2[j])) {
                    commonList.add(new CommonMenu(list1[i], i+j));
                }
            }
        }
        int minIdx = Integer.MAX_VALUE;
        for (CommonMenu menu : commonList) {
            minIdx = Math.min(minIdx, menu.indexSum);
        }
        ArrayList<String> retList = new ArrayList<String>();
        for (CommonMenu cm : commonList) {
            if (cm.indexSum == minIdx) {
                retList.add(cm.menu);
            }
        }
        return retList.toArray(new String[ retList.size() ]);
    }
    private static class CommonMenu {
        String menu;
        int indexSum;
        public CommonMenu(String menu, int indexSum) {
            this.menu = menu;
            this.indexSum = indexSum;
        }
    }    
}