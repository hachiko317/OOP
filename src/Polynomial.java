public class Polynomial {
    private double[] coef; // coefficient;
    private int deg; // highest degree of the polynomial

    //constructor initialization
    // a= coef, b = deg, a*x^b;
    public Polynomial(double a, int b) {
        coef = new double[b + 1];
        coef[b] = a;
        deg = degree();
    }

    //constructor initialization
    public Polynomial(Polynomial p) {
        coef = new double[p.coef.length];
        for (int i = 0; i < p.coef.length; i++) {
            coef[i] = p.coef[i];
        }
        deg = degree();
    }

    public int degree() {
        int d = 0;
        for (int i = 0; i < coef.length; i++) {
            if (coef[i] != 0) {
                d = i;
            }
        }
        return d;
    }

    // c= a+b
    public Polynomial plus(Polynomial b) {
        Polynomial a = this;
        Polynomial c = new Polynomial(0, Math.max(a.deg, b.deg));
        for (int i = 0; i <= a.deg; i++) {
            c.coef[i] += a.coef[i];
        }
        for (int i = 0; i <= b.deg; i++) {
            c.coef[i] += b.coef[i];
        }
        c.deg = c.degree();
        return c;
    }

    // c = a - b
    public Polynomial minus(Polynomial b) {
        Polynomial a = this;
        Polynomial c = new Polynomial(0, Math.max(a.deg, b.deg));
        for (int i = 0; i <= a.deg; i++) {
            c.coef[i] += a.coef[i];
        }
        for (int i = 0; i <= b.deg; i++) {
            c.coef[i] -= b.coef[i];
        }
        c.deg = degree();
        return c;
    }

    // c = a*b
    public Polynomial times(Polynomial b) {
        Polynomial a = this;
        Polynomial c = new Polynomial(0, a.deg + b.deg);
        for(int i=0;i<=a.deg;i++){
           for(int j=0;j<=b.deg;j++){
               c.coef[i+j] +=( a.coef[i]*b.coef[j]);
           }
        }
        c.deg = b.deg + a.deg;
        return c;
    }
     /*
     Implement the division as described in wikipedia
        function n / d:
          require d ≠ 0
          q ← 0
          r ← n       # At each step n = d × q + r
          while r ≠ 0 AND degree(r) ≥ degree(d):
          t ← lead(r)/lead(d)     # Divide the leading terms
          q ← q + t
          r ← r − t * d
          return (q, r)
     */
    public Polynomial[] devides(Polynomial b){
        Polynomial q = new Polynomial(0,0);
        Polynomial r = this;
        while(r.isZero()== false && r.degree() >= b.degree() ){
           double coeff =r.coeff()/b.coeff();
           int degg = r.degree() - b.degree();
           Polynomial t = new Polynomial(coeff,degg);
           q = q.plus(t);
           r = r.minus(t.times(b));
        }
        return new Polynomial[]{q,r};
    }

    public boolean isZero(){
        for(int i=0;i<=deg;i++){
            if(coef[deg] != 0){
                return false;
            }
        }
        return true;
    }
     // return ceofficent of the  agree.
    public double coeff(int degree){
        return coef[degree];
    }
    // return ceofficent of the highest agree.
    public double coeff(){
        return coeff(degree());
    }

    public String toString() {
        if (deg == 0) {
            return " " + coef[0];
        }
        if (deg == 1) {
            return " " + coef[0]+"+"+coef[1] + "X";
        }
        String s = " " + coef[deg] + "X^" + deg;
        for (int i = deg - 1; i >= 0; i--) {
            if (coef[i] == 0) {
                continue;
            }
            if (i == 0) {
                if (coef[i] > 0) s = s + " + " + coef[i];
                else if (coef[i] < 0) s = s + " " + coef[i];
            } else if (i == 1) {
                if (coef[i] > 0) s = s + " + " + coef[i] + "X";
                else if (coef[i] < 0) s = s + "  " + coef[i] + "X";
            } else {
                if (coef[i] > 0) s = s + " + " + coef[i] + "X^" + i;
                else if (coef[i] < 0) s = s + " " + coef[i] + "X^" + i;
            }
        }
        return s;
    }


}

