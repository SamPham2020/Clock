
package clock;

/**
 * Testing Clock class
 * @author sammy
 */
public class Test {
    public static void main(String[] args) {
        Clock clock1 = new Clock(12, 23, 2);
        Clock clock2 = new Clock(clock1); // deep copy clock1 
        System.out.println(clock1);//12:23:02
        System.out.println(clock2);//12:23:02
        clock1.setHour(0);
        System.out.println(clock1);//00:23:02 => deep copy => change clock1
        System.out.println(clock2);//12:23:02 => won't affect clock2
        clock1.setHour(-1); //Invalid
        clock1.setHour(24); //Invalid
        clock1.setMinute(-1); //Invalid
        clock1.setMinute(60); //Invalid
        clock1.setSecond(-1); //Invalid
        clock1.setSecond(60); //Invalid
        System.out.println(clock1);//00:23:02
        //increase 1000 secs. test
//        for (int i = 0; i < 1000; i++) {
//            clock1.increaseSecond();
//            System.out.println(clock1);//print every sec.
//        }
    }
}
