package com.github.tachesimazzoca.erdoc.core.model;

import java.util.ArrayList;
import java.util.List;

public final class SchemaModel {
    private final String schemaName;
    private final String logicalName;
    private final String description;
    private final List<TableModel> tables;

    private SchemaModel() {
        schemaName = "";
        logicalName = "";
        description = "";
        tables = new ArrayList<TableModel>();
    }

    private SchemaModel(Builder builder) {
        schemaName = builder.schemaName;
        logicalName = builder.logicalName;
        description = builder.description;
        tables = builder.tables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getSchemaName() {
        return schemaName;
    }

    public String getLogicalName() {
        return logicalName;
    }

    public String getDescription() {
        return description;
    }

    public List<TableModel> getTables() {
        return tables;
    }

    public static class Builder {
        private String schemaName;
        private String logicalName;
        private String description;
        private List<TableModel> tables;

        public Builder() {
            this.schemaName = "";
            this.logicalName = "";
            this.description = "";
            this.tables = new ArrayList<TableModel>();
        }

        public SchemaModel build() {
            return new SchemaModel(this);
        }

        public Builder schemaName(String s) {
            this.schemaName = s;
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

        public Builder addTable(TableModel table) {
            this.tables.add(table);
            return this;
        }

        public Builder removeTables() {
            this.tables.clear();
            return this;
        }
    }
}
