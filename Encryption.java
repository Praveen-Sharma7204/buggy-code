
import java.util.*;


class Encryption {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        
        String str=in.next();
        int k=in.nextInt();
        String nstr="";
        
        for(int i=0;i<str.length();i++)
        {
            if((str.charAt(i)>=65 && str.charAt(i)<=90) )
               {
                   if((str.charAt(i)+k)>90)
                   {
                       nstr+=""+(char)(65+(((str.charAt(i)+k)-90)-1));
                   }
                   else
                   {
                       nstr+=""+(char)(str.charAt(i)+k);
                   }
                   
              }
              else if(str.charAt(i)>=97 && str.charAt(i)<=122)
               {
                   if((str.charAt(i)+k)>122)
                   {
                       nstr+=""+(char)(97+(((str.charAt(i)+k)-122)-1));
                   }
                   else
                   {
                       nstr+=""+(char)(str.charAt(i)+k);
                   }
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
                nstr+=""+(char)(str.charAt(i));
            }      
        }
        System.out.println(nstr);

    }
}
