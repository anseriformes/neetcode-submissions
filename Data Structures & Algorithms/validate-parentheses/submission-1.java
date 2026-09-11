class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        boolean isValid = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            //add to stack for open brackets; else remove from stack and validate
            if (c == '{' || c == '[' || c == '(') {
                stack.add(c);
            } else {
                //close bracket w/o open bracket
                if (stack.empty()) {
                    isValid = false;
                    break;
                } 
                
                char prev = stack.pop();
                
                //missing expected matching open bracket
                if ((c == '}' && prev != '{') || 
                (c == ']' && prev != '[') ||
                (c == ')' && prev != '(')) {
                    isValid = false;
                    break;
                }
            }
        }

        if (!stack.empty()) {
            isValid = false;
        }

        return isValid;
    }
}
