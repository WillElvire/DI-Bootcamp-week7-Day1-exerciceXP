package Exercice1;
/*
*@author Wilfried koua
*/
public class MyPoint {

    private int x;
    private int y;

    // le constructeur sans parametre
    public MyPoint() {
        super();
        this.x = 0;
        this.y = 0;
    }

    //le constructeur avec parametre
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //les getters et setters

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //getter et setters xy
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY() {
        int[] result = {x,y};
        return result;
    }

    public double distance(int x, int y){
        return this.calculDistance(x, y);
    }

    public double distance(MyPoint given){
        return this.calculDistance(given.x, given.y);
    }

    public double distance(){
        return this.calculDistance(0, 0);
    }

    public double calculDistance(int x , int y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2)) ;
    }
}
