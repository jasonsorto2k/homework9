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

        for (int i = 0; i < countries.length; i++) {

            String country = countries[i];
            String capital = "";

            switch (country){

                case "Italy":
                    capital = "Rome";
                    break;

                case "France":
                    capital = "Paris";
                    break;

                case "Greece":
                    capital = "Athens";
                    break;

                case "Spain":
                    capital = "Madrid";
                    break;

                case "El Salvador":
                    capital = "San Salvador";
                    break;

                default:
                    System.out.println("Null");
                    break;

            }
            System.out.println(capital+ " is the capital of "+ country);
        }
    }
}


