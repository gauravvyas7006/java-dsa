package dsa.stack;

import java.util.Stack;

class stacks{
    public static void main(String[] args){
        String s = "{()}";
        Stack<Character> map = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '{' || ch=='('){
                map.push(ch);
            }else{
                if(map.isEmpty()){
                    System.out.println(false);
                    return;
                }
                char top = map.pop();
                if (ch == '}' && top != '{') {
                    System.out.println(false);
                    return;
                }

                if (ch == ']' && top != '[') {
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(map.isEmpty());
    }
}