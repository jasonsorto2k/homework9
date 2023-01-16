public class task2 {

    public static void main(String[] args) {

        // Create an array of names and store all names of your group.
        // Then print your name from that array. (use 2 different ways of creating an array).

        String[] names = {"Jason","Jessica","Jelena","Nafisa","Hasmik","Adem","Amir","Daniel"};

        System.out.println(names[0]);

        String[] name = new String[8];

        name[0]="Jason";
        name[1]="Jessica";
        name[2]="Jelena";
        name[3]="Nafisa";
        name[4]="Hasmik";
        name[5]="Adem";
        name[6]="Amir";
        name[7]="Daniel";

        System.out.println(name[0]);

    }
}
