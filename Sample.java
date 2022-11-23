class Sample
{
    public static void main(String [] args)
    {
        //Creating a object of class Sample
        Sample sa=new Sample();
        String y="prasad";

        //1.0
        //Calling function getlengthofwordsinstring
        System.out.println(sa.getlengthofwordsinstring("one two three four five"));

        
        //2.0
        //Calling function reversestring
        System.out.println(sa.reversestring(y));

        
        //3.0
        //Calling function converttoarray
        char[] arr= sa.converttoarray(y);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        
        //4.0
        //Calling a function convertstringarray
        String [] array=sa.covertstringarr("one two three four");
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
    //1.0
    //Count number of words in a given string.
    public int getlengthofwordsinstring(String x)
    {
        
        int len=x.split(" ").length;
        
        return len;
    }

    //2.0
    //Reversing a string
    public String reversestring(String y)
    {
        StringBuilder reversedstring=new StringBuilder();
        for(int i=y.length()-1;i>=0;i--)
        {
            reversedstring.append(y.charAt(i));
        }
        return reversedstring.toString();   
    }

    //3.0
    //Converting a string into an char array
    public char[] converttoarray(String y)
    {
        char[] arr=new char[y.length()];
        for(int i=0;i<y.length();i++)
        {
            arr[i]= y.charAt(i);
        }
        return arr;
    }

    //4.0
    //Coverting a string at space to array
    public String[] covertstringarr(String x)
    {

        String [] arr= x.split(" ");

        return arr;
    }

    //5.0
}




