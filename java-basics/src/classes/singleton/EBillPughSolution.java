package classes.singleton;

/*

this is very fast and solves most of the problems discussed before

 */

public class EBillPughSolution {

    private EBillPughSolution() {

    }

    private static class BillPughSolutionHelper{
        private static final EBillPughSolution INSTANCE = new EBillPughSolution();
    }

    public static EBillPughSolution getInstance(){
        return BillPughSolutionHelper.INSTANCE;
    }
}
