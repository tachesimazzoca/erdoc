package com.github.tachesimazzoca.erdoc.core.model;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.List;

public class SchemaModelTest {
    @Test
    public void testBuilder() {
        TableModel table1 = TableModel.builder().tableName("tableA").build();
        TableModel table2 = TableModel.builder().tableName("tableB").build();
        SchemaModel database = SchemaModel.builder()
          .schemaName("test")
          .addTable(table1)
          .addTable(table2)
          .build();
        assertEquals(database.getSchemaName(), "test");
        assertEquals(database.getLogicalName(), "");
        assertEquals(database.getDescription(), "");
        List<TableModel> tables = database.getTables();
        assertEquals(tables.size(), 2);
        assertEquals(tables.get(0), table1);
        assertEquals(tables.get(1), table2);
    }
}
