public class TestSwitchEnumeration {
    enum  cards {
        Spade,Heart,Diamond,Club
    }
    public static void main (String[] args){
        cards card = cards.Diamond;
        switch (card){
            case Spade :
                System.out.println("SPADE");
                break;
            case Heart:
                System.out.println("Heart");
                break;
            case Diamond:
                System.out.println("Diamond");
                break;
            case Club:
                System.out.println("Club");
                break;



        }

    }
}
