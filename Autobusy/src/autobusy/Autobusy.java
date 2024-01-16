package autobusy;

public class Autobusy {

    public static void main(String[] args) {
        Statistika swag = new Statistika();
        
        Cas x = new Cas(2, 34);
        Cas y = new Cas(2, 35);
        Cas z = new Cas(3, 45);
        Cas w = new Cas(4, 11);
        Cas q = new Cas(11, 9);
        Cas xx = new Cas(5, 34);
        Cas yy = new Cas(5, 36);
        Cas zz = new Cas(6, 7);
        Cas ww = new Cas(12, 48);
        Cas qq = new Cas(23, 19);
        
        Spoj a = new Spoj("a", x, xx);
        Spoj b = new Spoj("b", y, yy);
        Spoj c = new Spoj("c", z, zz);
        Spoj d = new Spoj("d", x, ww);
        Spoj e = new Spoj("e", q, qq);
        
        swag.pridejSpoj(a);
        swag.pridejSpoj(b);
        swag.pridejSpoj(c);
        swag.pridejSpoj(d);
        swag.pridejSpoj(e);
        
        swag.vypisSpoje();
        swag.najdiNejrychlejsiSpoj();
        swag.vypisSpojeOdCasu(x);
        
        // System.out.println("M1;15:35;15:42");
        swag.nactiSpoje("busy.csv");
        
    }
    
}
