package solidprinciples.liskovsubstitution.good;

public class HomeLoan implements SecureLoan {
    @Override
    public void doPayment(int amount) {

    }

    @Override
    public void loanForeClosure() {

    }
}
