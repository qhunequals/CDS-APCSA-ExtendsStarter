import java.util.ArrayList;
public class Main 
{
  public static void main(String[] args) 
  {
     Cat p1 = new Cat();
     Cat p2 = new Cat();
     Cat p3 = new Cat();

     p1.changeName("Fluffy");
     p2.changeAge(3);
     p3.changeName("Mr.Whiskers");
     p3.changeAge(4);

    ArrayList<Cat> catList = new ArrayList<Cat>();
    catList.add(p1);
    catList.add(p2);
    catList.add(p3);

    for(int i = 0; i < catList.size(); i++){
      System.out.println(catList.get(i));
    }

    int max = catList.get(0).getAge();
    for(int i = 1; i < catList.size(); i++){
      if(catList.get(i).getAge() > max){
        max = catList.get(i).getAge();
      }
    }
    for(int i = 0; i < catList.size(); i++){
      if(catList.get(i).getAge() == max){
        System.out.println("\n\nThe oldest cat is\n" + catList.get(i));
      }
    }



    System.out.println("\n\n");


    

    Dog d1 = new Dog();
    Dog d2 = new Dog();
    Dog d3 = new Dog();

    d1.changeName("Woofy");
    d2.changeAge(3);
    d3.changeName("Amos");
    d3.changeAge(5);

    d1.speak();

    ArrayList<Dog> dogList = new ArrayList<Dog>();
    dogList.add(d1);
    dogList.add(d2);
    dogList.add(d3);

    for(int i = 0; i < dogList.size(); i++){
      System.out.println(dogList.get(i));
    }


    System.out.println("\n\n");





    Poodle P1 = new Poodle();
    Poodle P2 = new Poodle();
    Poodle P3 = new Poodle();

    P1.changeName("Woofy the Poodle");
    P2.changeAge(2);
    P3.changeName("Amos the Poodle");
    P3.changeAge(83935783);

    P1.speak();

    ArrayList<Poodle> PoodleList = new ArrayList<Poodle>();
    PoodleList.add(P1);
    PoodleList.add(P2);
    PoodleList.add(P3);

    for(int i = 0; i < PoodleList.size(); i++){
      System.out.println(PoodleList.get(i));
    }


  }
}