package com.nativegame.nattyengine.collision;

import com.nativegame.nattyengine.collision.shape.ShapeCollidable;

/**
 * Created by Oscar Liang on 2022/12/11
 */

public interface Collidable {

    CollisionType getCollisionType();

    void setCollisionType(CollisionType collisionType);

    ShapeCollidable getCollisionShape();

    void setCollisionShape(ShapeCollidable shapeCollidable);

    void onCollision(Collidable otherObject);

}
