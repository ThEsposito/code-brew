package exercicios.exercism;


class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeek = new int[7];
        int n = birdsPerDay.length;

        for(int i = n-7; i<n; i++) lastWeek[n-7+i] = birdsPerDay[i];

        return lastWeek;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int day : birdsPerDay){
            if(day == 0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int counter = 0;
        if(numberOfDays > birdsPerDay.length) numberOfDays = birdsPerDay.length;
        for(int i=0; i<numberOfDays; i++){
            counter+=birdsPerDay[i];
        }
        return counter;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for(int day : birdsPerDay){
            if(day >= 5){
                busyDays++;
            }
        }
        return busyDays;
    }
}
