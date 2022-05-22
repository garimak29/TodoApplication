package com.example.todoapplication.model;


import lombok.*;

import java.time.LocalDate;

@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@AllArgsConstructor
@NoArgsConstructor
public class  Task {
    private String name;
    private LocalDate dueDate;
    private Boolean done;


    /**
     * Create a task object with given task name String
     * due date is 5 days from now and done = false
     *
     * @param name : name of the task
     *
     */
    public Task(String name) {
        this(name, LocalDate.now().plusDays(5), false);
    }
}
