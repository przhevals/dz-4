public class ConvertIntoFahrenheit implements BaseConverter{
    @Override
    public double convert(double degreeCels) {
        return degreeCels * 1.8 + 32;
    }
}
