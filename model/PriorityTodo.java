package org.example.model;

public class PriorityTodo extends Todo {

    private String priorityBasse = "basse";
    private String priorityMoyenne = "moyenne";
    private String priorityHaute = "haute";


    public String getPriorityBasse() {
        return priorityBasse;
    }

    public String getPriorityMoyenne() {
        return priorityMoyenne;
    }

    public String getPriorityHaute() {
        return priorityHaute;
    }

    @Override
    public String toString() {
        return "PriorityTodo{" +
                "priorityBasse='" + priorityBasse + '\'' +
                ", priorityMoyenne='" + priorityMoyenne + '\'' +
                ", priorityHaute='" + priorityHaute + '\'' +
                '}';
    }
}
