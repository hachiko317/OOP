public class test {
    public static void main(String[] args) {
        Polynomial zero = new Polynomial( 0, 0 );

        Polynomial p1 = new Polynomial( 1, 3 );
        Polynomial p2 = new Polynomial( 2, 2 );
        Polynomial p3 = new Polynomial( 4, 0 );
        Polynomial p4 = new Polynomial( 0, 1 );
        Polynomial p = p1.plus( p2 ).plus( p3 ).plus( p4 ); // 1x^3+2x^2+4
        Polynomial q1 = new Polynomial( 1, 1 );
        Polynomial q2 = new Polynomial( 3, 0 );
        Polynomial q = q1.plus( q2 );
        Polynomial test = p.times(q);
        System.out.println(test);

    }
}
