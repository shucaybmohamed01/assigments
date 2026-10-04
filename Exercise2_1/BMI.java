package Exercise2_1;

public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public BMI(String name, double weight, double height) {
        this(name, 20, weight, height);
    }

    /** Returns the BMI: weight(pounds) * 703 / height(inches)^2. */
    public double getBMI() {
        return weight * 703 / (height * height);
    }

    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25.0)
            return "Normal";
        else if (bmi < 30.0)
            return "Overweight";
        else
            return "Obese";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public static void main(String[] args) {
        BMI bmi1 = new BMI("mohamed", 18, 145, 70);
        System.out.println("The BMI for " + bmi1.getName() + " is "
                + String.format("%.2f", bmi1.getBMI()) + " " + bmi1.getStatus());

        BMI bmi2 = new BMI("asho", 215, 70);
        System.out.println("The BMI for " + bmi2.getName() + " (age " + bmi2.getAge() + ") is "
                + String.format("%.2f", bmi2.getBMI()) + " " + bmi2.getStatus());
    }
}
