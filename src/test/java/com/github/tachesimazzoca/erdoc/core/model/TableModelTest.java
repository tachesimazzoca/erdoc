package com.github.tachesimazzoca.erdoc.core.model;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.List;

public class TableModelTest {
    @Test
    public void testBuilder() {
        ColumnModel idColumn = ColumnModel.builder().columnName("id").build();
        ColumnModel nameColumn = ColumnModel.builder().columnName("name").build();
        TableModel table = TableModel.builder()
          .tableName("products")
          .logicalName("Product Master")
          .addColumn(idColumn)
          .addColumn(nameColumn)
          .build();
        assertEquals(table.getTableName(), "products");
        assertEquals(table.getLogicalName(), "Product Master");
        assertEquals(table.getDescription(), "");
        List<ColumnModel> columns = table.getColumns();
        assertEquals(columns.size(), 2);
        assertEquals(columns.get(0), idColumn);
        assertEquals(columns.get(1), nameColumn);
    }
}
