package com.lsxp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Column {

    private int id;

    private String name;

    private String job;

    private User user;
}
