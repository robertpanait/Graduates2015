/**
 * Created by rpanait on 7/20/2015.
 */
public class Complex {
    public double real;
    public double imag;

    public Complex(){
        real = 0;
        imag = 0;
    }

    public Complex(double real, double imag) {
        this.real=real;
        this.imag=imag;
    }
    public void add(Complex n1, Complex n2) {
        this.real=n1.real+n2.real;
        this.imag=n1.imag+n2.imag;
    }
    public void print(){
        System.out.println(real + " " + imag +"i");
    }

}
