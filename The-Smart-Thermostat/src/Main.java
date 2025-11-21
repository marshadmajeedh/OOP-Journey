//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Thermostat thermostat = new Thermostat();
        thermostat.setCurrentTemperature(0);
        thermostat.setTargetTemperature(2);
        System.out.println("The current status is : "+thermostat.status());
        thermostat.increaseTemperature(100);
    }
}