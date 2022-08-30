package services;

import models.DataModel;

public class DataSourceImpl implements DataSource{


    DataModel dataModel;

    public DataSourceImpl(DataModel dataModel) {
        this.dataModel = dataModel;
    }

    @Override
    public DataModel getData() {
        return dataModel;
    }
}
