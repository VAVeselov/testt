public class BonusService {
    public int calcBonus(int amount, boolean isRegistered) {
        int persent = isRegistered ? 3 : 1;
        int bonus = amount * persent / 100;
        if (bonus > 500) {
            bonus = 500;
        }
        return bonus;
    }
}
