public class Main {
    public static void main(String[] args) {
        Hero hero1=new Hero("Kenny",19,true);
        Hero hero4=new Hero("Maggie",12,false);
        Hero hero2=new Hero();
        Hero hero3=new Hero();
        hero1.Print();
        hero2.Print();
        hero3.Print();
        hero4.Print();
        hero1.greeting(hero1);
        hero1.greeting(hero2);
        hero1.greeting(hero3);
        hero1.greeting(hero4);

        hero2.greeting(hero1);
        hero2.greeting(hero2);
        hero2.greeting(hero3);
        hero2.greeting(hero4);

        hero3.greeting(hero1);
        hero3.greeting(hero2);
        hero3.greeting(hero3);
        hero3.greeting(hero4);
    }
}