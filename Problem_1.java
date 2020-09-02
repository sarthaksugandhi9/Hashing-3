// Time complexity - O(n)
// Space complexity - O(n)

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if(s == null || s.length() == 0) return new ArrayList<String>();
        Set<String> res = new HashSet<>();
        Set<String> subs = new HashSet<>();
        
        for(int i = 0 ; i <= s.length() - 10; i++){
            String a = s.substring(i,i+10);
            if(subs.contains(a)){
                res.add(a);
            }
            subs.add(a);
        } 
        return new ArrayList<>(res);
    }
}
