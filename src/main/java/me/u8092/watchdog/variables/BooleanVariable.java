package me.u8092.watchdog.variables;

import me.u8092.watchdog.Main;
import me.u8092.watchdog.util.DebugUtil;

import java.util.List;

public class BooleanVariable {
    private String name;
    private boolean value;
    private boolean defaultValue;
    private List<String> trueEvents;
    private List<String> falseEvents;
    private List<String> switchEvents;
    private List<String> resetEvents;
    private String owner;

    public BooleanVariable(String name,
                           boolean value,
                           List<String> trueEvents,
                           List<String> falseEvents,
                           List<String> switchEvents,
                           List<String> resetEvents,
                           String owner) {
        this.name = name;
        this.value = value;
        this.defaultValue = value;
        this.trueEvents = trueEvents;
        this.falseEvents = falseEvents;
        this.switchEvents = switchEvents;
        this.resetEvents = resetEvents;
        this.owner = owner;
    }

    public String getName() { return name; }
    public boolean getValue() { return value; }
    public boolean getDefaultValue() { return defaultValue; }
    public void setValue(boolean value) {
        if(Main.getInstance().getConfig().getBoolean("debug")) DebugUtil.info("Set BooleanVariable " + name + " to " + value + " (" + owner + ")");
        this.value = value;
    }
    public List<String> getTrueEvents() { return trueEvents; }
    public List<String> getFalseEvents() { return falseEvents; }
    public List<String> getSwitchEvents() { return switchEvents; }
    public List<String> getResetEvents() { return resetEvents; }
    public String getOwner() { return owner; }
}
