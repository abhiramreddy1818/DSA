class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
            }
            if( stack.isEmpty() &&( c==']' || c==')' || c=='}'))
                return false;
              if( c==']'){
                if(stack.peek()=='[')
                  stack.pop();
                  else
                  return false;
            }
             if(c==')'){
                if(stack.peek()=='(')
                  stack.pop();
                  else
                  return false;
            }
            if(c=='}'){
                if(stack.peek()=='{')
                  stack.pop();
                  else
                  return false;
            }
            
        }
        return stack.isEmpty();
    }
}