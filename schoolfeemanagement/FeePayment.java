import java.sql.Date;
public class FeePayment {
    private int paymentId;
    private int studentId;
    private double amount;
    private Date paymentDate;
    private String forMonth;
    private String paymentMode;


    public FeePayment() {}


    public FeePayment(int paymentId, int studentId, double amount, Date paymentDate, String forMonth, String paymentMode) {
        this.paymentId = paymentId;
        this.studentId = studentId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.forMonth = forMonth;
        this.paymentMode = paymentMode;
    }
    
    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getForMonth() {
        return forMonth;
    }

    public void setForMonth(String forMonth) {
        this.forMonth = forMonth;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    @Override
    public String toString() {
        return "FeePayment{" +
                paymentId + ", " +
                studentId + ", " +
                amount + ", " +
                paymentDate + ", " +
                forMonth + ", " +
                paymentMode + "}";
    }
}