package com.starthacks.blob;

import com.badlogic.gdx.scenes.scene2d.Group;

import java.util.ArrayList;
import java.util.List;

public class Level_2 extends AbstractLevel {

        private final int NUM_PLATFORMS = 9;

        public Level_2(float unitX, float unitY) {
            super(unitX, unitY);
            destinationPositionX = 220f * unitX;
            destinationPositionY = 146f * unitY;

            for (int i = 0; i < NUM_PLATFORMS; ++i) {
                PlatformObject platformObject = new PlatformObject(this.texture, unitX, unitY);
                platformObjects.add(platformObject);
                this.addActor(platformObject);
            }

            platformObjects.get(0).setPlatformSize(unitX * 300f, unitY * 10f);
            platformObjects.get(0).setPosition(0, unitY * 0.05f);

            platformObjects.get(1).setPlatformSize(unitX * 30f, unitY * 10f);
            platformObjects.get(1).setPosition(unitX * 35f, unitY * 35f);

            platformObjects.get(2).setPlatformSize(unitX * 10f, unitY * 25f);
            platformObjects.get(2).setPosition(unitX * 55f, unitY * 10f);

            platformObjects.get(3).setPlatformSize(unitX * 30f, unitY * 10f);
            platformObjects.get(3).setPosition(unitX * 85f, unitY * 40f);

            platformObjects.get(4).setPlatformSize(unitX * 30f, unitY * 10f);
            platformObjects.get(4).setPosition(unitX * 115f, unitY * 70f);

            platformObjects.get(5).setPlatformSize(unitX * 30f, unitY * 10f);
            platformObjects.get(5).setPosition(unitX * 145f, unitY * 100f);

            platformObjects.get(6).setPlatformSize(unitX * 1f, unitY * 10f);
            platformObjects.get(6).setPosition(unitX * 155f, unitY * 100f);

            platformObjects.get(7).setPlatformSize(unitX * 30f, unitY * 10f);
            platformObjects.get(7).setPosition(unitX * 180f, unitY * 120f);

            platformObjects.get(8).setPlatformSize(unitX * 30f, unitY * 145f);
            platformObjects.get(8).setPosition(unitX * 210f, unitY * 0.05f);

        }

        @Override
        public void update(float playerX, float playerY, float playerWidth, float playerHeight) {
            super.update(playerX, playerY, playerWidth, playerHeight);
        }
}


