class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        Set<String> operations = new HashSet<>();

        operations.add("+");
        operations.add("-");
        operations.add("*");
        operations.add("/");

        for(int i=0;i<tokens.length;i++)
        {
            if(!operations.contains(tokens[i]))
            {
                stack.push(tokens[i]);
            }else{
                int op2 = Integer.parseInt(stack.peek());
                stack.pop();
                int op1 = Integer.parseInt(stack.peek());
                stack.pop();
                int res = 0;
                switch (tokens[i]){
                    case "+":
                        res = op1+op2;
                        break;
                    case "-":
                        res = op1-op2;
                        break;
                    case "*":
                        res = op1*op2;
                        break;
                    case "/":
                        res = op1/op2;
                        break;
                }
                stack.push(String.valueOf(res));
            }
        }
        return Integer.parseInt(stack.peek());
    }
}
