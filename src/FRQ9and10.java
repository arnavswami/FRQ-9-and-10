public class FRQ9and10 {

/*
a.) The PictureBook class is a subcass of the Book class that has the additional attribute: a String variable named
illustrator that is used to represent the name of the illustrator of a picture book. The PictureBook class also
contains a printBookInfo method to print the title, writer, and illustrator of a picture book. Complete PictureBook
class below.

public class PictureBook extends Book
{
    private String illustrator;
    public PictureBook(String t, String a, String i)
    {

        super(t, a);
        illustrator = i;

    }
    public void printBookInfo()
    {
        super.printBookInfo();

        System.out.print(" and illustrated by " + illustrator);
    }
    }




    b.) Write a code segment that can be used to replace "missing code" so that book1 and book2 will be correctly
created and added to myLibrary. Assume that class PictureBook works as intended, regardless of what you
wrote in part (a).

Book Book1 = new Book("Frankenstein", "Mary Shelley");

PictureBook Book2 = new PictureBook("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Denslow");

c.) Complete the BookListing class below. Your implementation should conform to the examples. Assume that class
PictureBook works as intended, regardless of what you wrote in part (a).

public class BookListing
{
 private Book bookInListing;
 private double price;
 public BookListing(Book b, double p)
    {
        bookInListing = b;
        price = p;
    }
    public void printDescription()
    {
        bookInListing.printBookInfo();
        System.out.printf(", $" + price);
    }
}

import java.util.ArrayList;
class Book
{
 private String title, author;
 public Book(String t, String a)
    {
     title = t;
     author = a;
    }
    public void printBookInfo()
    {
     System.out.println(title + ", written by " + author);
    }
}
class PictureBook extends Book
{
 private String illustrator;
 public PictureBook(String t, String a, String i)
    {
     super(t, a);
     illustrator = i;
     }
    public void printBookInfo()
       {
     super.printBookInfo();
     System.out.print(" and illustrated by " + illustrator);
       }
   }
class BookListing
{
 private Book bookInListing;
 private double price;
 public BookListing(Book b, double p)
    {
     bookInListing = b;
     price = p;
    }
    public void printDescription()
    {
     bookInListing.printBookInfo();
     System.out.printf(", $" + price);
    }
}

public class test
{
    public static void main(String [] args)
    {
     PictureBook myBook = new PictureBook("Peter and Wendy", "J.M. Barrie", "F.D. Bedford");
     myBook.printBookInfo();
     System.out.println();
     ArrayList<Book> myLibrary = new ArrayList<Book>();
     Book Book1 = new Book("Frankenstein", "Mary Shelley");
     PictureBook Book2 = new PictureBook("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Denslow");
     myLibrary.add(Book1);
     myLibrary.add(Book2);
     BookListing Listing1 = new BookListing(Book 1, 10.99);
     Listing1.printDescription();
     System.out.println();
     BookListing Listing2 = new BookListing(Book2, 12.99);
     Listing2.printDescription();
     System.out.println();
    }
}
Question 2

a.) Write the complete Animal class.
Your implementation must meet all specifications and conform to the
behavior shown in the table.
--
public class Animal
{
 private String animalType;
 private String species;
 private String name;
 public Animal(String animalType, String species, String name)
    {
  super();
  this.animalType = animalType;
  this.species = species;
  this.name = name;
    }
    @Override
    public String toString()
    {

        return name + " the " + species + " is a " + animalType;

    }
}

b.) Write the complete Herbivore class. Your implementation
must meet all specifications and conform to the
behavior shown in the table.

public class Herbivore extends Animal
{
 public Herbivore(String species, String name)
 {
    super("herbivore", species, name);
    }
}

c.) Write the complete Elephant class. Your implementation must meet all specifications and conform to the
behavior shown in the table.

public class Elephant extends Herbivore
{
 private double tuskLength;
 public Elephant(String name, double tuskLength)
 {
     super("elephant", name);
     this.tuskLength = tuskLength;
 }
    @Override
    public String toString()
 {
     return super.toString() + " with tusks " + tuskLength + meters long.";
 }
}
--
public class Test
{
    public static void main(String [] args)
    {
     Animal lisa = new Animal("carnivore", "lion", "Lisa");
     System.out.println(lisa);
     Herbivore gary = new Herbivore("giraffe", "Gary");
     System.out.println(gary);
     Elephant percy = new Elephant("Percy", 2.0);
     System.out.println(percy);
    }
}


UNIT 10 FRQ AP COMPUTER SCIENCE A

1)

a.) The gcf method returns the greatest common factor of parameters a and b, as determined by case I and case II. Write
the gcf method below. You are encouraged to implement this method recursively.

b.) Write the reduceFraction method below. Assume that gcf works as specified, regardless of what you wrote in part
(a). You must use gcf appropriately to receive full credit.

public class NumberSystem
{
 public static int gcf(int a, int b)
 {
     int result = 0;
     if (a < b)

     {
         result = gcf(b, a);

        }
     else if (b == 0)
     {

          result = a;

     }

        else

        {
         int remainder = a % b;

         result = gcf(b, remainder);
        }
        return result;

  }
    public static void reduceFraction(int numberator, int denominator)
    {


   System.out.println(numerator + "/" + denominator);
   int factor;

   factor = gcf(numerator, denominator);

   numerator = numerator / factor;

   denominator = denominator / factor;
    if (denominator > 1)
        {

            System.out.println(" reduces to " + numerator + "/" + denominator);

        }

        else

        {

            System.out.println(" reduces to " + numerator);

        }
    }
    class Test

    {
        public static void main(String [] args)
        {

         NumberSystem.reduceFraction(30, 3);

         NumberSystem.reduceFraction(8, 20);

         NumberSystem.reduceFraction(24, 9);

         NumberSystem.reduceFraction(7, 3);

        }
    }
}

 */


}
