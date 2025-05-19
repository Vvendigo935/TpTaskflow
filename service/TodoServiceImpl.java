package org.example.service;

import org.example.model.Todo;

import java.util.ArrayList;
import java.util.List;

public class TodoServiceImpl implements TodoService{

    private Todo todo;
    private List<String> service = new ArrayList<>();


    @Override
    public List<Todo> getAll() {
        for (int i = 1; i < service.size(); i++){
            System.out.println("Tache n° : "+i);
            System.out.println(service.get(i));
        }
        return List.of();
    }

    @Override
    public Todo getById(int id) {

        return null;
    }
    // for (int i = 0; i < service.size(); i++)

    @Override
    public void add(String name, String description) {
        service.add(name);
        service.add(description);
    }

    @Override
    public void update(int id, String name, String description, boolean done) {
        service.set(id, name);
        service.set(id, description);
        service.set(id, String.valueOf(done));
    }

    @Override
    public void remove(int id) {
        service.remove(id);
    }

    @Override
    public void toggleDone(int id) {
        Todo todo = getById(id);
        if(todo.isTodoFait()==false){
      //      todo.isTodoFait()=true;

        }
    }



}
