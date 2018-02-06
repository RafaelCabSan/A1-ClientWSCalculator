package clientwscalculator;

public class ClientWSCalculator {

    public static void main(String[] args) {
        System.out.println("Suma de dos numeros enteros: " + sum(20,47));
        System.out.println("Resta de dos numeros enteros: " + rest(20,47));
    }

    private static int sum(int n1, int n2) {
        pack.Calc_Service service = new pack.Calc_Service();
        pack.Calc port = service.getCalcPort();
        return port.sum(n1, n2);
    }

    private static int rest(int n1, int n2) {
        pack.Calc_Service service = new pack.Calc_Service();
        pack.Calc port = service.getCalcPort();
        return port.rest(n1, n2);
    }
    
}
