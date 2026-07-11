class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();

        for(int i = 0; s.length() > i; i++){
            countS.put(s.charAt(i),
            countS.getOrDefault(s.charAt(i), 0) + 1);
            //if char is already in the set it will return its count,
            //if not it will set it to 0, and + 1 is added in the end;
            countT.put(t.charAt(i),
            countT.getOrDefault(t.charAt(i), 0) + 1);
        }
        return countS.equals(countT);
    }
}
