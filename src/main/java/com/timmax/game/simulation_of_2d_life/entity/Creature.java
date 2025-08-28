package com.timmax.game.simulation_of_2d_life.entity;

//  Абстрактный класс, наследуется от Entity.
//  Существо, имеет скорость (сколько клеток может пройти за 1 ход), количество HP.
//  Имеет метод makeMove() - сделать ход.
public abstract class Creature extends Entity {
    protected int speed;
    protected int hp;

    abstract void makeMove();
}
