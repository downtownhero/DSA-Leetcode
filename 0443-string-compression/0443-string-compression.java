class Solution {
    public int compress(char[] chars) {
        // String s = chars[0] + "";
        // int count = 1;

        int i=0;

        for(int j=1, count = 1; j<=chars.length; j++, count++){
            if(j == chars.length || chars[j] != chars[j-1]){
                chars[i++] = chars[j-1];
                if(count > 1){
                    String s = Integer.toString(count);
                    for(int k=0; k<s.length(); k++)
                        chars[i++] = s.charAt(k); 
                }
                count = 0;
            } 
        }

        // for(int i=1; i<chars.length; i++){
        //     char curr = chars[i];
        //     char prev = chars[i-1];

        //     if(curr == prev){
        //         count++;
        //     } else {
        //         if(count > 1){
        //             s += count;
        //             count = 1;
        //         }
        //         s += curr;
        //     }
        // }
        // if(count > 1){
        //     s += count;
        //     count = 1;
        // }

        // for(int i=0; i<s.length(); i++){
        //     chars[i] = s.charAt(i);
        // }

        return i;
    }
}