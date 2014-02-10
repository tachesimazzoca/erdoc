package com.github.tachesimazzoca.erdoc.core.model;

import org.junit.*;
import static org.junit.Assert.*;

public class ColumnModelTest {
    @Test
    public void testBuilder() {
        ColumnModel column = ColumnModel.builder()
          .columnName("id")
          .columnType("int not null auto_increment")
          .logicalName("Serial ID")
          .build();
        assertEquals(column.getColumnName(), "id");
        assertEquals(column.getColumnType(), "int not null auto_increment");
        assertEquals(column.getLogicalName(), "Serial ID");
        assertEquals(column.getDescription(), "");
    }
}
