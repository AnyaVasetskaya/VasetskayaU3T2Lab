public class SelectionMadness
{
    public SelectionMadness() { }

    public boolean flipCoin() {
        if ((int) (Math.random() * 2 + 1) == 1)
            return true;
        else
            return false;
    }

    public int largest(int num1, int num2, int num3) {
        int largest = num1;
        if (num2 > num1) {
            largest = Math.max(num2, num3);
        } else if (num3 > num1)
            largest = num3;
        return largest;
    }

    public boolean rightTriangle(int side1, int side2, int side3) {
        if (largest(side1, side2, side3) == side1)
            return Math.pow(side2, 2) + Math.pow(side3, 2) == Math.pow(side1,2);
        else if (largest(side1, side2, side3) == side2)
            return Math.pow(side1, 2) + Math.pow(side3, 2) == Math.pow(side2,2);
        else
            return Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(side3,2);
    }

}