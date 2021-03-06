package actor;

import stats.Stats;

public abstract class Actor {
    Stats stats;
    public String name;
    protected String id;

    @Override
    public String toString() {
        return "Actor('%s')".formatted(name);
    }
}