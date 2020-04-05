package com.kroot.model;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@Data
public class Student {
    public String name;
    public String number;
    public int sex;
    public String Email;
}
