class Solution {
    public String processStr(String s) {
        StringBuilder s1=new StringBuilder();

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            if((ch>='a')&&(ch<='z'))
            {
                s1.append(ch);
            }
            else if(ch=='*')
            {
                if(s1.length()>0 )
                 s1.deleteCharAt(s1.length()-1);
            }

            else if(ch=='#')
            {
                
                s1.append(s1);
            }
            else if(ch=='%') {
                
                     s1.reverse();
                
            }
        }

       return s1.toString(); 
        
    }
}