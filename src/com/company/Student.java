package com.company;

import java.util.List;

public class Student {
    private String name;
    private int group;
    private int cuors;
    private List<Integer> mark;

    public List<Integer> getMark() {
        return mark;
    }

    public int calculate() {
        int sum = 0;
        for (int i = 0; i < mark.size(); i++) {
            sum = sum + mark.get(i);
        }
        return sum;
    }

    public void setMark(List<Integer> mark) {
        this.mark = getMark();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup(String group) {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getCuors() {
        return cuors;
    }

    public void setWell(int well) {
        this.cuors = cuors;
    }

    public void setMark(int i, int i1) {


    }
}