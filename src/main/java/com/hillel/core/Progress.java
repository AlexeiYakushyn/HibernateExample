package com.hillel.core;

import javax.persistence.*;

/**
 * Created by alexei.yakushyn on 05.10.2017.
 */

@Entity
@Table(name = "progress")
public class Progress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id", table = "students")
    private Integer student_id;

    @Column(name = "physics")
    private Integer physics;

    @Column(name = "math")
    private Integer math;

    @Column(name = "programming")
    private Integer programming;

    public Integer getStudent_id() {
        return student_id;
    }

    public Integer getPhysics() {
        return physics;
    }

    public Integer getMath() {
        return math;
    }

    public Integer getProgramming() {
        return programming;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public void setPhysics(Integer physics) {
        this.physics = physics;
    }

    public void setMath(Integer math) {
        this.math = math;
    }

    public void setProgramming(Integer programming) {
        this.programming = programming;
    }
}
