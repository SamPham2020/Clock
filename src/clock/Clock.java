package clock;

/**
 * Clock shows time in this format (00:00:00)
 * @author Hong Hien Pham
 */
public class Clock {  
    private int hour;
    private int minute;
    private int second;
    
    //Clock usually has only one constructor 
    /**
     * Default Constructor  
     */
    public Clock() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
    
    /**
     * Constructor with all three parameters(hour, minute, second)
     * @param hour the entered hour 
     * @param minute the entered minute     
     * @param second the entered second
     */
    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    /**
     * Copy constructor: copy all the values of parameters of an object of Clock
     * @param clock an object of Clock to copy
     */
    public Clock(Clock clock) {
        this.hour = clock.hour;
        this.minute = clock.minute;
        this.second = clock.second;
    }
    
    /**
     * To increase the hour by one
     */
    public void increaseHour() {
//        hour = (hour + 1) % 24;
        hour++;
        if (hour == 24)
            hour = 0;
    }
    
    /**
     * To increase the minute by one
     */
    public void increaseMinute() {
        minute++;
        if (minute == 60) {
            minute = 0;
            increaseHour();
        }
    }
    
    /**
     * To increase the second by one
     */
    public void increaseSecond() {
        second++;
        if (second == 60) {
            second = 0;
            increaseMinute();
        }
    }
    
    /**
     * Verify if the values of the parameters of an object of Clock is equal to
     * the ones of another of Clock  
     * @param clock an object of Clock
     * @return true if equal; else, false
     */
    public boolean equals(Clock clock) {
        return this.hour == clock.hour &&
                this.minute == clock.minute &&
                this.second == clock.second;
    }

    /**
     * Return a String with all values of an object of Clock  
     * @return the String with all values of an object of Clock
     */
    @Override
    public String toString() { 
        return String.format("%02d:%02d:%02d", hour, minute, second);   
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour < 24 )
            this.hour = hour;
        else 
            System.out.println("Invalid");
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60 )
            System.out.println("Invalid");
        else 
            this.minute = minute;     
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second < 60 )
            this.second = second;
        else 
            System.out.println("Invalid");        
    }  
}
