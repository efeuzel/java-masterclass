package com.company;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {
    List<Integer> dataToSave();

    void loadFromSavedData(List<Integer> data);
}
