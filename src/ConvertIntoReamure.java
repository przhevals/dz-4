public class ConvertIntoReamure implements BaseConverter{
    @Override
    public double convert(double degreeCels) {
        return degreeCels * 0.8;
    }
}
