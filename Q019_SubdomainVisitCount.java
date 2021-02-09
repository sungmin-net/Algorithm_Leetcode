// https://leetcode.com/problems/subdomain-visit-count/

class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String s : cpdomains) {
            String[] split = s.split(" ");
            int visits = Integer.valueOf(split[0]);
//            System.out.println("count : " + visits);
            String domain = split[1];
//            System.out.println("domain : " + domain);
            while (domain != null) {
                addDomainAndVisits(map, domain, visits);
                domain = getParentDomain(domain);
            }
        }

        // build return
        ArrayList<String> ret = new ArrayList<String>();
        StringBuffer buf = new StringBuffer();
        for (String key : map.keySet()) {
            buf.setLength(0); // clear
            buf.append(map.get(key)).append(" ").append(key);
            ret.add(buf.toString());
        }

        return ret;
    }
    
    public static String getParentDomain(String domain) {
        // snip the first word and dot.
        if (!domain.contains(".")) {
            return null;
        }
        String[] words = domain.split("\\."); // Node! .split(".") doesn't work


        StringBuffer buf = new StringBuffer();
        for (int i = 1 ; i < words.length ; i++) {  // skip words[0]
            buf.append(words[i]);
            if (i != words.length - 1) {
                buf.append(".");
            }
        }
        return buf.toString();
    }

    public static void addDomainAndVisits(HashMap<String, Integer> map, String domain, Integer visits) {
        if (map.containsKey(domain)) {
            map.replace(domain, map.get(domain) + visits);
        } else {
            map.put(domain, visits);
        }
    }
    
}