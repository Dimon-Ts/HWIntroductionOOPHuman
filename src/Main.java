public class Main {
    public static void main(String[] args) {
        Human[] humans = new Human[4];
        humans[0] = new Human("Максим", "Минск", -1988, "бренд-менеджер");
        humans[1] = new Human("Аня", "Москва", -1993, "методист образовательных программ");
        humans[2] = new Human("Катя", "Калининград", -1992, "продакт-менеджер");
        humans[3] = new Human("Артём", "Москва", -1995, "директор по развитию бизнеса");
        for (Human human : humans) {
            if (human != null) {
                System.out.println(human);
            }
        }
    }
}

