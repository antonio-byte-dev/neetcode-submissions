class Solution {
    public boolean isPalindrome(String s) {

        char[] palyndrome = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "").toCharArray();
        System.out.println(palyndrome);
        int init = 0;
        int end = palyndrome.length-1;

        while(init<end)
        {
            
            //if(palyndrome[end]=='?'||palyndrome[end]=='!')end--;
            if(palyndrome[init]!=palyndrome[end]) return false;
            init++;
            end--;
        }

        return true;
    }
}
