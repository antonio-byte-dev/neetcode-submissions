class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        Set<Character> opening = new HashSet<>();
        Set<Character> closing = new HashSet<>();

        opening.add('(');
        opening.add('[');
        opening.add('{');


        for(int i=0;i<s.length();i++)
        {
            if(opening.contains(s.charAt(i)))
            {
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty()) return false;
                switch(stack.peek()){
                    case '{':
                        if(s.charAt(i)=='}')
                        {
                            stack.pop();
                        }else{
                            return false;
                        }
                        break;
                    case '[':
                        if(s.charAt(i)==']')
                        {
                            stack.pop();
                        }else{
                            return false;
                        }
                        break;
                    case '(':
                        if(s.charAt(i)==')')
                        {
                            stack.pop();
                        }else{
                            return false;
                        }
                        break;
                }
            }
        }
        if(stack.isEmpty()) return true;

        return false;
     }
}
