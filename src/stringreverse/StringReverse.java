/*
 * Name: 
 * Project:
 * Description: 
 * 
 * Date Started: 
 * Date Modified:
 * 
 */
package stringreverse;

import java.util.Scanner;

public class StringReverse
{

    public static void main(String[] args)
    {
        System.out.print("Enter a string: ");
        String Str=new String();

        String reverse="The reverse string is " + "";

        Scanner in=new Scanner(System.in);

        Str=in.nextLine();

        int len=Str.length();

        for(int i=(len-1);i>=0;i--){

            reverse+=Str.charAt(i);

        }

        System.out.println(reverse);

    }
    
}
