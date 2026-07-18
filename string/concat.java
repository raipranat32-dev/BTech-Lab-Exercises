public class concat{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Pranat");
        sb.append(" Rai");
        String res= sb.toString();
        String s1= new String("Pranat ");
        String s2 = new String("Rai");
        System.out.println("Concatenation using + operator: "+s1+s2);
        System.out.println("Cpncatention using concat() method: "+s1.concat(s2));
        System.out.println("cocatenation using String Builder: "+res);
    }
}