public class Main {
    public static void main(String[] args) {

        Boss villain = new Boss();
        villain.setHealth(800);
        villain.setDamage(60);
        villain.setProtectionType("Physical");
        System.out.println("Boss health: " + villain.getHealth() + ", damage: " + villain.getDamage() + ", protection type: " + villain.getProtectionType());
        System.out.println();
    }
}