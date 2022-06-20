public class PartyAffiliation
        {
    public static void main(String[] args) {

        String partyChoice = "M";
        String party = "D-democrat R-republican I-independent";

       if(partyChoice .equalsIgnoreCase("D"))
        {
            System.out.println(" you get a democratic donkey");
        }
       else if(partyChoice .equalsIgnoreCase("R")){
        System.out.println("You get a republican elephant");
        }
        else if(partyChoice .equalsIgnoreCase("I"))
        {
            System.out.println("You get an independent person");
        }
        else{
           System.out.println(" You get Other");
       }
    }
        }
