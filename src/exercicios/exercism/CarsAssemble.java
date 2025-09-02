package exercicios.exercism;

public class CarsAssemble {
    static final int MINIMAL_PRODUCTION_PER_HOUR = 221;
    public double productionRatePerHour(int speed) throws IllegalArgumentException {
        if(speed <0 || speed > 10) throw new IllegalArgumentException("Speed must be between 1 and 10");
        double successRate = 0;
        if(speed < 5){
            successRate = 1;
        } else if(speed < 9){
            successRate = 0.9;
        } else if(speed == 9){
            successRate =  0.8;
        } else {
            successRate = 0.77;
        }

        return MINIMAL_PRODUCTION_PER_HOUR * speed * successRate;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed)/60);
    }
}
