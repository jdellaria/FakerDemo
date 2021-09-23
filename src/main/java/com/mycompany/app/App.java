package com.mycompany.app;

import com.github.javafaker.Faker;
/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
      Faker faker = new Faker();

      String name = faker.name().fullName(); // Miss Samanta Schmidt
      String firstName = faker.name().firstName(); // Emory
      String lastName = faker.name().lastName(); // Barton
      String rockBand = faker.rockBand().name(); // Barton

//String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449
      System.out.println( "Hello World !" );
      int x = 0;

      System.out.println("id, name, firstName, lastName, rockBand");
      for (x = 1; x <= 30; x++)
      {

        System.out.println( x + ", " + faker.name().fullName() + ", " + faker.name().firstName() +", "+ faker.name().lastName()  + ", "+ faker.rockBand().name());
      }

    }
}
