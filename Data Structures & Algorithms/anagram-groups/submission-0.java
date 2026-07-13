class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> result = new HashMap<>();
        for(String s : strs){ //O(m)
            char[] charArray = s.toCharArray(); //O(n);
            Arrays.sort(charArray);//O(nlogn);
            String sortedS = new String(charArray); //O(n);
            //converts back to the String;
            result.putIfAbsent(sortedS, new ArrayList<>()); //O(1);
            //If there isn't already list for this key, create an empty one;
            result.get(sortedS).add(s); //O(1);
            //Go to the map and give me the list stored under the key "aet";
            //then add s to this list;
        }
        return new ArrayList<>(result.values());
    }
}
