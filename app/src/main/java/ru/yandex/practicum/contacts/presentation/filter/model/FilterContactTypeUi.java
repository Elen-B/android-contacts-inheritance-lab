package ru.yandex.practicum.contacts.presentation.filter.model;

import androidx.annotation.NonNull;

public class FilterContactTypeUi {

    private final String type;
    private final boolean selected;

    public FilterContactTypeUi(@NonNull String type, boolean selected) {
        this.type = type;
        this.selected = selected;
    }

    public String getType() {
        return type;
    }

    public boolean isSelected() {
        return selected;
    }

    public String createLogMessage() {
        return "Выбран фильтр: " + type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FilterContactTypeUi that = (FilterContactTypeUi) o;

        if (selected != that.selected) return false;
        return type.equals(that.type);
    }

    @Override
    public int hashCode() {
        int result = type.hashCode();
        result = 31 * result + (selected ? 1 : 0);
        return result;
    }
}
