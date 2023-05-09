public class logical {
    public static void main (String[] args){
       boolean hasHighIncome = true;
       boolean hasGoodCredit = true;
       boolean hasCriminalReport = false;
       boolean isEligible =  (hasHighIncome || hasGoodCredit) && !hasCriminalReport ;
       System.out.println(isEligible);
    }
}
