public class BuddyInfo {

    //name of buddy
    private String name;
    //age of Buddy
    private int age;

    BuddyInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Get the age of buddy
     *
     * @return int age
     */
    public int getAge() {
        return age;
    }


    /**
     * Get the name of buddy
     *
     * @return String name
     */
    public  String getName() {
        return name;
    }


    /**
     * Say hello to a buddy
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello " + new BuddyInfo("Alex",20).getName() + "!");
    }
}