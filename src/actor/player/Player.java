package actor.player;

import actor.Actor;

import java.util.Random;
import java.util.UUID;

public class Player extends Actor {
    PlayerStats stats = new PlayerStats();
    Float skill = 1000F;


    public Player(String in_name) {
        name = in_name;
        id = UUID.randomUUID().toString();
        Random r = new Random();
        skill += r.nextFloat(-100F, 100F);
    }

    public long damage(final long amount) {
        return stats.takeDamage(stats.mitigateDamage((float) amount));
    }

    public PlayerStatValues getStats() {
        return stats.getStats();
    }

    public String getId() {
        return this.id;
    }
}