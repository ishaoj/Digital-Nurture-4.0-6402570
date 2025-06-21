public class FinancialForecasting {

    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue; // Base case
        }
        return (1 + growthRate) * calculateFutureValue(presentValue, growthRate, years - 1);
    }

    public static void main(String[] args) {
        double presentValue = 10000;  
        double growthRate = 0.08;     
        int years = 5;                

        double futureValue = calculateFutureValue(presentValue, growthRate, years);
        System.out.println("Future Value after 5 years: " + futureValue);
    }
}
