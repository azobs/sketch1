package com.sketch1.sketch1.dtos;

import java.io.Serializable;
import java.time.Instant;

public class CommandDto implements Serializable {
    Long id;
    String cmdCode;
    Instant cmdDate;
}
