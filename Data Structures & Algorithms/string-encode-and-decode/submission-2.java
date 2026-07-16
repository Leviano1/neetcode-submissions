class Solution {
    public String encode(List<String> strs) {
        if(strs.isEmpty()) return "";
        StringBuilder encodedWord = new StringBuilder();
        List<Integer> sSize = new ArrayList<>();
        for(String str : strs){
            sSize.add(str.length());
        }
        for(Integer size : sSize){
            encodedWord.append(size).append(",");
        }
        encodedWord.append("#");
        for(String str : strs){
            encodedWord.append(str);
        }
        return encodedWord.toString();
    }

    public List<String> decode(String str) {
        if(str.length() == 0) return new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        List<String> res = new ArrayList<>();
        int i = 0;
        while(str.charAt(i) != '#'){
            StringBuilder cur = new StringBuilder();
            while(str.charAt(i) != ','){
                cur.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(cur.toString()));
            //Converting string builder to string and then
            // to an integer;
            i++;
        }
        i++;
        for(int sz : sizes){
            res.add(str.substring(i, i + sz));
            i += sz;
        }
        return res;
    }
}