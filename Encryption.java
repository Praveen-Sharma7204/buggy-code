

import java.io.InputStreamReader;


import java.util.*;


class Encryption {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        
        String str=in.next();
        int k=in.nextInt();
        String nstr="";
        
        for(int i=0;i<str.length();i++)
        {
            if((str.charAt(i)>=65 && str.charAt(i)<=90) || (str.charAt(i)>=97 && str.charAt(i)<=122)  )
            {
                nstr+=(char)(str.charAt(i)+k);
            }
            else if((str.charAt(i)>=48 && str.charAt(i)<=57))
            {
                String n=""+(char)(str.charAt(i));
                int na=Integer.parseInt(n);
                na=na+k;
                na=na%10;
               
               
                
                nstr+=na;
            }
            else
            {
                nstr+=str.charAt(i);
            }
        }
        System.out.println(nstr);

    }
}
