public class Main {
    public static void main(String[] args){

        Human human1 = new Human("Rick",60,1.9);
        Human human2 = new Human("Morty",15,1.7);

        System.out.println(human1.name);
        System.out.println(human2.name);

        human1.eat();
        human2.drink();

    }
}
