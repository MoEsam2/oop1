package com.moesam;

public class Main {
    public static void main(String[] args) {
      if(Job.recruiting)
      {
         System.out.println("Lucky");
      }
      else
      {
         System.out.println("unlucky");
      }
      programmer p=new programmer();
        if(Job.recruiting)
        {
            System.out.println("Lucky");
        }
        else
        {
            System.out.println("unlucky");
        }
    }
}
//programmer constructor overides employee constructor because of inheritence so
//,it prints employee ,then prints name mohamed 21 years and also changes the field recruiting to true
//the job become avaliable because of the keyword static
//it locates one time in memory and being avaliable for all objects so i can call be type the name of class.field(static)