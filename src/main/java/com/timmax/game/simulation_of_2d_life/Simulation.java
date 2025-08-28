package com.timmax.game.simulation_of_2d_life;

//  Главный класс приложения
public class Simulation {
    //  включает в себя:
    //  Карту
    private WorldMap worldMap;
    //  Счётчик ходов
    private int countOfMoves;
    //  Рендерер поля
    private Renderer renderer;

    //  Actions - список действий, исполняемых перед стартом симуляции или на каждом ходу (детали ниже)
    //  Симуляция содержит 2 массива действий:

    //  Действия, совершаемые перед стартом симуляции.
    //  Пример - расставить объекты и существ на карте
    private Action[] initActions;

    //  Действия, совершаемые каждый ход.
    //  Примеры - передвижение существ, добавить травы или травоядных, если их осталось слишком мало
    private Action[]  turnActions;

    public void gameLoop() {
        System.out.println("simulation_of_2d_life.");
    }

    //  просимулировать и отрендерить один ход
    void nextTurn() {

    }

    //  запустить бесконечный цикл симуляции и рендеринга
    void startSimulation() {

    }

    //  приостановить бесконечный цикл симуляции и рендеринга
    void pauseSimulation() {

    }
}
