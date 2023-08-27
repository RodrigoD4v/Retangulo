public class Retangulo {
    double width;
    double heigth;

    public Retangulo(double width, double heigth){
        this.heigth = heigth;
        this.width = width;
    }
    public double Area(){
        return this.width*this.heigth;
    }
    public double Perimeter(){
        return this.width*2+this.heigth*2;
    }
    public double Diagonal(){
        return Math.sqrt(Math.pow(width, 2)+ Math.pow(heigth,2));
    }
}