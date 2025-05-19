package org.example.model;

public class Todo {

    private int todoId;
    private String todoNom;
    private String todoDescription;
    private boolean todoFait;

    public int getTodoId() {
        return todoId;
    }

    public void setTodoId(int todoId) {
        this.todoId = todoId;
    }

    public String getTodoNom() {
        return todoNom;
    }

    public void setTodoNom(String todoNom) {
        this.todoNom = todoNom;
    }

    public String getTodoDescription() {
        return todoDescription;
    }

    public void setTodoDescription(String todoDescription) {
        this.todoDescription = todoDescription;
    }

    public boolean isTodoFait() {
        return todoFait;
    }

    public void setTodoFait(boolean todoFait) {
        this.todoFait = todoFait;
    }
}
