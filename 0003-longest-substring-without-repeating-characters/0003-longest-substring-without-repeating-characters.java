class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int n = s.length();
        int answer = 0, left = 0, right = 0;
        while (right < n) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right++));
                answer = Math.max(answer, set.size());
            } else {
                set.remove(s.charAt(left++));
            }
        }
        return answer;
    }
}
