//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double degreeCels = 24.7;

        ConvertIntoFahrenheit far = new ConvertIntoFahrenheit();
        ConvertIntoKelvin kelvin = new ConvertIntoKelvin();
        ConvertIntoReamure ram = new ConvertIntoReamure();

        System.out.println("Converted Celsius to Fahrenheit: " + far.convert(degreeCels));
        System.out.println("Converted Celsius to Kelvin: " + kelvin.convert(degreeCels));
        System.out.println("Converted Celsius to Reamure: " + ram.convert(degreeCels));
    }
}