package org.example.HomeWork;

public class Main {
    public static void main(String[] args) {
        Actions[] actions = fullPersons();
        Obstacle[] obstacle = fullObstacleat();


        /**
         * метод определяющий участников, которые продолжат проходить испытания
         */
        for (Obstacle value : obstacle) {
            for (int j = 0; j < actions.length; j++) {
                int participant = -1;
                if (actions[j] != null) {
                    if (value.nameObstacle().equals("Track")) {
                        participant = actions[j].run(value.sizeObstacle());

                    } else if (value.nameObstacle().equals("Wall")) {
                        participant = actions[j].jump(value.sizeObstacle());
                        if (participant == 1) {
                            actions[j] = null;
                        }
                    } else continue;
                }
                if (participant == 1) {
                    actions[j] = null;
                }
            }
        }
    }

    /**
     * Метод для наполнения участниками
     *
     * @return возвращает массив участников
     */
    private static Actions[] fullPersons() {
        Actions[] actions = {
                new Human(180, 3000),
                new Cat(130, 500),
                new Robot(110, 300),};
        return actions;
    }

    /**
     * Метод для наполнения препятствиями
     *
     * @return возващает массив препядствий
     */
    private static Obstacle[] fullObstacleat() {
        Obstacle[] obstacle = {
                new Track(100, "Track"), new Wall(100, "Wall"),
                new Track(400, "Track"), new Wall(120, "Wall"),
                new Track(1000, "Track"), new Wall(150, "Wall")};
        return obstacle;
    }
}