public class TeamLeader extends ProductionWorker {

  // private fields
  private double monthlyBonus;
  private double requiredTrainingHours;
  private double completedTrainingHours;

  // public methods

  /**
   * Default constructor.
   */
  public TeamLeader(String name, String number, String hireDate, int shift, double payRate, double monthlyBonus, double rth, double cth) {
    super(name, number, hireDate, shift, payRate);
    this.monthlyBonus = monthlyBonus;
    this.requiredTrainingHours = rth;
    this.completedTrainingHours = cth;
  }

  /**
   * Copy constructor.
   * This constructor will create a new TeamLeader by copying another.
   * @param tl An existing TeamLeader object
   */
  public TeamLeader(TeamLeader tl) {
    super(tl.getName(), tl.getNumber(), tl.getHireDate(), tl.getShift(), tl.getPayRate());
    this.monthlyBonus = tl.getMonthlyBonus();
    this.requiredTrainingHours = tl.getRequiredTrainingHours();
    this.completedTrainingHours = tl.getCompletedTrainingHours();
  }

  /**
   * Monthly Bonus accessor (getter)
   * @return the value of the monthlyBonus field
   */
  public double getMonthlyBonus() {
    return monthlyBonus;
  }

  /**
   * Monthly Bonus mutator (setter)
   * @param newBonus new value for the monthlyBonus field
   */
  public void setMonthlyBonus(double bonus) {
    this.monthlyBonus = bonus;
  }

  /**
   * Required Training Hours accessor (getter)
   * @return the value of the requiredTrainingHours field
   */
  public double getRequiredTrainingHours() {
    return requiredTrainingHours;
  }

  /**
   * Required Training Hours mutator (setter)
   * @param hours new value for the requiredTrainingHours field
   */
  public void setRequiredTrainingHours(double hours) {
    this.requiredTrainingHours = hours;
  }

  /**
   * Completed Training Hours accessor (getter)
   * @return the value of the completedTrainingHours field
   */
  public double getCompletedTrainingHours() {
    return completedTrainingHours;
  }

  /**
   * Completed Training Hours mutator (setter)
   * @param hours new value for the completedTrainingHours field
   */
  public void setCompletedTrainingHours(double hours) {
    this.completedTrainingHours = hours;
  }

  /**
   * To String Method.
   * This method will print a nicely formatted string representation of the
   * class' fields
   */
  public String toString() {
    String str = super.toString();
    str += "\nEmployee Monthly Bonus: " + monthlyBonus +
           "\nEmployee Required Training Hours: " + requiredTrainingHours +
           "\nEmployee Completed Training Hours: " + completedTrainingHours;
    return str;
  }

}