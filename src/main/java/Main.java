public class Main {

    public static final int TAG_VALUE_ID = 31877;

    public static void main(String[] args) {

        Escalate escalate = new Escalate();
        String email = escalate.oneSwitchToRuleThemAll(TAG_VALUE_ID);
        System.out.println(email);
    }
}
