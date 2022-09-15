package day10assignment.emplyoeewage;


public class EmployeeWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    private int numOfCompany = 0;
    private CompanyInfo[] companyInfoArray;

    public EmployeeWage() {
        companyInfoArray = new CompanyInfo[3];
    }

    private void addCompanyInfo(String companyName, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth) {
        companyInfoArray[numOfCompany] = new CompanyInfo(companyName, empRatePerHr, numOfWorkingDays, maxHrsPerMonth);
        numOfCompany++;
    }

    private void computeEmpWage() {
        for (int i = 0; i < numOfCompany; i++) {
            companyInfoArray[i].setTotalWage(this.computeEmpWage(companyInfoArray[i]));
            System.out.println(companyInfoArray[i]);
        }
    }

    public static int computeEmpWage(CompanyInfo companyInfo) {
        int empHrs = 0;
        int totalWage = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalWorkingDays <= companyInfo.getNumOfWorkingDays() && totalEmpHrs < companyInfo.getMaxHrsPerMonth()) {
            totalWorkingDays++;
            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            int empWage = empHrs * companyInfo.getEmpRatePerHr();
            totalEmpHrs += empHrs;
            totalWage += empWage;
        }
        return totalWage;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Builder Program For Multiple companies ");
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.addCompanyInfo("TCS", 20, 20, 100);
        employeeWage.addCompanyInfo("Accenture", 25, 22, 110);
        employeeWage.addCompanyInfo("Wipro", 27, 26, 120);
        employeeWage.computeEmpWage();
    }

    private class CompanyInfo {
        public CompanyInfo(String companyName, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth) {

        }

        public int getNumOfWorkingDays() {
            return 0;
        }

        public void setTotalWage(int computeEmpWage) {

        }

        public int getMaxHrsPerMonth() {
            return 0;
        }

        public int getEmpRatePerHr() {
            return 0;
        }
    }
}