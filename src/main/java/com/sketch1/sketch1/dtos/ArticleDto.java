package com.sketch1.sketch1.dtos;

import java.io.Serializable;
import java.math.BigDecimal;

public class ArticleDto implements Serializable {
    Long id;
    String artCode;
    String artName;
    BigDecimal artPrice;
}
