public class Pet
{
   private String name;
   private int age;

   public Pet()
   {
      name = "Alpha";
      age = 1;
   }

   public String getName()
   {
     return name;
   }

   public int getAge()
   {
     return age;
   }

   public void changeName(String n)
   {
     name = n;
   }

   public void changeAge(int a)
   {
     age = a;
   }

   public String toString()
   {
     String output = "Name: " +  name;
     output += "\nAge: " + age;
     return output;
   }
}