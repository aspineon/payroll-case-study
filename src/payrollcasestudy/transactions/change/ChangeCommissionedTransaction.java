package payrollcasestudy.transactions.change;

import payrollcasestudy.entities.paymentclassifications.CommissionedClassification;
import payrollcasestudy.entities.paymentclassifications.PaymentClassification;
import payrollcasestudy.entities.paymentschedule.MonthlyPaymentSchedule;
import payrollcasestudy.entities.paymentschedule.PaymentSchedule;

/**
 * Created by zhangshijie on 7/26/16.
 */
public class ChangeCommissionedTransaction extends ChangeClassificationTransaction {

    private double commissionRate;
    private int monthlySalary;

    public ChangeCommissionedTransaction(int employeeId, double commissionRate, int monthlySalary) {
        super(employeeId);
        this.commissionRate = commissionRate;
        this.monthlySalary = monthlySalary;
    }


    @Override
    PaymentClassification getNewPaymentClassification() {
        return new CommissionedClassification( monthlySalary, commissionRate );
    }

    @Override
    PaymentSchedule getNewPaymentSchedule() {
        return new MonthlyPaymentSchedule();
    }
}
