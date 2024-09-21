public class BonusMilesService {

    public int calculate(int price) {

        int miles;

        int coefficient = 20;

        miles = price / coefficient;
        return miles;
    }
}





