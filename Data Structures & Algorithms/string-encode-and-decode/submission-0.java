class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s: strs) {
            sb.append(s.length());
            sb.append('#');
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        if (str.isEmpty()) {
            return Collections.emptyList();
        }
        int i = 0;
        int length = 0;
        StringBuilder sb = new StringBuilder();
        List<String> result = new ArrayList<>();
        while (i < str.length()) {
            char c = str.charAt(i);
            while (c != '#') {
                sb.append(c);
                i++;
                c = str.charAt(i);
            }
            length = Integer.parseInt(sb.toString());
            sb.setLength(0);
            i++;
            for (int j = i; j < i + length; j++) {
                sb.append(str.charAt(j));
            }
            result.add(sb.toString());
            sb.setLength(0);
            i = i + length;
        }
        return result;
    }
}
