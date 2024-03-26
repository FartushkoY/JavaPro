package de.telran.homework_25_03_Set_Queue_Stack;

import java.util.LinkedList;

public class CustomStack {
    private LinkedList<String> linkedList = new LinkedList<>();

    public void pushCS(String string) {
        linkedList.add(string);
    }

    @Override
    public String toString() {
        return "CustomStack{" +
                linkedList +
                '}';
    }

    public String peekCS(){
        return linkedList.getFirst();
    }

    public String popCS() {
        String elem = linkedList.getFirst();
        linkedList.removeFirst();
        return elem;
    }
}
