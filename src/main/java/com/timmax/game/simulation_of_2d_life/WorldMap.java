package com.timmax.game.simulation_of_2d_life;

import com.timmax.game.simulation_of_2d_life.entity.Entity;

import java.util.Map;

//  Карта, содержит в себе коллекцию для хранения существ и их расположения.
//  Советую не спешить использовать двумерный массив или список списков, а подумать какие ещё коллекции могут подойти.
public class WorldMap {
    private Map<Coordinate, Entity> entities;
}
