package com.github.tachesimazzoca.erdoc.core.model;

import java.util.ArrayList;
import java.util.List;

public final class TableModel {
    private final String tableName;
    private final String logicalName;
    private final String description;
    private final List<ColumnModel> columns;

    private TableModel() {
        tableName = "";
        logicalName = "";
        description = "";
        columns = new ArrayList<ColumnModel>();
    }

    private TableModel(Builder builder) {
        tableName = builder.tableName;
        logicalName = builder.logicalName;
        description = builder.description;
        columns = builder.columns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getTableName() {
        return tableName;
    }

    public String getLogicalName() {
        return logicalName;
    }

    public String getDescription() {
        return description;
    }

    public List<ColumnModel> getColumns() {
        return columns;
    }

    public static class Builder {
        private String tableName;
        private String logicalName;
        private String description;
        private List<ColumnModel> columns;

        public Builder() {
            this.tableName = "";
            this.logicalName = "";
            this.description = "";
            this.columns = new ArrayList<ColumnModel>();
        }

        public TableModel build() {
            return new TableModel(this);
        }

        public Builder tableName(String s) {
            this.tableName = s;
            return this;
        }

        public Builder logicalName(String s) {
            this.logicalName = s;
            return this;
        }

        public Builder description(String s) {
            this.description = s;
            return this;
        }

        public Builder addColumn(ColumnModel column) {
            this.columns.add(column);
            return this;
        }

        public Builder removeColumns() {
            this.columns.clear();
            return this;
        }
    }
}
