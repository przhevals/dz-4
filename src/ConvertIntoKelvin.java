public class ConvertIntoKelvin implements BaseConverter{
    @Override
    public double convert(double degreeCels) {
        return degreeCels + 273.15;
    }
}
