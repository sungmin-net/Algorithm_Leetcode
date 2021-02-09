// https://leetcode.com/problems/groups-of-special-equivalent-strings/

class Solution {
    public int numSpecialEquivGroups(String[] A) {
        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList(A));
        ArrayList<Permutation> permutations = new ArrayList<Permutation>();
        int numGroups = 0;

        while(!wordList.isEmpty()) {
            String currentWord = wordList.get(0);
            wordList.remove(0);
            Permutation currentPermutation = new Permutation(currentWord);
            boolean hasSame = false;
            for(Permutation p : permutations) {
                if (currentPermutation.oddLetters.equals(p.oddLetters)
                        && currentPermutation.evenLetters.equals(p.evenLetters)) {
                    p.words.add(currentWord);
                    hasSame = true;
                }
            }
            if (!hasSame) {
                permutations.add(currentPermutation);
                numGroups++;
            }
        }

        return numGroups;        
    }
    public static class Permutation {
        ArrayList<String> words = new ArrayList<String>();
        HashSet<Character> oddLetters;
        HashSet<Character> evenLetters;

        public Permutation(String word) {
            words.add(word);
            oddLetters = getOddLettersHashSet(word);
            evenLetters = getEvenLettersHashSet(word);
        }
    }

    public static HashSet<Character> getOddLettersHashSet(String word) {
        HashSet<Character> ret = new HashSet<Character>();
        for (int i = 1 ; i < word.length() ; i += 2) {
            ret.add(word.charAt(i));
        }
        return ret;
    }

    public static HashSet<Character> getEvenLettersHashSet(String word) {
        HashSet<Character> ret = new HashSet<Character>();
        for (int i = 0 ; i < word.length() ; i += 2) {
            ret.add(word.charAt(i));
        }
        return ret;
    }
}