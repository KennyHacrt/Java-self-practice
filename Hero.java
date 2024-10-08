import java.util.Random;
public class Hero {
    String name;
    int age;
    boolean gender;
    int greetingCount;
    String superPower;
//    enum superPower{
//        _TimeTravel_,_Invulnerability_,_Precognition_,_Healing_
//    }
    Hero(){
        Random rand=new Random();
        char a=(char) rand.nextInt(65,91);
        char b=(char) rand.nextInt(65,91);
        this.name=""+a+b;
        this.age=rand.nextInt(5,91);
        this.gender=rand.nextBoolean();
        Power(this.age,this.gender);
    }
    Hero(String name, int age, boolean gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
        Power(age,gender);
    }
    void Power(int age, boolean gender){
        if(gender && age<40) this.superPower= "_TimeTravel_";
        else if (gender && age>=40) this.superPower= "_Invulnerability_";
        else if(age<40) this.superPower= "_Precognition_";
        else this.superPower= "_Healing_";
    }
    public void Print(){
        System.out.println(name+" "+age+" "+gender+" "+
                superPower);
    }
    public void greeting(Hero anotherHero){

        if (!(anotherHero ==null || this.equals(anotherHero))) {
            System.out.println("Greeting-" +greetingCount +"from Hero-"+ name +": Hi Hero- "+anotherHero.name+" , I'm "+name+ ", my superpower is "+superPower+"." );
            greetingCount++;
        }
        else{
            System.out.println("anotherHero must not be null or himself");
        }
    }
}
