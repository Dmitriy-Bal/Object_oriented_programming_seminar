package org.example.ClassWork.Ex1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor

public class GenBox<T> {
    T obj;
}
