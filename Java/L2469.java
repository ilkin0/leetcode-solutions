import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class L2469 {
    public static void main(String[] args) {

        double celsius = 36.509;
        double[] converts = convertTemperature(celsius);
        System.out.println(Arrays.toString(converts));
    }

    public static double[] convertTemperature(double celsius) {
        double[] doubleValues = new double[2];

        doubleValues[0] = BigDecimal.valueOf(celsius + 273.15).setScale(5, RoundingMode.HALF_EVEN).doubleValue();
        doubleValues[1] = BigDecimal.valueOf(celsius)
                .multiply(BigDecimal.valueOf(1.80))
                .add(BigDecimal.valueOf(32.00))
                .setScale(5, RoundingMode.HALF_EVEN).doubleValue();

        return doubleValues;
    }
}
