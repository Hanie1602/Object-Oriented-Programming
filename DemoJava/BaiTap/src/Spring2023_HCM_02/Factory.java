package Spring2023_HCM_02;


public abstract class Factory {
    protected String type;
    protected String dataSource;
    
    public Factory() {
        this.type = " ";
    }

    public Factory(String type, String dataSource) {
        this.type = type;
        this.dataSource = dataSource;
    }

    public String getType() {
        return type;
    }

    public String getDataSource() {
        return dataSource;
    }
    
    public abstract void readData();
    public abstract String writeData();
    
}