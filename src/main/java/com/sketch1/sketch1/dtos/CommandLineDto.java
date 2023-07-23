package com.sketch1.sketch1.dtos;

import java.io.Serializable;
import java.math.BigDecimal;

public class CommandLineDto implements Serializable {
    Long id;
    BigDecimal cmdLineQuantity;
    String cmdLineComment;
    String cmdLineFinalPrice;
    Long cmdLineCommandId;
    Long cmdLineArticleId;
}
