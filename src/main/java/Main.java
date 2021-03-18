import td.api.TDException;
import td.api.TeamDynamix;
import td.api.Ticket;

public class Main {

    public static final int TAG_VALUE_ID = 13221;

    public static void main(String[] args) {

//        Ticket ticket = new Ticket();
//        ticket.setResponsibleUid(String);

        Escalate escalate = new Escalate();
        String email = escalate.oneSwitchToRuleThemAll(TAG_VALUE_ID);
        System.out.println(email);
    }
}
