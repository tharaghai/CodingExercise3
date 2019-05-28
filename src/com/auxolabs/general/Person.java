package com.auxolabs.general;

public class Person
{
    String firstName;
    String lastName;
    int age;
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public int getAge()
    {
        return age;
    }
    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName=lastName;
    }
    public int setAge(int age)
    {
       if(age<0 && age>100)
       {
           this.age = age;
       }
       return 0;
    }
    public boolean isTeen()
    {
        if(age>12 && age<20)
        {
            return true;
        }
        return false;
    }
    public String getFullName()
    {
        String fullname=firstName+lastName;
        if(firstName.isEmpty()) {
            return lastName;
        }
        else if(lastName.isEmpty())
        {
            return firstName;
        }
        else if(firstName.isEmpty()&&lastName.isEmpty())
        {
            return "";
        }
        return fullname;
    }
    public static void main(String[] args)
    {
        Person person=new Person();
        person.setFirstName("thara");
        person.setLastName("oviya");
        System.out.println("fullName= "+person.getFullName());
        System.out.println("teen="+person.isTeen());
        person.setFirstName("thara");
        person.setAge(21);
        System.out.println("fullName= "+person.getFullName());
        System.out.println("teen="+person.isTeen());
        person.setLastName("ghai");
        System.out.println("fullName= "+person.getFullName());
    }
}
