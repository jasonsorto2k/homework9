public class task6 {

    public static void main(String[] args) {

        // Create an array of countries.
        // While retrieving all values from an array print capital for each country choose any five countries.

        String[] countries = new String[5];

        countries[0] = "Italy";
        countries[1] = "France";
        countries[2] = "Greece";
        countries[3] = "Spain";
        countries[4] = "El Salvador";

        String[] capitals = new String[5];

        capitals[0] = "Rome";
        capitals[1] = "Paris";
        capitals[2] = "Athens";
        capitals[3] = "Madrid";
        capitals[4] = "San Salvador";

        for (int i = 0; i < countries.length; i++) {
            System.out.println(capitals[i]+" is the capital of "+countries[i]);


        }

            }
        }


