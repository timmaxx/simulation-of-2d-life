package com.timmax.game.simulation_of_2d_life.entity;

//  Хищник, наследуется от Creature. В дополнение к полям класса Creature, имеет силу атаки.
//  На что может потратить ход хищник:
//  -   Переместиться (чтобы приблизиться к жертве - травоядному).
//  -   Атаковать травоядное. При этом количество HP травоядного уменьшается на силу атаки хищника.
//      Если значение HP жертвы опускается до 0, травоядное исчезает.
public class Predator extends Creature {
    private int attackPower;

    @Override
    void makeMove() {

    }
}
