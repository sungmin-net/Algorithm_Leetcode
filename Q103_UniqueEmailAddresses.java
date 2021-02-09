// https://leetcode.com/problems/unique-email-addresses/

class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> validEmailSet = new HashSet<String>();
        for (String email : emails) {
            System.out.println(email);
            String[] tokens = email.split("@");
            if (tokens[0].contains("+")) {
                tokens[0] = tokens[0].substring(0, tokens[0].indexOf("+"));
            }
            if (tokens[0].contains(".")) {
                tokens[0] = tokens[0].replaceAll("\\.", "");
            }

            if (tokens[0].length() != 0) {
                validEmailSet.add(tokens[0] + "@" + tokens[1]);
            }
                
        }
        System.out.println(validEmailSet);

        return validEmailSet.size();        
    }
}