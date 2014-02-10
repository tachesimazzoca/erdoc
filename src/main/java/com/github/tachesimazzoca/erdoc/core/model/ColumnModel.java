package com.github.tachesimazzoca.erdoc.core.model;

public final class ColumnModel {
    private final String columnName;
    private final String logicalName;
    private final String columnType;
    private final String description;

    private ColumnModel() {
        columnName = "";
        logicalName = "";
        columnType = "";
        description = "";
    }

    private ColumnModel(Builder builder) {
        columnName = builder.columnName;
        logicalName = builder.logicalName;
        columnType = builder.columnType;
        description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getColumnName() {
        return columnName;
    }

    public String getLogicalName() {
        return logicalName;
    }

    public String getColumnType() {
        return columnType;
    }

    public String getDescription() {
        return description;
    }

    public static class Builder {
        private String columnName;
        private String logicalName;
        private String columnType;
        private String description;

        public Builder() {
            this.columnName = "";
            this.logicalName = "";
            this.columnType = "";
            this.description = "";
        }

        public ColumnModel build() {
            return new ColumnModel(this);
        }

        public Builder columnName(String s) {
            this.columnName = s;
            return this;
        }

        public Builder logicalName(String s) {
            this.logicalName = s;
            return this;
        }

        public Builder columnType(String s) {
            this.columnType = s;
            return this;
        }

        public Builder description(String s) {
            this.description = s;
            return this;
        }
    }
}
