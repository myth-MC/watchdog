package me.u8092.watchdog.variables;

import java.util.ArrayList;
import java.util.List;

public class VariableHandler {
    private static List<CountVariable> countVariables = new ArrayList<>();
    private static List<BooleanVariable> booleanVariables = new ArrayList<>();

    public static List<BooleanVariable> getBooleanVariables() {
        return booleanVariables;
    }

    public static List<CountVariable> getCountVariables() {
        return countVariables;
    }

    public static BooleanVariable getBooleanVariable(String owner, String name) {
        for(BooleanVariable booleanVariable : booleanVariables) {
            if(booleanVariable.getOwner().equals(owner) && booleanVariable.getName().equals(name)) return booleanVariable;
        }

        return null;
    }

    public static CountVariable getCountVariable(String owner, String name) {
        for(CountVariable countVariable : countVariables) {
            if(countVariable.getOwner().equals(owner) && countVariable.getName().equals(name)) return countVariable;
        }

        return null;
    }

    public static void addBooleanVariable(BooleanVariable booleanVariable) {
        booleanVariables.add(booleanVariable);
    }

    public static void addCountVariable(CountVariable countVariable) {
        countVariables.add(countVariable);
    }
}
