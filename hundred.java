public class hundred {

    public static void main(String[] args) {
    
        StringBuilder strb = new StringBuilder(args[0]);
        int T = 100;
        for (int i=0; i<100; i++) strb.append(" " + args[0]);
        System.out.println(strb.toString());
        return;
    }
}