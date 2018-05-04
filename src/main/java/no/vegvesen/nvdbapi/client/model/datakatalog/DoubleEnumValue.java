package no.vegvesen.nvdbapi.client.model.datakatalog;

import java.time.LocalDate;

public class DoubleEnumValue extends EnumValue<Double> {
    public DoubleEnumValue(Integer id,
                           Integer sortNumber,
                           Double value,
                           String shortName,
                           String description,
                           LocalDate objectListDate) {
        super(id, sortNumber, value, shortName, description, objectListDate);
    }
}