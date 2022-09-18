package Week5;

public class reference {
    Day d1 = new Day(20 , 2 , 2122);
    Day d2 = d1;
    Day d3 = new Day(d1.day , d1.month , d1.year);
    //We must create another object using the constructor
}
