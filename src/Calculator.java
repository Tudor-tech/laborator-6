public class Calculator {
    double rezultat;

    public Calculator(){
        rezultat = 0;
    }

    public Calculator(double nr){
        rezultat = nr;
    }

    public Calculator adunare(double nr){
        rezultat += nr;
        return this;
    }

    public Calculator scadere(double nr){
        rezultat -= nr;
        return this;
    }

    public Calculator inmultire(double nr){
        rezultat *= nr;
        return this;
    }

    public Calculator impartire(double nr){
        if(nr == 0)
            throw new RuntimeException("Eroare");
        rezultat /= nr;
        return this;
    }

    public double getRezultat(){
        return rezultat;
    }
}
