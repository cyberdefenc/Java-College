// Write a class `Temperature` that has a private variable `celsius`. Provide methods to convert and return the temperature in Fahrenheit using getter.
 

package Day9;

class Temp{
    private int  celsius;

    void setvalue(int celsius)
    {
        this.celsius=celsius;

    }

      double getFahrenheit() {
        return (celsius * 9.0 / 5.0) + 32;
    }


}
public class P5_temp_ {
        public static void main(String[] args) {
        Temp t = new Temp();
        t.setvalue(30);  

        System.out.println("Temperature in Fahrenheit: " + t.getFahrenheit());
    }
    
}
