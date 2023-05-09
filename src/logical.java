public class logical {
    public static void main (String[] args){
       boolean hasHighIncome = true;
       boolean hasGoodCredit = true;
       boolean isEligible = hasHighIncome || hasGoodCredit;
       System.out.println(isEligible);
    }
}
