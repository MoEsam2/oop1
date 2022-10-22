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
//,it print employee then print name mohamed 21 years and also change the field recruiting to true
//the ob become avaliable beause of the keyword static
//it locates one time in memory and being avaliable for all objects so i can call be type the name of class.field(static)