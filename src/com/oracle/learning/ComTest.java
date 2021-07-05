package com.oracle.learning;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComTest {
    public static void main(String[] args) {


  System.out.println(captial("this is a test"));
    }

//String == "this is a test
    // This Is A Test

    // A this is  test
    // dab

    // abd

    public static String captial(String str)
    {

       /* Comparator<Person> c = Comparator.comparing(Person::getAge).thenComparing(Person::getName);

        Collections.sort(str,c);
*/


        StringBuilder sb = new StringBuilder();

       /* String str1[] = str.split("\\b");
        Arrays.sort(str1);                      // nlog()
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str1.length;i++)
        {
            sb.append(str1[i]+" ");
        }*/
     //return sb.toString();



    /* List<String> ll1= Arrays.asList(str1);

        Collections.sort(ll1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("list in "+ll1);
*/
       // StringBuilder sb = new StringBuilder();
// 65 98

       // System.out.println('a'-26);
       String s = "";
       s+=str.charAt(0);

        sb.append(s.toUpperCase(Locale.ROOT));
        char c = (char) ((char)str.charAt(0)-'a'+'A');
       // System.out.println(c);
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i-1)==' ')
            {

                String temp = "";

                temp +=str.charAt(i);

                sb.append((char) (str.charAt(i)-'a'+'A'));
            }else
            {
                sb.append(str.charAt(i));
            }


        }
    return sb.toString();

    }

}
//age ,name
class Person
{
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
