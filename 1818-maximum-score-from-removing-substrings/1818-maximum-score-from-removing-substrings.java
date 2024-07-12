import java.util.Stack;

class Solution {
    public int maximumGain(String s, int x, int y) {
        int n = s.length();
        int flag;
        if (x >= y) {
            flag = 1;
        } else {
            flag = 0;
        }
        int ans = 0;
        Stack<Character> stack = new Stack<>();
        int i = 0;

        // First pass to remove the first type of pattern
        while (i < n) {
            char ch = s.charAt(i);
            if (flag == 1) {
                if (ch == 'b' && !stack.isEmpty() && stack.peek() == 'a') {
                    ans += x;
                    stack.pop();
                } else {
                    stack.add(ch);
                }
            } else {
                if (ch == 'a' && !stack.isEmpty() && stack.peek() == 'b') {
                    ans += y;
                    stack.pop();
                } else {
                    stack.add(ch);
                }
            }
            i++;
        }

        // Prepare the remaining string after removing the first type of pattern
        StringBuilder st = new StringBuilder();
        while (!stack.isEmpty()) {
            st.append(stack.pop());
        }
        st.reverse();

        s = st.toString();
        n = s.length();  // Update the length of the string
        stack.clear();
        i = 0;

        // Second pass to remove the second type of pattern
        while (i < n) {
            char ch = s.charAt(i);
            if (flag == 0) {
                if (ch == 'b' && !stack.isEmpty() && stack.peek() == 'a') {
                    ans += x;
                    stack.pop();
                } else {
                    stack.add(ch);
                }
            } else {
                if (ch == 'a' && !stack.isEmpty() && stack.peek() == 'b') {
                    ans += y;
                    stack.pop();
                } else {
                    stack.add(ch);
                }
            }
            i++;
        }

        return ans;
    }
}
