public class RecursionDemo{
    public static boolean isPalindrome(int i,int j,String str)
    {
        if(i>=j)
        {
            return true;
        
        }
        if(str.charAt(i)!=str.charAt(j))
        {
            return false;
        }
        i+=1;
        j-=1;
        return isPalindrome(i,j,str);
    
    }
    public static void main(String args[])
    {
        boolean i=isPalindrome(0,2,"aba");
        System.out.println(i);
        
    }
}
