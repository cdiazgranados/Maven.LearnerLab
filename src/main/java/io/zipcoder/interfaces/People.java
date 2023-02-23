package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People<T extends Person> implements Iterable<T> {
    List<T> personList;


    public People() {
        personList = new ArrayList<>();
    }

    public People(List<T> personList) {
        this.personList = personList;
    }

    public void add(T person) {
        personList.add(person);
    }

    public T findById(Long id) {
        for (int i = 0; i < personList.size(); i++) {
            if(personList.get(i).getId() == id) {
                return personList.get(i);
            }
        }
        return null;
    }

    public boolean contains(T person) {
        if (personList.contains(person)) {
            return true;
        }
        return false;
    }

    
    //todo: start here
    public void remove(T person) {
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

    public Person[] toArray(Student[] students) {
        return personList.toArray(new Person[0]);
    }


    @Override
    public Iterator<T> iterator() {
        return personList.stream().iterator();
    }

}
