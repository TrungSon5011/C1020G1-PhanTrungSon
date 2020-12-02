package C1020G1.lop_doi_tuong.bai_tap.QuadracticEquation;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }
    public double getDiscriminant(){
        return this.b*this.b - 4*this.a*this.c;
    }
    public double getRoot1(){
        return (-this.b + Math.sqrt(this.b*this.b - 4*this.a*this.c))/(2*this.a);
    }
    public double getRoot2(){
        return (-this.b - Math.sqrt(this.b*this.b - 4*this.a*this.c))/(2*this.a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a, b, c of ax2 + bx +c = 0");
        System.out.println("Enter a:");
        double a = scanner.nextDouble();
        System.out.println("Enter b:");
        double b = scanner.nextDouble();
        System.out.println("Enter c:");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if( quadraticEquation.getDiscriminant()> 0){
            System.out.println("The equation has two roots: "+quadraticEquation.getRoot1()+ " and "+quadraticEquation.getRoot2() );
        }else if(quadraticEquation.getDiscriminant() == 0){
            System.out.println("The equation has one root: ");
            System.out.println(quadraticEquation.getRoot1());
        }else{
            System.out.println("The equation has no roots");
        }
    }
}
