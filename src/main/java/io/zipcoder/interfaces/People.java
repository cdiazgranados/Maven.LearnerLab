package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E> {
    List<E> personList;

    public People() {
        personList = new ArrayList<>();
    }

    public People(List<E> personList) {
        this.personList = personList;
    }

    public void add(E person) {
        personList.add(person);
    }

    public E findById(Long id) {
        for (int i = 0; i < personList.size(); i++) {
            if(personList.get(i).getId() == id) {
                return personList.get(i);
            }
        }
        return null;
    }

    public boolean contains(E person) {
        if (personList.contains(person)) {
            return true;
        }
        return false;
    }

    public void remove(E person) {
        Long id = person.getId();
        for (int i = 0; i < personList.size(); i++) {
            if(personList.get(i).getId() == id) {
               personList.remove(i);
            }
        }
    }

    public void removeAll() {
        personList.clear();
    }

    public Integer count() {
        return personList.size();
    }

    public E[] toArray(Student[] students){
        E[] arr = (E[]) Array.newInstance(personList.get(0).getClass(), personList.size());
        for (int i = 0; i < personList.size(); i++) {
            arr[i] = personList.get(i);
        }
        return arr;
    }


    @Override
    public Iterator<E> iterator() {
        return personList.stream().iterator();
    }

}
