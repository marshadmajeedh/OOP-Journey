public class Thermostat {
    private double currentTemperature;
    private double targetTemperature;

    public Thermostat() {
        this.currentTemperature = 20;
        this.targetTemperature = 20;
    }

    public void increaseTemperature(double temperature) {
        setTargetTemperature(this.targetTemperature += temperature);
    }

    public void decreaseTemperature(double temperature) {
        setTargetTemperature(this.targetTemperature -= temperature);
    }

    public void setCurrentTemperature(double temperature) {
        if (temperature >= 0 && temperature <=35) {
            this.currentTemperature = temperature;
            System.out.println("Current temperature is " + this.currentTemperature+"C");
        } else {
            System.out.println("Temperature out of range");
        }
    }

    public void setTargetTemperature(double temperature) {
        if (temperature >= 0 && temperature <=35) {
            this.targetTemperature = temperature;
            System.out.println("Target temperature is " + this.targetTemperature+"C");
        } else {
            System.out.println("Temperature out of range");
        }
    }

    public String status() {
        if(this.targetTemperature > this.currentTemperature) {
            return  "Heating";
        }
        else if (this.targetTemperature < this.currentTemperature) {
            return  "Cooling";
        } else {
            return "Standby";
        }
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public double getTargetTemperature() {
        return targetTemperature;
    }
}
