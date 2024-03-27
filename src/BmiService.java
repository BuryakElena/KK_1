public class BmiService {
    public int calculate(int weightInKg, double heightMeters) {
        double Bmi = (weightInKg / heightMeters / heightMeters);
        return (int) Bmi;
    }
}

