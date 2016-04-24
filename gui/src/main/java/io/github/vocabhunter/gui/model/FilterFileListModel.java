/*
 * Open Source Software published under the Apache Licence, Version 2.0.
 */

package io.github.vocabhunter.gui.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.nio.file.Path;

public class FilterFileListModel {
    private final ObservableList<FilterFileModel> files = FXCollections.observableArrayList();

    public ObservableList<FilterFileModel> getFiles() {
        return files;
    }

    public FilterFileModel addFile(final Path file) {
        FilterFileModel fileModel = new FilterFileModel(file);

        files.removeIf(f -> f.getFile().equals(file));
        files.add(fileModel);

        return fileModel;
    }

    public void remove(final FilterFileModel file) {
        files.remove(file);
    }
}
