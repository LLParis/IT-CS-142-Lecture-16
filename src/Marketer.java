class Marketer extends Employee {
    @Override
    public double getSalary() {
        double MarketerSalary = super.getSalary() + 10000;
        return MarketerSalary;
    }

    public String catchPhrase() {
        return "Act now, while supplies last!";
    }
}