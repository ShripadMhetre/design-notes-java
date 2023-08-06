package solidprinciples.liskovsubstitution.good;

/**
 * SecureLoan interface extends LoanPayment.
 * So that, HomeLoan can implement this interface with loanForeClosure() functionality in addition to doPayment()
 */
public interface SecureLoan extends LoanPayment {
    void loanForeClosure();
}
