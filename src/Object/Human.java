package Object;

public class Human {

    int age;
    int weight;
    int height;
    String name;
    String male;

    public int getAge(int i) {
        return age;
    }

    public int getHeight(int x) {
        return height;
    }

    public String isMale(String a) {
        return male;
    }

    public int getWeight(int q) {
        return weight;
    }

    public String getName(String b) {
        return name;
    }


    public static void main(String[] args) {

        Human human = new Human();

        System.out.println(human.getWeight(100));
        System.out.println(human.getAge(25));
        System.out.println(human.getHeight(189));
        System.out.println(human.isMale("male"));
        System.out.println(human.getName("Martin"));
    }
}
