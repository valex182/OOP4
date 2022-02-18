package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SelectMovie {
    private int id;
    private String name;
    private String genre;
}
