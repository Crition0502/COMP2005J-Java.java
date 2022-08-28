package Day08_OOPIntro;

public class Circle {
    /*
    double属性
    表示圆的面积
     */
    double radius;

    /**
     * @author 16624
     * @description 计算圆的面积
     * @name public void findArea()
     * @date 2022.8.26
     */
    public double findArea(){
        double area = Math.PI * Math.pow(radius , 2);
        return area;
    }
}
