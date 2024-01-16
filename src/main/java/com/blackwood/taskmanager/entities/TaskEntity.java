package com.blackwood.taskmanager.entities;

import lombok.Data;

import java.util.Date;

@lombok.Data
public class TaskEntity {
    private int id;
    private String title;
    private String description;
    private Date deadLine;
    private Boolean completed;
}
