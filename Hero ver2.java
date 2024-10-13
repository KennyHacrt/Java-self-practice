//file Main.class (both under EXAMPLE Package)
package EXAMPLE;

public class Main {
    public static void main(String[] args) {
        Hero hero1=new Hero("Kenny",19,true);
        Hero hero2=new Hero();
        Hero hero3=new Hero();
        Hero hero4=new Hero(null,12,false);

        hero1.Print();
        hero2.Print();
        hero3.Print();
        hero4.Print();
        Hero[] heroes={hero1};
        hero3.greeting(heroes);


    }
}


// file Hero.class

package EXAMPLE;

import java.util.Random;
public class Hero {
    private String name;
    private int age;
    private boolean gender;
    private int greetingCount;
//    private String superPower;
    static int count=1;
    private final int id=count++;
//    {
//        id=count++;
//    }
    enum SuperPower{
        _TimeTravel_,_Invulnerability_,_Precognition_,_Healing_
    }
    private SuperPower superPower;

    void getName() {
        System.out.println(name);
    }
    void getAge() {
        System.out.println(age);
    }
    void getGender() {
        System.out.println(gender);
    }
    void getSuperpower() {
        System.out.println(superPower);
    }
    void getId(){
        System.out.println(superPower);
    }
    Hero(){
        Random rand=new Random();
        char a=(char) rand.nextInt(65,91);
        char b=(char) rand.nextInt(65,91);
        this.name=""+a+b;
        this.age=rand.nextInt(5,91);
        this.gender=rand.nextBoolean();
        Power(this.age,this.gender);
//        this.id=count++;

    }
    Hero(String name, int age, boolean gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
        Power(age,gender);
//        this.id=count++;
    }
    void Power(int age, boolean gender){
        if(gender && age<40) this.superPower= SuperPower._TimeTravel_;
        else if (gender && age>=40) this.superPower= SuperPower._Invulnerability_;
        else if(age<40) this.superPower= SuperPower._Precognition_;
        else this.superPower= SuperPower._Healing_;
    }
    public void Print(){
        System.out.println(name+" "+id+" "+age+" "+gender+" "+
                superPower);
    }
    public void greetings(Hero anotherHero){

        if (!(anotherHero ==null || this.equals(anotherHero))) {
            System.out.println("Greeting-" +greetingCount +"from EXAMPLE.Hero-"+ name +": Hi EXAMPLE.Hero- "+anotherHero.name+" , I'm "+name+ ", my superpower is "+superPower+"." );
            greetingCount++;
        }
        else{
            System.out.println("anotherHero must not be null or himself");
        }
    }
    public void greeting (Hero[] heroes){
        int xx=0;
        for (Hero hero:heroes) if(hero!=null) xx++;

        if (xx>1) System.out.println("Hello to all you "+xx+"!");
        if (xx==1) {
            for (Hero hero:heroes) if(hero!=null) System.out.println("Greeting-" +hero.greetingCount +"from EXAMPLE.Hero-"+ name +": Hi EXAMPLE.Hero- "+hero.name+" , I'm "+name+ ", my superpower is "+superPower+".");

        }
    }
}
