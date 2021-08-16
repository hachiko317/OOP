public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        return "(" + real + "+" + imag + "i)";
    }

    public boolean isReal() {
        if (imag == 0) {
            return true;
        }
        return false;
    }

    public boolean isImaginary() {
        if (real == 0) {
            return true;
        }
        return false;
    }

    public boolean equals(double real, double imag) {
        if (this.real == real && this.imag == imag) {
            return true;
        }
        return false;
    }

    public boolean equals(MyComplex complex) {
        if (real == complex.real && imag == complex.imag) {
            return true;
        }
        return false;
    }
    public MyComplex conjugate(){
        return new MyComplex(real, -imag);
    }
    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public MyComplex add(MyComplex right) {
        return new MyComplex(real + right.real, imag + right.imag);
    }

    public MyComplex subtract(MyComplex right) {
        return new MyComplex(real - right.real, imag - right.imag);
    }

    public MyComplex multiply(MyComplex another) {
        //(a+bi) , (c+di)
        double a= this.real;
        double b= this.imag;
        double c= another.real;
        double d= another.imag;
        //(ac-bd)+(ad+bc)i
        real = a*c-b*d;
        imag = a*d+b*c;
        return this;
    }

    public MyComplex divide(MyComplex another) {
        //(a+bi)/(c+di) = [(a+bi)(c-di)]/(c*c+d*d)

        //(a+bi)(c-di)
        MyComplex numerator = multiply(another.conjugate());
        //(c*c+d*d)
        double c= another.real;
        double d= another.imag;
        double denominator =c*c+d*d ;
        if(denominator != 0) {
            real = numerator.real / denominator;
            imag = numerator.imag / denominator;
        }
        return this;
    }

}

